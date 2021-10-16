/**
 * Classe para fazer operações aritméticas como soma, subtração, etc
 * @author : luiz.f.gadelha
 *
 * @version: 1.0
 */
public class Aritmetica {
    /*
     * Primeiro Operando
     */
    private int oparandoA;
    /*
     * Segurando Operando
     */
    private int oparandoB;



   /*
   construtores
    */
    public Aritmetica() {
    }

    /**
     * Esse método realiza a soma de numeros inteiros
     * @return int valor da doma
     *
     */
    public int somar()
    {
        return this.oparandoA + this.oparandoB;
    }
}
