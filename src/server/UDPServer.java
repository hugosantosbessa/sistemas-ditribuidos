package server;

import java.io.IOException;
import java.net.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.mensagem.protos.Mensagem;

public class UDPServer {

	static DatagramSocket clientSocket = null;
	static DatagramPacket receivePacket;
	
	public static byte[] getRequest() {
	
		byte[] receiveData = new byte[1024];
		receivePacket = new DatagramPacket(receiveData, receiveData.length);
		try {
			clientSocket.receive(receivePacket);
			System.out.println("recebendo pacotte do cliente");
		}catch (IOException e) {
			e.printStackTrace();
		}

		return receivePacket.getData();
	}
	
	public static Mensagem desempacotaRequisicao(byte[] args) {
		Mensagem mensagem = null;

		try{
			mensagem = Mensagem.parseDelimitedFrom(new ByteArrayInputStream(args));
		}catch(InvalidProtocolBufferException e){
			System.out.println("Erro:" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mensagem;
	}

	public static byte[] empacotaResposta(byte[] args, int id_request) {
		Mensagem mensagem = Mensagem.newBuilder().setMessageType(1).setRequestId(id_request).setArguments(ByteString.copyFrom(args)).build();

		ByteArrayOutputStream mensagem_em_bytes = new ByteArrayOutputStream(1024);
		try {
			mensagem.writeDelimitedTo(mensagem_em_bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mensagem_em_bytes.toByteArray();
	}

	public static void sendReply(byte[] resposta) {
		byte[] sendData = new byte[1024];
		int port = receivePacket.getPort();
		InetAddress IPAddress = receivePacket.getAddress();

		sendData = resposta;
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
		try {
			clientSocket.send(sendPacket);
			System.out.println("enviando pacote para o cliente");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void finaliza() {
		clientSocket.close();
	}
	
	public static void main(String args[]) throws Exception {
		clientSocket = new DatagramSocket(9876);
		AddressBookDespachante despachante = new AddressBookDespachante();
		//int idUltimaMsg = -1;
		//int ultimoCliente = -1;
		//int cliente = 0;
		while(true){
			Mensagem mensagem = null;
			mensagem = desempacotaRequisicao(getRequest());
			if(mensagem != null && mensagem.getMessageType() != 1) {
				byte[] resultado = despachante.selecionaEqueleto(mensagem);
				sendReply(empacotaResposta(resultado, mensagem.getRequestId()));
			}
			/*if((idUltimaMsg != mensagem.getRequestId() && ultimoCliente != cliente) ||
			(idUltimaMsg != mensagem.getRequestId() && ultimoCliente == cliente)){
				idUltimaMsg = mensagem.getRequestId();
				ultimoCliente = cliente;
				cliente += 1;
				sendReply(empacotaResposta(despachante.selecionaEqueleto(mensagem), mensagem.getRequestId()));	
			}else{
				System.out.println("Mensagem Duplicada -> ID:" + mensagem.getRequestId() + "cliente:" + cliente);
			} */
		}

	}
}