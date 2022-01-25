package server;

import server.model.*;

public class AddressBookServente {


	public String CadastrarUsuario(String nome, String Id, String email, String cpf) throws Exception {
		AddUsuario addUsuario = new AddUsuario();
		addUsuario.CadastrarUsuario(nome, Id, email, cpf);
		String msgResposta = "Usuario cadastrado com sucesso";
		return msgResposta;
	}
	
	public String CadastrarLivro(String titulo, String cod, String genero, String autor, String qtd_exemplares) throws Exception {
		AddLivro addLivro = new AddLivro();
		addLivro.CadastrarLivro(titulo, cod, genero, autor, qtd_exemplares);
		String msgResposta = "Livro cadastrado com sucesso";
		return msgResposta;
	}

	public String CadastrarAutor(String nome, String Id, String email, String cpf) throws Exception {
		AddAutor addAutor = new AddAutor();
		addAutor.CadastrarAutor(nome, Id, email, cpf);
		String msgResposta = "Autor cadastrado com sucesso";
		return msgResposta;
	}



}
