package aula09;

public enum TipoFilaPriorizada {
	VETOR(new FilaPriorizadaVetor()), 
	LISTA(new FilaPriorizadaLista()), 
	LISTADUPLA(new FilaPriorizadaLista());
	
	private FilaPriorizadaI fila;

	private TipoFilaPriorizada(FilaPriorizadaI fila) {
		this.fila = fila;
	}
	
	public FilaPriorizadaI getFila(){
		return this.fila;
	}
}
