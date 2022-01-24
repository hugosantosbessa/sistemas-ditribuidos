package server.model;
// See README.txt for information and build instructions.

import com.autores.protos.AddressAutores;
import com.autores.protos.Autor;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class AddAutor {
  // This function fills in a Person message based on user input.
  static Autor PromptForAddress(BufferedReader stdin,
                                 PrintStream stdout) throws IOException {
    Autor.Builder autor = Autor.newBuilder();
    
    stdout.print("ID: ");
    autor.setId(Integer.valueOf(stdin.readLine()));
    
    stdout.print("Nome do autor: ");
    autor.setName(stdin.readLine());
    
    stdout.print("CPF do autor: ");
    autor.setCpf(Integer.valueOf(stdin.readLine()));
    
    stdout.print("Email do autor: ");
    autor.setEmail(stdin.readLine());

    

    return autor.build();
  }

  // Main function:  Reads the entire address book from a file,
  //   adds one person based on user input, then writes it back out to the same
  //   file.
  public static void CadastrarAutor(String nome, String Id, String email, String cpf) throws Exception {

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
      PromptForAddress(new BufferedReader(new InputStreamReader(System.in)),
                       System.out));

    // Write the new address book back to disk.
    FileOutputStream output = new FileOutputStream(dir);
    try {
    	addressAutores.build().writeTo(output);
    } finally {
      output.close();
    }
  }
}
