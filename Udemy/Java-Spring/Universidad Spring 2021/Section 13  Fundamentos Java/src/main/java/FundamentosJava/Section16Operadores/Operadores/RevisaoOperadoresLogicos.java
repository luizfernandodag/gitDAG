package FundamentosJava.Section16Operadores.Operadores;

public class RevisaoOperadoresLogicos {
    public static void  printResultadoOperacoesLogicas(boolean x, boolean y)
    {
        boolean and = x&&y;
        boolean or  = x||y;
        boolean or_ = x^y;
        boolean n   = !x;


        System.out.println("|   X  |  Y   | X&&Y | X||Y |  X^Y  |  !X   |");
        System.out.println("| "+x+" | "+y+" | "+and+" | "+or+" | "+or_+" | "+n+" |");



    }

    public static void main(String[] args) {
        boolean x = true, y= true;
        printResultadoOperacoesLogicas(x,y);

    }

}
