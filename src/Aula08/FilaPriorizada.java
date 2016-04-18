package Aula08;

public class FilaPriorizada {
	
	private ListaPriorizada lista;

	public FilaPriorizada(){
		this.lista = new ListaPriorizada();
	}

	public void inserir(Aluno aluno) {
		this.lista.inserir(aluno);
	}

	public void imprimir() {
		this.lista.imprimir();
	}

	public Aluno remover() {
		return this.lista.remover();
	}

}
