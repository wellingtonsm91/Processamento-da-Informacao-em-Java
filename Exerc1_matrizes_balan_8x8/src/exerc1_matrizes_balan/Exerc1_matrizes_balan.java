
package exerc1_matrizes_balan;

import java.util.Random;
//import java.util.Scanner;


public class Exerc1_matrizes_balan {

    
    public static void main(String[] args) {
     // matriz quadrada 8x8 e soma da matriz principal
//      Scanner imput = new Scanner(System.in);
        int matriz[][] = new int [8][8];
        int soma = 0;
        Random gerador = new Random();
        for ( int i = 0; i < 8; i++){
            
            for(int j = 0; j < 8; j++){
                matriz[i][j] = gerador.nextInt(99);
                //soma da diagonal principal:
                if (i == j){
                    soma = soma + matriz[i][j];
                }
                 System.out.println(i + "," + j + ":"+ matriz[i][j]);
            }
        }
        System.out.println("A soma das variáveis da  diagonal principal  é = " + soma);
    }
}
