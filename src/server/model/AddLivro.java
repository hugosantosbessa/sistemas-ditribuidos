package server.model;
// See README.txt for information and build instructions.

import com.livros.protos.AddressLivros;
import com.livros.protos.Livro;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddLivro {
  // This function fills in a Person message based on user input.
  static Livro setLivro(String titulo, String cod, String genero, String autor, String quant_exemplares) throws IOException {
    Livro.Builder livro = Livro.newBuilder();
    
    livro.setTitulo(titulo);
    livro.setCodigo(cod);
    livro.setQtd(quant_exemplares);
    livro.setAutor(autor);
    livro.setGenero(genero);

    return livro.build();
  }

  // Main function:  Reads the entire address book from a file,
  //   adds one person based on user input, then writes it back out to the same
  //   file.
  public void CadastrarLivro(String titulo, String cod, String genero, String autor, String quant_exemplares) throws Exception {
	  
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
    		setLivro(titulo, cod, genero, autor, quant_exemplares));

    // Write the new address book back to disk.
    FileOutputStream output = new FileOutputStream(dir);
    try {
    	addressLivros.build().writeTo(output);
    } finally {
      output.close();
    }
  }
}
