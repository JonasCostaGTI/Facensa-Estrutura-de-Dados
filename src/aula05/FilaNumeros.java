package aula05;

public class FilaNumeros {

	private static final Integer TAMANHOFILA = 10;

	public static void main(String[] args) {
		Fila fila = new Fila(TAMANHOFILA);
		
		for (int i = 0; i < TAMANHOFILA ; i++) {
			fila.inserir(i+1);
		}			

		fila.mostrar();
		System.out.println("************************************");
		System.out.println("Removido valor = "+fila.remover());
		System.out.println("Removido valor = "+fila.remover());
		System.out.println("Inserindo valor = "+fila.inserir(-3));		
		System.out.println("Removido valor = "+fila.remover());
		System.out.println("Removido valor = "+fila.remover());
		System.out.println("Inserindo valor = "+fila.inserir(5));
		System.out.println("************************************");
		fila.mostrar();
		
		
	}

}
