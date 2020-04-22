
package exer_7_lista1_balan_advinhacao;

import java.util.Random;
import java.util.Scanner;


public class Exer_7_lista1_balan_advinhacao {

    
    public static void main(String[] args) {
       Scanner imput = new Scanner(System.in);
       Random gerador = new Random();
       int ent; //Entrada
       int x; //Numero gerado em random
       
       System.out.println("Qual é o número sorteado? ");
          x = gerador.nextInt(100);
       do{
   
       ent = imput.nextInt();
       
          if(ent > x){
          System.out.println("O número sorteado é menor que este valor!!");
          } 
          else{  if(ent<x){
                System.out.println("O número sorteado é maior que este valor!!");
                }
          }
       }while( ent != x);
       
       System.out.println("Parabéns, este é o número sorteado! Vá buscar o seu prêmio");
       
    }
}
