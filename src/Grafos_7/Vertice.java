package Grafos_7;

public class Vertice {
    public char rotulo; // rotulo (Exemplo: 'A')
    public boolean foiVisitado;

    public Vertice(char rotulo) { // Construtor
        this.rotulo = rotulo;
        foiVisitado = false;
    }
}