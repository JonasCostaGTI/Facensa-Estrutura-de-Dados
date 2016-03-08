package EXG102;

public class ContatoBeanImplementacao {

	public static void main(String[] args) {
		ContatoBean contatoBean = new ContatoBean();
		
		Contato contato = new Contato();
		contato.setNome("Jonas");
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
		contato3.setNome("Jonas3");
		contato3.setEmail("jonas3@mail.com");
		contato3.setTelefone("99999993");
		

		
		Contato[] contatos = new Contato[4];
		contatos[0] = contato;
		contatos[1] = contato1;
		contatos[2] = contato2;
		contatos[3] = contato3;
		
				
				
		//insere contatos
		for (int i = 0; i < contatos.length; i++) {
			contatoBean.inserirContato(contatos);
		}
		
		
		
		
		contatoBean.imprimir();

	}

}
