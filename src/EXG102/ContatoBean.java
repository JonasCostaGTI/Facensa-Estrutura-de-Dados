package EXG102;

public class ContatoBean {
	
		
		Contato[] contatos = new Contato[4];
		
		
		
		
	
	
	
	
	
	
	public void inserirContato(Contato ...contato) {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = contato[i];
				
				i = contatos.length;
			}
			
	      }
		
		}
	
	public Contato pegaContatoPorNome(String nome) {
		
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i].equals(nome)) {
				Contato contato = contatos[i];
				return contato;
			}
		}
		return null;
		
	}
	
	public void imprimir() {
		for (int i = 0; i < contatos.length; i++) {
			
			if (contatos[i] != null) {
				System.out.println("contato " + (i+1));
				System.out.println("Nome: " + contatos[i].getNome());
				System.out.println("Email: " + contatos[i].getEmail());
				System.out.println("Telefone: " + contatos[i].getTelefone());
			}
			
			System.out.println("");
		}
	}
	
	
	
	
	
}

