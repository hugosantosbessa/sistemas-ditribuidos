package server;

import java.io.IOException;
import java.net.*;
import java.io.ByteArrayOutputStream;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.mensagem.protos.Mensagem;

public class UDPServer {

	static DatagramSocket clientSocket =  null;

	public static byte[] getRequest() throws SocketException {
		clientSocket =  new DatagramSocket(9876);
		byte[] receiveData = new byte[1024];
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		try {
			clientSocket.receive(receivePacket);
		}catch (IOException e) {
			e.printStackTrace();
		}

		return receiveData;
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
		String serverIP = "localhost";
		int port = 9876;
		byte[] sendData = new byte[1024];
		InetAddress IPAddress = null;
		
		try {
			IPAddress = InetAddress.getByName(serverIP);
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}

		sendData = resposta;
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
		try {
			clientSocket.send(sendPacket);
			clientSocket.setSoTimeout(2000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void finaliza() {
		clientSocket.close();
	}
	
	public static void main(String args[]) throws Exception {		
		AddressBookDespachante despachante = new AddressBookDespachante();
		int idUltimaMsg = -1;
		int ultimoCliente = -1;
		int cliente = 0;
		//msgResposta = msgResposta.getRequest();
		while(true){
			Mensagem mensagem = desempacotaRequisicao(getRequest());

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