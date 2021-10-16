package FundamentosJava.Section31Heranca.Exercicio;

import java.util.Date;

public class TestesHeranca {
    public static void print(String s)
    {
        System.out.println(s);
    }
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Luiz", 111111);
        emp1.setIdade(30);
        emp1.setGenero('M');
        emp1.setEndereco("Brasilia/DF Brasil");
        print(emp1.toString());

        Pessoa c1 = new Cliente(new Date(), true);
        c1.setIdade(30);
        c1.setGenero('M');
        c1.setEndereco("Brasilia/DF Brasil");
        c1.setNome("Fernando");
        print(c1.toString());




    }
}
