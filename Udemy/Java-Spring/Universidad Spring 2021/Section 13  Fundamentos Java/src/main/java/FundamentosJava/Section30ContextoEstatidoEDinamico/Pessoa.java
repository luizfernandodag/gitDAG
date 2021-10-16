package FundamentosJava.Section30ContextoEstatidoEDinamico;


public class Pessoa {
    //Atributos da classe Pessoa
    private int idPessoa;
    private String nome;
    private double saldo;
    private boolean elimininado;
    public static int contadorPessoa;
    //construtores
    public Pessoa(String nome, double saldo, boolean elimininado) {
        //adicionar um ao contador
        this.contadorPessoa += 1;
        this.idPessoa=contadorPessoa;
        //setar instâncias
        this.nome = nome;
        this.saldo = saldo;
        this.elimininado = elimininado;
    }

    public Pessoa() {
        //adicionar um ao contador
        this.contadorPessoa+=1;
        this.idPessoa=this.contadorPessoa;
    }

    public static int getContadorPessoa() {
        return contadorPessoa;
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

    public int getId() {
        return this.idPessoa;
    }

    public void setId(int id) { this.idPessoa=id; }

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
        b.append("Id: " + this.getId() + "\n");
        b.append("Saldo: " + this.getSaldo() + "\n");
        b.append("Eliminado: " + this.isElimininado() + "\n}\n");


        return b.toString();
    }

}
