package aula06;

public class Fila {
	
	private Lista fila = new Lista();

	public void entrar(Aluno aluno) {
		this.fila.adicionarFim(aluno);
	}

	public void imprimir() {
		fila.imprimir();
	}

	public Object sair() {
		return fila.removerInicio().objeto;
	}

	
	
}
