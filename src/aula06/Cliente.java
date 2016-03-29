package aula06;

public class Cliente {
	
	
	public String nome;
	public String email;

	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + "]";
	}
	
	
	

}
