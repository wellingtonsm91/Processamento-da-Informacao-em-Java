/*
Area e perímetro de um retangulo
 */
package lista_1_pi;

import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class Exer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);
        
        double a;  //area
        double p;  //perimetro
        double l1; //lado 1
        double l2; //lado 2
 
        System.out.println("digite o valor em metros do primeiro lado do retângulo :");
        l1 = imput.nextDouble();
         
        System.out.println("digite o valor em metros do segundo lado do retângulo :");
        l2 = imput.nextDouble();
        
        a = l1 * l2;
        p = l1*2 + l2*2;
        
        System.out.println("O valor da área (metros quadrados) é  :" +a );
        System.out.println("O valor do perímetro (metros) é  :" +p );
        
        
               
    }
}
