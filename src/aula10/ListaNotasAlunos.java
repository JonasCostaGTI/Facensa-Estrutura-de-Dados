package aula10;

public class ListaNotasAlunos {

	public static void main(String[] args) {
		
		Lista listaNotas = new Lista();
		
		listaNotas.adicionar(10);
		listaNotas.adicionar(9);
		listaNotas.adicionar(10);
		listaNotas.adicionar(8);
		
		listaNotas.imprimir();
		listaNotas.imprimirTudoInvertido();
		
		
		
		
		
		Lista outraTurma = new Lista();
		outraTurma.adicionar(1);
		outraTurma.adicionar(2);
		outraTurma.adicionar(5);
		
		
		listaNotas.concatenar(outraTurma);
		
		listaNotas.imprimir();

	}

}
