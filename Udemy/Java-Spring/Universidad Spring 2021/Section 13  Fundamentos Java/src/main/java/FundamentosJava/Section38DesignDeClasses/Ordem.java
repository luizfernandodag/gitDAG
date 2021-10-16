package FundamentosJava.Section38DesignDeClasses;

public class Ordem {
    private Produto[] produtos;
    private int numProdutos;
    private int idOrdem;
    private static int contadorOrdems;
    private static final int MAX_PRODUCTS = 100;
    public void print(String s)
    {
        System.out.print(s);
    }
    public void println(String s)
    {
        System.out.println(s);
    }
    public Ordem()
    {
        this.idOrdem = ++contadorOrdems;
        this.produtos = new Produto[MAX_PRODUCTS];
        this.numProdutos = 0;
    }

    public void addProduct(Produto produto )
    {
        if(numProdutos < MAX_PRODUCTS)
        {
            produtos[numProdutos++] = produto;
        }
        else
        {
            System.out.println("Vamlor máximo de produtos( "+MAX_PRODUCTS+" ) excedido");
        }

    }

    public double calculateTotal()
    {
            double precoTotal = 0;
            for(int i = 0; i < numProdutos; i++) {
                precoTotal += produtos[i].getPreco();
            }

            return precoTotal;

    }

    public void showOrder()
    {
        println("Ordem #" + this.idOrdem);
        println("Produtos da ordem:");
        for(int i = 0; i< this.numProdutos; i++)
        {
            println("Produto " + (i+1)+":" + produtos[i].getNome() + " preco: " +produtos[i].getPreco() );
        }
        println("--------------------------------------");
        println("Total ordem: " + this.calculateTotal());

    }
}
