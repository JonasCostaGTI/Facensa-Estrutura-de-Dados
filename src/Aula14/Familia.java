package Aula14;

public class Familia {
	private Nodo raiz = null;

	public void inserir(Familiar familiar){ 
		Nodo nodoNovo = new Nodo( familiar );
		
		if ( raiz == null){
			raiz = nodoNovo; 
		} else {
			Nodo corrente = raiz;
			
			while (true){
				if (familiar.codigo < corrente.familiar.codigo){
					if (corrente.ladoEsquerdo == null){
						corrente.ladoEsquerdo = nodoNovo;
						return;
					} else {
						corrente = corrente.ladoEsquerdo;
					}
				} else {
					if (corrente.ladoDireito == null){
						corrente.ladoDireito = nodoNovo;
						return;
					} else {
						corrente = corrente.ladoDireito;
					}
				}
			}
		}
	}

	public void imprimir() {
		this.imprimir(this.raiz);
	}

	private void imprimir(Nodo corrente) {		
		if (corrente == null){
			return;
		}
		
		//Integer[] codigosTeste = { 45, 35, 55, 28, 37, 
		//                           60, 53, 59, 65, 69};
		this.imprimir(corrente.ladoEsquerdo);
		System.out.println(corrente.familiar.codigo);		
		this.imprimir(corrente.ladoDireito);
	}

	public Familiar remover(Integer codigo) {
		Nodo corrente = this.raiz;
		Nodo pai = null;
		String lado = "";
		
		while (corrente != null &&
				corrente.familiar.codigo != codigo){
			pai = corrente;
			if (codigo < corrente.familiar.codigo ){
				corrente = corrente.ladoEsquerdo;
				lado = "E";
			} else {
				corrente = corrente.ladoDireito;
				lado = "D";
			}
		}
		
		if ( corrente == null){
			return null;
		}
				
		if ( corrente.ladoEsquerdo == null && 
				corrente.ladoDireito == null){
			if ( pai == null){
				this.raiz = null;
			} else {
				if ("E".equals(lado)){
					pai.ladoEsquerdo = null;
				} else {
					pai.ladoDireito = null;
				}
			}
		} else if (corrente.ladoEsquerdo != null &&
				corrente.ladoDireito == null ){
			if ("E".equals(lado)){
				pai.ladoEsquerdo = corrente.ladoEsquerdo;
			} else {
				pai.ladoDireito = corrente.ladoEsquerdo;
			} 
		
		} else if (corrente.ladoDireito != null &&
				corrente.ladoEsquerdo == null ){
			if ("E".equals(lado)){
				pai.ladoEsquerdo = corrente.ladoDireito;
			} else {
				pai.ladoDireito = corrente.ladoDireito;
			}
		} else {
			Nodo sucessor = this.getSucessor( corrente );
			
			this.remover(sucessor.familiar.codigo);
			
			sucessor.ladoEsquerdo = corrente.ladoEsquerdo;
			sucessor.ladoDireito = corrente.ladoDireito;
			
			if ("E".equals(lado)){
				pai.ladoEsquerdo = sucessor;
			} else {
				pai.ladoDireito = sucessor;
			}
		}
		
		return corrente.familiar;
	}

	private Nodo getSucessor(Nodo corrente) {		
		corrente = corrente.ladoDireito;
		
		while (corrente.ladoEsquerdo != null || 
				corrente.ladoDireito != null ){
			corrente = corrente.ladoEsquerdo;
		}
		
		return corrente;
	}

}
