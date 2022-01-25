package server.model;
// See README.txt for information and build instructions.

import com.autores.protos.AddressAutores;
import com.autores.protos.Autor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

class ListAutor {
  // Iterates though all people in the AddressBook and prints info about them.
  static void Print(AddressAutores addressAutores) {
    for (Autor autor: addressAutores.getAutorList()) {
      System.out.println("Id autor: " + autor.getId());
      System.out.println("	Nome: " + autor.getName());
      System.out.println("	e-mail: " + autor.getEmail());
      System.out.println("	CPF: " + autor.getCpf());
   
    }
  }

  // Main function:  Reads the entire address book from a file and prints all
  //   the information inside.
  public static void main(String[] args) throws Exception {    
	  
	  String dir = "BackUp_autores";
    // Read the existing address book.
	  AddressAutores addressAutores =
	  AddressAutores.parseFrom(new FileInputStream(dir));

    Print(addressAutores);
  }
}
