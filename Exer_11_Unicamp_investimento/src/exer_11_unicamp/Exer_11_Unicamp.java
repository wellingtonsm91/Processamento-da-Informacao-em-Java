/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_11_unicamp;

import java.util.Scanner;
        
public class Exer_11_Unicamp {

    
    public static void main(String[] args) {
    
        Scanner imput = new Scanner(System.in);
        
        double a; // Valor do investimento inicial
        double r; // Juros ao mês
        int n;    //número n de meses investido
        int i;    //incremento de cada mês
        double t; //valor acumulado por mês
        
       System.out.println("Entre com o valor de investimento inicial :");
       a = imput.nextDouble();
       
       System.out.println("Entre com o número de meses previstos para o investimento:");
       n = imput.nextInt();
       
       
       r = 0.005;     //juros de 0.5 por cento ao mês 
       t = 0; 
   //Para modo de poupança de Joãozinho
//        for (i = 1; i <= n; i++ )
//        {
//            
//            t = a* Math.pow((1+r),i);
//        }
       
  //Para modo de poupança de Mariazinha
      for (i = 1; i <= n; i++ )
        {
            
            t = a*i* Math.pow((1+r),i);
        } 
       
        System.out.println("O valor acumulado para o "+(i-1)+"º mês é de : " +t );  //foi colocado i -1 para compensar o incremento final que é maior que n
        
    }
}
