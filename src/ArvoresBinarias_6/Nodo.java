package ArvoresBinarias_6;

public class Nodo {
    public int chave;
    public double dado;
    public Nodo filhoEsquerda;
    public Nodo filhoDireita;

    public void mostrarNodo() {
        System.out.print('{');
        System.out.print(chave);
        System.out.print(", ");
        System.out.print(dado);
        System.out.print("} ");
    }
}