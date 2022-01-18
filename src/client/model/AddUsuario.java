package client.model;
// See README.txt for information and build instructions.

import com.usuarios.protos.AddressUsuarios;
import com.usuarios.protos.Usuario;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

class AddUsuario {
  // This function fills in a Person message based on user input.
  static Usuario PromptForAddress(BufferedReader stdin,
                                 PrintStream stdout) throws IOException {
    Usuario.Builder usuario = Usuario.newBuilder();

    stdout.print("ID: ");
    usuario.setId(String.valueOf(stdin.readLine()));

    stdout.print("CPF do usuário: ");
    usuario.setCpf(String.valueOf(stdin.readLine()));

    stdout.print("Nome do usuário: ");
    usuario.setNome(stdin.readLine());

    stdout.print("Email: ");
    String email = stdin.readLine();
    if (email.length() > 0) {
      usuario.setEmail(email);
    }


    return usuario.build();
  }

  // Main function:  Reads the entire address book from a file,
  //   adds one person based on user input, then writes it back out to the same
  //   file.
  public static void main(String[] args) throws Exception {
	 
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
      PromptForAddress(new BufferedReader(new InputStreamReader(System.in)),
                       System.out));

    // Write the new address book back to disk.
    FileOutputStream output = new FileOutputStream(dir);
    try {
    	addressUsuarios.build().writeTo(output);
    } finally {
      output.close();
    }
  }
}
