
package exer8_lista1_balan;

import java.util.Scanner;

public class Exer8_lista1_Balan {

    
    public static void main(String[] args) {
     
        Scanner imput = new Scanner(System.in); 
       
        double n = 1; //numerador
        double d =1; //denominador
        double ent; //valor de entrada
        double s;    //soma
        double maximo;
        
        System.out.println(" Entre com o expoente do numero de Euler = ");
        
        ent = imput.nextDouble();
        s = 1;
        
        maximo = 100;
        for(int i = 1; i != maximo; i++){
         d = d*i;
         n = n*ent;
         s = s+(n/d);
        }
        System.out.println("e^"+ent+" = " +s);
                
                
                
    }
}
