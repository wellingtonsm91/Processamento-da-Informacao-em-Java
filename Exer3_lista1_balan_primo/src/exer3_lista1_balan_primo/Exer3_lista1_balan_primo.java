
package exer3_lista1_balan_primo;

import java.util.Scanner;


public class Exer3_lista1_balan_primo {

 
    public static void main(String[] args) {
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
