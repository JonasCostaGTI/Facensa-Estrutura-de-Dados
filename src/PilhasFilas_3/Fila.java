package PilhasFilas_3;

public class Fila {
    private final static int ULTIMO = -1;
    private int tamanhoFila;
    private long[] fila;
    private int primeiro;
    private int ultimo;
    private int qtdeItens;
    
//--------------------------------------------------------------
    public Fila(int tamanho) // Construtor
    {
        tamanhoFila = tamanho;
        fila = new long[tamanhoFila];
        primeiro = 0;
        ultimo = ULTIMO;
        qtdeItens = 0;
    }
    
//--------------------------------------------------------------
    public void inserir(long item) // Colocar item no final da fila
    {
        if (ultimo == tamanhoFila - 1) // Solução para lista circular
        {
            ultimo = ULTIMO;
        }
        fila[++ultimo] = item; // Incrementa ultimo e insere item
        qtdeItens++; // Incrementa quantidade de itens na fila
    }
    
//--------------------------------------------------------------
    public long remover() // Remove o primeiro item da fila
    {
        long auxiliar = fila[primeiro++]; // Pega o valor e incrementa o primeiro
        if (primeiro == tamanhoFila) // Solução para lista circular
        {
            primeiro = 0;
        }
        qtdeItens--; // Diminui quantidade itens na fila 
        return auxiliar;
    }
    
//--------------------------------------------------------------
    public long getPrimeiro() // Pega o primeiro da fila
    {
        return fila[primeiro];
    }
    
//--------------------------------------------------------------
    public boolean estaVazia() // Fila esta vazia?
    {
        return (qtdeItens == 0);
    }
    
//--------------------------------------------------------------
    public boolean estaCheia() // Fila esta cheia?
    {
        return (qtdeItens == tamanhoFila);
    }
    
//--------------------------------------------------------------
    public int tamanho() // Quantidade itens na fila
    {
        return qtdeItens;
    }
} 

////////////////////////////////////////////////////////////////
class FilaApp {
    public static void main(String[] args) {
        Fila fila = new Fila(5); // Tamanho da Fila
        fila.inserir(1); // Insere quatro itens na Fila
        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(4);
        fila.remover(); // Remove 3 itens da fila
        fila.remover(); // (1, 2, 3)
        fila.remover();
        fila.inserir(5); // Intere mais 4 itens
        fila.inserir(6); // (lista circular)
        fila.inserir(7);
        fila.inserir(8);
        
        // Remove e mostra todos os itens
        while (!fila.estaVazia()) { 
            long item = fila.remover(); // (4, 5, 6, 7, 8)
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println("");
    } 
} 
