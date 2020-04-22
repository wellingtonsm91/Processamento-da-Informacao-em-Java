/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_3_atividade3_balan_zero_para;

import java.util.Scanner;

public class Exer_3_atividade3_balan_zero_para {

    
    public static void main(String[] args) {
    
        Scanner imput = new Scanner(System.in);
        
        int qt; //contador dos números
        double soma; //soma das entradas dos números reais
        double b; //memória
        double en; //valor de cada entrada
        double media; //média das entradas dos números reais
         
        //inicialização da variável e
        en = 1;
        b = 0;
        qt = 0;
        soma = 0;
        
         System.out.println("Entre com os valores de entrada e termine-os apertando o numero zero");
        
         while(en!=0){
            
            en = imput.nextDouble();
            soma = en + b;
            b = soma;
            qt = qt+1;
           
        }
       
        System.out.println("A soma das entradas é : " + soma);
        
    }
}
