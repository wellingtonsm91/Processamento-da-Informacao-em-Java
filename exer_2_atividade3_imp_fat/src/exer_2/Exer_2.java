/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_2;

import java. util.Scanner;

public class Exer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int  N, imp , soma,s ,i;  //  imp = impares
        
        
      Scanner imput = new Scanner(System.in);

      System.out.println("Entre com um valor inteiro positivo:");
      
      N =  imput.nextInt();
      
      i = 1;
      imp = 1;
      soma = 0;
      
      while(i <=N){
          
      soma = soma+imp;
      imp = imp+2;
      i++;
      }
      System.out.println("O somatorio do impares é " + soma);
        
    }
}
