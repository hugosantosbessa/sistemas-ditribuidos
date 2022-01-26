package server.model;
// See README.txt for information and build instructions.

import com.emprestimos.protos.AddressEmprestimos;
import com.emprestimos.protos.Emprestimo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddEmprestimo {
  // This function fills in a Person message based on user input.
  static Emprestimo setEmprestimo(String Id, String codigo, String quantidade, String dataR, String dataE) throws IOException {
    Emprestimo.Builder emprestimo = Emprestimo.newBuilder();
    
    emprestimo.setId(Id);
    emprestimo.setCodigo(codigo);
    emprestimo.setQuantidade(quantidade);
    emprestimo.setDataReserva(dataR);
    emprestimo.setDataEntrega(dataE);
    
    return emprestimo.build();
  }

  // Main function:  Reads the entire address book from a file,
  //   adds one person based on user input, then writes it back out to the same
  //   file.
  public void Emprestimo(String Id, String codigo, String quantidade, String dataR, String dataE) throws Exception {
	 
	String dir = "BackUp_emprestimos";

	AddressEmprestimos.Builder addressEmprestimos = AddressEmprestimos.newBuilder();

    // Read the existing address book.
    try {
      FileInputStream input = new FileInputStream(dir);
      try {
    	  addressEmprestimos.mergeFrom(input);
      } finally {
        try { input.close(); } catch (Throwable ignore) {}
      }
    } catch (FileNotFoundException e) {
      //System.out.println(args[0] + ": File not found.  Creating a new file.");
    }
    
    // Add an address.
    addressEmprestimos.addEmprestimo(
    		setEmprestimo(Id, codigo, quantidade, dataR, dataE));

    // Write the new address book back to disk.
    FileOutputStream output = new FileOutputStream(dir);
    try {
    	addressEmprestimos.build().writeTo(output);
    } finally {
      output.close();
    }
  }
}
