package PilhasFilas_3;

import java.io.IOException;

public class FilasPriorizadas {
    private int tamanhoFila;
    private long[] fila;
    private int qtdeItens;
    
//-------------------------------------------------------------
    public FilasPriorizadas(int tamanho) // Construtor
    {
        tamanhoFila = tamanho;
        fila = new long[tamanhoFila];
        qtdeItens = 0;
    }
    
//-------------------------------------------------------------
    public void inserir(long item) // Insere item
    {
        int elemento;
        if (qtdeItens == 0) // Se não tem itens
        {
            fila[qtdeItens++] = item; // Insere em 0
        } else // Se possui itens
        {
            // Inicia no fim
            for (elemento = qtdeItens - 1; elemento >= 0; elemento--) 
            {
                if (item > fila[elemento]) // Se novo elemento é maior
                {
                    fila[elemento + 1] = fila[elemento]; // Troca de lugar
                } else // Se menor
                {
                    break; // Deslocamento realizado
                }
            } 
            
            fila[elemento + 1] = item; // Insere item
            qtdeItens++;
        } 
    } 
    
//-------------------------------------------------------------
    public long remover() // Remove o menor item
    {
        return fila[--qtdeItens];
    }
    
//-------------------------------------------------------------
    public long pegarMinimo() // Pega o menor item
    {
        return fila[qtdeItens - 1];
    }
    
//-------------------------------------------------------------
    public boolean estaVazia() // Fila esta vazia?
    {
        return (qtdeItens == 0);
    }
    
//-------------------------------------------------------------
    public boolean estaCheia() // Fila esta cheia?
    {
        return (qtdeItens == tamanhoFila);
    }
    
} 

////////////////////////////////////////////////////////////////
class FilasPriorizadasApp {

    public static void main(String[] args) throws IOException {
        FilasPriorizadas filas = new FilasPriorizadas(5);
        filas.inserir(3);
        filas.inserir(5);
        filas.inserir(1);
        filas.inserir(4);
        filas.inserir(2);
        
        while (!filas.estaVazia()) {
            long item = filas.remover();
            System.out.print(item + " "); // 1, 2, 3, 4, 5
        } 
        
        System.out.println("");
    } 
    
//-------------------------------------------------------------
}
