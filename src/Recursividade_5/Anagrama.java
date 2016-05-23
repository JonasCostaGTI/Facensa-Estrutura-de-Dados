package Recursividade_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrama {
    static int tamanho;
    static int contador;
    static char[] caracteres = new char[100];

    public static void main(String[] args) throws IOException {
        System.out.print("Digite uma palavra: ");
        
        // Le palavra
        String input = getString();
        tamanho = input.length();
        
        // Define o tamanho
        contador = 0;
        for (int posicao = 0; posicao < tamanho; posicao++) // Coloca no array
        {
            caracteres[posicao] = input.charAt(posicao);
        }
        criaAnagrama(tamanho);
    } 
    
    //-----------------------------------------------------------
    public static void criaAnagrama(int novoTamanho) {
        if (novoTamanho == 1) { // se muito pequeno, 
            return;
        }
        
        // vai mais longe
        for (int item = 0; item < novoTamanho; item++) // para cada posição,
        {
            criaAnagrama(novoTamanho - 1);
            
            // Anagramas restantes
            if (novoTamanho == 2) {
                mostrarPalavra();
            }
            
            // mostra item
            rodar(novoTamanho);
            // roda palavra
        }
    }
    
    // rodapara esquerda todos os caracters da posição até o fim
    public static void rodar(int novoTamanho) {
        int j;
        int posicao = tamanho - novoTamanho;
        char temp = caracteres[posicao];
        
        // Salva a primeira letra 
        for (j = posicao + 1; j < tamanho; j++) // Move os outros para esquerda
        {
            caracteres[j - 1] = caracteres[j];
        }
        
        caracteres[j - 1] = temp;
        // coloca o primeiro na direita
    }
    
    //-----------------------------------------------------------
    public static void mostrarPalavra() {
        if (contador < 99) {
            System.out.print(" ");
        }
        if (contador < 9) {
            System.out.print(" ");
        }
        System.out.print(++contador + " ");
        for (int j = 0; j < tamanho; j++) {
            System.out.print(caracteres[j]);
        }        
        System.out.print("");
        System.out.flush();
        if (contador % 6 == 0) {
            System.out.println("");
        }
    }
    
    //-----------------------------------------------------------
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
