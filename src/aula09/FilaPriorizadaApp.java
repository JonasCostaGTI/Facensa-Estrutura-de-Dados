package aula09;

public class FilaPriorizadaApp {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Sicrano", "sicrano@facensa.edu.br");
		Aluno aluno2 = new Aluno("Beltrano", "beltrano@facensa.edu.br");
		Aluno aluno3 = new Aluno("Cicrano", "cicrano@facensa.edu.br");
		
		FilaPriorizadaI fila = FilaPriorizadaFactory.getFila(TipoFilaPriorizada.VETOR.name());
		fila.setTamanho(10);
		fila.inserir(aluno1);
		fila.inserir(aluno2);
		fila.inserir(aluno3);
		fila.imprimir();
		
		System.out.println("Removido = "+fila.remover());
		fila.imprimir();
	}
}
