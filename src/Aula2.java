public class Aula2 {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;

        //int i1 = -10000000000; muito abaixo do valor suportado
        int i2 = 28500;

        long l1 = 1000000000000000000l;//long tem que colocar letra l no final
        long l2 = 2000000000000000000l;

        //float f1 = 4.5; // exige que esja colocado o f no final senão da erro.
        float f2 = 10.45f;

        double d1 = 40.99;
        double d2 = 25.85d; // os 2 estão corretos pq double não exige o d no final pq ja é default

        char c1 = 'T';
        //char c2 = 'tc'; // não deixa colocar 2 caracteres
        //char c3 = '\oooo'; //funciona colocando o nome da letra(não é usual)

        String st1 =  "aula2";
        String st2 =  "esta é aula java 2";

        //String st4 = "28/05/1973"; (funciona, mas tipo de dado está errado)

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(bo1);
        System.out.println(bo2);



    }
}
