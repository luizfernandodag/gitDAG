package FundamentosJava.Section21Metodos.ProjetoAritmetica;

public class ProjetoCaixa {

   private double largura, comprimento, altura;


    public ProjetoCaixa(double largura, double comprimento, double altura) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public ProjetoCaixa()
    {
        this.largura=0;
        this.comprimento=0;
        this.altura=0;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getVolume()
    {
        double volume = this.getAltura()*this.getComprimento()*this.getLargura();
        return volume;
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "largura:" + largura +
                ", comprimento:" + comprimento +
                ", altura:" + altura +
                "\nVolume: "+this.getVolume()+
                '}';


    }

    public static void main(String[] args) {

        ProjetoCaixa caixa1 = new ProjetoCaixa(2,2,2);
        ProjetoCaixa caixa2 = new ProjetoCaixa(3,3,3);
        ProjetoCaixa caixa3 = new ProjetoCaixa(0,25,25);

        System.out.println(caixa1.toString());
        System.out.println(caixa2.toString());
        System.out.println(caixa3.toString());


        Object p1 = new String("PS4");
        Object p2 = 1500;
        System.out.println("Endereços originais:");
        System.out.println("p1:" + p1.hashCode());
        System.out.println("p2:" + p2.hashCode());
        System.out.println("Conteudos originais:");
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        p2 =  p1;
        System.out.println("Endereços após fazer p2 = p1:");
        System.out.println("p1:" + p1.hashCode());
        System.out.println("p2:" + p2.hashCode());
        System.out.println("Conteudos após fazer p1 = p2:");
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);




    }
}
