package br.edu.ufal.parserbugreport.view;

import br.edu.ufal.parserbugreport.control.App;

/**
 * Created by gabrielnunes on 05/09/17.
 */
public class Main {
    public static void main(String[] args) {
        String folderPath = "/Users/gabrielnunes/Downloads/Spring-Boot"; //Pasta com os arquivos .json de bugs
        App.run(folderPath);
    }
}
