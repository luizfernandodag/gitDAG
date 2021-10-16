package FundamentosJava.Section27UsoPalavraThisENull.UsoNull;

import FundamentosJava.Section19CriacaoClasses.CriacaoClasse.Pessoa;

public class UsoNull {
    public static void main(String[] args) {
        UsoNull n = new UsoNull();

        n.testeNull();

    }

    public void testeNull()
    {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = p1;
        System.out.println("p1:" + p1.hashCode());
        System.out.println("p2:" + p2.hashCode());

        p1 = null;
        if(p1 ==null)
        {
            System.out.println("p1 nulo");
        }

    }
}
