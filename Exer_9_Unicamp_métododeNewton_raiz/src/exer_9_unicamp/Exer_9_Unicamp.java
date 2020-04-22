/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_9_unicamp;

import java.util.Scanner;

public class Exer_9_Unicamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner imput = new Scanner (System.in);
        
        double x, a;
        int i;
        i = 0;
        
                  
        System.out.println("Entre com o valor de a :");
        a = imput.nextDouble();
//        a = Math.pow(10, 12);
//      
//        System.out.println("O valor de a é :" + a);
        
        for (x = a/2; i <10; i++)
        {
            x = 0.5 * ( x + a/x);
          
        
        }
       
        
        System.out.println("X" +(i)+ " = " +x);
                   
        
        
    }
}
