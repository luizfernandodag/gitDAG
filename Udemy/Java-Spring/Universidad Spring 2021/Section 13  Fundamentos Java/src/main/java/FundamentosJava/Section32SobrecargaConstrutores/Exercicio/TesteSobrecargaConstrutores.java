package FundamentosJava.Section32SobrecargaConstrutores.Exercicio;

public class TesteSobrecargaConstrutores {

    public static void println(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Luiz", 30);
        println(p1.toString());

        Empregado emp1 = new Empregado("Luiz",30,10000);
        println(emp1.toString());


    }
}
