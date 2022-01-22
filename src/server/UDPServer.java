package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.mensagem.protos.Mensagem;

public class UDPServer {

	DataInputStream in;
	DataOutputStream out;
	DatagramSocket clientSocket;
	AddressBookDespachante despachante;

	public Mensagem getRequest() {
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
	
	public Mensagem desempacotaRequisicao(byte[] args) {
		Mensagem mensagem = null;

		try{
			mensagem = Mensagem.parseFrom(args);
		
			
		}catch(InvalidProtocolBufferException e){
			System.out.println("Erro:" + e.getMessage());
		}

		return mensagem;
	}

	public byte[] empacotaResposta(byte[] args, int requestId) {
		Mensagem mensagem = Mensagem.newBuilder().build();

		ByteArrayOutputStream mensagem_em_bytes = new ByteArrayOutputStream(1024);
		try {
			mensagem.writeDelimitedTo(mensagem_em_bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mensagem_em_bytes.toByteArray();
	}

	public void sendReply(byte[] resposta) {
		// enviado via moodle
	}

	public void finaliza() {
		clientSocket.close();
	}

	public static void main(String args[]) {
		Mensagem mensagem = null;
		mensagem = getRequest();
		int idUltimaMsg = 0;
		ultimoCliente = ();
		msgResposta = msgResposta.getRequest();
		cliente = cliente.getRequest();

		while(true){
			if((idUltimoMsg != mensagem.request_id && ultimoCliente != cliente) ||
			(idUltimoMsg != mensagem.request_id && ultimoCliente == cliente)){
				idUltimoMsg = msgResposta.request_id;
				ultimoCliente=cliente;

				sendReply(mensagem, des.invoke(mensagem), cliente);
			}else{
				System.out.print("Mensagem Duplicada -> ID:",msgResposta.request_id, "cliente:", cliente);
			}
		}

	}
}