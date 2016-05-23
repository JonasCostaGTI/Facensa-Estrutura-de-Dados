package Grafos_7;

public class Pilha {
    private int[] pilha;
    private int topo;
    
    // -----------------------------------------------------------
    public Pilha(int tamanho) { // Construtor
        pilha = new int[tamanho]; // Cria array
        topo = -1;
    }
    
    // -----------------------------------------------------------
    public void push(int item) { // Coloca item no topo da pilha
        pilha[++topo] = item;
    }
    
    // -----------------------------------------------------------
    public int pop() { // Retira item da pilha
        return pilha[topo--];
    }
    
    // ------------------------------------------------------------
    public int peek() { // Espia/Pega o item do topo da pilha
        return pilha[topo];
    }
    
    // ------------------------------------------------------------
    public boolean estaVazia() { // Pilha esta vazia?
        return (topo == -1);
    }
}