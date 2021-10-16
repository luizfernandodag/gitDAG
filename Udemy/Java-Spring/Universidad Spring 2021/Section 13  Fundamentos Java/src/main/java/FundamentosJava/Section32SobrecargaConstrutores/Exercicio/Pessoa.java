package FundamentosJava.Section32SobrecargaConstrutores.Exercicio;

public class Pessoa {


    private int idPessoa;
    private String nome;
    private int idade;
    private static int contadorPessoa;
    private Pessoa()
    {
        this.idPessoa = ++contadorPessoa;
    }
    public Pessoa(String nome, int idade) {
        this();
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "TotalPessoas: " + getContadorPessoa() + "\n{Pessoa" +
                "idPessoa=" + idPessoa +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                "}\n";
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static int getContadorPessoa() {
        return contadorPessoa;
    }


}
