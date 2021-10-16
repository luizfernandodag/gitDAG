package section41;
/* classe de exemplo para demonstar o padrão javadoc
* @author: Luiz
* @version 1.0
* */


/**
 * The type Nome classe.
 */
public class NomeClasse{

    /*
    * Parametros:
    *
    * */

    /*
   Primeiro parametro
   * */
   private String s;
    /*
    Segundo parametro
    * */
   private Pessoa[] pessoas;
    /*
    Terceiro parametro
    * */
   private int contadorPessoas;

    //construtores

    /**
     * Instantiates a new Nome classe.
     *
     * @param s the s
     */
/*
   Construtor considerando o primeiro parametro
   * */
    public NomeClasse(String s) {
        this.s = s;
    }

    /**
     * Instantiates a new Nome classe.
     */
/*
   Construtor vazio da clase
   * */
    public NomeClasse()
    {
        this.s = "";
    }

    //métodos

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
/*
   Este é p método main o método principal

   * */
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Hello world");
    }

    /**
     * Adicionar pessoa.
     *
     * @param p the p
     */
/*
   Método para adicionar um objeto da classe Pessoa ao Array de pessoas da classe
   @param Pessoa p: um objeto da classe Pessoa
   
   * */
    public void adicionarPessoa(Pessoa p)
    {
        this.pessoas[contadorPessoas++] = p;
    }


    @Override
    public String toString() {
        return "NomeClasse{" +
                "s='" + s + '\'' +
                '}';
    }







}
