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
				System.out.println("contato: " + i);
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
		}else {
			System.out.println("Contado " + nome + " nao encontrado para ser excluido");
		}

	}

}
