package server.model;
// See README.txt for information and build instructions.

import com.usuarios.protos.AddressUsuarios;
import com.usuarios.protos.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddUsuario {
  // This function fills in a Person message based on user input.
  static Usuario setUser(String nome, String Id, String email, String cpf) throws IOException {
    Usuario.Builder usuario = Usuario.newBuilder();

    usuario.setId(Id);
    usuario.setCpf(cpf);
    usuario.setNome(nome);
    usuario.setEmail(email);		
    
    return usuario.build();
  }

  // Main function:  Reads the entire address book from a file,
  //   adds one person based on user input, then writes it back out to the same
  //   file.
  public void CadastrarUsuario(String nome, String Id, String email, String cpf) throws Exception {
	 
	String dir = "BackUp_usuarios";

	AddressUsuarios.Builder addressUsuarios = AddressUsuarios.newBuilder();

    // Read the existing address book.
    try {
      FileInputStream input = new FileInputStream(dir);
      try {
    	  addressUsuarios.mergeFrom(input);
      } finally {
        try { input.close(); } catch (Throwable ignore) {}
      }
    } catch (FileNotFoundException e) {
      //System.out.println(args[0] + ": File not found.  Creating a new file.");
    }
    
    // Add an address.
    addressUsuarios.addUsuario(
    		setUser(nome, Id, email, cpf));

    // Write the new address book back to disk.
    FileOutputStream output = new FileOutputStream(dir);
    try {
    	addressUsuarios.build().writeTo(output);
    } finally {
      output.close();
    }
  }
}
