package Grafos_7;

// DFS (Deep-fist search) ou Busca em Profundidade
public class DFSApp {
    public static final int TAMANHO = 20;
    public static void main(String[] args) {
        GrafoDFS grafo = new GrafoDFS(TAMANHO);
        grafo.addVertice('A'); // 0 (Início para o dfs)
        grafo.addVertice('B'); // 1
        grafo.addVertice('C'); // 2
        grafo.addVertice('D'); // 3
        grafo.addVertice('E'); // 4
        grafo.addAresta('A', 'B');
        //grafo.addAresta(0, 1); // AB
        grafo.addAresta(1, 2); // BC
        grafo.addAresta(0, 3); // AD
        grafo.addAresta(3, 4); // DE
        System.out.print("Visitas: ");
        grafo.dfs(); // Busca em profundidade (deep first search)
        System.out.println();
    } 
}