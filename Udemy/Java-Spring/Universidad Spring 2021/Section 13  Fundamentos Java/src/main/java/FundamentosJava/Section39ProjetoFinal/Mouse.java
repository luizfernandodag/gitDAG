package FundamentosJava.Section39ProjetoFinal;

public class Mouse extends DipositivosEntradas {
    private int idMouse;
    private static int contadorMouses;

    public Mouse(String tipoEntrada, String marca)
    {
        super(tipoEntrada,marca);
        this.idMouse = ++contadorMouses;
    }
    public Mouse()
    {
        super();
        this.idMouse = ++contadorMouses;
    }

    public int getIdMouse() {
        return idMouse;
    }


    public static int getContadorMouses() {
        return contadorMouses;
    }

    public static void setContadorMouses(int contadorMouses) {
        Mouse.contadorMouses = contadorMouses;
    }

    @Override
    public String toString() {
        return super.toString()+ "Mouse{" +
                "idMouse=" + idMouse +
                '}';
    }
}
