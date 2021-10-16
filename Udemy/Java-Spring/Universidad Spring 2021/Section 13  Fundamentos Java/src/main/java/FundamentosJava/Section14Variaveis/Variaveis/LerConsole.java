package FundamentosJava.Section14Variaveis.Variaveis;

import java.util.Scanner;

public class LerConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o nome do usuario:");
        String usuario = scanner.nextLine();
        System.out.println(usuario);
    }
}
