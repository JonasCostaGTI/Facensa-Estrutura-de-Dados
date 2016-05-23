package ArvoresBinarias_6;

import java.util.Stack;

public class Arvore {

    private Nodo raiz; // Primeiro nodo da árvore
    private int qtdeNos;

    // -------------------------------------------------------------
    public Arvore() {
        raiz = null;
    } // Árvore não tem nodos ainda

    // -------------------------------------------------------------
    public Nodo pesquisar(int chave) {
        // (assume árvore não-vazia)
        Nodo corrente = raiz;

        while (corrente.chave != chave) { // enquanto não encontrar,
            if (chave < corrente.chave) { // vai para esquerda?
                corrente = corrente.filhoEsquerda;
            } else { // ou vai para direita?
                corrente = corrente.filhoDireita;
            }

            if (corrente == null) { // se não tem filho
                return null; // não faz nada
            }
        }
        return corrente; // encontrou
    }

    // -------------------------------------------------------------
    public void inserir(int chave, double dado) {
        Nodo novoNodo = new Nodo(); // cria novo nodo
        novoNodo.chave = chave; // insere dado
        novoNodo.dado = dado;

        if (raiz == null) { // não tem nodo na raiz
            raiz = novoNodo;
        } else { // raiz ocupado
            Nodo corrente = raiz; // inicia na raiz
            Nodo pai;

            while (true) { // (sai internamente)
                pai = corrente;

                if (chave < corrente.chave) { // vai para esquerda?
                    corrente = corrente.filhoEsquerda;

                    if (corrente == null) { // se fim da linha,
                        // insere na esquerda
                        pai.filhoEsquerda = novoNodo;
                        return;
                    }
                } else { // ou vai para direita?
                    corrente = corrente.filhoDireita;
                    if (corrente == null) { // se fim da linha
                        // insere na direita
                        pai.filhoDireita = novoNodo;
                        return;
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------
    public boolean remover(int chave) { // remover nodo com chave
        // (assume list não vazia)
        Nodo corrente = raiz;
        Nodo pai = raiz;
        boolean ehFilhoEsquerda = true;

        while (corrente.chave != chave) { // pesquisa pelo nodo
            pai = corrente;

            if (chave < corrente.chave) { // vai para esquerda?
                ehFilhoEsquerda = true;
                corrente = corrente.filhoEsquerda;
            } else { // ou vai para direita?
                ehFilhoEsquerda = false;
                corrente = corrente.filhoDireita;
            }

            if (corrente == null) { // fim da linha,
                return false; // Não encontrou
            }
        }

        // encontrou o nodo para remover
        // se não tem filho, simplesmente remove
        if (corrente.filhoEsquerda == null
                && corrente.filhoDireita == null) {
            if (corrente == raiz) { // se raiz,
                raiz = null; // árvore é esvaziada
            } else if (ehFilhoEsquerda) {
                pai.filhoEsquerda = null; // desconecta
            } else { // do pai
                pai.filhoDireita = null;
            }
        } // se não tem filho a direita, altera com a subárvore esquerda
        else if (corrente.filhoDireita == null) {
            if (corrente == raiz) {
                raiz = corrente.filhoEsquerda;
            } else if (ehFilhoEsquerda) {
                pai.filhoEsquerda = corrente.filhoEsquerda;
            } else {
                pai.filhoDireita = corrente.filhoEsquerda;
            }
        } // se não temfilho a esquerda, altera com a subárvore direita
        else if (corrente.filhoEsquerda == null) {
            if (corrente == raiz) {
                raiz = corrente.filhoDireita;
            } else if (ehFilhoEsquerda) {
                pai.filhoEsquerda = corrente.filhoDireita;
            } else {
                pai.filhoDireita = corrente.filhoDireita;
            }
        } else { // dois filhos, altera com sucessor em ordem
            // pega o sucessor do nodo para remover (corrente)
            Nodo sucessor = getSucessor(corrente);

            // conecta o pai corrente ao invés do sucessor
            if (corrente == raiz) {
                raiz = sucessor;
            } else if (ehFilhoEsquerda) {
                pai.filhoEsquerda = sucessor;
            } else {
                pai.filhoDireita = sucessor;
            }

            // conecta o sucesso no filho esquerdo corrente
            sucessor.filhoEsquerda = corrente.filhoEsquerda;
        }

        // (sucessor não tem um filho na esquerda)
        return true; // sucesso
    }

    // -------------------------------------------------------------
    // retorna o nodo com o próximo valor maior depois de delNode
    // para o filho da direita, então descendentes esquerdo do filho a direita
    private Nodo getSucessor(Nodo delNode) {
        Nodo sucessorPai = delNode;
        Nodo sucessor = delNode;
        Nodo corrente = delNode.filhoDireita; // vai para o filho da direita

        while (corrente != null) { // até não ter mais filhos a esquerda,
            sucessorPai = sucessor;
            sucessor = corrente;
            corrente = corrente.filhoEsquerda; // vai para o filho da esquerda
        }

        // se não tem sucessor
        if (sucessor != delNode.filhoDireita) { // filho a direta, faz conexões
            sucessorPai.filhoEsquerda = sucessor.filhoDireita;
            sucessor.filhoDireita = delNode.filhoDireita;
        }

        return sucessor;
    }

    // -------------------------------------------------------------
    public void percorrer(int percorrerTipo) {
        switch (percorrerTipo) {
            case 1:
                System.out.print("\nPercorrer em Pré-Ordem: ");
                preOrdem(raiz);
                break;
            case 2:
                System.out.print("\nPercorrer em Em-Ordem: ");
                emOrdem(raiz);
                break;
            case 3:
                System.out.print("\nPercorrer em Pós-Ordem: ");
                posOrdem(raiz);
                break;
        }
        System.out.println();
    }

    // -------------------------------------------------------------
    private void preOrdem(Nodo localRaiz) {
        if (localRaiz != null) {
            System.out.print(localRaiz.chave + " ");
            preOrdem(localRaiz.filhoEsquerda);
            preOrdem(localRaiz.filhoDireita);
        }
    }
// -------------------------------------------------------------

    private void emOrdem(Nodo localRaiz) {
        if (localRaiz != null) {
            emOrdem(localRaiz.filhoEsquerda);
            System.out.print(localRaiz.chave + " ");
            emOrdem(localRaiz.filhoDireita);
        }
    }
    
    // -------------------------------------------------------------
    private void posOrdem(Nodo localRaiz) {
        if (localRaiz != null) {
            posOrdem(localRaiz.filhoEsquerda);
            posOrdem(localRaiz.filhoDireita);
            System.out.print(localRaiz.chave + " ");
        }
    }
    
    // -------------------------------------------------------------
    public void mostrarArvore() {
        Stack pilhaGlobal = new Stack();
        pilhaGlobal.push(raiz);
        int brancos = 32;
        boolean ehLinhaVazia = false;
        System.out.println("......................................................");
        while (ehLinhaVazia == false) {
            Stack localStack = new Stack();
            ehLinhaVazia = true;
            
            for (int j = 0; j < brancos; j++) {
                System.out.print(' ');
            }
            
            while (pilhaGlobal.isEmpty() == false) {
                Nodo temp = (Nodo) pilhaGlobal.pop();
                if (temp != null) {
                    System.out.print(temp.chave);
                    localStack.push(temp.filhoEsquerda);
                    localStack.push(temp.filhoDireita);
                    if (temp.filhoEsquerda != null
                            || temp.filhoDireita != null) {
                        ehLinhaVazia = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < brancos * 2 - 2; j++) {
                    System.out.print(' ');
                }
            } 
            System.out.println();
            brancos /= 2;
            while (localStack.isEmpty() == false) {
                pilhaGlobal.push(localStack.pop());
            }
        } 
        
        System.out.println("......................................................");
    }

    public int contar() {
        this.qtdeNos = 0;
        percorrer(this.raiz);
        return this.qtdeNos;
    }

    private void percorrer(Nodo nodo) {
        if (nodo != null){
            this.qtdeNos++;
            percorrer(nodo.filhoDireita);
            percorrer(nodo.filhoEsquerda);
        }
    }
    
    private int contaNodo(Nodo nodo){
        int cont = 0;
        if (nodo != null){
            cont +=  contaNodo(nodo.filhoEsquerda);
            cont += 1;
            cont += contaNodo(nodo.filhoDireita);
        }
        return cont;
    }
    

    public int contaNodos() {
        return contaNodo(raiz);
    }
} 