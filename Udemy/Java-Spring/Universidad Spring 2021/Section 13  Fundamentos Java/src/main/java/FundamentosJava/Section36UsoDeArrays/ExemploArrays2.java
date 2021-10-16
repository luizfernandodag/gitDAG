package FundamentosJava.Section36UsoDeArrays;

import FundamentosJava.Section31Heranca.Exercicio.Empregado;

public class ExemploArrays2 {

    public static void print(String s)
    {
        System.out.print(s);
    }

    public static void println(String s)
    {
        System.out.println(s);
    }

/*
        int m[][] = new int[3][4];

        m[1][0] = -5;

        int nomeMatrix [][] = new int[10][10];

        String [][] nomeMatrix2;

        nomeMatrix2 = new String[5][5];

        //definição matriz [2][2]
        int inteiros [][] = new int [2][2];

        //definição de valores da matriz

        inteiros[0][0] = 1;// elemento linha 0 coluna 0
        inteiros[0][1] = 2;// elemento linha 0 coluna 1
        inteiros[1][0] = 3;// elemento linha 1 coluna 0
        inteiros[1][1] = 4;// elemento linha 1 coluna 1

        //definição da matriz [2][2] para objetos da classe String
        String [][] nomes= new String[2][2];
        //definição dos valores da matriz se Strings
        nomes[0][0] = "Luiz";
        nomes[0][1] =  new String("Fernando");
        nomes[1][0] = "Fernanda";
        nomes[1][1] = "Carol";
       //assinalando o valor de um índice de uma matriz a uma vaiável
        variavel = nomeMatrix[índice_linha][índice_coluna];

        //definindo um dos índice de uma matriz usando o valor de uma variável.

        nomeMatrix[índice_linha][índice_coluna = variavel;

        int var1 = inteiros[0][0]; //lendo o índice [0][0] e assinalando a variável var
        Pessoa p = pessoas[0][0]; //lendo um objeto da classe pessoa salvo numa matriz de objetos pessoas

        int [][] matrizNumeros = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        Pessoa pessoas [][] = {{new Pessoa("Luiz"), new Pessoa("Fernando")}, {new Pessoa("Luiz"), new Pessoa("Fernando")}};
*/

    public static void main(String[] args) {
        Pessoa[] arrayPessoa = {new Pessoa("Luiz"), new Pessoa("Carla")};

        for(int i = 0; i < arrayPessoa.length; i++)
        {
            println("arrayPessoa[" + i + "]: " + arrayPessoa[i].getNome());
        }

    }
}
