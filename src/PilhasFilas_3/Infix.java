package PilhasFilas_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Infix {

    private static final int TOPO = -1;
    private int tamanhoPilha;
    private char[] pilha;
    private int topo;

//--------------------------------------------------------------
    public Infix(int tamanho) // Construtor
    {
        tamanhoPilha = tamanho;
        pilha = new char[tamanhoPilha];
        topo = TOPO;
    }

//--------------------------------------------------------------
    public void push(char item) // Coloca item no topo da pilha
    {
        pilha[++topo] = item;
    }

//--------------------------------------------------------------
    public char pop() // Retira item do topo da pilha
    {
        return pilha[topo--];
    }

//--------------------------------------------------------------
    public char peek() // Le um item do topo da pilha
    {
        return pilha[topo];
    }

//--------------------------------------------------------------
    public boolean estaVazia() // Pilha esta Vazia?
    {
        return (topo == TOPO);
    }

//-------------------------------------------------------------
    public int tamanho() // Tamanho da pilha
    {
        return topo + 1;
    }

//--------------------------------------------------------------
    public char peekN(int posicao) // Retorna o item na posição n
    {
        return pilha[posicao];
    }

//--------------------------------------------------------------
    public void mostrarPilha(String infix) {
        System.out.print(infix);
        System.out.print("Pilha(bottom-- > top): ");
        for (int posicao = 0; posicao < tamanho(); posicao++) {
            System.out.print(peekN(posicao));
            System.out.print(' ');
        }
        System.out.println("");
    }
}

////////////////////////////////////////////////////////////////
class InfixParaPostfix // Conversão de Infix para postfix 
{

    private Infix pilha;
    private String entrada;
    private String saida = "";

//--------------------------------------------------------------
    public InfixParaPostfix(String infix) // Construtor
    {
        entrada = infix;
        int stackSize = entrada.length();
        pilha = new Infix(stackSize);
    }

//--------------------------------------------------------------
    // Faz tradução para postfix
    public String traducaoParaPostfix() {
        for (int pos = 0; pos < entrada.length(); pos++) {
            char ch = entrada.charAt(pos);
            pilha.mostrarPilha("Para " + ch + " "); // *diagnóstico*

            switch (ch) {
                case '+': // É + ou -
                case '-':
                    pegaOperador(ch, 1); // Faz pop do operador
                    break; // (precedência 1)
                case '*': // É * ou /
                case '/':
                    pegaOperador(ch, 2); // Faz pop dos operadores
                    break; // (precedência 2)
                case '(': // é um parênteses esquerdo
                    pilha.push(ch); // retira o operador
                    break;
                case ')': // é um parênteses direito
                    pegaParenteses(ch); // Faz pop dos operadores
                    break;
                default: // deve ser um operando
                    saida = saida + ch; // escreve ele na saída
                    break;
            }
        }

        while (!pilha.estaVazia()) // pop dos operadores restantes
        {
            pilha.mostrarPilha("Enquanto "); // *diagnóstico*
            saida = saida + pilha.pop(); // escreve na saída
        }
        pilha.mostrarPilha("Fim "); // *diagnóstic*
        return saida; // Retorna o postfix
    }

    // Pega operador da entrada
    public void pegaOperador(char operador, int precedencia1) {
        while (!pilha.estaVazia()) {
            char operadorTopo = pilha.pop();
            if (operadorTopo == '(') // ser é um ‘(‘
            {
                pilha.push(operadorTopo); // restaurar ‘(‘
                break;
            } else // é um operador
            {
                int precedencia2; // precedência do novo operador
                // pesquisa a nova precedência do operador
                if (operadorTopo == '+' || operadorTopo == '-') {
                    precedencia2 = 1;
                } else {
                    precedencia2 = 2;
                }

                // se precedência do novo operador é menor
                if (precedencia2 < precedencia1) { // entao precedência do velho
                    pilha.push(operadorTopo); // salve novo-popped operador
                    break;
                } else // precedência do novo não é menor
                {
                    saida = saida + operadorTopo; // então precede anterior
                }
            }
        }

        pilha.push(operador); // coloca novo operador
    }

//--------------------------------------------------------------
    // Pega parenteses direito da entrada
    public void pegaParenteses(char ch) {
        while (!pilha.estaVazia()) {
            char chx = pilha.pop();
            if (chx == '(') // se popped ‘(‘
            {
                break; // esta feito
            } else // se popped operador
            {
                saida = saida + chx; // acrescenta na saida
            }
        }
    }
}

////////////////////////////////////////////////////////////////
class InfixApp {

    public static void main(String[] args) throws IOException {
        String entrada, saida;
        while (true) {
            System.out.print("Entre um infix: ");
            System.out.flush();
            entrada = getString(); // Le a string do teclado

            if (entrada.equals("")) // sai se [Enter]
            {
                break;
            }

            // faz a tradução
            InfixParaPostfix theTrans = new InfixParaPostfix(entrada);
            saida = theTrans.traducaoParaPostfix(); // faz a tradução

            System.out.println("Postfix é " + saida + '\n');
        }
    }

//--------------------------------------------------------------
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
//--------------------------------------------------------------
}
