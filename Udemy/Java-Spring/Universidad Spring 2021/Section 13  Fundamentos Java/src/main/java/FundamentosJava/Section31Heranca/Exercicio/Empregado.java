package FundamentosJava.Section31Heranca.Exercicio;

public class Empregado extends Pessoa {
    private static int contadorEmpregado;
    private int idEmpregado;
    private double saldo;

    public Empregado(String nome, double saldo) {

        super(nome);
        this.idEmpregado=++contadorEmpregado;
        this.saldo = saldo;
    }
    public Empregado(String nome, double saldo, int idade) {

        super(nome,idade);
        this.idEmpregado=++contadorEmpregado;
        this.saldo = saldo;
    }

    public Empregado() {

        super();
        this.idEmpregado=++contadorEmpregado;

    }
    public Empregado(String nome, char genero, int idade, String direcao, double saldo) {
        super(nome, genero, idade, direcao);
        this.idEmpregado=++contadorEmpregado;
        this.saldo = saldo;
    }

    public Empregado(double saldo) {
        this.idEmpregado=++contadorEmpregado;
        this.saldo = saldo;
    }


    public static int getContadorEmpregado() {
        return contadorEmpregado;
    }

    public static void setContadorEmpregado(int contadorEmpregado) {
        Empregado.contadorEmpregado = contadorEmpregado;
    }

    public int getIdEmpregado() {
        return idEmpregado;
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString()+
        " Empregado{" +
                "idEmpregado=" + idEmpregado +
                ", saldo=" + saldo +
                '}';
    }
}
