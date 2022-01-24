package client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

import com.google.protobuf.ByteString;

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
			return "Opera��o invalida";
		}
	}

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
			return "Opera��o invalida";
		}
	}

	private byte[] empacotaCadLivro(String titulo, String cod, String genero, String autor, String quant_exemplares) {
		Livro cadLivro = Livro.newBuilder().setTitulo(titulo).setCod(cod).setGenero(genero).setAutor(autor).setQtd(quant_exemplares).build();

		ByteArrayOutputStream cadLivro_em_bytes = new ByteArrayOutputStream(1024);
		try {
			cadLivro.writeDelimitedTo(cadLivro_em_bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return cadLivro_em_bytes.toByteArray();
	}

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
			return "Opera��o invalida";
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