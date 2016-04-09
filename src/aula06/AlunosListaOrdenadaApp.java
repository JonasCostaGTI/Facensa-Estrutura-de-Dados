package aula06;

public class AlunosListaOrdenadaApp {

	public static void main(String[] args) {
		ListaOrdenada lista = new ListaOrdenada();
		
		Aluno aluno = new Aluno("C", "sicrano@gmail.com");		
		Aluno aluno1 = new Aluno("A", "beltrano@gmail.com");
		Aluno aluno2 = new Aluno("B", "cicrano@gmail.com");
		
		lista.inserir( aluno );
		lista.inserir( aluno1 );
		lista.inserir( aluno2 );
		
		lista.imprimir();

	}

}
