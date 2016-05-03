package aula11;

public class ClientesAPP {

	public static void main(String[] args) {
		
		ListaDupla clientes = new ListaDupla();
		
		clientes.adicionarInicio("Sicrano","sicrano@cnec.br");
		clientes.adicionarInicio("Alex","alex@cnec.br");
		clientes.adicionarInicio("Beltrano","beltrano@cnec.br");
		clientes.adicionarInicio("Fulano","fulano@cnec.br");
		clientes.imprimir();
		
		clientes.remover("Beltrano");
		
		clientes.imprimir();
		
		clientes.adicionarFim("Mario", "mario@cnec.br");
		clientes.imprimir();
		
		clientes.adicionarDepois("Sicrano", new Cliente("Carlos", "carlos@cnec.com.br"));
		
		clientes.imprimir();
		
		
		System.out.println("ordenar...");
		clientes.ordenar();
		clientes.imprimir();
		
		

	}

}
