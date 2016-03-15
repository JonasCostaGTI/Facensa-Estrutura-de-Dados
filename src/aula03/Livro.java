package aula03;

public class Livro {
	public String titulo;
	public String autor;
	
	public Livro(String titulo, String autor){
		this.titulo = titulo;
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Titulo = "+this.titulo+"; Autor = "+this.autor;
	}

}
