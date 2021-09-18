package FundamentosJava.SentencasControle;

import java.util.Scanner;

public class EstacaoAnoSwicth {
    public static int LerInteiro()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        return Integer.parseInt(scanner.nextLine());

    }

    public static void main(String[] args) {

        String estacao = "Estacao: ";
        int estacaoInt = LerInteiro();
        switch(estacaoInt)
        {
            case 1: case 2: case 3:
            estacao += "Verao";
            break;
            case 4: case 5: case 6:
            estacao += "Outono";
            break;
            case 7: case 8: case 9:
            estacao += "Inverno";
            break;
            case 10: case 11: case 12:
            estacao += "Primavera";
            break;
            default:
                estacao += "Estacao nao definida";

        }
        System.out.println(estacao);


    }
}
