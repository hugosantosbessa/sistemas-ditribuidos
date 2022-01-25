package server;

import server.model.*;



public class AddressBookServente {

	// Essa e a classe que REALMENTE implementa o servico.
	// Neste exemplo, os mï¿½tdos devem adicionar, listar e remover contatos de
	// uma
	// agenda.
	// Os dados sao armazenados em arquivo

	public String CadastrarUsuario(String nome, String Id, String email, String cpf) throws Exception {
		AddUsuario addUsuario = new AddUsuario();
		addUsuario.CadastrarUsuario(nome, Id, email, cpf);
		String msgResposta = "Usuario cadastrado com sucesso";
		return msgResposta;
	}

	public String remove(int id, String nomeAgenda) {

		// Remove uma pessoa do arquivo que mantem os dados da agenda.
		// A pessoa que deve ser removida  indica por "id"
		// O path do arquivo eh indicado por "nomeAgenda"
		// Retorna uma mensagem de sucesso ou de erro
		return null;
	}

}
