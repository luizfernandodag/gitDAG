package FundamentosJava.Section32SobrecargaConstrutores.Exercicio;

public class Empregado extends Pessoa {
    private static int contadorEmpregado;
    private double saldo;
    private static int contadorPessoa;


    public Empregado(String nome, int idade) {

        super(nome, idade);
        contadorEmpregado++;

    }

    public Empregado(String nome, int idade, double saldo) {
        super(nome, idade);
        contadorEmpregado++;
        this.saldo = saldo;

    }

    public static int getContadorEmpregado() {
        return contadorEmpregado;
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString()+ "TotalEmpregados: "+ getContadorEmpregado() + "\nEmpregado{" +
                "saldo=" + saldo +
                "}\n";
    }

    int somar(int a, int b)
    {
        return a + b;
    }

    int somar(double a , double b)
    {
        return (int)(a+b);
    }

    int somar(String a, String b)
    {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    double somarDoubles( double a, double b)
    {
        return a + b;


    }
}
