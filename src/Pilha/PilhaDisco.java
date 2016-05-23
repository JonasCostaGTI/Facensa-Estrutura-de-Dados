package Pilha;

import EXG104.Discografia;
import EXG104.DiscografiaLista;

public class PilhaDisco {
	
	private DiscografiaLista lista = new DiscografiaLista();

	public void push(Discografia discografia) {
			lista.adicionar(discografia);
		
	}

	public Discografia peek() {
		return lista.getNodoDiscoAtual();
	}

	public void listar() {
		lista.lista();
		
	}

	public Discografia pop() {
		return lista.removerPop().discografia;
	}

	public boolean estaVazio() {
		return lista.getNodoDiscoAtual() == null;
	}

}
