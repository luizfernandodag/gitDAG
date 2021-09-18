package FundamentosJava.TiposPrimitivos;

import java.util.Scanner;

public class TiposPrimitivosConversao {
    public static int LerIdade() {
        String idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:\n");
        idade = scanner.nextLine();

        return Integer.parseInt(idade);


    }

    public static boolean pertoAposentadoria(int idade, int aposentadoria) {
        boolean perto = aposentadoria - idade < 10; //Distância entre idade e aposentadoria é menor que 10 anos
        if (perto)
            return true;
        else {
            return false;
        }
    }


    public static void main(String[] args) {

        String num = "10";
        int VarConvertida = Integer.parseInt(num);
        System.out.println(num + ": convertido: " + VarConvertida + "\nn tipo:" + ((Object) VarConvertida).getClass().getName());

        //String a int
        String num2 = "10";
        int VarConvertida2 = Integer.parseInt(num2);
        System.out.println(num + ": convertido: " + VarConvertida + "\nn tipo:" + ((Object) VarConvertida).getClass().getName());

        //String a double
        String piStr = "3.1415";
        double pi = Double.parseDouble(piStr);
        System.out.println(piStr + ": convertido: " + pi + "\nn tipo:" + ((Object) pi).getClass().getName());
        // String o Char
        int i = 0;
        char c = "teste".charAt(i);
        System.out.println("Char na posição " + i + ": " + c);

        //Ler idade:
        int idade = LerIdade();

        boolean pertoApo = pertoAposentadoria(idade, 70);
        System.out.println("Idade: " + idade +"\nperto aposentadoria: " + pertoApo);



    }
}



