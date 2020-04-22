package exer7_lista2_mirisola_div7_5;

import java.util.Scanner;

public class Exer7_lista2_Mirisola_div7_5 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Entrada");
        double somatoria = 0;
        double media;
        int ct = 0;  // variável contador


        while (imput.hasNextLine()) {
            String textoLinha = imput.nextLine();
            //se não tiver nova entrada, sai do laço
            if (textoLinha.isEmpty()) {
                break;
            }
            //transformando de texto para inteiro
            double numeroLinha = Double.parseDouble(textoLinha);
            //exibindo número de entrada
            //System.out.println("n>>> " + numeroLinha);
            if (((numeroLinha % 5) == 0) & ((numeroLinha % 7) == 0)) {

                somatoria = somatoria + numeroLinha;
                ct = ct + 1;
            }

        }

        media = somatoria / ct;
        System.out.println("A quantidade de números divisiveis por 5 e 7 ao mesmo tempo é " + ct);
        System.out.println("A média dos numeros divisiveis por 5 e 7 ao mesmo tempo é = " + media);


    }
}
