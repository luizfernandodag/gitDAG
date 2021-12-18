package dados;

import domain.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaJDBC {
    private static final String SQL_SELECT = "SELECT id_pessoa, nome, sobrenome, email, telefone from pessoa";
    private static final String SQL_INSERT = "INSERT INTO pessoa(nome,sobrenome,email,telefone) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE pessoa SET nome=?, sobrenome=?, email=?, telefone=? WHERE id_pessoa = ? ";
    private static final String SQL_DELETE = "DELETE FROM pessoa WHERE id_pessoa = ? ";

    public List<Pessoa> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pessoa pessoa;
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        conn = Conexao.getConnection();
        stmt = conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();

        while(rs.next())
        {
            //int id_pessoa = rs.getInt(1);
            int id_pessoa = rs.getInt("id_pessoa");
            String nome = rs.getString("nome");
            String sobrenome = rs.getString("sobrenome");
            String email = rs.getString("email");
            String telefone = rs.getString("telefone");

            pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setId_pessoa(id_pessoa);
            pessoa.setSobrenome(sobrenome);
            pessoa.setEmail(email);
            pessoa.setTelefone(telefone);

            pessoas.add(pessoa);
        }
        Conexao.close(rs);
        Conexao.close(stmt);
        Conexao.close(conn);
        return pessoas;
    }

    public int insert(Pessoa pessoa) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try{
            conn=Conexao.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,pessoa.getNome());
            stmt.setString(2,pessoa.getSobrenome());
            stmt.setString(3,pessoa.getEmail());
            stmt.setString(4,pessoa.getTelefone());

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


    public int update (Pessoa pessoa) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        int rows = 0;

        conn = Conexao.getConnection();
        System.out.println("executando query: " + SQL_UPDATE);

        stmt = conn.prepareStatement(SQL_UPDATE);
        stmt.setString(1, pessoa.getNome());
        stmt.setString(2, pessoa.getSobrenome());
        stmt.setString(3, pessoa.getEmail());
        stmt.setString(4, pessoa.getTelefone());
        //id pessoa do where
        stmt.setInt(5, pessoa.getId_pessoa());

        rows = stmt.executeUpdate();
        System.out.println("Numero de registros atualizados: " + rows);
        Conexao.close(stmt);
        Conexao.close(conn);
        return rows;
    }

    public int delete(Pessoa p) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;
        conn = Conexao.getConnection();
        System.out.println("executando query: " + SQL_DELETE);
        stmt = conn.prepareStatement(SQL_DELETE);
        stmt.setInt(1, p.getId_pessoa());
        rows = stmt.executeUpdate();


        System.out.println("Numero de registros eliminados: " + rows);
        Conexao.close(stmt);
        Conexao.close(conn);

        return rows;

    }



}
