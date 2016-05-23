package Recursividade_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangulo {
    static int numero;

    public static void main(String[] args) throws IOException {
        System.out.print("Número: ");
        numero = getInt();
        int numeroTriangular = numeroTriangular(numero);
        System.out.println("Número Triangular = " + numeroTriangular);
    } 
    
    //-------------------------------------------------------------
    public static int numeroTriangular(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return (numero + numeroTriangular(numero - 1));
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