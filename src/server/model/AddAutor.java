package server.model;
// See README.txt for information and build instructions.

import com.autores.protos.AddressAutores;
import com.autores.protos.Autor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddAutor {
  // This function fills in a Person message based on user input.
  static Autor setAutor(String nome, String Id, String email, String cpf) throws IOException {
    Autor.Builder autor = Autor.newBuilder();
    
    autor.setId(Id);
    autor.setName(nome);
    autor.setCpf(cpf);  
    autor.setEmail(email);

    

    return autor.build();
  }

  // Main function:  Reads the entire address book from a file,
  //   adds one person based on user input, then writes it back out to the same
  //   file.
  public void CadastrarAutor(String nome, String Id, String email, String cpf) throws Exception {

    AddressAutores.Builder addressAutores = AddressAutores.newBuilder();
    
    String dir = "BackUp_autores";
    // Read the existing address book.
    try {
      FileInputStream input = new FileInputStream(dir);
      try {
    	  addressAutores.mergeFrom(input);
      } finally {
        try { input.close(); } catch (Throwable ignore) {}
      }
    } catch (FileNotFoundException e) {
      //System.out.println(args[0] + ": File not found.  Creating a new file.");
    }

    // Add an address.
    addressAutores.addAutor(
    		setAutor(nome, Id, email, cpf));

    // Write the new address book back to disk.
    FileOutputStream output = new FileOutputStream(dir);
    try {
    	addressAutores.build().writeTo(output);
    } finally {
      output.close();
    }
  }
}
