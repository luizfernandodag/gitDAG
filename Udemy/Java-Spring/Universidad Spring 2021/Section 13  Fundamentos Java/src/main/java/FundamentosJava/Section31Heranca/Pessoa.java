package FundamentosJava.Section31Heranca;

public class Pessoa {
    //Atributos da classe Pessoa

    private static int contadorPessoa;//int é inicializado por default com o valor 0
    private int idPessoa;
    private String nome;
    private int idade;
    private boolean elimininado;



    //construtores

    public Pessoa( String nome, int idade, boolean elimininado) {
        this.idPessoa = ++contadorPessoa;
        this.nome = nome;
        this.idade = idade;
        this.elimininado = elimininado;
    }

    public Pessoa() {
        this.idPessoa = ++contadorPessoa;
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

    public double getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isElimininado() {
        return elimininado;
    }

    public void setElimininado(boolean elimininado) {
        this.elimininado = elimininado;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", elimininado=" + elimininado +
                '}';
    }
}
