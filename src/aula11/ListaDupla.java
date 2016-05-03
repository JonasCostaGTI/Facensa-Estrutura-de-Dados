package aula11;

import aula10.Nodo;

public class ListaDupla {
	
	private NodoDuplo primeiro = null;
	private NodoDuplo ultimo = null;

	public void adicionarInicio(String nome, String email) {
		
		Cliente cliente = new Cliente(nome, email);
		NodoDuplo nodoNovo = new NodoDuplo(cliente);
		
		if (this.primeiro == null ) {
			this.primeiro = nodoNovo;
			this.ultimo = nodoNovo;
		}else{
			this.primeiro.anterior = nodoNovo;
			nodoNovo.proximo = this.primeiro;
			this.primeiro = nodoNovo;
		}
		
		System.out.println("Inseriu no inicio o cliente: " + cliente.nome );
		
		
	}

	public void imprimir() {
		
		NodoDuplo atual = this.primeiro;
		
		while (atual != null) {
			System.out.println("Cliente: " + atual.cliente.nome);
			atual = atual.proximo;
		}
		
		
		
	}

	public void remover(String nome) {
		NodoDuplo delNodo = this.getNodoDuplo(nome);
		
		if (delNodo != null) {
			
			if (delNodo.proximo == null) {
				this.ultimo = delNodo.anterior;
			}else{
				delNodo.proximo.anterior = delNodo.anterior;
			}
			
			if (delNodo.anterior == null) {
				this.primeiro = delNodo.proximo;
			}else{
				delNodo.anterior.proximo = delNodo.proximo;
			}
			
			
			System.out.println("Removido o cliente: " + delNodo.cliente.nome);
			
		}
		
	}

	private NodoDuplo getNodoDuplo(String nome) {
		NodoDuplo atual = this.primeiro;
		while (atual != null && atual.cliente.nome.equalsIgnoreCase(nome)) {
			atual = atual.proximo;
		}
		return atual;
	}

	public void adicionarFim(String nome, String email) {
		Cliente cliente = new Cliente(nome, email);
		NodoDuplo nodoNovo = new NodoDuplo(cliente);
		
		if (this.primeiro == null ) {
			this.primeiro = nodoNovo;
			this.ultimo = nodoNovo;
		}else{
			this.ultimo.proximo = nodoNovo;
			nodoNovo.anterior = this.ultimo;
			this.ultimo = nodoNovo;
		}
		
		System.out.println("Inseriu no fim o cliente: " + cliente.nome );
		
	}

	public void adicionarDepois(String nome, Cliente cliente) {
		NodoDuplo nodoAtual = this.getNodoDuplo(nome);
		
		if (nodoAtual != null) {
			
			if (nodoAtual.proximo == null) {
				this.adicionarFim(cliente.nome, cliente.email);
			}else {
				NodoDuplo nodoNovo = new NodoDuplo(cliente);
				
				nodoNovo.anterior = nodoAtual;
				nodoNovo.proximo = nodoAtual.proximo;
				nodoAtual.proximo.anterior = nodoNovo;
				nodoAtual.proximo = nodoNovo;
			}
			
			System.out.println("Adicionou: " + cliente.nome + " depois de " + nome);
			
			
			
			
		}
		
		
	}

	public void ordenar() {
		
		if (this.primeiro == null) {
			return;
		}
		NodoDuplo last = this.ultimo;
		
		while (last != null) {
			NodoDuplo first = this.primeiro;
			
			while (first != last) {
				
				if (first.cliente.nome.compareToIgnoreCase(last.cliente.nome) > 0) {
					this.troca(first, last);
				}
				first = first.proximo;
			}
			
			last = last.anterior;
		}
		
	}

	private void troca(NodoDuplo first, NodoDuplo last) {
		Cliente clienteFirst = first.cliente;
		first.cliente = last.cliente;
		last.cliente = clienteFirst;
		
	}
	
	

}
