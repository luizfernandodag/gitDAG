package FundamentosJava.Section26UsoPalavraReturn.ReturnPackage;

public class ReturnEVoid {

    public static void printMultiplicao(int num1, int num2)
    {
        System.out.println("num1 * num2: " + (num1*num2));

    }

    public static int multiplicacao(int num1, int num2)
    {
        return num1*num2;
    }

    public static void main(String[] args) {
        printMultiplicao(2, 2);
        System.out.println("multiplicação 3*4: " + multiplicacao(3,4));
    }
}
