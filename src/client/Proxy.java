package client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

import com.autores.protos.Autor;
import com.google.protobuf.ByteString;
import com.livros.protos.Livro;
import com.mensagem.protos.Mensagem;
import com.mensagem_response.protos.MensagemResponse;
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
		System.out.println("\nMENU USUARIO\nDigite o n da operacao que deseja executar: ");
		System.out.println("1. Cadastrar Usuario");
		System.out.println("2. Cadastrar Livro");	
		System.out.println("3. Cadastrar Autor");
		System.out.println("-------------------------------------------------------------------------");
	}

	public String CadastrarUsuario(String nome, String Id, String email, String cpf) {// cad proto
		if (cpf != null) {
			byte[] args = new byte[1024];
			args = empacotaCadastro(nome, Id, email, cpf);

			Mensagem aux = doOperation("Cadastro", "Metodo_cadastro_usuario", args);
			byte[] msg =  aux.getArguments().toByteArray();
			String msgResposta = new String(msg);
		 
			return msgResposta;
		} else {
			return "Operacao invalida";
		}
	}

	private byte[] empacotaCadastro(String nome, String Id, String email, String cpf) {
		String cad = nome + Id + email + cpf;
		byte[] cad_em_bytes = cad.getBytes();
		
		return cad_em_bytes;
	}

	/*
	public String CadastrarLivro(String titulo, String cod, String genero, String autor, String quant_exemplares) {// cad proto
		if (cod != null) {
			byte[] args = new byte[1024];
			args = empacotaCadLivro(titulo, cod, genero, autor,quant_exemplares);

			Mensagem aux = doOperation("Cadastro", "Metodo_cadastro_livro", args);

			MensagemResponse msgResposta = null;

			try {
				msgResposta = MensagemResponse
						.parseDelimitedFrom(new ByteArrayInputStream(aux.getArguments().toByteArray()));
			} catch (java.lang.NullPointerException e) {
				System.out.println("Servidor nao respondeu!, Tente novamente mais tarde.");
			} catch (IOException e) {
				e.printStackTrace();
			}

			return msgResposta.getMensagem();
		} else {
			return "Operaï¿½ï¿½o invalida";
		}
	}
	*/
	/*
	private byte[] empacotaCadLivro(String titulo, String cod, String genero, String autor, String quant_exemplares) {
		Livro cadLivro = Livro.newBuilder().set(titulo).setCod(cod).setGenero(genero).setAutor(autor).setQtd(quant_exemplares).build();

		ByteArrayOutputStream cadLivro_em_bytes = new ByteArrayOutputStream(1024);
		try {
			cadLivro.writeDelimitedTo(cadLivro_em_bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return cadLivro_em_bytes.toByteArray();
		
	}
	*/
	/*
	public String CadastrarAutor(String nome, String Id, String email, String cpf) {// cad proto
		if (cpf != null) {
			byte[] args = new byte[1024];
			args = empacotaCadAutor(nome, Id, email, cpf);

			Mensagem aux = doOperation("Cadastro", "Metodo_cadastro_autor", args);

			MensagemResponse msgResposta = null;

			try {
				msgResposta = MensagemResponse
						.parseDelimitedFrom(new ByteArrayInputStream(aux.getArguments().toByteArray()));
			} catch (java.lang.NullPointerException e) {
				System.out.println("Servidor nao respondeu!, Tente novamente mais tarde.");
			} catch (IOException e) {
				e.printStackTrace();
			}

			return msgResposta.getMensagem();
		} else {
			return "Operaï¿½ï¿½o invalida";
		}
	}

	private byte[] empacotaCadAutor(String nome, String Id, String email, String cpf) {
		Autor cadAutor = Usuario.newBuilder().setName(nome).setId(Id).setEmail(email).setCpf(cpf).build();

		ByteArrayOutputStream cadAutor_em_bytes = new ByteArrayOutputStream(1024);
		try {
			cadAutor.writeDelimitedTo(cadAutor_em_bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return cadAutor_em_bytes.toByteArray();
	}
	*/

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
			} else {
				msg = null;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return msg;
	}

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
					System.out.println("tentando receber pacote do server");
					m = udpclient.getReplay();
					System.out.println("Recebendo pacote do server");
					resposta = desempacotaMensagem(m);
				} catch (SocketTimeoutException e) {
					System.out.println("erro ao receber pacote do server");
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