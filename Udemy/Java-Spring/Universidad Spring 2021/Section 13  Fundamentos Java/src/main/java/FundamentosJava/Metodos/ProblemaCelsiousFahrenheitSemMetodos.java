package FundamentosJava.Metodos;

public class ProblemaCelsiousFahrenheitSemMetodos {
    public static void main(String[] args) {
        double C = 10; //variavel para guardar a temperatura em Celsious
        double F = 10; //variavel para guardar a temperatura em Fahrenheit
        double FtoC = (F-32)*5/9 ; // variavel para guardar o resultado da conversão de celsious para fahrenheit
        double CtoF = C*1.8 + 32 ; // variavel para guardar o resultado da conversão de celsious para fahrenheit

        System.out.println(C +" Celsious: " + CtoF + " Fahrenheit");
        System.out.println(F +" Fahrenheit: " + FtoC + " Celsious");


    }
}
