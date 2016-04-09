package aula06;

public class AlunosPilhaApp {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();		
		
		Aluno aluno = new Aluno("Sicrano", "sicrano@gmail.com");		
		pilha.push( aluno );
		
		Aluno aluno1 = new Aluno("Beltrano", "beltrano@gmail.com");
		pilha.push(aluno1);
		
		System.out.println("-------------------");
		pilha.imprimir();
		
		Aluno alunoRemovido = (Aluno) pilha.pop();
		System.out.println("Aluno Removido = "+alunoRemovido);
		
		

	}

}
