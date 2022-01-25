package server;

import com.mensagem.protos.Mensagem;

public class AddressBookDespachante {
	AddressBookEsqueleto esqueleto;

	public AddressBookDespachante(){
		esqueleto = new AddressBookEsqueleto();
	}

	public byte[] selecionaEqueleto(Mensagem request) throws Exception {
		byte[] resposta = null;
		
		switch (request.getObjectReference()) {
		case "Cadastro": 
			if(request.getMethod().equals("Metodo_cadastro_usuario"))    
			resposta = (byte[]) (esqueleto.CadastrarUsuario(request.getArguments()));
			
			else if(request.getMethod().equals("Metodo_cadastro_livro"))
			resposta = (byte[]) (esqueleto.CadastrarLivro(request.getArguments()));
			
			else if(request.getMethod().equals("Metodo_cadastro_autor"))
			resposta = (byte[]) (esqueleto.CadastrarAutor(request.getArguments()));
		break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + request.getObjectReference());
		}
		
		return resposta;
	}
}