package javaapplication21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entrada");
        double somatoria = 0;
        double media;
        int ct = 0;  // variável contador
        double var;

        //Primeiro laço While calcula a media
        while (s.hasNextLine()) {
            String textoLinha = s.nextLine();
            //se não tiver nova entrada, sai do laço
            if (textoLinha.isEmpty()) {
                break;
            }
            //transformando de texto para inteiro
            double numeroLinha = Double.parseDouble(textoLinha);
            //exibindo número de entrada
            //System.out.println("n>>> " + numeroLinha);
            
            somatoria = somatoria + numeroLinha;
            ct = ct + 1;

        }
        
        media = somatoria / ct;
        
        //Zerando as variáveis
        ct = 0;
        somatoria = 0;
        //**************
        
        //Segundo laço while para calculo de media e variancia
         while (s.hasNextLine()) {
            String textoLinha = s.nextLine();
            //se não tiver nova entrada, sai do laço
            if (textoLinha.isEmpty()) {
                break;
            }
            //transformando de texto para inteiro
            double numeroLinha = Double.parseDouble(textoLinha);
            //exibindo número de entrada
            //System.out.println("n>>> " + numeroLinha);

            somatoria = somatoria + Math.pow((numeroLinha-media),2);
            ct = ct + 1;

        }
         var = somatoria/(ct-1);
         
        //fora do laço, exibindo os resultados:
        System.out.println("n>>> " + ct);
        System.out.println("soma>>> " + somatoria);
        System.out.println("media>>> " + media);
        System.out.println("variância>>> " + var);
        
    }
}
