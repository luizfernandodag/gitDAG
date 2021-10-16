package FundamentosJava.Section31Heranca.Exercicio;

public class Pessoa {
    private static int contadorPessoa;
    private int pessoaId;
    private String nome;
    private char genero;
    private int idade;
    private String endereco;

    public Pessoa(String nome, char genero, int idade, String endereco) {
        this.pessoaId=++contadorPessoa;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.endereco = endereco;
    }

    public Pessoa() {
        this.pessoaId=++contadorPessoa;
    }
    public Pessoa(String nome) {
        this.pessoaId=++contadorPessoa;
        this.nome = nome;
    }
    public Pessoa(String nome, int idade) {
        this.pessoaId=++contadorPessoa;
        this.nome  = nome;
        this.idade = idade;
    }

    public static int getContadorPessoa() {
        return contadorPessoa;
    }

    public static void setContadorPessoa(int contadorPessoa) {
        Pessoa.contadorPessoa = contadorPessoa;
    }

    public int getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoaId=" + pessoaId +
                ", nome='" + nome + '\'' +
                ", genero=" + genero +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
