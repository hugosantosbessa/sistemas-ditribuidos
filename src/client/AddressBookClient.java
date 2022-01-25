package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddressBookClient {

	private Proxy proxy;

	public AddressBookClient() {
		this.proxy = new Proxy();
	}

	public int selecionaOperacao() {

		int operacao = 0;

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String opt = null;
		do {
			try {
				opt = stdin.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());

		operacao = Integer.parseInt(opt);

		switch (operacao) {
		case 1:
			System.out.println("Digite o nome do usuário: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String nome = opt + ";";
			
			System.out.println("Digite o Id do usuário: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String Id = opt + ";";
			
			System.out.println("Digite o email do usuário: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String email = opt + ";";
			
			System.out.println("Digite o CPF do usuário: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String cpf = opt + ";";
			System.out.println(proxy.CadastrarUsuario(nome, Id, email, cpf)); 
			break;
			
		case 2:
			//proxy.CadastrarLivro(opt, opt, opt, opt, opt);
			break;
		case 3:
			//proxy.CadastrarAutor(opt, opt, opt, opt);
			break;
		default:
			System.out.println("Operacao invalida, tente outra.");
			break;
		}
		return operacao;
	}

	public static void main(String[] args) {
		AddressBookClient cli = new AddressBookClient();
		int operacao = -1;
		do {
			cli.proxy.Menu();
			operacao = cli.selecionaOperacao();
		} while (operacao != 0);
	}
}

