public class Aula4 {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000; // pode fazer mas vai haver perda de valores
        b1 = (byte) s1;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 100000000000000l; //pode, mas haverá perda de informação
        i2 = (int)l2;

        int i3;
        long l3  = 10000l;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10500.56;
        f2 = (float)d2;
        double d3 = 25.4561321549832;// havera perda pq muitos numeros depois da virgula(vai truncar)
        f3 = (float) d3;

        int i4;
        float f4 = 11.321587f;
        i4 = (int) f4; // haverá perda de todo o valor depois da virgula

        System.out.println(b1);
        System.out.println(l1);
        System.out.println(i2);
        System.out.println(13);
        System.out.println(d1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(14);


    }
}
