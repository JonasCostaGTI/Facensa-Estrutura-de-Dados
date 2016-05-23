package EXG104;

public class DiscografiaAPP {

	public static void main(String[] args) {
		DiscografiaLista discos = new DiscografiaLista();
		
		discos.adicionar(new Discografia(1, "Nirvana", "Never Mind"));
		discos.adicionar(new Discografia(2, "Kalipso", "Joelma 1"));
		discos.adicionar(new Discografia(3, "Pink Floyd", "1"));
		discos.adicionar(new Discografia(4, "Imagine Dragons", "smoke mirror"));
		discos.adicionar(new Discografia(5, "Beatles", "yellow submarine"));
		
		discos.lista();
		
		System.out.println("Removido: " + discos.remover());
		
		discos.lista();

		discos.saltar(3);
		
		discos.lista();
		

		

	}

}
