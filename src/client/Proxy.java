package client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

import com.google.protobuf.ByteString;
import com.mensagem.protos.Mensagem;


public class Proxy {

	UDPClient udpclient;
	private int id_request = 0;

	public Proxy() {
		udpclient = new UDPClient("localhost", 9876);
	}


	public void Menu() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("\nMENU USUARIO\nDigite o n da operacao que deseja executar: ");
		System.out.println("1. Cadastrar Usuario");
		System.out.println("2. Cadastrar Livro");	
		System.out.println("3. Cadastrar Autor");
		System.out.println("4. Realizar Emprestimo");

		System.out.println("-------------------------------------------------------------------------");
	}

	public String CadastrarUsuario(String nome, String Id, String email, String cpf) {// cad proto
		if (cpf != null) {
			byte[] args = new byte[1024];
			args = empacotaCadUsuario(nome, Id, email, cpf);

			Mensagem aux = doOperation("Cadastro", "Metodo_cadastro_usuario", args);
			byte[] msg =  aux.getArguments().toByteArray();
			String msgResposta = new String(msg);
		 
			return msgResposta;
		} else {
			return "Operacao invalida";
		}
	}

	private byte[] empacotaCadUsuario(String nome, String Id, String email, String cpf) {
		String cad = nome + Id + email + cpf;
		byte[] cad_em_bytes = cad.getBytes();
		
		return cad_em_bytes;
	}

	
	public String CadastrarLivro(String titulo, String cod, String genero, String autor, String quant_exemplares) {// cad proto
		if (cod != null) {
			byte[] args = new byte[1024];
			args = empacotaCadLivro(titulo, cod, genero, autor, quant_exemplares);

			Mensagem aux = doOperation("Cadastro", "Metodo_cadastro_livro", args);
			byte[] msg =  aux.getArguments().toByteArray();
			String msgResposta = new String(msg);
		 
			return msgResposta;
		} else {
			return "Operacao invalida";
		}
	}
	
	
	private byte[] empacotaCadLivro(String titulo, String cod, String genero, String autor, String quant_exemplares) {
		String cad = titulo + cod + genero + autor + quant_exemplares;
		byte[] cad_em_bytes = cad.getBytes();
		
		return cad_em_bytes;
	}
	
	
	public String CadastrarAutor(String nome, String Id, String email, String cpf) {// cad proto
		if (cpf != null) {
			byte[] args = new byte[1024];
			args = empacotaCadAutor(nome, Id, email, cpf);

			Mensagem aux = doOperation("Cadastro", "Metodo_cadastro_autor", args);
			byte[] msg =  aux.getArguments().toByteArray();
			String msgResposta = new String(msg);

			return msgResposta;
		} else {
			return "Operacao invalida";
		}
	}

	private byte[] empacotaCadAutor(String nome, String Id, String email, String cpf) {
		String cad = nome + Id + email + cpf;
		byte[] cad_em_bytes = cad.getBytes();
		
		return cad_em_bytes;
	}

	public String RealizarEmprestimo(String Id, String codigo, String quantidade, String dataR, String dataE) {// cad proto
		if (Id != null) {
			byte[] args = new byte[1024];
			args = empacotaEmprestimo(Id, codigo, quantidade, dataR, dataE);

			Mensagem aux = doOperation("Cadastro", "Metodo_realiza_emprestimo", args);
			byte[] msg =  aux.getArguments().toByteArray();
			String msgResposta = new String(msg);
		 
			return msgResposta;
		} else {
			return "Operacao invalida";
		}
	}

	private byte[] empacotaEmprestimo(String Id, String codigo, String quantidade, String dataR, String dataE) {
		String emp = Id + codigo + quantidade + dataR + dataE;
		byte[] emp_em_bytes = emp.getBytes();
		
		return emp_em_bytes;
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