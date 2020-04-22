/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_tidia_mirisola;

/**
 *
 * @author wellington
 */
public class Lista1_tidia_Mirisola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /** byte b;       // PRimeira parte
        b = 127;
        
         b++;
       
     System.out.println(b); //deveria ser positivo não*/
        
        
         int i = 3;
        i++;
        // prints ?
        System.out.println(i);
        ++i;			   
        // prints ?
        System.out.println(i);
        // prints ?
        System.out.println(++i);
        // prints ?
        System.out.println(i++);
        // prints ?
        System.out.println(i);  
       
        //parte dois
        
        int R1;
        double R2;
        double R3;
        double R4;
        double R5;
        int a = 5;
        int b = 10;
        int c = 8;
        double d = 1.5;
        
        
        R1 = 2*a%-c;
        R2 = Math.toRadians(-2*c)+4;
        R3 = (30 % 4 * Math.pow(3,3)) * -1; 
        R4 = Math.pow(-c,2) + (d * 10)/a;
        R5 = (Math.sqrt(Math.pow(a,b/a)) + c * d);
        
        System.out.println("R1 = " +R1);
        System.out.println("R2 = " +R2);
        System.out.println("R3 = " +R3);
        System.out.println("R4 = " +R4);
        System.out.println("R5 = " +R5);
        
    }
}
