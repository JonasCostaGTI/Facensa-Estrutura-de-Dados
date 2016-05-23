package Recursividade_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fatorial {
    static int numero;

    public static void main(String[] args) throws IOException {
        System.out.print("Número: ");
        numero = getInt();
        int fatorial = fatorial(numero);
        System.out.println("Fatorial = " + fatorial);
    } 
    
    //-------------------------------------------------------------
    public static int fatorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return (numero * fatorial(numero - 1));
        }
    }
    
    //-------------------------------------------------------------
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
    //--------------------------------------------------------------
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }    
} 