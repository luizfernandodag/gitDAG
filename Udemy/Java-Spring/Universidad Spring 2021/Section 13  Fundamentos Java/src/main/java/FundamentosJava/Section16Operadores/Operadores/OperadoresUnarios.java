package FundamentosJava.Section16Operadores.Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 3,b = 0;
        b = -a;
        System.out.println("b = -a: " + b);
        boolean c  = true;
        boolean d  = ! c;
        System.out.println("d = " + d);
        //preincremento
        int e   = 3;
        System.out.println("e ( valor inicial) = " + e);
        int preIncremento = ++e;
        System.out.println("e (apos pre incremento) = " + e);
        System.out.println("preIncremento = " + preIncremento);
        //posIncremento
        System.out.println("e (voltando para o valor inicial) = " + e);

        int posIncremento =e++;
        System.out.println("e (apos pos incremento) = " + e);
        System.out.println("posIncremento = " + posIncremento);






    }
}
