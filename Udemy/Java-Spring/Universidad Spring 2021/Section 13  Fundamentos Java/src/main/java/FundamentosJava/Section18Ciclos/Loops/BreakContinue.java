package FundamentosJava.Section18Ciclos.Loops;

public class BreakContinue {
    public static void main(String[] args) {
        //continue
        for(int i = 0; i<=10; ++i)
        {
            if(i%2 == 0)
                continue;
            System.out.println("i: " + i);

        }
        //break
        System.out.println("Iniciando o loop");

        for(int i = 0; i<=10; ++i)
        {
            if(i > 5)
                break;

            System.out.println("i: " + i);

        }
        System.out.println("Fora do loop");
    }
}
