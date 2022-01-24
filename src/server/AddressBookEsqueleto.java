package server;

import com.google.protobuf.ByteString;

public class AddressBookEsqueleto {

	AddressBookServente servente;

	public AddressBookEsqueleto() {
		servente = new AddressBookServente();
	}

	public byte[] CadastrarUsuario(ByteString args) {
		// (1) Desempacota argumento de entrada
		// (2) chama o metodo do servente
		// (3) empacota resposta do m�todo servente e retorna
		return null;
	}
	public byte[] CadastrarLivro(ByteString args) {
		// (1) Desempacota argumento de entrada
		// (2) chama o metodo do servente
		// (3) empacota resposta do m�todo servente e retorna
		return null;
	}

	public byte[] CadastrarAutor(ByteString args) {
		// (1) Desempacota argumento de entrada
		// (2) chama o metodo do servente
		// (3) empacota resposta do m�todo servente e retorna
		return null;
	}



	public byte[] list(ByteString args) {
		// (1) Desempacota argumento de entrada
		// (2) chama o metodo do servente
		// (3) empacota resposta do m�todo servente e retorna
		return null;
	}

	public byte[] remove(ByteString args) {
		// (1) Desempacota argumento de entrada
		// (2) chama o metodo do servente
		// (3) empacota resposta do m�todo servente e retorna
		return null;
	}
}
