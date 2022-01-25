package server;

import com.google.protobuf.ByteString;

import com.mensagem.protos.Mensagem;

public class AddressBookDespachante {
	AddressBookEsqueleto esqueleto;

	public AddressBookDespachante(){
		esqueleto = new AddressBookEsqueleto();
	}

	public byte[] selecionaEqueleto(Mensagem request) throws Exception {
		byte[] resposta = null;
		if(request.getObjectReference()=="Cadastro"){
			if(request.getMethod()=="Metodo_cadastro_usuario")                
			resposta = (byte[]) (esqueleto.CadastrarUsuario(request.getArguments()));
		}
	
	
		return resposta;
	}
}