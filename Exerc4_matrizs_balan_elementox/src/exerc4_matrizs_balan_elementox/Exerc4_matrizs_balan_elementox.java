
package exerc4_matrizs_balan_elementox;

import java.util.Random;
import java.util.Scanner;


public class Exerc4_matrizs_balan_elementox {

    public static void main(String[] args) {
        // Primeira parte - matriz de dimensão N x M
       Scanner entrada = new Scanner(System.in); 
       Random gerador = new Random();
       
       System.out.println("Entre com a quantidade de linhas da matriz");
       int N = entrada.nextInt();
       System.out.println("Entre com a quantidade de colunas da matriz");
       int M = entrada.nextInt();
       int matriz[][] = new int[N][M];
       
       //Preenchimento da matriz
       for(int i = 0; i < N ; i++){
           
           for(int j = 0; j < M ; j++){
               
               matriz[i][j] = gerador.nextInt(99);
               
           }
       }
       // Verificação do elemento X
       System.out.println("Entre com um número entre 0 e 99 a ser procurado na matriz ");
       int x = entrada.nextInt();
       boolean contem = false;
       for(int i = 0; i < N ; i++){
           for(int j = 0; j < M ; j++){
               if( (matriz[i][j]) == x){
                   System.out.println("O numero x está na linha "+(i+1)+" ,coluna "+(j+1));
                   contem = true;
                   break;
               }
           }
        
       }
           if (contem == false){
              System.out.println("O numero x n não está contido na matriz");  
            }
 //*****************************************************       
    }
}
