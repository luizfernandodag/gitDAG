package FundamentosJava.Section26UsoPalavraReturn.ReturnPackage;

public class ReturnEObject {
    static public String str = "";

    public static String getString(String text)
    {
        return "texto retornado: "+ text;

    }

    public static void main(String[] args) {
        System.out.println("Objeto: " + getString("teste"));
    }
}
