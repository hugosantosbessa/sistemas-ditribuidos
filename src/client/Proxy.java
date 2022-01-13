package client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import com.mensagem.protos.AddressMensagem;
import com.mensagem.protos.Mensagem;
import com.mensagem_response.protos.AddressMensagemResponse;
import com.mensagem_response.protos.MensagemResponse;
import com.usuarios.protos.AddressUsuarios;
import com.usuarios.protos.Usuario;


public class Proxy {

	UDPClient udpclient;
	private static int id_usuario = -1;
	private int id_request = 0;

	public Proxy() {
		udpclient = new UDPClient("localhost", 20001);
	}


	public void Menu() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("\nMENU USUARIO\nDigite o nº da operação que deseja executar: ");
		System.out.println("1. Cadastrar Usuário");	
		System.out.println("-------------------------------------------------------------------------");
	}
	/*
	 * 
	 * SERVIÇÕS DO USUÁRIO
	 * 
	 */

	public String CadastrarUsuario(String nome, String Id, String email, String cpf) {// cad proto
		if (cpf != null) {
			byte[] args = new byte[1024];
			args = empacotaCadastro(nome, Id, email, cpf);

			Mensagem aux = doOperation("ReferenceAuth", "Metodo_cadastro_usuario", args);

			MensagemResponse msgResposta = null;

			try {
				msgResposta = MensagemResponse
						.parseDelimitedFrom(new ByteArrayInputStream(aux.getArguments().toByteArray()));
			} catch (java.lang.NullPointerException e) {
				System.out.println("Servidor não respondeu!, Tente novamente mais tarde.");
			} catch (IOException e) {
				e.printStackTrace();
			}

			return msgResposta.getMensagem();
		} else {
			return "Operação invalida";
		}
	}

	/*
	 * 
	 * EMPACOTAMENTO
	 * 
	 */

	private byte[] empacotaCadastro(String nome, String Id, String email, String cpf) {
		Usuario cad = Usuario.newBuilder().setNome(nome).setId(Id).setEmail(email).setCpf(cpf).build();

		ByteArrayOutputStream cad_em_bytes = new ByteArrayOutputStream(1024);
		try {
			cad.writeDelimitedTo(cad_em_bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return cad_em_bytes.toByteArray();
	}

	private byte[] empacotaMensagem(String objectRef, String method, byte[] args) {
		Mensagem msg = Mensagem.newBuilder().setMessageType(0).setRequestId(id_request).setObjectReference(objectRef)
				.setMethod(method).setArguments(ByteString.copyFrom(args)).build();
		ByteArrayOutputStream mensagem_em_bytes = new ByteArrayOutputStream(1024);
		try {
			msg.writeDelimitedTo(mensagem_em_bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mensagem_em_bytes.toByteArray();
	}

	private Mensagem desempacotaMensagem(byte[] args) {
		Mensagem msg = null;
		try {
			msg = Mensagem.parseDelimitedFrom(new ByteArrayInputStream(args));
			if (msg.getMessageType() == 1) {
//				System.out.println("Mensagem de resposta");
			} else {
				msg = null;
//				System.out.println("Mensagem de requisiï¿½ï¿½o : ErroMsg - era esperado uma mensagem de resposta");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return msg;
	}

	/*
	 * 
	 * DO_OPERATION
	 * 
	 */
	private Mensagem doOperation(String objectRef, String method, byte[] args) {

		byte[] data = empacotaMensagem(objectRef, method, args);

		udpclient.sendRequest(data);

		boolean estouro = true;

		Mensagem resposta = null;
		for (int i = 0; i < 3; i++) {
			if (estouro) {
				estouro = false;
				byte[] m;
				try {
					m = udpclient.getReplay();
					resposta = desempacotaMensagem(m);
				} catch (SocketTimeoutException e) {
					estouro = true;
					udpclient.sendRequest(data);
				}
			}
		}

		id_request += 1;
		return resposta;

	}

	void finaliza() {
		udpclient.finaliza();
	}
}