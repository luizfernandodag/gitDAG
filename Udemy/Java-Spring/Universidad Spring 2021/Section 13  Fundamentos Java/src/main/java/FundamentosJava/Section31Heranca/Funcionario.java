package FundamentosJava.Section31Heranca;

public class Funcionario extends Pessoa{

    public Funcionario() {
    }

    public Funcionario( String nome, int idade, boolean elimininado) {
        super(nome, idade, elimininado);
    }

    public static void main(String[] args) {
        Pessoa p = new Funcionario("Luiz",10,false);
        System.out.println(p.toString());

    }


    @Override
    public String toString() {
        return super.toString() + " Funcionario{}";
    }
}
