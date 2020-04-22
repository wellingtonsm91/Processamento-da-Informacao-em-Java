/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes_matriz;

//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Wellington
 */
public class Testes_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tamanho de Matrizes
        //Scanner input = new Scanner(System.in);
        File dir = new File("Bibliotecas\\Documentos");
    File arq = new File(dir, "matriz_base_teste");
 
    try {
        //Indicamos o arquivo que será lido
        FileReader fileReader = new FileReader(arq);
 
        //Criamos o objeto bufferReader que nos
        // oferece o método de leitura readLine()
        BufferedReader bufferedReader = 
            new BufferedReader(fileReader);
 
        //String que irá receber cada linha do arquivo
        String linha = "";
 
        //Fazemos um loop linha a linha no arquivo,
        // enquanto ele seja diferente de null.
        //O método readLine() devolve a linha na
        // posicao do loop para a variavel linha.
        while ( ( linha = bufferedReader.readLine() ) != null) {
            //Aqui imprimimos a linha
            System.out.println(linha);
        }
 
        //liberamos o fluxo dos objetos 
        // ou fechamos o arquivo
        fileReader.close();
        bufferedReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
        
}

