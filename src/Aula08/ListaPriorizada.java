package Aula08;

public class ListaPriorizada {
	
	private Nodo primeiro;

	public ListaPriorizada() {
		this.primeiro = null;
	}
	
	public void inserir(Aluno aluno) {
		Nodo novoNodo = new Nodo(aluno);
		
		Nodo atual = this.primeiro;
		Nodo anterior = null;
		
		while (atual != null && 
				atual.aluno.nome.compareToIgnoreCase(novoNodo.aluno.nome) < 0 ){
			anterior = atual;
			atual = atual.proximo;
		}
		
		novoNodo.proximo = atual;
		
		if ( anterior == null ) {
			this.primeiro = novoNodo;
		} else { 
			anterior.proximo = novoNodo;
		}
	}

	public void imprimir() {
		Nodo atual = this.primeiro; 
		
		while (atual != null){
			System.out.println(atual.aluno);
			
			atual = atual.proximo;
		}	
	}

	public Aluno remover() {
		Aluno alunoRemovido = this.primeiro.aluno;
		
		this.primeiro = this.primeiro.proximo;
		
		return alunoRemovido;
	}
	

}
