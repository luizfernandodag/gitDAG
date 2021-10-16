package FundamentosJava.Section37Matrizes;

import FundamentosJava.Section36UsoDeArrays.Pessoa;

public class ExemploMatrizes {
    static void println(String s)
    {
        System.out.println(s);
    }

    static void print(String s)
    {
        System.out.print(s);
    }

    public static void main(String[] args) {
        //declarando uma matriz 3 por 2
        int idades [][] = new int[3][2];

        //setando os valores

        idades[0][0] = 1;
        idades[0][1] = 3;
        idades[1][0] = 5;
        idades[1][1] = 7;
        idades[2][0] = 9;
        idades[2][1] = 11;

        //esse matriz também pode ser definida assim:

        idades = new int[][]{{1, 3}, {5, 7}, {9, 11}};
        //printando a matriz por linhas
        println("Matriz 3X2:");
        println("     0 | 1" );
        println(" ----------- " );
        print(" 0 | " + idades[0][0] + " | " );
        println(idades[0][1] + "| " );
        print(" 1 | " + idades[1][0] + " | " );
        println(idades[1][1] + "| " );
        print(" 2 | " + idades[2][0] + " | " );
        println(idades[2][1] + "| " );
        println(" ----------  " );

        // array de objetos Pessoa
        Pessoa pessoas[][] = {{new Pessoa("Luiz"), new Pessoa("Ana"), new Pessoa("Fernando")}, {new Pessoa("Barbara"), new Pessoa("Camila"), new Pessoa("Daniela") }};
        println("Matriz de Pessoas");
        println("     0   |   1      |     2" );
        println(" ----------- " );
        //percorrendo as linhas
        for (int i = 0; i< pessoas.length; i++)
        {
            //percorrendo as colunas
            for (int j = 0; j< pessoas[i].length; j++)
            {
                if(j==0)
                {
                    print(" " + i +  "| "+ pessoas[i][j].getNome() + " | " );
                }
                else if( j < pessoas[i].length-1)
                {
                    print( "| "+ pessoas[i][j].getNome() + " | " );
                }
                else
                {
                    println( "| "+ pessoas[i][j].getNome() + " | " );
                }
            }
        }

        println("Matriz pessoas, quantindade de linhas: " + pessoas.length );
        println("Matriz pessoas, quantindade de colunas: " + pessoas[0].length );

        //percorrendo as linhas
        for (int i = 0; i< pessoas.length; i++) {
            //percorrendo as colunas
            for (int j = 0; j < pessoas[i].length; j++) {
                println("elemento(" + i +"," + j + ")");
            }
        }

    }



}
