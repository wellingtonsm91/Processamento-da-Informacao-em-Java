
package exer1_listavetores;

import java.util.Scanner;


public class Exer1_listavetores {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int N; //numero de entrada
        double soma = 0; //somatório do vetores
        double media;
        
        // 1ª Parte - Encontrar a média
      
      System.out.println("Entre com um número natural");
      
      N = input.nextInt();
         
      int natural[] = new int[N];
      
      for (int i = 0; i < natural.length; i++  ){   // naturais.length é o valor de N
      System.out.println("Coloque o "+(i+1)+ "º numero aqui :");
      natural[i] = input.nextInt();
      
      soma = soma + natural[i];
      }
      media = soma/natural.length;
      
      System.out.println("A média é = " + media);
      
      
      // Segunda parte - Variância
      
      double som_var = 0; //somatória para calculo da variância
      double var; //Variancia
      
      for (int i = 0; i < natural.length; i++  ){
          
          som_var = Math.pow((natural[i] - media),2 ) + som_var; 
      }
      //variancia
        var = som_var/(N -1);
        
         System.out.println("A variância dos valores é : " +var);
        
    }
}
