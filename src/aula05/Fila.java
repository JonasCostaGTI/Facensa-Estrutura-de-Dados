package aula05;

public class Fila {

	private static final Integer PRIMEIRO = -1;
	private Integer tamanho;
	private Integer[] fila;
	private Integer primeiro;
	private Integer ultimo;
	private int qtdeElementos;

	public Fila(Integer tamanho) {
		this.tamanho = tamanho;
		this.fila = new Integer[this.tamanho];
		this.primeiro = 0;
		this.ultimo = PRIMEIRO;
		this.qtdeElementos = 0;
	}

	public Integer inserir(int contador) {
		if (this.ultimo == this.tamanho - 1) {
			if (this.primeiro == PRIMEIRO + 1)
				throw new Error("Não tem mais espaço no array");
			else
				this.ultimo = PRIMEIRO;
		}

		this.fila[++this.ultimo] = contador;
		qtdeElementos++;
		
		return contador;
	}

	public void mostrar() {
		if (qtdeElementos == 0){
			System.out.println("Fila Vazia!");
			return;
		}
		
		int posicao = this.primeiro;

		while (posicao != this.ultimo) {
			System.out.printf("fila[%d] = %d\n", posicao, 
					this.fila[posicao]);

			posicao++;
			posicao = posicao % this.tamanho;
		}

		System.out.printf("fila[%d] = %d\n", posicao, this.fila[posicao]);
	}

	public Integer remover() {
		Integer numeroAtual = this.fila[this.primeiro];
		
		if (this.qtdeElementos == 0)
			throw new Error("Não existem elementos para remover");

		if (this.ultimo == this.primeiro) {
			this.primeiro = 0;
			this.ultimo = PRIMEIRO;
		} else if (this.primeiro == this.tamanho - 1) {
			this.primeiro = 0;
		} else {
			this.primeiro++;
		}
		
		qtdeElementos--;

		return numeroAtual;
	}

}
