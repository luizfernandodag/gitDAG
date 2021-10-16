package FundamentosJava.Section21Metodos.ProjetoAritmetica;

public class TestesAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();

        System.out.println("Soma: 2 + 2: " +aritmetica.Somar(2,2));
        System.out.println("Subtracao: 2 - 2: " +aritmetica.Subtrair(2,2));
        System.out.println("Divisao: 2 / 2: " +aritmetica.Dividir(2,2));
        System.out.println("Multiplicar: 2 - 2: " +aritmetica.Multiplicar(2,2));

        // Novo objeto aritmetica
        Aritmetica aritmetica2 = new Aritmetica(2,2);
        System.out.println("Soma: 2 + 2: " +aritmetica2.Somar());
        System.out.println("Subtracao: 2 - 2: " +aritmetica2.Subtrair());
        System.out.println("Divisao: 2 / 2: " +aritmetica2.Dividir());
        System.out.println("Multiplicar: 2 - 2: " +aritmetica2.Multiplicar());


    }
}
