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
			System.out.println("Digite o nome do usu�rio: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String nome = opt + ";";
			
			System.out.println("Digite o Id do usu�rio: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String Id = opt + ";";
			
			System.out.println("Digite o email do usu�rio: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String email = opt + ";";
			
			System.out.println("Digite o CPF do usu�rio: ");
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
			System.out.println("Digite o t�tulo do livro: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String titulo = opt + ";";
			
			System.out.println("Digite o c�digo do livro: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String cod = opt + ";";
			
			System.out.println("Digite o g�nero do livro: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String genero = opt + ";";
			
			System.out.println("Digite o autor do livro: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String autor = opt + ";";
			
			System.out.println("Digite a quantidade de exemplares do livro: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String quant_exemplares = opt + ";";
			System.out.println(proxy.CadastrarLivro(titulo, cod, genero, autor, quant_exemplares));
			break;
			
		case 3:
			System.out.println("Digite o nome do autor: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			nome = opt + ";";
			
			System.out.println("Digite o Id do autor: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			Id = opt + ";";
			
			System.out.println("Digite o email do autor: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			email = opt + ";";
			
			System.out.println("Digite o CPF do autor: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			cpf = opt + ";";
			System.out.println(proxy.CadastrarAutor(nome, Id, email, cpf)); 
			break;
<<<<<<< HEAD
		case 4:
			//proxy.RealizarEmprestimo(opt,opt,opt,opt,opt,opt)
=======
			
>>>>>>> df7a7724f2ef53b1a23d8fcfc25b1b2bcbe693ca
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

