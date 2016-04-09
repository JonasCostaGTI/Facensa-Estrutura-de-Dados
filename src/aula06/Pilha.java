package aula06;

public class Pilha {
	
	private Lista pilha = new Lista(); 

	public void push(Aluno aluno) {
		pilha.inserirInicio(aluno);
	}

	public void imprimir() {
		pilha.imprimir();
	}

	public Object pop() {
		return pilha.removerInicio().objeto;
	}

}
