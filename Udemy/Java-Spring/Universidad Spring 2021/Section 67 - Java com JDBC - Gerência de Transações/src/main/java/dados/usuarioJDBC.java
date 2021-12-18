package dados;

import domain.Pessoa;
import domain.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class usuarioJDBC {

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password from usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=? WHERE id_usuario = ? ";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ? ";

    public List<Usuario> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario;
        List<Usuario> usuarios = new ArrayList<Usuario>();

        conn = Conexao.getConnection();
        stmt = conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();

        while(rs.next())
        {
            //int id_usuario = rs.getInt(1);
            int id_usuario = rs.getInt("id_usuario");
            String usuariostring = rs.getString("usuario");
            String p = rs.getString("password");

            usuario = new Usuario();
            usuario.setUsername(usuariostring);
            usuario.setId_usuario(id_usuario);
            usuario.setPassword(p);

            usuarios.add(usuario);
        }
        Conexao.close(rs);
        Conexao.close(stmt);
        Conexao.close(conn);
        return usuarios;
    }

    public int insert(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try{
            conn=Conexao.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,usuario.getUsername());
            stmt.setString(2,usuario.getPassword());


            System.out.println("executando query: " +SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afetados: " + rows);




        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            Conexao.close(stmt);
            Conexao.close(conn);
        }

        return rows;
    }


    public int update (Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        int rows = 0;

        conn = Conexao.getConnection();
        System.out.println("executando query: " + SQL_UPDATE);

        stmt = conn.prepareStatement(SQL_UPDATE);
        stmt.setString(1, usuario.getUsername());
        stmt.setString(2, usuario.getPassword());

        //id usuario do where
        stmt.setInt(3, usuario.getId_usuario());

        rows = stmt.executeUpdate();
        System.out.println("Numero de registros atualizados: " + rows);
        Conexao.close(stmt);
        Conexao.close(conn);
        return rows;
    }

    public int delete(Usuario p) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;
        conn = Conexao.getConnection();
        System.out.println("executando query: " + SQL_DELETE);
        stmt = conn.prepareStatement(SQL_DELETE);
        stmt.setInt(1, p.getId_usuario());
        rows = stmt.executeUpdate();


        System.out.println("Numero de registros eliminados: " + rows);
        Conexao.close(stmt);
        Conexao.close(conn);

        return rows;

    }

}
