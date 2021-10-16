package FundamentosJava.Section28Encapsulamento;

public class Pessoa {
    //Atributos da classe Pessoa
    private String nome;
    private double saldo;
    private boolean elimininado;
    //construtores
    public Pessoa(String nome, double saldo, boolean elimininado) {
        this.nome = nome;
        this.saldo = saldo;
        this.elimininado = elimininado;
    }

    public Pessoa() {
    }


    public static void main(String[] args) {

    }
    //get and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isElimininado() {
        return elimininado;
    }

    public void setElimininado(boolean elimininado) {
        this.elimininado = elimininado;
    }


    public String toString()
    {
        StringBuilder b = new StringBuilder("");
        b.append(" Objeto Pesssoa hash: " + this.hashCode() + "\n");
        b.append("{\nNome: " + this.getNome() + "\n");
        b.append("Saldo: " + this.getSaldo() + "\n");
        b.append("Eliminado: " + this.isElimininado() + "\n}\n");


        return b.toString();
    }

}
