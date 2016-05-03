package aula10;

public class Pilha {

	private static final Integer TOPO = -1;
	private Integer[] numeros;
	private Integer topo = TOPO;

	public Pilha(Integer tamanho) {
		this.numeros = new Integer[tamanho];
		
	}

	public void push(Integer numeroDoDado) {
		this.numeros[++topo] = numeroDoDado;
		System.out.printf("\n push(%d) = numeros[%d] = %d", numeroDoDado, topo, numeroDoDado);
	}

	public Integer pop() {
		Integer numero = this.numeros[topo--];
		System.out.printf("\n pop() => retornou %d ", numero);
		return numero;
		
		
	}

	public Integer peek() {
		Integer numero = this.numeros[topo];
		System.out.printf("\n peek() => retornou %d ", numero);
		return numero;
		
	}

	public void ordenar(Pilha pilhaDados) {
		for (int fim = topo; fim > TOPO; fim--) {
			for (int inicio = 0; inicio < fim; inicio++) {
				
				if (this.numeros[inicio] > this.numeros[inicio+1]) {
					trocar(inicio, inicio+1);
				}
			}
			
		}
		
	}

	private void trocar(int atual, int proximo) {
		int dado = this.numeros[atual];
		this.numeros[atual] = this.numeros[proximo];
		this.numeros[proximo] = dado;
		
	}

}
