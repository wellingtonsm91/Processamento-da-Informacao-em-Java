
package exer4_listavetor_balan_dna;

import java.util.Scanner;


public class Exer4_listavetor_balan_DNA {

    
    public static void main(String[] args) {
        
        Scanner sequencia = new Scanner(System.in); // função de scaneamento
        int qt = 0; //Contador de codons atg
        
        System.out.println("Entre com a cadeia de DNA : ");
        String DNA = sequencia.nextLine();  //Atribui  a sequencia de entrada para a variável String de DNA
                                           // o tamanho do vetor é dado automaticamente pela função toCharArray()
                                                 
        char base [] = DNA.toCharArray(); // toma a String e quebra em varios caracteres, cada caracter possui uma posição no vetor
                                          // bases = caracteres bases nitrogenadas  
        int n = base.length;
        System.out.println("A cadeia contém " +n+" bases nitrogendas");
        
            
         //laço da varredura de atg
         for (int i = 0; i<=(n-3); i++ ){
           if(base[i]=='a' && base[i+1]=='t' && base[i+2] == 'g'){
             qt = qt+1;
           }   
        }
        
         System.out.println("A quantidade de sequencias ATG é " +qt);
         
    }                                      
}
