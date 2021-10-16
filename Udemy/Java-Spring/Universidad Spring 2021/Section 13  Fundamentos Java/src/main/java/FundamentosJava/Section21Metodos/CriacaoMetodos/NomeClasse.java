package FundamentosJava.Section21Metodos.CriacaoMetodos;

public class NomeClasse {

    public static boolean divisivel( int num1, int num2)
    {
        if(num1%num2 == 0)//se num2 divide num1
        {
           return true;
        }

        return false;
    }

    public static void main(String[] args) {

        if(NomeClasse.divisivel(4,2) == true) {
        System.out.println("2 divide 4");
        }
        else
        {
            System.out.println("2 não divide quatro");
        }
    }
}
