package aula06;

public class Lista {
	private Nodo primeiro;
	private Nodo ultimo;

	public Lista() {
		this.primeiro = null;
		this.ultimo = null;
	}

	public void inserirInicio(Aluno cliente) {
		Nodo novoNodo = new Nodo(cliente);
		
		if (this.primeiro == null)
			this.ultimo = novoNodo;
			
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
		
		if (this.primeiro == null)
			this.ultimo = null;
		
	}

	public void adicionarFim(Aluno aluno) {
		Nodo nodoNovo = new Nodo(aluno);
		
		if (this.primeiro == null){
			this.primeiro = nodoNovo;
		} else {
			Nodo nodoAtual = this.primeiro;
			
			while (nodoAtual.proximo != null)
				nodoAtual = nodoAtual.proximo;
			
			nodoAtual.proximo = nodoNovo;
		} 

		this.ultimo = nodoNovo;
	}

	public void adicionarFimV2(Aluno aluno) {
		Nodo nodoNovo = new Nodo(aluno);
		
		if (this.ultimo == null){
			this.primeiro = nodoNovo; 
		} else {
			this.ultimo.proximo = nodoNovo;
		}
	}

	public Nodo removerInicio() {
		if (this.primeiro == null)
			return null;
		
		Nodo nodoRemovido = this.primeiro;
		
		this.primeiro = this.primeiro.proximo;
		
		if (this.primeiro == null)
			this.ultimo = null;
		
		return nodoRemovido;
	}
}
