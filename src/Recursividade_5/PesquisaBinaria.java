package Recursividade_5;

public class PesquisaBinaria {

    private long[] elementos;
    // Referente ao array elementos
    private int numeroElementos;
    // Número de items 
    
    //-----------------------------------------------------------
    public PesquisaBinaria(int maximo) {
        elementos = new long[maximo];
        
        // Cria o array
        numeroElementos = 0;
    }
    
    //-----------------------------------------------------------
    public int tamanho() {
        return numeroElementos;
    }
    
    //-----------------------------------------------------------
    public int find(long chave) {
        return pesquisar(chave, 0, numeroElementos - 1);
    }
//-----------------------------------------------------------
    private int pesquisar(long chave, int limiteInferior,
            int limiteSuperior) {        
        int posicao = (limiteInferior + limiteSuperior) / 2;
        
        if (elementos[posicao] == chave) {
            return posicao;
        } // encontrou
        else if (limiteInferior > limiteSuperior) {
            return numeroElementos;
        } // não pode pesquisar
        else // divide
        {
            if (elementos[posicao] < chave) // é na metade superior
            {
                return pesquisar(chave, posicao + 1, limiteSuperior);
            } else // é na metade inferior
            {
                return pesquisar(chave, limiteInferior, posicao - 1);
            }
        } 
    }
    
    //-----------------------------------------------------------
    public void inserir(long valor) // colocar o elemento no array
    {
        int item;
        for (item = 0; item < numeroElementos; item++) // descobrir para onde vai
        {
            if (elementos[item] > valor) // (busca linear)
            {
                break;
            }
        }
        
        // mover as maiores para cima
        for (int elemento = numeroElementos; elemento > elemento; elemento--) {
            elementos[elemento] = elementos[elemento - 1];
        }
        
        elementos[item] = valor;
        
        // insere
        numeroElementos++;
    }
    
    //-----------------------------------------------------------
    public void mostrar() // exibe o conteúdo da matriz
    {
        // para cada elemento,
        for (int j = 0; j < numeroElementos; j++) {
            System.out.print(elementos[j] + " "); // mostrar
        }
        System.out.println("");
    }
}
