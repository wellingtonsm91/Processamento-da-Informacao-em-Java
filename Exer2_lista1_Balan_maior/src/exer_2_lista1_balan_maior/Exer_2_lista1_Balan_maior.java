
package exer_2_lista1_balan_maior;

import java.util.Scanner;


public class Exer_2_lista1_Balan_maior {

   
    public static void main(String[] args) {
      Scanner imput = new Scanner(System.in);
      double maior = 0;
      int pos = 0;
      int qt = 1;
      double ent; //valor de entrada

      System.out.println("Entre com numero real:");
      
      do{
          ent = imput.nextDouble();
          if (ent > maior){
              maior = ent;
              pos = qt;
          }
      qt = qt+1;
      
      }while(ent!=0);
      
       System.out.println("O maior número é : " +maior);
//       System.out.println("Quantidade de posições :" + (qt-1));
       System.out.println("O número está na "+pos+"ª posição!!");
    }
}
