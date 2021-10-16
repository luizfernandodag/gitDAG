package FundamentosJava.Section14Variaveis.Metodos;

public class ExemploMetodosAreaCirculo {
    public static double AreaCirculo( double raio)
    {   double pi = 3.1415926;
        return pi*raio*raio;
    }
    public static void main(String[] args) {
        double raio = 10;
        System.out.println("Area de um circulo de raio " + raio + " : " + AreaCirculo(raio));

    }
}
