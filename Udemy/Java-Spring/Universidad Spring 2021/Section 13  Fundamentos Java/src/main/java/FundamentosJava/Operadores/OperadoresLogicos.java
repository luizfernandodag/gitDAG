package FundamentosJava.Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int val   = 50;
        int valorMinino = 0;
        int valorMaximo = 100;
      // operador AND
        boolean dentroRange = val<valorMaximo && val> valorMinino;

        System.out.println("val está dentro do range(0-100)?: "+ dentroRange);
        //operador OR
        String status   = "sono";
        boolean dormir =status.equals("sono")|| status.equals("hora de dormir");
        System.out.println("Dormir agora?" +dormir);


    }
}
