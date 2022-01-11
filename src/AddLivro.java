// See README.txt for information and build instructions.

import com.livros.protos.AddressLivros;
import com.livros.protos.Livro;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class AddLivro {
  // This function fills in a Person message based on user input.
  static Livro PromptForAddress(BufferedReader stdin,
                                 PrintStream stdout) throws IOException {
    Livro.Builder livro = Livro.newBuilder();

    stdout.print("Código do livro: ");
    livro.setCodigo(Integer.valueOf(stdin.readLine()));

    stdout.print("Quantidade de exemplares: ");
    livro.setQtd(Integer.valueOf(stdin.readLine()));

    stdout.print("Nome do autor: ");
    livro.setAutor(stdin.readLine());
    
    stdout.print("Gênero do livro: ");
    livro.setGenero(stdin.readLine());

    return livro.build();
  }

  // Main function:  Reads the entire address book from a file,
  //   adds one person based on user input, then writes it back out to the same
  //   file.
  public static void main(String[] args) throws Exception {
	  
	 String dir = "BackUp_livros";

    AddressLivros.Builder addressLivros = AddressLivros.newBuilder();

    // Read the existing address book.
    try {
      FileInputStream input = new FileInputStream(dir);
      try {
    	  addressLivros.mergeFrom(input);
      } finally {
        try { input.close(); } catch (Throwable ignore) {}
      }
    } catch (FileNotFoundException e) {
      //System.out.println(args[0] + ": File not found.  Creating a new file.");
    }

    // Add an address.
    addressLivros.addLivro(
      PromptForAddress(new BufferedReader(new InputStreamReader(System.in)),
                       System.out));

    // Write the new address book back to disk.
    FileOutputStream output = new FileOutputStream(dir);
    try {
    	addressLivros.build().writeTo(output);
    } finally {
      output.close();
    }
  }
}
