package exerc3_matrizes_balan_dezdiagonal;

public class Exerc3_matrizes_balan_dezdiagonal {

    public static void main(String[] args) {

        int matrizA[][] = new int[6][6];

        //matriz A

        System.out.println("Matriz A :");

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                if (i == j) {
                    matrizA[i][j] = 10;
                } else {
                    matrizA[i][j] = 1;
                }
                System.out.println(i + "," + j + ":" + matrizA[i][j]);

            }

        }

        //****************************   
    }
}
