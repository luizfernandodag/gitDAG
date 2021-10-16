package FundamentosJava.Section39ProjetoFinal;

public class mundopc {

    public static void main(String[] args) {
        Order o1 = new Order();
        Monitor monitor = new Monitor("HDMI", "LG",40);
        Teclado teclado = new Teclado("USB", "LG");
        Mouse mouse = new Mouse("USB", "LG");

        //Computador(String nome, Monitor monitor, Teclado teclado, Mouse mouse) {
        Computador pc1 =new Computador("Linux",monitor,teclado,mouse  );

        System.out.print(pc1.toString());
    }
}
