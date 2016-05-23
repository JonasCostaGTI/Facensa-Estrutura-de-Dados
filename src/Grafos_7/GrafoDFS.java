package Grafos_7;

// DFS (Deep-fist search) ou Busca em Profundidade
public class GrafoDFS extends Grafo{
    private Pilha pilha;

    // -----------------------------------------------------------
    public GrafoDFS(int tamanho) { // Construtor
        vertices = new Vertice[tamanho];

        // Matriz de adjacência
        adjacentes = new int[tamanho][tamanho];
        qtdeVertices = 0;
        for (int j = 0; j < tamanho; j++) { // Seta adjacência
            for (int k = 0; k < tamanho; k++) // Zera matriz
            {
                adjacentes[j][k] = 0;
            }
        }
        pilha = new Pilha(tamanho);
    } 

    // ------------------------------------------------------------
    // DFS - Depth-first search - Pesquisa em profundidade
    public void dfs() { 
        // Inícia o vértice em 0
        vertices[0].foiVisitado = true; // Marca ele
        mostrarVertice(0); // Mostra o vértice
        pilha.push(0); // Empurra (coloca) ele na pilha

        while (!pilha.estaVazia()) { // Até a pilha ficar vazia,
            // Coloca um vértice não visitado para o topo da pilha
            int v = getVerticeAdjacenteNaoVisitado(pilha.peek());

            if (v == -1) { // Se não tem vértice,
                pilha.pop();
            } else { // Se existe,
                vertices[v].foiVisitado = true; // Marca
                mostrarVertice(v); // Mostra
                pilha.push(v); // Empilha
            }
        }

        // Pilha esta vazia, portando já finalizamos as visita
        for (int j = 0; j < qtdeVertices; j++) { // Reseta o sinalizador
            vertices[j].foiVisitado = false;
        }
    } 
}