package server;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import com.autores.protos.AddressAutores;
import com.autores.protos.Autor;
import java.io.IOException;
import java.io.PrintStream;


public class AddressBookServente {

	// Essa � classe que REALMENTE implementa o servi�o.
	// Neste exemplo, os m�tdos devem adicionar, listar e remover contatos de
	// uma
	// agenda.
	// Os dados s�o armazenados em arquivo

	public AddressBook list(String agenda) {

		// L� o arquivo que armazena a agenda e retorna um objeto
		// AddressBook preenchido com esses dados
	}

	public String CadastrarUsuario(Person person, String nomeAgenda) {

		// Adiciona uma pessoa ao arquivo que mantem os dados da agenda.
		// O path do arquivo � indicado por "nomeAgenda"
		// Retorna uma mensagem de sucesso ou de erro
	}

	public String remove(int id, String nomeAgenda) {

		// Remove uma pessoa do arquivo que mantem os dados da agenda.
		// A pessoa que deve ser removida � indica po "id"
		// O path do arquivo � indicado por "nomeAgenda"
		// Retorna uma mensagem de sucesso ou de erro
	}
}
}