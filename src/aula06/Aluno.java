package aula06;

public class Aluno {

	public String nome;
	public String email;

	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;		
	}
	
	@Override
	public String toString() {
		return this.nome+" - "+this.email;
	}

}
