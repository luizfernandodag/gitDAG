package test;

import dados.PessoaJDBC;
import domain.Pessoa;

import java.sql.SQLException;
import java.util.List;

public class ExemploPessoas {
    public static void main(String[] args) throws SQLException {
        PessoaJDBC pessoaJDBC = new PessoaJDBC();
        List<Pessoa> pessoas = pessoaJDBC.select();
        //teste insert
//        Pessoa p = new Pessoa( );
//        p.setNome("Maria");
//        p.setSobrenome("Souza");
//        p.setEmail("maria@email.com");
//        p.setTelefone("12341234");

 //       pessoaJDBC.insert(p);

//teste de update
//      Pessoa p = new Pessoa( );
//      //id jah existente
//      p.setId_pessoa(3);
//       p.setNome("Maria_Novo_Nome");
//        p.setSobrenome("Souza");
//        p.setEmail("maria@email2.com");
//        p.setTelefone("12341234_2");


//        pessoaJDBC.update(p);
        //teste de delete

        Pessoa p = new Pessoa( );
        //id jah existente
        p.setId_pessoa(3);

        pessoaJDBC.delete(p);



        for(Pessoa pessoa: pessoas)
        {
            System.out.println("pessoa: " + pessoa);
        }

    }


}
