package FundamentosJava.Operadores;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int a = 3, b = 2;
        //atribuindo valor de 'a' a variavel c
        int c = a;
        System.out.println("c: "+c);
        c = 2*a - b;
        System.out.println("c: "+c);

        //operadores de incrimento
        System.out.println("a++: " + a++);
        a=3;
        System.out.println("++a: " + ++a);
        //operadores da tabela

        a = 3;
        a+=1;
        System.out.println("a+=1: " + a);
        a= 3;
        a*=2;
        System.out.println("a*=2: " + a);
        a= 3;
        a/=2;
        System.out.println("a/2: " + a);
        a= 3;
        a%=2;
        System.out.println("a%=2: " + a);





    }
}
