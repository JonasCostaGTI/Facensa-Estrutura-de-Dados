package aula06;

public class ClientesAPP {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		
		Cliente cliente = new Cliente("Jonas","jonas.com");
		lista.adicionar(cliente);
		
		Cliente cliente1 = new Cliente("Jonas1","jonas1.com");
		lista.adicionar(cliente1);
		
		Cliente cliente2 = new Cliente("Jonas2","jonas2.com");
		lista.adicionar(cliente2);
		
		
		lista.imprimir();
		
		System.out.println("");
		lista.remover("Jonas1");
		
		lista.imprimir();
		
		

	}

}
