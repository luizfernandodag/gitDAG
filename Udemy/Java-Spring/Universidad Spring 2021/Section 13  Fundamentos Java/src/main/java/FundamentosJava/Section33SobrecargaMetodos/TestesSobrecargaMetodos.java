package FundamentosJava.Section33SobrecargaMetodos;

public class TestesSobrecargaMetodos {
    public static void main(String[] args) {
        Operacoes.println(""+ Operacoes.somar(1,1));
        Operacoes.println(""+Operacoes.somar(2.3,1.1));
        //novos métodos

        Operacoes.println(""+ Operacoes.somar(1,1.1));
        Operacoes.println(""+Operacoes.somar(2.1,1));

    }
}
