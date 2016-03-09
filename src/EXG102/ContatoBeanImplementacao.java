package EXG102;

public class ContatoBeanImplementacao {

	public static void main(String[] args) {
		ContatoBean contatoBean = new ContatoBean();

		Contato contato = new Contato();
		contato.setNome("Jonas3");
		contato.setEmail("jonas@mail.com");
		contato.setTelefone("9999999");

		Contato contato1 = new Contato();
		contato1.setNome("Jonas1");
		contato1.setEmail("jonas1@mail.com");
		contato1.setTelefone("99999991");

		Contato contato2 = new Contato();
		contato2.setNome("Jonas2");
		contato2.setEmail("jonas2@mail.com");
		contato2.setTelefone("99999992");

		Contato contato3 = new Contato();
		contato3.setNome("Jonas5");
		contato3.setEmail("jonas3@mail.com");
		contato3.setTelefone("99999993");

		Contato[] contatos = new Contato[4];
		contatos[0] = contato;
		contatos[1] = contato1;
		contatos[2] = contato2;
		contatos[3] = contato3;

		// insere contatos
		for (int i = 0; i < contatos.length; i++) {
			contatoBean.inserirContato(contatos);
		}

		// imprime os contatos salvos
		contatoBean.imprimir();
		//
		// System.out.println("------------------------");
		//
		// // pega contato por nome
		// Contato pegaContatoPorNome = contatoBean.pegaContatoPorNome("Jonas");
		// if (pegaContatoPorNome != null) {
		// System.out.println("Contato encontrado pelo Nome: ");
		// System.out.println("Nome: " + pegaContatoPorNome.getNome());
		// System.out.println("Email: " + pegaContatoPorNome.getEmail());
		// System.out.println("telefone: " + pegaContatoPorNome.getTelefone());
		// }
		//
		// System.out.println("------------------------");
		//
		// // pega contato por email
		// Contato pegaContatoPorEmail =
		// contatoBean.pegaContatoPorEmail("jonas1@mal.com");
		// if (pegaContatoPorEmail != null) {
		// System.out.println("Contato encontrado pelo Email: ");
		// System.out.println("Nome: " + pegaContatoPorEmail.getNome());
		// System.out.println("Email: " + pegaContatoPorEmail.getEmail());
		// System.out.println("telefone: " + pegaContatoPorEmail.getTelefone());
		// }
		//
		// System.out.println("------------------------");
		//
		// // pega contato por telefone
		// Contato pegaContatoPorTelefone =
		// contatoBean.pegaContatoPorTelefone("99999992");
		// if (pegaContatoPorTelefone != null) {
		// System.out.println("Contato encontrado por Telefone: ");
		// System.out.println("Nome: " + pegaContatoPorTelefone.getNome());
		// System.out.println("Email: " + pegaContatoPorTelefone.getEmail());
		// System.out.println("telefone: " +
		// pegaContatoPorTelefone.getTelefone());
		// }
		//
		// System.out.println("------------------------");
		//
		// //remove contato
		// System.out.println("Impressao dos contatos apos a exclusao");
		// contatoBean.removeContatoPorNome("Jonas");
		// System.out.println("");
		// // imprime os contatos salvos
		// contatoBean.imprimir();
		//
		// System.out.println("------------------------");

		System.out.println("Ordenacao por nome");
		System.out.println("");
		Contato[] ordenarPorNome = contatoBean.ordenarPorNome("A");
		for (Contato contatoNome : ordenarPorNome) {
			System.out.println(contatoNome.getNome());
		}

		System.out.println("------------------------");

		System.out.println("Ordenacao por email");
		System.out.println("");
		Contato[] ordenarPorEmail = contatoBean.ordenarPorEmail("A");
		for (Contato contatoEmail : ordenarPorEmail) {
			System.out.println(contatoEmail.getEmail());
		}

		System.out.println("------------------------");

		System.out.println("Ordenacao por telefone");
		System.out.println("");
		Contato[] ordenarPorTelefone = contatoBean.ordenarPorTelefone("A");
		for (Contato contatoTelefone : ordenarPorTelefone) {
			System.out.println(contatoTelefone.getTelefone());
		}

	}

}
