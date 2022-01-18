package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


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
		receiveData = receivePacket.getData();
		msg = desempacotaRequisicao(receiveData);
		try {
			clientSocket.receive(receivePacket);
		}catch (IOException e) {
			e.printStackTrace();
		}

		return msg;

	}

	

	public Mensagem desempacotaRequisicao(byte[] args) {
		Mensagem msg = null;
		try {
			msg = Mensagem.parseDelimitedFrom(new ByteArrayInputStream(args));
			if (msg.getMessageType() == 1) {
//				System.out.println("Mensagem de resposta");
			} else {
				msg = null;
//				System.out.println("Mensagem de requisi��o : ErroMsg - era esperado uma mensagem de resposta");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return msg;
	}

	public byte[] empacotaResposta(byte[] resultado, int requestId) {
		
		return null;
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

				// chamar despachante
			}else{
				System.out.print("Mensagem Duplicada -> ID:",msgResposta.request_id, "cliente:", cliente);
			}
		}

	}
}