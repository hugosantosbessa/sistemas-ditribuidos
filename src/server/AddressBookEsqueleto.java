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
	

	public byte[] CadastrarLivro(ByteString args) throws Exception {
		byte[] msg = args.toByteArray();
		String data = new String(msg); 
		String[] valores = data.split(";");	
		String titulo = valores[0];
		String cod = valores[1];
		String genero = valores[2];
		String autor = valores[3];
		String qtd_exemplares = valores[4];
		String msgResposta = servente.CadastrarLivro(titulo, cod, genero, autor, qtd_exemplares);
		byte[] resposta = msgResposta.getBytes();
		return resposta;
	}

	public byte[] CadastrarAutor(ByteString args) throws Exception {
		byte[] msg = args.toByteArray();
		String data = new String(msg); 
		String[] valores = data.split(";");	
		String nome = valores[0];
		String Id = valores[1];
		String email = valores[2];
		String cpf = valores[3];
		String msgResposta = servente.CadastrarAutor(nome, Id, email, cpf);
		byte[] resposta = msgResposta.getBytes();
		return resposta;
	}
	
	public byte[] RealizarEmprestimo(ByteString args) throws Exception {
		byte[] msg = args.toByteArray();
		String data = new String(msg); 
		String[] valores = data.split(";");	
		String Id = valores[0];
		String codigo = valores[1];
		String quantidade = valores[2];
		String dataR = valores[3];
		String dataE = valores[4];
		String msgResposta = servente.RealizarEmprestimo(Id, codigo, quantidade, dataR, dataE);
		byte[] resposta = msgResposta.getBytes();
		return resposta;
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
