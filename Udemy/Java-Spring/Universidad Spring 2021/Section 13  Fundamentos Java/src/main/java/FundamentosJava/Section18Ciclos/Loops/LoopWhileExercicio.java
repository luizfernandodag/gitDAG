package FundamentosJava.Section18Ciclos.Loops;

import java.util.Scanner;

public class LoopWhileExercicio {
    public static int readNumber()
    {
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        while(input <2) {
            System.out.println("Digite um numero inteiro maior ou igual a 2:");

            input = Integer.parseInt(scanner.nextLine());

        }
        return input;
    }

    public static void main(String[] args) {
        int limSuperior = readNumber();
        int cont = 2;
        System.out.println("Numeros pares entre 2 e " +limSuperior + ":");
        while(cont <= limSuperior)
        {   //se cont for par
            if(cont%2==0)
            {
                System.out.println(cont );
            }
            cont = cont +1 ;//cont++ poderia ser usado ou cont+=1 ou ++cont
        }



    }
}
