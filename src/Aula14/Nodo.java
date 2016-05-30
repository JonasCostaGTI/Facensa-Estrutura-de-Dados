package Aula14;

public class Nodo {
	public Familiar familiar;
	public Nodo ladoEsquerdo = null;
	public Nodo ladoDireito = null;

	public Nodo(Familiar familiar) {
		this.familiar = familiar;
	}

}
