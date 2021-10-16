package FundamentosJava.Section18Ciclos.Loops;

public class ExerciciosWhileDoWhile {
    public static void main(String[] args) {
        //while
        int cont = 0;
        while(cont++<10)
        {
            System.out.println("Contador: " + cont);
        }
        //do while
        do{
            System.out.println("Do While - Contador: " + cont);

        }while(cont++ < 20);
        cont = 1;
        while(cont <1)
        {
            System.out.println("Dentro do while: " + cont);
        }
        cont = 1;
        do{
            cont++;
            System.out.println("Dentro do DO-While: " + cont);
        }while(cont<2);


    }
}
