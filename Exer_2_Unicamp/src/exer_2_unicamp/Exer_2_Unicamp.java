/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_2_unicamp;

import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class Exer_2_Unicamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
       int a,b,c,d,i,aux;
       a = sc.nextInt();
       b = sc.nextInt();
       c = sc.nextInt();
       d = sc.nextInt();
       for(i=1;i<=3;i++){
           if(a>b){
               aux = a;
               a = b;
               b = aux;
           }
           if(b>c){
               aux = b;
               b = c;
               c = aux;
           }
           if(c>d){
               aux = c;
               c = d;
               d = aux;
           }
       }
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
