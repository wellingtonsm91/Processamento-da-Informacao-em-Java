/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author hpgarcia
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lista 1 - exercicio 03
        Scanner input = new Scanner(System.in);
        int n, div;
        boolean primo = true;
        
        System.out.print("Entre com um valor: ");
        
        n = input.nextInt();
        div = n/2;
        
        while(div > 1){
            if(n % div == 0){
                primo = false;
                break;
            }
            
            div--;
        }
        if(primo){
            System.out.println(" O número é primo!");
        }
        else{
            System.out.println(" O número não é primo!");
        }
    }
}
