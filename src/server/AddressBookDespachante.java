package server;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import com.mensagem.protos.AddressMensagem;
import com.mensagem.protos.Mensagem;

public class AddressBookDespachante {

	public byte[] selecionaEqueleto(Mensagem request) {

		Class<?> objRef = null;
		Method method = null;
		byte[] resposta = null;
		try {
			objRef = Class.forName("addressBook."
					+ request.getObjectReference() + "Esqueleto");
			String methodName = request.getMethod();
			System.out.println("Executando: " + methodName);
			method = objRef.getMethod(methodName, ByteString.class);
			resposta = (byte[]) (method.invoke(objRef.newInstance(),
					request.getArguments()));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		return resposta;
	}
}