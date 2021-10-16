package FundamentosJava.Section16Operadores.Operadores;

public class OperadoresPrecedencia {
    public static void main(String[] args) {
        int a = 10 , b=20;
        int c = a++ + ++a + b-- - -b;
        //c = 10 + 12(a foi pre pos incrementado) + 20 -18(pré e pós decremento em b)
        System.out.println("a: "+a + "\nb: " + b + "\nc: " + c);




    }
}
