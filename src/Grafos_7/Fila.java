package Grafos_7;

public class Fila {
    private int[] fila;
    private int primeiro;
    private int ultimo;
    
    // -------------------------------------------------------------
    public Fila(int tamanho) { // Construtor
        fila = new int[tamanho];
        primeiro = 0;
        ultimo = -1;
    }
    
    // -------------------------------------------------------------
    public void insert(int item) { // Colaca item por última na fila
        if (ultimo == fila.length - 1) {
            ultimo = -1;
        }
        fila[++ultimo] = item;
    }
    
    // -------------------------------------------------------------
    public int remove() { // Pega item do início da fila
        int inicio = fila[primeiro++];
        if (primeiro == fila.length) {
            primeiro = 0;
        }
        return inicio;
    }
    
    // -------------------------------------------------------------
    public boolean estaVazia() { // Fila esta vazia?
        return (ultimo + 1 == primeiro || 
                (primeiro + fila.length - 1 == ultimo));
    }
}