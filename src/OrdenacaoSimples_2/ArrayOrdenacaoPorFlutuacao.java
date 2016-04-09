package OrdenacaoSimples_2;

// ArrayOrdenacaoPorFlutuacao.java
// Demonstra o Bubble Sort (Ordenacao por Flutuacao)
// para executar o programa digite:
//    java ArrayOrdenacaoPorFlutuacaoApp
////////////////////////////////////////////////////////////////
public class ArrayOrdenacaoPorFlutuacao {

    private long[] dados; // Array de Dados
    private int qtdeElementos; // Quantidade de elementos do array de dados
//--------------------------------------------------------------

    public ArrayOrdenacaoPorFlutuacao(int qtdeDados) // Construtor
    {
        dados = new long[qtdeDados]; // Cria o Arrya de Dados
        qtdeElementos = 0; // Nenhum elemento ainda
    }
//--------------------------------------------------------------

    public void inserir(long valor) // Coloca um elemento dentro do array
    {
        dados[qtdeElementos] = valor; // Insere ele
        qtdeElementos++; // Incrementa o tamanho
    }
//--------------------------------------------------------------

    public void mostrar() // Mostra o conteúdo do array de dados
    {
        // Para cada elemento, 
        for (int elemento = 0; elemento < qtdeElementos; elemento++) {
            System.out.print(dados[elemento] + " "); // Mostra o dado
        }
        System.out.println("");
    }
//--------------------------------------------------------------

    public void ordenarPorFlutuacao() {
        int fim, inicio;
        // Repetição externa (para trás)
        for (fim = qtdeElementos - 1; fim > 1; fim--) {
            // Repetição interna (para frente)
            for (inicio = 0; inicio < fim; inicio++) {
                if (dados[inicio] > dados[inicio + 1]) // Fora de Ordem?
                {
                    trocar(inicio, inicio + 1); // Trocar de posição
                }
            }
        }
    }
//--------------------------------------------------------------

    private void trocar(int um, int dois) {
        long auxiliar = dados[um];
        dados[um] = dados[dois];
        dados[dois] = auxiliar;
    }
//--------------------------------------------------------------
}

////////////////////////////////////////////////////////////////
class ArrayOrdenacaoPorFlutuacaoApp {

    public static void main(String[] args) {
        int tamanhoMaximo = 100; // Tamanho do Array
        ArrayOrdenacaoPorFlutuacao ordena; // Referencia para Classe
        // Criar o Array
        ordena = new ArrayOrdenacaoPorFlutuacao(tamanhoMaximo);
        ordena.inserir(77); // Insere 10 itens
        ordena.inserir(99);
        ordena.inserir(44);
        ordena.inserir(55);
        ordena.inserir(22);
        ordena.inserir(88);
        ordena.inserir(11);
        ordena.inserir(00);
        ordena.inserir(66);
        ordena.inserir(33);
        ordena.mostrar(); // Mostra os itens
        ordena.ordenarPorFlutuacao(); // Ordena por Flutuacao os itens
        ordena.mostrar(); // Mostra os itens novamente, agora ordenados
    }
} 
////////////////////////////////////////////////////////////////