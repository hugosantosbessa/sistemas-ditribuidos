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
		case 0:
			System.out.println("Encerrando programa");
			break;
			
		case 1:
			System.out.println("Digite o nome do usuario: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String nome = opt + ";";
			
			System.out.println("Digite o Id do usuario: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String Id = opt + ";";
			
			System.out.println("Digite o email do usuario: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String email = opt + ";";
			
			System.out.println("Digite o CPF do usuario: ");
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
			System.out.println("Digite o titulo do livro: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String titulo = opt + ";";
			
			System.out.println("Digite o codigo do livro: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String cod = opt + ";";
			
			System.out.println("Digite o genero do livro: ");
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
		case 4:
			System.out.println("Digite o Id do emprestimo: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			Id = opt + ";";
			
			System.out.println("Digite o codigo do emprestimo: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String codigo = opt + ";";
			
			System.out.println("Digite o quantidade do emprestimo: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String quantidade = opt + ";";
			
			System.out.println("Digite o data de reserva do emprestimo: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String dataR = opt + ";";
			
			System.out.println("Digite o data de entrega do emprestimo: ");
			do {
				try {
					opt = stdin.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (opt.equals("\n") || opt.equals("") || opt.isEmpty());
			String dataE = opt + ";";
			System.out.println(proxy.RealizarEmprestimo(Id, codigo, quantidade, dataR, dataE));
			
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

