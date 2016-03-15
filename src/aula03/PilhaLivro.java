package aula03;

public class PilhaLivro {
	private Integer tamanho;
	private Livro[] livros;
	private int topo;
	private static final int TOPO = -1;

	public PilhaLivro(int tamanho) {
		this.tamanho = tamanho;
		this.livros = new Livro[tamanho];
		this.topo = TOPO;
		
	}

	public static void main(String[] args) {
		/*PilhaLivro pilhaLivro = new PilhaLivro(10);
		
		pilhaLivro.push(new Livro("Pilhas em Java", "Sicrano"));
		System.out.println("push = "+pilhaLivro.peek());
		pilhaLivro.push(new Livro("Filas em Java", "Beltrano"));
		System.out.println("push e um peek = "+pilhaLivro.peek());
		System.out.println("pop = "+pilhaLivro.pop());
		System.out.println("peek = "+pilhaLivro.peek());*/
		
		int tamanho = 5;
		PilhaLivro pilha = new PilhaLivro(tamanho);
		
		System.out.println("**** Push  ****");
		for (Integer i = 0; i < tamanho; i++){
			Livro livro = new Livro(i.toString(), i.toString()); 
			pilha.push(livro);
			System.out.println("Push -> "+pilha.peek());
		}
		
		System.out.println("**** Pop ****");
		for (Integer i = 0; i < tamanho; i++){
			System.out.println("Pop = "+pilha.pop());
		}
		
		
	}

	private Livro pop() {		
		return this.livros[this.topo--];
	}

	private String peek() {		
		return (this.topo == TOPO)? "": this.livros[this.topo].toString();
	}

	private void push(Livro livro) {		
		this.livros[++this.topo] = livro;
	}

}
