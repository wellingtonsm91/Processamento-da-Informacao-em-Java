package exerc2_matrizes_balan_somamatriz;


import java.util.Scanner;

public class Exerc2_matrizes_balan_somamatriz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrizA[][] = new int[3][2];
        int matrizB[][] = new int[3][2];
        int matrizC[][] = new int[3][2];
        int soma = 0;


        //matriz A
        System.out.println("Matriz A :");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {
                matrizA[i][j] = input.nextInt();
                
                System.out.println(i + "," + j + ":"+ matrizA[i][j]);
            }
        }
        
        //matriz B
        System.out.println("Matriz B :");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {
                matrizB[i][j] = input.nextInt();
                
                System.out.println(i + "," + j + ":"+ matrizB[i][j]);
           }   
        }
        //matriz C
        System.out.println("Matriz C :");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                
                System.out.println(i + "," + j + ":"+ matrizC[i][j]);
           }   
        }
        
        
  
  //********************      
    }
}
