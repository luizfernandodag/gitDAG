package FundamentosJava.SentencasControle;

public class ControleSwitch {
    public static void main(String[] args) {
        String pais = "Italy";
        switch (pais){
            case "USA":
                System.out.println("Born in the USA, I was born in the USA!");
                break;
            case "Argentina":
                System.out.println("Don't cry for me, Argentina.");
                break;
            case "Brazil":
                System.out.println("Tava ruim lá na Bahia, profissão de boia-fria");
                break;
            default:
                System.out.println("Hello person from " + pais);

        }


    }
}
