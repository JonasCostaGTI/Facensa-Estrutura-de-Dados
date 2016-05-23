package Grafos_7;

public class GrafoBFS extends Grafo {
    private Fila fila;

    // -----------------------------------------------------------
    public GrafoBFS(int tamanho) { // Construtor
        vertices = new Vertice[tamanho];

        // Matriz de adjacências
        adjacentes = new int[tamanho][tamanho];
        qtdeVertices = 0;
        for (int j = 0; j < tamanho; j++) { // Seta adjacência
            for (int k = 0; k < tamanho; k++) // Zera matriz
            {
                adjacentes[j][k] = 0;
            }
        }
        fila = new Fila(tamanho);
    } 

    // -------------------------------------------------------------
    public void bfs() { // Breadth-first search - Pesquisa em Largura
        // Inicia no vértice 0
        vertices[0].foiVisitado = true; // Marca 
        mostrarVertice(0); // Mostra
        fila.insert(0); // Insere no fim
        
        int v2;
        while (!fila.estaVazia()) { // até fila ficar vazia,
            int v1 = fila.remove(); // remove vértice do início
            
            // até que ele não tenha vizinhos não visitados
            while ((v2 = getVerticeAdjacenteNaoVisitado(v1)) != -1) { // Pega um,
                vertices[v2].foiVisitado = true; // Marca
                mostrarVertice(v2); // Mostra
                fila.insert(v2); // Insere
            } 
        } 
       
        // Fila esta vazia, portando já finalizamos as visita
        for (int j = 0; j < qtdeVertices; j++) { // Reseta o sinalizador
            vertices[j].foiVisitado = false;
        }
    }
}