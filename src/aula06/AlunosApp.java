package aula06;

public class AlunosApp {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Sicrano", "sicrano@gmail.com");

		Lista listaAlunos = new Lista();
		listaAlunos.inserirInicio(aluno);

		Aluno aluno1 = new Aluno("Beltrano", "beltrano@gmail.com");
		listaAlunos.inserirInicio(aluno1);

		Aluno aluno2 = new Aluno("João", "joão@gmail.com");
		listaAlunos.inserirInicio(aluno2);

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

		Aluno aluno3 = new Aluno("Mario", "mario@gmail.com");
		listaAlunos.adicionarFim(aluno3);

		Aluno aluno4 = new Aluno("Mario Dois", "mario2@gmail.com");
		listaAlunos.adicionarFimV2(aluno4);
		System.out.println("-----------------------");
		listaAlunos.imprimir();

		System.out.println("Removido = " + 
		listaAlunos.removerInicio());

	}

}
