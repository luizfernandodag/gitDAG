package FundamentosJava.Section38DesignDeClasses;

public class Produto {
    private int idProduto;
    private String nome;
    private double preco;
    private static int contadorProduto;

    private Produto()
    {
        this.idProduto = ++contadorProduto;
    }


    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static int getContadorProduto() {
        return contadorProduto;
    }

    public static void setContadorProduto(int contadorProduto) {
        Produto.contadorProduto = contadorProduto;
    }
}
