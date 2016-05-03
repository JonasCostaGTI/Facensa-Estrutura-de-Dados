package aula10;

public class Lista {
	private Nodo primeiro = null;

	public void adicionar(int nota) {
		Nodo nodoNovo = new Nodo(nota);
		
		if (this.primeiro == null) {
			this.primeiro = nodoNovo;
		}else {
			nodoNovo.proximo = this.primeiro;
			this.primeiro = nodoNovo;
		}
		
	}

	public void imprimir() {
		Nodo atual = this.primeiro;
		while (atual != null) {
			System.out.printf("Nota do aluno de ED = %d \n", atual.nota);
			atual = atual.proximo;
		}
		
	}

	public void imprimirTudoInvertido() {
		
		Nodo atual = this.primeiro;
		String numerosInvertido = "";
		
		while (atual != null) {
			numerosInvertido = atual.nota + " ," + numerosInvertido;
			
			atual = atual.proximo;
		}
		
		System.out.println(numerosInvertido);
		
	}

	public void concatenar(Lista outraTurma) {
		Nodo root = outraTurma.getprimeiro();
		
		while (root != null) {
			this.adicionar(root.nota);
			root = root.proximo;
		}
		
	}

	private Nodo getprimeiro() {
		return this.primeiro;
	}

	
}
