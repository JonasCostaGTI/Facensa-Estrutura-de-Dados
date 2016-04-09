package aula05;

import PilhasFilas_3.Pilha;

public class P1ComparacaoFilas {

	private static final int TAMANHO = 5;

	public static void main(String[] args) throws CloneNotSupportedException {
		Pilha pilha1 = new Pilha(TAMANHO);
		Pilha pilha2 = new Pilha(TAMANHO);
		
		long[] numeros = {2,3,4,5,6};
		
		pilha1.push(numeros);
		pilha2.push(numeros);
		
		if ( Pilha.ehIgual(pilha1, pilha2) ){
			System.out.println("Pilha1 é igual a pilha2");
		}
	}

}
