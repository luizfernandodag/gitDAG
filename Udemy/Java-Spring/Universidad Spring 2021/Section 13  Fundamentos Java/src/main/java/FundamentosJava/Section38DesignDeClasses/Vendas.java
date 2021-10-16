package FundamentosJava.Section38DesignDeClasses;

public class Vendas {
    public static void main(String[] args) {

        Produto p1 = new Produto("Camisa", 50);
        Produto p2 = new Produto("Calça", 100);
        Produto p3= new Produto("Tenis", 75);

        Ordem o1 = new Ordem();
        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p3);

        o1.showOrder();
    }
}
