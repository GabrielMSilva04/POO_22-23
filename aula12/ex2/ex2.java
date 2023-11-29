package aula12.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.TreeMap;

public class ex2 {
    public static void main(String[] args) {
        HashMap<Character, TreeMap<String, Integer>> characterMap = new HashMap<>();
        String filename = "A_cidade_e_as_serras.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] palavras = line.split(" ");
                // Percorre o array de palavras
                for (int i = 0; i < palavras.length - 1; i++) {
                    String word = palavras[i].toLowerCase();
                    word = word.replaceAll("\\S*[\\t\\n.,:'‘’_^«»;?!\\-*{}=+&/()\\[\\]”“\"'\\d]+\\S*", "");
                    if (word.length() >= 3) {
                        Character firstCharacter = Normalizer.normalize(Character.toString(word.charAt(0)), Normalizer.Form.NFD).charAt(0);
                        if (characterMap.containsKey(firstCharacter)) {
                            TreeMap<String, Integer> innerMap = characterMap.get(firstCharacter);
                            innerMap.put(word, innerMap.getOrDefault(word, 0) + 1);
                        } else {
                            TreeMap<String, Integer> innerMap = new TreeMap<>();
                            innerMap.put(word, 1);
                            characterMap.put(firstCharacter, innerMap);
                        }
                    }
                }
            }
            System.out.println(characterMap);
            
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
