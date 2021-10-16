package FundamentosJava.Section19CriacaoClasses.CriacaoClasse;
//modificador nome
public class Pessoa {
    //atributos
   public  String nome;
   public  String sobrenome;

    public  void printPessoa()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);

    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //definição de atributos do objeto usando o ponto
        p1.nome="Luiz";
        p1.sobrenome="Gadelha";

    }



}
