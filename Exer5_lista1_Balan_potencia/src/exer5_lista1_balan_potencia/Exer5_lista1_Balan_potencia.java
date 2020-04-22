
package exer5_lista1_balan_potencia;

public class Exer5_lista1_Balan_potencia {

    public static void main(String[] args) {
     
        double n = 2;
        double k = 5;
        double x = 1;
        // x(k) = n^k
        for (int i = 0; i < k; i++) {
            x=x*n;
            
            System.out.println(x);
        }
        
    }
}
