/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usp_10_triangular;

import java.util.Scanner;


public class Usp_10_triangular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero,i,j,k;
        boolean loop;
        
         Scanner imput =  new Scanner(System.in); //função para entrada de dados
         
         System.out.println("Digite o numero a verificar: ");
         numero = imput.nextInt();
         
         // Loop que verificará se o numero é triangular
         
         do 
         {    
            
         
            i = 1;
            j = ++i;
            k = ++i;
        
            if (((numero%i)== 0) & ((numero%j)== 0) & ((numero%k)==0))
            {
                System.out.println("O numero digitado é triangular!");
            }
            else
            {
                i = 2;
                 System.out.println("O numero digitado NÃO é triangular!");
            }
         
         } while ( i == numero);
         
          
    }
}
