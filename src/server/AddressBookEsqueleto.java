package server;

import com.google.protobuf.ByteString;

public class AddressBookEsqueleto {

	AddressBookServente servente;

	public AddressBookEsqueleto() {
		servente = new AddressBookServente();
	}

	public byte[] CadastrarUsuario(ByteString args) throws Exception {
		byte[] msg = args.toByteArray();
		String data = new String(msg); 
		String[] valores = data.split(";");	
		String nome = valores[0];
		String Id = valores[1];
		String email = valores[2];
		String cpf = valores[3];
		String msgResposta = servente.CadastrarUsuario(nome, Id, email, cpf);
		byte[] resposta = msgResposta.getBytes();
		return resposta;
	}
	

	public byte[] CadastrarLivro(ByteString args) {
		// (1) Desempacota argumento de entrada
		// (2) chama o metodo do servente
		// (3) empacota resposta do metodo servente e retorna
		return null;
	}

	public byte[] CadastrarAutor(ByteString args) {
		// (1) Desempacota argumento de entrada
		// (2) chama o metodo do servente
		// (3) empacota resposta do metodo servente e retorna
		return null;
	}



	public byte[] list(ByteString args) {
		// (1) Desempacota argumento de entrada
		// (2) chama o metodo do servente
		// (3) empacota resposta do metodo servente e retorna
		return null;
	}

	public byte[] remove(ByteString args) {
		// (1) Desempacota argumento de entrada
		// (2) chama o metodo do servente
		// (3) empacota resposta do metodo servente e retorna
		return null;
	}
}
