package aula06;

public class AlunosFilaApp {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		Aluno aluno = new Aluno("Sicrano", "sicrano@gmail.com");
		Aluno aluno1 = new Aluno("Beltrano", "beltrano@gmail.com");
		
		fila.entrar( aluno );
		fila.entrar( aluno1 );
		fila.imprimir();
		Aluno alunoAtendido = (Aluno) fila.sair();
		System.out.println("Aluno atendido"+
		alunoAtendido);
	}
}
