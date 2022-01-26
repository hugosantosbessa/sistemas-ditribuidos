package server.model;
// See README.txt for information and build instructions.

import com.emprestimos.protos.AddressEmprestimos;
import com.emprestimos.protos.Emprestimo;
import java.io.FileInputStream;

class ListEmprestimo {
  // Iterates though all people in the AddressBook and prints info about them.
  static void Print(AddressEmprestimos addressEmprestimos) {
    for (Emprestimo emprestimo: addressEmprestimos.getEmprestimoList()) {
      System.out.println("ID: " + emprestimo.getId());
      System.out.println("	C�digo: " + emprestimo.getCodigo());
      System.out.println("	Quantidade: " + emprestimo.getQuantidade());
      System.out.println("	Data de reserva: " + emprestimo.getDataReserva());
      System.out.println("	Data de entrega: " + emprestimo.getDataEntrega());

    }
  }

  // Main function:  Reads the entire address book from a file and prints all
  //   the information inside.
  public static void main(String[] args) throws Exception {					
	
	String dir = "BackUp_emprestimos";
    // Read the existing address book.
	AddressEmprestimos addressEmprestimos =
			AddressEmprestimos.parseFrom(new FileInputStream(dir));

    Print(addressEmprestimos);
  }
}
