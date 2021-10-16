package FundamentosJava.Section27UsoPalavraThisENull.UsoNull;

public class PalavraNull {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Luiz");
        System.out.println("Pessoa1: " + p1.getNome());

        Pessoa p2 = p1;

        System.out.println("Pessoa2: " + p2.getNome());

        p1 = null;
        System.out.println("Pessoa1: " + p1.getNome());


    }
}

class Pessoa{
    private String nome;
    public Pessoa() {

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}