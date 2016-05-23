package EXG104;

public class DiscografiaLista {

	private NodoDisco atual = null;

	public void adicionar(Discografia discografia) {
		NodoDisco novoNodoDisco = new NodoDisco(discografia);

		if (this.atual == null) {
			this.atual = novoNodoDisco;
			this.atual.proximo = this.atual;
			this.atual.anterior = this.atual;

		} else {

			novoNodoDisco.proximo = this.atual.proximo;
			novoNodoDisco.anterior = this.atual;

			this.atual.proximo = novoNodoDisco;
			this.atual = novoNodoDisco;
		}

	}

	public void lista() {
		NodoDisco corrente = this.atual;
		System.out.println("listando discografia..");

		if (corrente == null) {
			System.out.println("Nao existe discos registrados");
		} else {
			System.out.println(corrente);

			corrente = corrente.proximo;
			while (corrente != this.atual) {
				System.out.println(corrente);
				corrente = corrente.proximo;
			}
		}

	}

	public NodoDisco remover() {
		NodoDisco nodoRemovido = this.atual;

		if (this.atual == null || this.atual == this.atual.proximo) {
			this.atual = null;

		} else {
			NodoDisco anterior = this.atual.anterior;

			this.atual = this.atual.proximo;
			anterior.proximo = this.atual;
		}

		return nodoRemovido;

	}

	// private NodoDisco getDiscoAnterior() {
	//
	// NodoDisco anterior = null;
	// NodoDisco corrente = this.atual.proximo;
	//
	//
	// while (corrente != this.atual) {
	// anterior = corrente;
	// corrente = corrente.proximo;
	// }
	//
	// return anterior;
	// }

	public void saltar(int salto) {
		while (salto > 0) {
			this.atual = this.atual.proximo;
			salto--;
		}

	}

	public Discografia getNodoDiscoAtual() {
		NodoDisco nodoAtual = this.atual;
		return nodoAtual == null ? null : this.atual.discografia;
	}
	
	

	public NodoDisco removerPop() {
		NodoDisco nodoRemovido = this.atual;

		if (this.atual == null || this.atual == this.atual.proximo) {
			this.atual = null;

		} else {
			
			this.atual.anterior.proximo = this.atual.proximo;
			this.atual.proximo.anterior = this.atual.anterior;
			this.atual = this.atual.anterior;
			
		}

		return nodoRemovido;

		
	}

}
