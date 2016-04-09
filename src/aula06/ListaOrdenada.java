package aula06;

public class ListaOrdenada {
	private Nodo primeiro = null;

	public void inserir(Aluno aluno) {
		Nodo nodoNovo = new Nodo(aluno);
		
		if ( this.primeiro == null ){
			this.primeiro = nodoNovo;
			return;
		}
		
		Nodo nodoAnterior = null;
		Nodo nodoAtual = this.primeiro;
		
		while (((Aluno) nodoNovo.objeto).nome.compareTo(
				((Aluno) nodoAtual.objeto).nome) > 0){
			nodoAnterior = nodoAtual;
			nodoAtual = nodoAtual.proximo;
		}
		
		if ( nodoAnterior == null){
			nodoNovo.proximo = this.primeiro;
			this.primeiro = nodoNovo;
		} else {
			nodoAnterior.proximo = nodoNovo;
			nodoNovo.proximo = nodoAtual;
		}
	}

	public void imprimir() {
		Nodo nodoAtual = this.primeiro;
		
		while (nodoAtual != null){
			System.out.println(nodoAtual.objeto);
			nodoAtual = nodoAtual.proximo;
		}		
	}

}