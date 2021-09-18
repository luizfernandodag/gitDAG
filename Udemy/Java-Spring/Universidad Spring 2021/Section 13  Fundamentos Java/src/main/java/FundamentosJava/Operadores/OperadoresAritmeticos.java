package FundamentosJava.Operadores;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static int LerNumeroInteiro()
    {
        String num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        num = scanner.nextLine();

        return Integer.parseInt(num);
    }
    public static boolean verificarNumeroPar(int numero)
    {   // resto = 0 -> divisivel
        if (numero % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }




    public static void main(String[] args) {
        int a=3, b=2;
        int resultadoSoma = a + b;
        int resultadoMultiplicacao = a*b;
        int resultadoSubtracao = a - b;
        int resultadoDivisao = a/b;
        int resultadoRestoDivisao = a%b;

        System.out.println("resultadoSoma: a+b: " + resultadoSoma);
        System.out.println("resultadoMultiplicacao: a*b: " + resultadoMultiplicacao);
        System.out.println("resultadoSubtracao: a-b: " + resultadoSubtracao);
        System.out.println("resultadoDivisao( divisao inteira): a/b: " + resultadoDivisao);
        System.out.println("resultadoRestoDivisao: a%b: " + resultadoRestoDivisao);
        //exemplo restoda divisão-> numero par
        int numero = LerNumeroInteiro();
        boolean par = verificarNumeroPar(numero);
        System.out.println("Numero: "+ numero + "\npar? " + par);



    }
}
