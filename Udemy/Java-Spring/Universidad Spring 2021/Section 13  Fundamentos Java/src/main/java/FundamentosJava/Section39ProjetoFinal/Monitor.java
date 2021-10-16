package FundamentosJava.Section39ProjetoFinal;

public class Monitor extends DipositivosEntradas {

    private int idMonitor;
    private static int contadorMonitores;
    private double tamanho;

    private Monitor()
    {
        super();
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String tipoEntrada, String marca)
    {
        super(tipoEntrada, marca);
        this.idMonitor = ++contadorMonitores;

    }

    public Monitor( String tipoEntrada, String marca,double tamanho) {
        this(tipoEntrada, marca);
        this.tamanho = tamanho;
    }

    public int getIdMonitor() {
        return idMonitor;
    }


    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }


    @Override
    public String toString() {
        return super.toString() + "Monitor{" +
                "idMonitor=" + idMonitor +
                ", tamanho=" + tamanho +

                '}';
    }
}
