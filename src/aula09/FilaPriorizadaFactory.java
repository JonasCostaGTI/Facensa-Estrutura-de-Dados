package aula09;

public class FilaPriorizadaFactory {
	public static FilaPriorizadaI getFila(String tipoFila) {
		System.out.println(tipoFila);
		
		if (TipoFilaPriorizada.LISTA.name().equals(tipoFila))
			return TipoFilaPriorizada.LISTA.getFila();
		else if (TipoFilaPriorizada.VETOR.name().equals(tipoFila) )
			return TipoFilaPriorizada.VETOR.getFila();
		else 
			return null;		
	}
}
