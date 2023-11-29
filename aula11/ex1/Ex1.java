package ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) {
        String filename = "major.txt";
        HashMap<String, HashMap<String, Integer>> words = new HashMap<String, HashMap<String, Integer>>();

        System.out.println("Text file:");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] palavras = line.split(" ");
                // Percorre o array de palavras
                for (int i = 0; i < palavras.length - 1; i++) {
                    // Verifica se a palavra atual tem tamanho maior ou igual a 3
                    if (palavras[i].length() >= 3) {
                        // Cria um par com a palavra atual e a próxima palavra
                        String palavra1 = palavras[i].toLowerCase();
                        String palavra2 = palavras[i+1].toLowerCase();
                        // Incrementa a contagem de ocorrências do par no mapa
                        if (hasSeparador(palavra1)) {
                            palavra2 = "separadores";
                        }
                        palavra1 = palavra1.replaceAll("\\w*[\\t\\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"']\\w*", "");
                        if (words.containsKey(palavra1)) {
                            HashMap<String, Integer> innerMap = words.get(palavra1);
                            if (innerMap.containsKey(palavra2)) {
                                innerMap.put(palavra2, innerMap.get(palavra2) + 1);
                            } else {
                                innerMap.put(palavra2, 1);
                            }
                        } else {
                            HashMap<String, Integer> innerMap = new HashMap<>();
                            innerMap.put(palavra2, 1);
                            words.put(palavra1, innerMap);
                        }
                    }
                    else {
                        i++;
                    }   
                }
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("Mapa:");
        System.out.println(words);
    }


    public static boolean hasSeparador(String word) {
        char lastChar = word.charAt(word.length()-1);
        return Character.toString(lastChar).matches("\\w*[\\t\\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"']\\w*");
    }
}


