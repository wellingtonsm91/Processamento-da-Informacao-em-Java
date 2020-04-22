/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usp_4_3_piramidal;

import java.util.Scanner;

/**
 *
 * @author Wellington
 */
public class Usp_4_3_Piramidal {
    //Função bloco

    static int bloco(int n) {
        Scanner input = new Scanner(System.in);
        int paridade = 0;
        int ent = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com um número inteiro: ");
            ent = input.nextInt();
            if (ent % 2 == 0) {            // Conta-se impares e pares
                pares++;
            } else {
                impares++;
            }
        }
        if (pares == n) {       //Se todos numeros de entrada forem pares, paridade é 0;
            paridade = 0;
        }
        if (impares == n) {
            paridade = 1;    //Se todos numeros de entrada forem impares, paridade é 1;
        }

        if ((impares != n) && (pares != n)) {    //Se ímpares e pares, paridade é -1;
            paridade = -1;
        }
//            
        return paridade;
    }

    public static void main(String[] args) {
        System.out.println("Entre com o valor de n ");
        Scanner recebe = new Scanner(System.in);
        int n = recebe.nextInt();

        //System.out.println(" Paridade : " + bloco(n) );  // Chama o bloco 'n';

        //********Parte dois_ Piramidal ou não****************
        //Verificar se o número n está no conjunto dos números de elementos de uma sequencia piramidal (1,3,6,10...)
        boolean pertence = true;
        int i = 1;
        int soma = 0;
        int m = 0;
        while (pertence) {

            soma = soma + i;


            if (soma == n) {
                m = i;
                System.out.println("m = " +i);
                System.out.println("hey ho!!");
                break;
            }

            if (soma > n) {
                System.out.println("Uma sequencia com " + n + " números não pode ser piramidal");
                pertence = false;
            }
            i++;
        }//termino do laço while

        int soma1 = 0;
        int ct = 2;
        int ant; // Auxiliar par numero anterior
        boolean piramidal = true;
        if (pertence) {      // Caso a condição anterior seja verdadeira
            
            bloco(1);
            ant = bloco(1);   //Pois empre começa do um
            while (soma1<n) {
                soma1 = soma1 + ct;  //ct varia de um em um
                //bloco(ct);
                System.out.println(ant + bloco(ct));
//                if((ant + bloco(ct)) != 1){
//                    System.out.println("Não é piramidal");   
//                    piramidal = false;
//                    break;
//                }   
                ant = bloco(ct);
                ct++;
                
            }//termino while
        
        if(piramidal == true){
                System.out.println("É piramidal " +m+ " - alternante");
        }    

        }//termino if
        
           





        // TODO code application logic here
    }
}
