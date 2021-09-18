package FundamentosJava.TiposPrimitivos;

public class TipoBoolean {
    public static void main(String[] args) {
        //bollean
        System.out.println("true em Boolean:" +Boolean.TRUE);
        System.out.println("false em Boolean:" +Boolean.FALSE);
        boolean boolValue = true;
        if(boolValue == true)
        {
            System.out.println("Entrei no if");

        }
        else
        {
            System.out.println("Entrei no else");
        }
        //Execicio Exemplo


        String cargo = "Funcionario";
        double salario = 0;
        boolean boolCargoPresidente = cargo.equals("Presidente");
        boolean salarioMaior5000 = false;

        if(boolCargoPresidente)
        {
            salario = 10000;

        }
        else {
            salario = 5000;
        }

        if(salario>5000)
        {
            System.out.println("Salario maior que 5000");

        }
        salarioMaior5000 = salario>5000;
        String stringOut = "Cargo: "+cargo +"\nSalario: " + salario;
        System.out.println(stringOut);
        stringOut = "Cargo: "+cargo +"\nSalario: " + salario+"\nboolCargoPresidente: " + boolCargoPresidente;
        System.out.println(stringOut);







    }
}
