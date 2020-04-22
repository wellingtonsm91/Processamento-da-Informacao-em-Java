/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package usp_12;

import java.util.Scanner;

public class Usp_12 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
                
        Scanner imput =  new Scanner(System.in); // Cria uma função que obtem dados via teclado
        
        int n1,n2, maior, menor,mdc,resto;   
        boolean loop;  // Loop assumirá valor verdadeiro quando encontrarmos o mdc
        
        loop = false;
        
        System.out.println("Digite o primeiro numero aqui:");
        n1 = imput.nextInt();
        
        System.out.println("Digite o segundo numero aqui:");
        n2 = imput.nextInt();
        
        // Verificação de qual é o maior numero
        if (n1>n2)    
        {
            maior = n1;
            menor = n2;
        }    
        else
        {    
            maior = n2;
            menor = n1;
        }   
        
        System.out.println("O maior numero é: " +maior);
        System.out.println("O menor numero é: " +menor);
        
        //laço para fazer divisão até resto 
        
        
         do {
           
             if ((maior%menor) == 0)
                {
                    mdc = menor;
                    System.out.println("mdc :" +mdc);
                    loop = true;
                }
             else 
                {
                 resto = maior%menor;
                 maior = menor;
                 menor = resto;
                 
                }
            } while (loop == false);
           
     }
            
        
        
   
    }

