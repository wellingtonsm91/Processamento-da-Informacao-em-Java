/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usp_1_14_fibonacci;

import java.util.Scanner;

public class Usp_1_14_Fibonacci {

 
   public static void main(String[] args) {
    
       Scanner imput = new Scanner(System.in);
       int i; //contador
       int f; // número de fibonacci
       int n; //n-ésimo númer
       int p, aux, Ap; // penultimo número, auxiliar para primeiro valor de p e ante-penultimo numero
       
       System.out.println("Entre com o valor de n da sequência");
       n = imput.nextInt();
       //Inicialização das variáveis
       p = 1;
       Ap  = 1;
       f = 0;
               
       //O segredo deste programa foi colocar o for dentro do if, caso contrário ele iria ser executado sem que houvesse a necessidade        
       if (n >= 3){
            for ( i = 3; i<= n; i++){
               f = p + Ap;
               Ap = p;
               p = f;
            }
        System.out.println("F"+(i-1)+" = " +f); 
       }     
       else{
        System.out.println("F"+n+" = " +1);
       } 
       
       
       
       
     
       
   }
}
