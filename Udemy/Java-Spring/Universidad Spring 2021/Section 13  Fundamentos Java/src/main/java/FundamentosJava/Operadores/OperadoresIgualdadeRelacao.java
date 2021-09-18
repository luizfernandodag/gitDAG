package FundamentosJava.Operadores;

public class OperadoresIgualdadeRelacao {
    public static void main(String[] args) {
        int a = 3, b=2;
        //Operadores de igualdade e diferenca
        boolean igualdade = a==b;
        System.out.println("igualdade a e b = " + igualdade);
        boolean diferentes = a!=b;
        System.out.println("a e b são diferentes: " + diferentes);

        //outros operadores

        boolean maiorQue  = a > b;
        boolean maiorOuIgualQue  = a >= b;
        boolean menorQue  = a < b;
        boolean menorOuIgualQue  = a<=b;
        System.out.println("a > b: " + maiorQue);
        System.out.println("a >= b: " + maiorOuIgualQue);
        System.out.println("a < b: " + menorQue);
        System.out.println("a <= b: " + menorOuIgualQue);




    }
}
