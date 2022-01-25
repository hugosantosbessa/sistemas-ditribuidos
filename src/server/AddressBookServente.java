package server;

import server.model.*;



public class AddressBookServente {

	// Essa � classe que REALMENTE implementa o servi�o.
	// Neste exemplo, os m�tdos devem adicionar, listar e remover contatos de
	// uma
	// agenda.
	// Os dados s�o armazenados em arquivo

	public String CadastrarUsuario(String nome, String Id, String email, String cpf) throws Exception {
		AddUsuario addUsuario = new AddUsuario();
		addUsuario.CadastrarUsuario(nome, Id, email, cpf);
		String msgResposta = "Usuario cadastrado com sucesso";
		return msgResposta;
	}

	public String remove(int id, String nomeAgenda) {

		// Remove uma pessoa do arquivo que mantem os dados da agenda.
		// A pessoa que deve ser removida � indica po "id"
		// O path do arquivo � indicado por "nomeAgenda"
		// Retorna uma mensagem de sucesso ou de erro
		return null;
	}

}
