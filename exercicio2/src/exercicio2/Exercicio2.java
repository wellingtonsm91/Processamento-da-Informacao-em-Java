/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author hpgarcia
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lista 1 - exercicio 02
        Scanner input = new Scanner(System.in);
        int n, pos = 0, qt = 1;
        double maior = 0;
        System.out.println("Entre com um número inteiro diferente de ZERO: ");
        do{
            n = input.nextInt();
            if(n >= maior){
                maior = n;
                pos = qt;
            }
            qt = qt + 1;
        }
        while(n != 0);
        System.out.println("Maior número: " + maior);
        System.out.println("Posição do número: " + pos + "º");
    }
}
