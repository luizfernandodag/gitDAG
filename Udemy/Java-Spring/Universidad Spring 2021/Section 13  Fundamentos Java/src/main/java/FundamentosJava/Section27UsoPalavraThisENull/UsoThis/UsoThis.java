package FundamentosJava.Section27UsoPalavraThisENull.UsoThis;

public class UsoThis {

    public static void main(String[] args) {

        UsoThis t = new UsoThis();
        t.criarObjetos();
    }

    public void criarObjetos()
    {
        c1 C1 = new c1(this);
        c2 C2 = new c2(this);

        printThis(this);
        C1.printThis(this);
        C2.printThis(this);

    }

    public  void printThis(Object t)
    {
        System.out.println("Usothis - variável this" + this );
        System.out.println("Object passado - variável this" + t );
    }
}

class c1{
    Object t1;
    public Object getT1() {
        return t1;
    }

    public  void printThis(Object t)
    {
        System.out.println("Usothis - variável this" + this );
        System.out.println("Object passado - variável this" + t1 );
    }


    public void setT1(Object t1) {
        this.t1 = t1;
    }


    public c1(Object t)
    {
        this.t1 = t;
    }


}

class c2{

    Object t2;

    public  void printThis(Object t)
    {
        System.out.println("Usothis - variável this" + this );
        System.out.println("Object passado - variável this" + t2 );
    }

    public c2(Object t2) {
        this.t2 = t2;
    }

    public Object getT2() {
        return t2;
    }

    public void setT2(Object t2) {
        this.t2 = t2;
    }
}