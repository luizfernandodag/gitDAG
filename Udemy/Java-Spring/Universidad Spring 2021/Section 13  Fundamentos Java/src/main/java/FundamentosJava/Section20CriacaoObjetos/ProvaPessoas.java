package FundamentosJava.Section20CriacaoObjetos;

import FundamentosJava.Section19CriacaoClasses.CriacaoClasse.Pessoa;

public class ProvaPessoas {
    public static void main(String[] args) {

        //criacao de objetos da classe Pessoa

        Pessoa pessoa1 = new Pessoa();
        //definição do valor das instância do objetos:

        pessoa1.nome="Luiz";
        pessoa1.sobrenome="Gadelha";

        pessoa1.printPessoa();


        //criação do segundo objeto da classe pessoa:

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome="Luiz";
        pessoa2.sobrenome="Souza";

        pessoa1.printPessoa();
        pessoa2.printPessoa();


    }
}
