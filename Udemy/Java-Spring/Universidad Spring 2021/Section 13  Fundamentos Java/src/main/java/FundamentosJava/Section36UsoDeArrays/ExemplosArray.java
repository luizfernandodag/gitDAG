package FundamentosJava.Section36UsoDeArrays;

import FundamentosJava.Section35PalavraFinal.Pessoa;

public class ExemplosArray {
    public static void print(String s)
    {
        System.out.print(s);
    }
    public static void println(String s)
    {
        System.out.println(s);
    }
    public static void main(String[] args) {
        //Declarando e inicializando o array de inteiros
        int idades[] = new int[2];
        //definindo os valores do array
        idades[0] = 30;
        idades[1] = 60;
        println("Array idades indice 0: " + idades[0]);
        println("Array idades indice 1: " + idades[1]);
        //declarando array de objetos da classe Pessoa
        Pessoa pessoas[] = new Pessoa[2];
        pessoas[0] = new Pessoa("Luiz");
        pessoas[1] = new Pessoa("Fernando");
        println("Array pessoa indice 0: " + pessoas[0] + " Nome: " + pessoas[0].getNome());
        println("Array pessoa indice 1: " + pessoas[1] + " Nome: " + pessoas[1].getNome());

        for (int i = 0; i < idades.length; ++i)
        {
            println("Loop: contador: " + i + " idades[" + i + "]: " + idades[i]);
        }
    }
}
