package aula09;

public class FilaPriorizadaVetor implements FilaPriorizadaI{

	private static final Integer VAZIA = -1;
	private Integer tamanho;
	private Aluno[] fila;
	private Integer numeroAlunos;
	private Integer posicaoFila;

	@Override
	public void inserir(Aluno aluno) {
		int posicaoIns = 
				( this.posicaoFila + this.numeroAlunos ) % this.tamanho;
		
		if (posicaoIns >= this.tamanho)
			throw new Error("Fila cheia!");
		
		this.fila[posicaoIns] = aluno;
		this.numeroAlunos++;
	}

	@Override
	public void imprimir() {
		for (int nroAluno = 1; 
				nroAluno <= this.numeroAlunos; 
				nroAluno++){
			System.out.println(
					this.fila[(this.posicaoFila+nroAluno)%this.tamanho]);
		}
	}

	@Override
	public Aluno remover() {
		if (this.tamanho == 0 )
			throw new Error("Fila esta vazia!");
			
	
		Aluno aluno = this.fila[posicaoFila];
		this.posicaoFila = (this.posicaoFila + 1)%this.tamanho;
		
		return aluno;
	}

	@Override
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
		this.fila = new Aluno[this.tamanho];
		this.numeroAlunos = 0;		
		this.posicaoFila = 0;
	}

}
