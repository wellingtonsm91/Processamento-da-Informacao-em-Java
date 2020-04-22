/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textovetor;

/**
 *
 * @author wellington
 */
public class TextoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        double numero=23243;
//        double cont=10;
//        while(numero>10){
//            numero=numero % Math.pow(10, cont);
//            cont--;
//            int resto=(int) (numero / Math.pow(10, cont));
//            System.out.println(resto);
//        };
        
        String texto = "444";
//        System.out.println(texto.charAt(0));
//        System.out.println(texto.charAt(1));
//        System.out.println(texto.charAt(2));
        
        int numeroDeCaracteres= texto.length();  //acha o numero de caracteres
        System.out.println("numero de carac.. "+numeroDeCaracteres);
        int c=0;
        for(int i=0;i<numeroDeCaracteres; i++){
            if(texto.charAt(i)==texto.charAt(numeroDeCaracteres-i-1)){
                c++;    
            }
        }
        if(c==numeroDeCaracteres){
        System.out.println("é palindromo");
        }
           
    }
}
