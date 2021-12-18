package test;

import dados.PessoaJDBC;
import dados.usuarioJDBC;
import domain.Pessoa;
import domain.Usuario;

import java.sql.SQLException;
import java.util.List;

public class ExemploUsuarios {
    public static void main(String[] args) throws SQLException {
        usuarioJDBC usuariosjdbc = new usuarioJDBC();
        List<Usuario> usuarios = usuariosjdbc.select();
        //teste insert
//        Usuario usuario = new Usuario( );
//        usuario.setUsername("Maria");
//        usuario.setPassword("1234");
//
//        usuariosjdbc.insert(usuario);

//teste de update
//      Usuario u = new Usuario( );
////      //id jah existente
//      u.setId_usuario(4);
//      u.setUsername("Maria_Novo_Nome");
//        u.setPassword("1234");
//
//
//        usuariosjdbc.update(u);


//        //teste de delete
//
//        Usuario u = new Usuario( );
//        //id jah existente
//        u.setId_usuario(4);
//
//        usuariosjdbc.delete(u);



        for(Usuario u: usuarios)
        {
            System.out.println("usuarios: " + u.toString());
        }
    }
}
