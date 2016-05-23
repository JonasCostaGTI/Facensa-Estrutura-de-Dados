package Grafos_7;

public class Grafo {
    protected Vertice vertices[]; // Lista de vértices
    protected int adjacentes[][]; // Adjacentes
    protected int qtdeVertices; // Quantidade corrente de vértices
    
    // -----------------------------------------------------------
    public void addVertice(char rotulo) {
        vertices[qtdeVertices++] = new Vertice(rotulo);
    }

    // -----------------------------------------------------------
    public void addAresta(int inicio, int fim) {
        adjacentes[inicio][fim] = 1;
        adjacentes[fim][inicio] = 1;
    }
    
    public void addAresta(char rotuloInicio, char rotuloFim) {
        this.addAresta(
                this.getPosicaoVertice(rotuloInicio), 
                this.getPosicaoVertice(rotuloFim));
    }

    // ------------------------------------------------------------
    public void mostrarVertice(int vertice) {
        System.out.print(vertices[vertice].rotulo);
    }

    // ------------------------------------------------------------
    // Retorna um vértice não foiVisitado adjacente ao "vertice"
    public int getVerticeAdjacenteNaoVisitado(int vertice) {
        for (int j = 0; j < qtdeVertices; j++) {
            if (adjacentes[vertice][j] == 1 && vertices[j].foiVisitado == false) {
                return j;
            }
        }
        return -1;
    }

    private int getPosicaoVertice(char rotulo) {
        int posicao = 0;
        while ( posicao < this.vertices.length &&
                this.vertices[posicao].rotulo == rotulo ){
            posicao++;
        }
        
        return posicao;
    }
} 