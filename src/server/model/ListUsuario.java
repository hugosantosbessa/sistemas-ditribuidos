package server.model;
// See README.txt for information and build instructions.

import com.usuarios.protos.AddressUsuarios;
import com.usuarios.protos.Usuario;
import java.io.FileInputStream;

public class ListUsuario {
  // Iterates though all people in the AddressBook and prints info about them.
  static void Print(AddressUsuarios addressUsuarios) {
    for (Usuario usuario: addressUsuarios.getUsuarioList()) {
      System.out.println("Person ID: " + usuario.getId());
      System.out.println("	CPF: " + usuario.getCpf());
      System.out.println("	Name: " + usuario.getNome());
      if (!usuario.getEmail().isEmpty()) {
        System.out.println("	E-mail address: " + usuario.getEmail());
      }
    }
  }

  // Main function:  Reads the entire address book from a file and prints all
  //   the information inside.
  public static void ListarUsuarios() throws Exception {					
	
	String dir = "BackUp_usuarios";
    // Read the existing address book.
	AddressUsuarios addressUsuarios =
			AddressUsuarios.parseFrom(new FileInputStream(dir));

    Print(addressUsuarios);
  }
}
