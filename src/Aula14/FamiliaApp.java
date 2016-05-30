package Aula14;

public class FamiliaApp {

	public static void main(String[] args) {
		Familia familia = new Familia();
		
		Integer[] codigos = { 70, 35, 30, 80, 99, 101, 20, 27,
				32, 40, 50, 10, 5, 130, 121, 89};
		
		Integer[] codigosTeste = { 45, 35, 55, 28, 37, 60, 53, 59, 65, 69};
		
		Familiar familiar;
		for (Integer codigo: codigosTeste) {
			familiar = new Familiar( codigo );
			familia.inserir( familiar );
		}
		
		familia.imprimir();
		
		System.out.println("---------------------");
				
		familia.remover(28);
		familia.remover(35);
		familia.remover(55);
		
		familia.imprimir(); 
	}
}
