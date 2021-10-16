package FundamentosJava.Section28Encapsulamento;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Luiz",10000, false);
        System.out.println(p1.toString());

        p1.setElimininado(true);
        p1.setNome("Fernando");
        p1.setSaldo(10000000);
        System.out.println(p1.toString());

        //System.out.println("Soma: " + this.soma(1,2));


    }


    public int soma(int a , int b)
    {
        return a+b;
    }




}

