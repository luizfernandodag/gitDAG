package FundamentosJava.Section21Metodos.ProjetoAritmetica;

public class Aritmetica {
    public Integer a, b;


    //construtor vazio
   public  Aritmetica()
    {
        this.a = 0;
        this.b = 0;

    }

    //construtor com as duas variaveis
    public Aritmetica(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    //construtor com variaveis de tipo distinto dos tipos das instâncias
    public Aritmetica (String a, String b)
    {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }

    public double Somar()
    {
        if(a != null && this.b != null )
            return this.a+this.b;

        return 0;
    }
    public double Multiplicar()
    {
        if(a != null && this.b != null )
            return this.a*this.b;

        return 1;
    }

    public double Dividir()
    {
        if(a != null && this.b != null && this.b != 0)
            return this.a/this.b;

        return 1;
    }

    public double Subtrair()
    {
        if(a != null && this.b != null )
            return this.a-this.b;

        return 0;
    }













    public double Somar(double a, double b)
    {
        return a+b;
    }




    public double Subtrair(double a, double b)
    {
        return a-b;
    }

    public double Multiplicar(double a, double b)
    {
        return a*b;
    }

    public double Dividir(double a, double b)
    {
        if(b == 0)//divisão por zero
        {
            return 0;
        }
        return a/b;
    }


}
