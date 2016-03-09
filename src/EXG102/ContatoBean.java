package EXG102;

public class ContatoBean {

	Contato[] contatos = new Contato[4];

	public void inserirContato(Contato... contato) {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = contato[i];

				i = contatos.length;
			}
		}
	}

	public Contato pegaContatoPorNome(String nome) {
		Contato contato = null;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i].getNome().equals(nome)) {
				contato = contatos[i];
			}
		}
		if (contato == null) {
			System.out.println("contato com o Nome: " + nome + ", nao encontrado");
		}
		return contato;
	}

	public void imprimir() {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				System.out.println("Nome: " + contatos[i].getNome());
				System.out.println("Email: " + contatos[i].getEmail());
				System.out.println("Telefone: " + contatos[i].getTelefone());
			}
			System.out.println("");
		}
	}

	public Contato pegaContatoPorEmail(String email) {
		Contato contato = null;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i].getEmail().equals(email)) {
				contato = contatos[i];
			}
		}
		if (contato == null) {
			System.out.println("contato com o Email: " + email + ", nao encontrado");
		}
		return contato;
	}

	public Contato pegaContatoPorTelefone(String telefone) {
		Contato contato = null;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i].getTelefone().equals(telefone)) {
				contato = contatos[i];
			}
		}
		if (contato == null) {
			System.out.println("contato com o Telefone: " + telefone + ", nao encontrado");
		}
		return contato;
	}

	public void removeContatoPorNome(String nome) {
		int conta = 0;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i].getNome().equals(nome)) {
				contatos[i] = null;
				conta++;
			}
		}

		if (conta != 0) {
			System.out.println("O contato " + nome + ", foi excluido com sucesso!");
		} else {
			System.out.println("Contado " + nome + " nao encontrado para ser excluido");
		}
	}

	public Contato[] ordenarPorNome(String ordemOrdenacao) {
		switch (ordemOrdenacao) {
		case "A":
			System.out.println("Ascendente");
			//ascendente
			for (int i = contatos.length - 1; i > 1; i--) {
				for (int j = 0; j < i; j++) {

					if (contatos[j].getNome().toString().compareTo(contatos[j + 1].getNome().toString()) > 0) {

						Contato c = new Contato();
						c.setNome(contatos[j].getNome());
						contatos[j].setNome(contatos[j+1].getNome());
						contatos[j+1].setNome(c.getNome());
						c = null;
						
					}
				}
			}

			return contatos;
			
		case "D":
			System.out.println("Descendente");
			//descendente
			for (int i = contatos.length - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) {

					if (contatos[j].getNome().toString().compareTo(contatos[j + 1].getNome().toString()) < 0) {

						Contato c = new Contato();
						c.setNome(contatos[j].getNome());
						contatos[j].setNome(contatos[j+1].getNome());
						contatos[j+1].setNome(c.getNome());
						c = null;
						
					}
				}
			}
			
			return contatos;

		default:
			
			System.out.println("valor invalido");
			break;
		}
		return contatos;
	}
	
	
	
	
	public Contato[] ordenarPorEmail(String ordemOrdenacao) {
		switch (ordemOrdenacao) {
		case "A":
			System.out.println("Ascendente");
			//ascendente
			for (int i = contatos.length - 1; i > 1; i--) {
				for (int j = 0; j < i; j++) {

					if (contatos[j].getEmail().toString().compareTo(contatos[j + 1].getEmail().toString()) > 0) {

						Contato c = new Contato();
						c.setEmail(contatos[j].getEmail());
						contatos[j].setEmail(contatos[j+1].getEmail());
						contatos[j+1].setEmail(c.getEmail());
						c = null;
						
					}
				}
			}

			return contatos;
			
		case "D":
			System.out.println("Descendente");
			//descendente
			for (int i = contatos.length - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) {

					if (contatos[j].getEmail().toString().compareTo(contatos[j + 1].getEmail().toString()) < 0) {

						Contato c = new Contato();
						c.setEmail(contatos[j].getEmail());
						contatos[j].setEmail(contatos[j+1].getEmail());
						contatos[j+1].setEmail(c.getEmail());
						c = null;
						
					}
				}
			}
			
			return contatos;

		default:
			
			System.out.println("valor invalido");
			break;
		}
		return contatos;
	}
	
	
	
	
	
	public Contato[] ordenarPorTelefone(String ordemOrdenacao) {
		switch (ordemOrdenacao) {
		case "A":
			System.out.println("Ascendente");
			//ascendente
			for (int i = contatos.length - 1; i > 1; i--) {
				for (int j = 0; j < i; j++) {

					if (contatos[j].getTelefone().toString().compareTo(contatos[j + 1].getTelefone().toString()) > 0) {

						Contato c = new Contato();
						c.setTelefone(contatos[j].getTelefone());
						contatos[j].setTelefone(contatos[j+1].getTelefone());
						contatos[j+1].setTelefone(c.getTelefone());
						c = null;
						
					}
				}
			}

			return contatos;
			
		case "D":
			System.out.println("Descendente");
			//descendente
			for (int i = contatos.length - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) {

					if (contatos[j].getTelefone().toString().compareTo(contatos[j + 1].getTelefone().toString()) < 0) {

						Contato c = new Contato();
						c.setTelefone(contatos[j].getTelefone());
						contatos[j].setTelefone(contatos[j+1].getTelefone());
						contatos[j+1].setTelefone(c.getTelefone());
						c = null;
						
					}
				}
			}
			
			return contatos;

		default:
			
			System.out.println("valor invalido");
			break;
		}
		return contatos;
	}
	
	
	
	

}
