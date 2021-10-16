package FundamentosJava.Section35PalavraFinal;

//não poderá ser extendida com o final
public  final class ClasseFinal {
    public final int num = 10;
    //variável final: tem que ser definida no momento da definição
    //como constante, é bom definir como static final
    //o padrão de nomeação de uma constante é usar letras maiúsculas
    public static final int ANO_NASCIMENTO = 1990;

    //definindo um objeto como final static ( uma constante)
    //Os parâmetros da classe podem ser editado, mas a referência do objeto não pode ser mudado
    public static final Pessoa p = new Pessoa();

    //final a um método: não pode ser reescrito
    public final void metodoFinal(){}
}
