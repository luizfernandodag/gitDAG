package FundamentosJava.Section33SobrecargaMetodos;

public class Operacoes {
    public static void println(String s)
    {
        System.out.println(s);
    }
    public static int somar(int a , int b)
    {
        println("Metodo somar(int, int): "  );
        return a + b;

    }

    //sobrecargas

    public static double somar (double a, double b)
    {
        println("Metodo somar( double, double)");
        return a + b;
    }

    public static double somar( int a, double b)
    {
        println("Metodo somar( int, double)");
        return a + b;
    }

    public static double somar(double a, int b)
    {
        println("Metodo somar( double, int)");
        return a + b;
    }
}
