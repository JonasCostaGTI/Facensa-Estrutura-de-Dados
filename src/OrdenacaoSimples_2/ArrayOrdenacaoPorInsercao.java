package OrdenacaoSimples_2;

// ArrayOrdenacaoPorInsercao.java
// Demonstra o Insert Sort (Ordenacao por Insercao)
// para executar o programa digite:
//    java ArrayOrdenacaoPorInsercaoApp
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
public class ArrayOrdenacaoPorInsercao {

    private long[] dados; // Array de Dados
    private int qtdeElementos; // Quantidade de elementos do array de dados
//--------------------------------------------------------------

    public ArrayOrdenacaoPorInsercao(int qtdeDados) // Construtor
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

    public void ordenarPorInsercao() {
        int elemento, subElemento;
        // Repetição externa
        for (elemento = 1; elemento < this.qtdeElementos; elemento++) {
            long auxiliar = dados[elemento]; // Marca item removido            
            subElemento = elemento; // Determina o início do subgrupo de troca
            
            // Até achar um menor que o auxiliar, que é o elemento avaliado
            while (subElemento > 0 && dados[subElemento - 1] >= auxiliar){
                // Troca pelo item da direita
                dados[subElemento] = dados[subElemento - 1]; 
                --subElemento; // Vai para a posicao esquerda no subgrupo
            }
            dados[subElemento] = auxiliar;
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

class ArrayOrdenacaoPorInsercaoApp {

    public static void main(String[] args) {
        int tamanhoMaximo = 100; // Tamanho do Array
        ArrayOrdenacaoPorInsercao ordena; // Referencia para Classe
        // Criar o Array
        ordena = new ArrayOrdenacaoPorInsercao(tamanhoMaximo);
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
        ordena.ordenarPorInsercao(); // Ordena por Selecao os itens
        ordena.mostrar(); // Mostra os itens novamente, agora ordenados
    }
} 
////////////////////////////////////////////////////////////////