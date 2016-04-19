package aula09;

public class FilaPriorizadaLista implements FilaPriorizadaI{
	
	private ListaPriorizada lista;

	public FilaPriorizadaLista(){
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

	@Override
	public void setTamanho(Integer tamanho) {		
	}

}
