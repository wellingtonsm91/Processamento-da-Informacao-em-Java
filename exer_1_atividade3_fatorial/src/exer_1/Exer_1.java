/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_1;

import java. util.Scanner;

public class Exer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n,c;
        double fat;   //fatorial
        
        Scanner imput = new Scanner(System.in);
        
        System.out.println("Entre com o valor para se tirar o fatorial:");
        
        n =  imput.nextInt();
        
        c = 1;
        fat = 1;
        
        if ( n < 0 ){
        
            System.out.println("Não é possível calcular o fatorial de n");
        
        }
        else {
                while(c <= n ){

                    fat = fat * c;
                    c++;

                }
                
             System.out.println(" O fatorial de n é:" +fat);                                 
        
        }
      
       
        
    
    }
}
