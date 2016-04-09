package OrdenacaoSimples_2;

// ArrayOrdenacaoPorSelecao.java
// Demonstra o Selection Sort (Ordenacao por Selecao)
// para executar o programa digite:
//    java ArrayOrdenacaoPorSelecaoApp
////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////
public class ArrayOrdenacaoPorSelecao {

    private long[] dados; // Array de Dados
    private int qtdeElementos; // Quantidade de elementos do array de dados
//--------------------------------------------------------------

    public ArrayOrdenacaoPorSelecao(int qtdeDados) // Construtor
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

    public void ordenarPorSelecao() {
        int primeira, menor, proxima;
        // Repetição externa
        for (primeira = 0; primeira < this.qtdeElementos-1; primeira++) {
            menor = primeira; // Menor
            // Repetição interna 
            for (proxima = primeira+1; proxima < qtdeElementos; proxima++) {
                if (dados[proxima] < dados[menor]) // Se menor maior proxima?
                {
                    menor = proxima; // Temos um novo menor
                    trocar(primeira, menor); // Trocar de posição
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
class ArrayOrdenacaoPorSelecaoApp {

    public static void main(String[] args) {
        int tamanhoMaximo = 100; // Tamanho do Array
        ArrayOrdenacaoPorSelecao ordena; // Referencia para Classe
        // Criar o Array
        ordena = new ArrayOrdenacaoPorSelecao(tamanhoMaximo);
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
        ordena.ordenarPorSelecao(); // Ordena por Selecao os itens
        ordena.mostrar(); // Mostra os itens novamente, agora ordenados
    }
} 
////////////////////////////////////////////////////////////////