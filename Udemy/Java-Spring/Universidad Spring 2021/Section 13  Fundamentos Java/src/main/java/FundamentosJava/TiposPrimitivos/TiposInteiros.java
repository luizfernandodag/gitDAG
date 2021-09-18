package FundamentosJava.TiposPrimitivos;

public class TiposInteiros {
    public static void main(String[] args) {
        byte b= 15;
        System.out.println("Valor da variavel byte: " + b);
        b = (byte)150;
        //bytes
        System.out.println("BYTE (8 bits)");
        System.out.println("Valor da variavel byte, além do máximo permitido: " + b);
        System.out.println("Tamanho de um byte( quantidade de bits): " + Byte.SIZE);
        System.out.println("Quantidade de bytes de um byte:" + Byte.BYTES);
        System.out.println("Valor máximo do byte: " + Byte.MAX_VALUE);
        System.out.println("Vaor mínimo do byte: " +Byte.MIN_VALUE);

        //short
        Short sh = 15;
        System.out.println("SHORT(16 bits)");

        System.out.println("Tamanho de um short( quantidade de bits): " + Short.SIZE);
        System.out.println("Quantidade de bytes de um short:" + Short.BYTES);
        System.out.println("Valor máximo do short: " + Short.MAX_VALUE);
        System.out.println("Vaor mínimo do short: "  + Short.MIN_VALUE);
        System.out.println("valor variavel short:"+sh);
        sh = (short) 400000;
        System.out.println("valor variavel short, além do máximo permitido:"+sh);
        //Integer
        int i = 15;
        System.out.println("INTEGER(32 bits)");

        System.out.println("Tamanho de um integer( quantidade de bits): " + Integer.SIZE);
        System.out.println("Quantidade de bytes de um integer:" + Integer.BYTES);
        System.out.println("Valor máximo do integer: " + Integer.MAX_VALUE);
        System.out.println("Vaor mínimo do integer: "  + Integer.MIN_VALUE);
        System.out.println("valor variavel integer:"+i);
        //i = (int)11111111111;
        System.out.println("valor variavel integer, além do máximo permitido:"+i);

        //long
        long l = 1500000000;
        System.out.println("Long (64 bits)");

        System.out.println("Tamanho de um long ( quantidade de bits): " + Long.SIZE);
        System.out.println("Quantidade de bytes de um long: " + Long.BYTES);
        System.out.println("Valor máximo do long: " + Long.MAX_VALUE);
        System.out.println("Vaor mínimo do long: "  + Long.MIN_VALUE);
        System.out.println("valor variavel long:"+l);
        //l = (long) 11111111111111;
        System.out.println("valor variavel long, além do máximo permitido:"+l);





    }
}
