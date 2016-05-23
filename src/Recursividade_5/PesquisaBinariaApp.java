package Recursividade_5;

public class PesquisaBinariaApp {

    public static void main(String[] args) {
        int tamanhoMaximo = 100; // tamanho do array 

        PesquisaBinaria itens;

        itens = new PesquisaBinaria(tamanhoMaximo);

        itens.inserir(72);
        itens.inserir(90);
        itens.inserir(45);
        itens.inserir(126);
        itens.inserir(54);
        itens.inserir(99);
        itens.inserir(144);
        itens.inserir(27);
        itens.inserir(135);
        itens.inserir(81);
        itens.inserir(18);
        itens.inserir(108);
        itens.inserir(9);
        itens.inserir(117);
        itens.inserir(63);
        itens.inserir(36);

        itens.mostrar();

        int chavePesquisa = 27;

        if (itens.find(chavePesquisa) != itens.tamanho()) {
            System.out.println("Encontrou " + chavePesquisa);
        } else {
            System.out.println("Não encontrou " + chavePesquisa);
        }
    }
}
