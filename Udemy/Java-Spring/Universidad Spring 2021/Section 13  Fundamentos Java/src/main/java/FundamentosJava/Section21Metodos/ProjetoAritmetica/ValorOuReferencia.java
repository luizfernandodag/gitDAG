package FundamentosJava.Section21Metodos.ProjetoAritmetica;

public class ValorOuReferencia {
    private static Integer objInteger = new Integer(3);

    public static void dobrar(int i)
    {
        i = i*2;
    }

    public static void dobrar2()
    {
        objInteger *= 2;
    }

    public static void main(String[] args) {
        int val = 3;


        System.out.println("val ( variavel tipo primitivo): " + val);
        dobrar(val);
        System.out.println("val ( variavel tipo primitivo dobrado): " + val);

        System.out.println("val objeto: " + objInteger);
        dobrar2();
        System.out.println("val objeto dobrado: " + objInteger);

    }

}
