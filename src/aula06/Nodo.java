package aula06;

public class Nodo<T> {
	public Object objeto;
	public Nodo proximo;

	public Nodo(Object objeto) {
		this.objeto = objeto;
		this.proximo = null;
	}

}
