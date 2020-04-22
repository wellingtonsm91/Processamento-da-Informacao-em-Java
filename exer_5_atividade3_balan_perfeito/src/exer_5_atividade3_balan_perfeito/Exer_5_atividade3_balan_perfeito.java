/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_5_atividade3_balan_perfeito;

import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class Exer_5_atividade3_balan_perfeito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner imput = new Scanner(System.in);
       int ent; //entrada
       int n =1; //sequencia dos naturai
       int soma = 0; //somatório
       int resto; //resto da divisão da entrada com cada numero natural
      
       
       System.out.println("Entre com o valor de n: ");
       ent = imput.nextInt();
       
       
       while(n!=ent){
           resto = ent%n;
                if(resto == 0){
                soma = soma + n;
                }
               n = n+1; //contagem dos numeros naturais
       }
       
              
       if(ent== soma){
            System.out.println("É perfeito!! ");   
       }
       else {
            System.out.println("Não é perfeito!! "); 
       }
    }
}
