package FundamentosJava.Section14Variaveis.Variaveis;

public class CaracteresEspeciais {
    public static void main(String[] args) {
        String nome = "Luiz";
        String saudacao = "oi";

        System.out.println("Espaço: " + saudacao + " " +nome);
        System.out.println("Nova linha: " + saudacao + "\n" +nome);
        System.out.println("Tab: " + saudacao + "\t" +nome);
        System.out.println("Backspace: " + saudacao + "\b\b\b" +nome);
                System.out.println("Carriage Return: " + saudacao + " " +nome);
        //System.out.println("Carriage Return: " + System.lineSeparator());
        System.out.println("Aspas Simples: " + saudacao + "\'" +nome + "\'");
        System.out.println("Espaço: " + saudacao + "\"" +nome+"\"");
    }

}
