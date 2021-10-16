package FundamentosJava.Section34Pacotes.Exercicio;
import FundamentosJava.Section34Pacotes.Exercicio.Utilidades;
import static FundamentosJava.Section34Pacotes.Exercicio.Utilidades.print;
public class ExercicioPacotes {

    public static void main(String[] args) {
        //forma completamente qualificada
        FundamentosJava.Section34Pacotes.Exercicio.Utilidades.print("Print de um método estático, forma completamente qualificada");
        // por meio do import da classe
        Utilidades.print("\nPrint de um método estático, usando import da classe");
        //import static do método
        print("\nPrint de um método estático, usando import static do método");

    }
}
