package aula12.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ex1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        int palavrasTotal = 0;
        String filename = "major.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] palavras = line.split(" ");
                // Percorre o array de palavras
                for (int i = 0; i < palavras.length - 1; i++) {
                    String word = palavras[i].toLowerCase();
                    word = word.replaceAll("\\w*[\\t\\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"']\\w*", "");
                    if (!lista.contains(word)) {
                        lista.add(word);
                    } else {
                        palavrasTotal++;
                    }
                }
            }
        }
        catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("Número Total de Palavras: " + palavrasTotal);
        System.out.println("Número de Diferentes Palavras: " + lista.size());
    }
}




