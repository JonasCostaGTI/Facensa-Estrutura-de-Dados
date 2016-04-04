package aula06;

public class Lista {
	private Nodo primeiro;

	public Lista() {
		this.primeiro = null;
	}

	public void adicionar(Aluno cliente) {
		Nodo novoNodo = new Nodo(cliente);
		
		novoNodo.proximo = this.primeiro;		
		this.primeiro = novoNodo;
	}

	public void imprimir() {
		Nodo nodoAtual = this.primeiro;
		
		while (nodoAtual != null){
			System.out.println( nodoAtual.objeto.toString() );
			
			nodoAtual = nodoAtual.proximo;
		}
	}

	public void remover(String nome) {
		Nodo atual = this.primeiro, anterior = null; 
		
		while (atual != null && 
				!nome.equalsIgnoreCase(((Aluno)atual.objeto).nome) ){
			anterior = atual;
			atual = atual.proximo;
		}
		
		if ( atual != null ){
			if (anterior == null){
				this.primeiro = atual.proximo;
			} else {
				anterior.proximo = atual.proximo;
			}
		}
		
	}

}
