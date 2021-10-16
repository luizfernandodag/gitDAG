package FundamentosJava.Section37Matrizes;

public class TestesMatrizes {
    public static void println (String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args) {
        //Declarando a matriz e instanciando
        int idades[][] = new int[3][2];

        //setando os valores da matriz:
        idades[0][0] = 5;
        idades[0][1] = 10;
        idades[1][0] = 7;
        idades[1][1] = 20;
        idades[2][0] = 90;
        idades[2][1] = 5;

        //impriminod elementos da matriz de inteiros
        println("Elemento matrix de inteiros 0,0: " + idades[0][0]);
        println("Elemento matrix de inteiros 2,1: " + idades[2][1]);


        //declarando marriz de objetos do tipo Pessoa

        Pessoa pessoas [][] = new Pessoa[1][2];

        pessoas[0][0] = new Pessoa("Luiz");
        pessoas[0][1] = new Pessoa("Gadelha");

       // println("/matriz de pessoas 0,0: " + pessoas[0][0]);
       // println("matriz de pessoas 0,1: " + pessoas[0][1]);
        println("");

        for (int linha = 0; linha< pessoas.length; ++linha)
        {
            for (int coluna = 0; coluna < pessoas[0].length; ++coluna)
            {
                println("pessoas(" + linha + "," +coluna + "): " + pessoas[linha][coluna].getNome());
            }
        }




    }
}
