package FundamentosJava.Section39ProjetoFinal;

public class Order {

    private int idOrder;
    private Computador computadores[];
    private static int contadorOrders;
    private int contadorComputadores;
    private static int MAX_COMPUTADORES = 100;

    public void print(String s)
    {
        System.out.print(s);
    }
    public void println(String s)
    {
        System.out.println(s);
    }



    public Order()
    {
        this.idOrder = ++contadorOrders;
    }



    public void addComputer(Computador computador)
    {
        if(contadorComputadores < MAX_COMPUTADORES)
        this.computadores[contadorComputadores++] = computador;
    }

    public void showOrder()
    {
        println("Ordem #" + this.idOrder);
        println("Produtos da ordem:");
        for(int i = 0; i< this.contadorComputadores; i++)
        {
            println("Computador " + (i+1)+":" + computadores[i].toString()  );
        }

    }
}
