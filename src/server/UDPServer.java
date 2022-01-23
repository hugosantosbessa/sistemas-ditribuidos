package server;

import java.io.IOException;
import java.net.*;
import java.io.ByteArrayOutputStream;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.mensagem.protos.Mensagem;

public class UDPServer {

	static DatagramSocket clientSocket;

	public static Mensagem getRequest() {
		byte[] receiveData = new byte[1024];
		Mensagem msg;
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		msg = desempacotaRequisicao(receiveData);
		try {
			clientSocket.receive(receivePacket);
		}catch (IOException e) {
			e.printStackTrace();
		}

		return msg;
	}
	
	public static Mensagem desempacotaRequisicao(byte[] args) {
		Mensagem mensagem = null;

		try{
			mensagem = Mensagem.parseFrom(args);
		
			
		}catch(InvalidProtocolBufferException e){
			System.out.println("Erro:" + e.getMessage());
		}

		return mensagem;
	}

	public byte[] empacotaResposta(byte[] args, int requestId) {
		Mensagem mensagem = Mensagem.newBuilder().setRequestId(requestId).setArguments(ByteString.copyFrom(args)).build();

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
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length);
		try {
			clientSocket.send(sendPacket);
			clientSocket.setSoTimeout(2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void finaliza() {
		clientSocket.close();
	}
	/* */
	public static void main(String args[]) {
		Mensagem mensagem = null;
		mensagem = getRequest();
		AddressBookDespachante despachante = new AddressBookDespachante();
		int idUltimaMsg = -1;
		int ultimoCliente = -1;
		int cliente = 0;
		//msgResposta = msgResposta.getRequest();
	
		while(true){

			if((idUltimaMsg != mensagem.getRequestId() && ultimoCliente != cliente) ||
			(idUltimaMsg != mensagem.getRequestId() && ultimoCliente == cliente)){
				idUltimaMsg = mensagem.getRequestId();
				ultimoCliente = cliente;
				cliente += 1;
				sendReply(despachante.selecionaEqueleto(mensagem));	
			}else{
				System.out.println("Mensagem Duplicada -> ID:" + mensagem.getRequestId() + "cliente:" + cliente);
			}
		}

	}
}