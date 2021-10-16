package FundamentosJava.Section39ProjetoFinal;

public class Computador {

    private int idComputador;
    private static int contadorComputadores;
    private String nome;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;

    private Computador()
    {
        this.idComputador = ++contadorComputadores;
    }


    public Computador(String nome, Monitor monitor, Teclado teclado, Mouse mouse) {
        this();
        this.nome = nome;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public static int getContadorComputadores() {
        return contadorComputadores;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "\nidComputador=" + idComputador +
                ", \nnome='" + nome + '\'' +
                ", \nmonitor=" + monitor.toString() +
                ", \nteclado=" + teclado.toString() +
                ", \nmouse=" + mouse.toString() +
                '}';
    }
}
