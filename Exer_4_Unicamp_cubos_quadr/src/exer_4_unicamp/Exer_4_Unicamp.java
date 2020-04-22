package exer_4_unicamp;

public class Exer_4_Unicamp {

    public static void main(String[] args) {

        int n, i, q, c;    // q = numero inteiro elevado ao quadrado/ c = numero inteiro elevado ao cubo


        for (i = 1; i <= 15; i++) {
            n = i;
            q = (int) Math.pow(n, 2);
            c = (int) Math.pow(n, 3);


            System.out.println("" + i + "  " + q + "  " + c);
        }

    }
}
