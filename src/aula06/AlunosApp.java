package aula06;

public class AlunosApp {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Sicrano", "sicrano@gmail.com");
		
		Lista listaAlunos = new Lista();
		listaAlunos.adicionar(aluno);
		
		Aluno aluno1 = new Aluno("Beltrano", "beltrano@gmail.com");
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno("João", "joão@gmail.com");
		listaAlunos.adicionar(aluno2);
		
		listaAlunos.imprimir();
		
		listaAlunos.remover("BELTRANO");		
		System.out.println("-----------------------");		
		listaAlunos.imprimir();
		
		listaAlunos.remover("João");		
		System.out.println("-----------------------");
		listaAlunos.imprimir();
		
		listaAlunos.remover("Sicrano");		
		System.out.println("-----------------------");
		listaAlunos.imprimir();
		
		
		
	}

}
