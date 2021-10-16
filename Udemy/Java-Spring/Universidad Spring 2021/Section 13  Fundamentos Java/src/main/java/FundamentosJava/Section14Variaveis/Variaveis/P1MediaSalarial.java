package FundamentosJava.Section14Variaveis.Variaveis;

public class P1MediaSalarial {
    public static double mediaSalarial(double total, int numFuncionarios)
    {
        double mediaSalario = total/numFuncionarios;
        return mediaSalario;
    }

    public static void main(String[] args) {
        double andreSalario = 5000.00;
        double brunaSalario = 7254.00;
        double carlosSalario = 3555.00;
        double camilaSalario = 4100.00;
        double totalSalario = andreSalario+brunaSalario+carlosSalario+camilaSalario;
        double mediaSalario = mediaSalarial(totalSalario,4);
        String s = "Media salarial na empresa: " +mediaSalario+" R$\n";
        System.out.println(s);


        

    }
}
