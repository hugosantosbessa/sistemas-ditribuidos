// See README.txt for information and build instructions.

import com.livros.protos.AddressLivros;
import com.livros.protos.Livro;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

class ListLivro {
  // Iterates though all people in the AddressBook and prints info about them.
  static void Print(AddressLivros addressLivros) {
    for (Livro livro: addressLivros.getLivroList()) {
      System.out.println("Código livro: " + livro.getCodigo());
      System.out.println("	Autor: " + livro.getAutor());
      System.out.println("	Gênero: " + livro.getGenero());
      System.out.println("	Quantidade de exemplares: " + livro.getQtd());
   
    }
  }

  // Main function:  Reads the entire address book from a file and prints all
  //   the information inside.
  public static void main(String[] args) throws Exception {

	 String dir = "BackUp_livros";
    // Read the existing address book.
    AddressLivros addressLivros =
      AddressLivros.parseFrom(new FileInputStream(dir));

    Print(addressLivros);
  }
}
