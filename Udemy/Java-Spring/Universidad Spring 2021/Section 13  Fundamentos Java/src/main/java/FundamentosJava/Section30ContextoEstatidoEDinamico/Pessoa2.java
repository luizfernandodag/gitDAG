package FundamentosJava.Section30ContextoEstatidoEDinamico;

public class Pessoa2 {
    private int idPessoa;
    private String nome;
    private static int contadorPessoa;//int é inicializado por default com o valor 0


    public Pessoa2( String nome) {

        this.nome = nome;
        this.idPessoa = ++contadorPessoa;
    }

    public Pessoa2() {
        this.idPessoa = ++contadorPessoa;
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

    public static int getContadorPessoa() {
        return contadorPessoa;
    }

    public static void setContadorPessoa(int contadorPessoa) {
        Pessoa2.contadorPessoa = contadorPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa2{" +
                "idPessoa=" + idPessoa +
                ", nome='" + nome + '\'' +
                '}';
    }
}
