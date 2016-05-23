package ArvoresBinarias_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int valor;
        Arvore arvore = new Arvore();
        arvore.inserir(50, 1.5);
        arvore.inserir(25, 1.2);
        arvore.inserir(75, 1.7);
        arvore.inserir(12, 1.5);
        arvore.inserir(37, 1.2);
        arvore.inserir(43, 1.7);
        arvore.inserir(30, 1.5);
        arvore.inserir(33, 1.2);
        arvore.inserir(87, 1.7);
        arvore.inserir(93, 1.5);
        arvore.inserir(97, 1.5);
        
        while (true) {
            System.out.print("Digite a primeira letra de mostrar, ");
            System.out.print("inserir, localizar, remover, percorrer, ou contar nodos: ");
            int choice = getChar();
            switch (choice) {
                case 'm':
                    arvore.mostrarArvore();
                    break;
                case 'i':
                    System.out.print("Digite o valor para inserir: ");
                    valor = getInt();
                    arvore.inserir(valor, valor + 0.9);
                    break;
                case 'l':
                    System.out.print("Digite o valor para localizar: ");
                    valor = getInt();
                    Nodo localizado = arvore.pesquisar(valor);
                    if (localizado != null) {
                        System.out.print("Encontrou: ");
                        localizado.mostrarNodo();
                        System.out.print("\n");
                    } else {
                        System.out.print("Não conseguiu localizar ");
                    }
                    System.out.print(valor + '\n');
                    break;
                case 'r':
                    System.out.print("Digite um valor para remover: ");
                    valor = getInt();
                    boolean removido = arvore.remover(valor);
                    if (removido) {
                        System.out.print("Removeu " + valor + '\n');
                    } else {
                        System.out.print("Não conseguiu remover ");
                    }
                    System.out.print(valor + '\n');
                    break;
                case 'p':
                    System.out.print("Digite um 1, 2, 3: ");
                    valor = getInt();
                    arvore.percorrer(valor);
                    break;
                case 'c':
                    int qtdeNodos = arvore.contar();
                    System.out.printf("Quantidade Nodos = %d\n", qtdeNodos);
                    System.out.printf("Quantidade Nodos = %d\n", arvore.contaNodos());
                    break;
                default:
                    System.out.print("Opção inválida\n");
            } 
        } 
    } 
    
    // -------------------------------------------------------------
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
    // -------------------------------------------------------------
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    
    //-------------------------------------------------------------
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}