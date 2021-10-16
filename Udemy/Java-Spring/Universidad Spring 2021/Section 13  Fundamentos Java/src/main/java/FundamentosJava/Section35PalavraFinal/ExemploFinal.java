package FundamentosJava.Section35PalavraFinal;

public class ExemploFinal {



    static final void println(String s)
    {
       System.out.println(s);

       int [] intArray = {1,2,3,4,5,6,7,8,9};

       Pessoa [] pessoas = {new Pessoa(), new Pessoa("Luiz")};
    }
    public static void main(String[] args) {
        //tentando modificiar um atributo final:
        //ClasseFinal.ANO_NASCIMENTO = 2021;
        //tentando modificar a referencia de um objeto final:
        //ClasseFinal.p = new Pessoa();

        //podemos alterar as instâncias de um objeto final:
        //ClasseFinal.p.setNome("Luiz");
        //println(ClasseFinal.p.getNome());
        //ClasseFinal.p.setNome("Fernando");
       // println(ClasseFinal.p.getNome());
    }
}
