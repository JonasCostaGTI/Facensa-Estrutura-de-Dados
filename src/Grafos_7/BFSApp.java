package Grafos_7;

// BFS (Breadth-first search) - Busca em Largura
public class BFSApp {
    public static int TAMANHO = 20;
    public static void main(String[] args) {
        GrafoBFS grafo = new GrafoBFS(TAMANHO);
        grafo.addVertice('A'); // 0 (iníco do bfs)
        grafo.addVertice('B'); // 1
        grafo.addVertice('C'); // 2
        grafo.addVertice('D'); // 3
        grafo.addVertice('E'); // 4
        grafo.addAresta(0, 1); // AB
        grafo.addAresta(1, 2); // BC
        grafo.addAresta(0, 3); // AD
        grafo.addAresta(3, 4); // DE
        System.out.print("Visitas: ");
        grafo.bfs(); // Breadth-first search - Pesquisa em largura
        System.out.println();
    }
}