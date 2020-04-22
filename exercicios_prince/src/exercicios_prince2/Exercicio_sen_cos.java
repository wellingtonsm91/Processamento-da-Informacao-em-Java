/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_prince2;

import java.util.Scanner;


/**
 *
 * @author wellington
 */

public class Exercicio_sen_cos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner imput = new Scanner(System.in); // Cria uma função que obtem dados via teclado
        
        double sen;
        double cos;
        double res;
         
         System.out.println("Digite o valor em graus do angulo do seno aqui:");//imprime na tela do computador a mensagem descrita
         sen = imput.nextDouble();
    
         System.out.println("Digite o valor em graus do angulo cosseno aqui:");
         cos = imput.nextDouble();
         
         res = Math.pow (Math.sin (Math.toDegrees(sen) ),2 ) + Math.pow( Math.cos(Math.toDegrees(cos) ),2 );
         
        // res = cos + sen ;
         System.out.println ("soma dos angulos é : " +res);
         
         // O valor de res nunca será sempre 1 porque o programa trabalha com aproximações.
         
       
       
       
    }
}
