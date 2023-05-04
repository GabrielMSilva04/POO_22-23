package aula10.ex3;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex3 {
    public static void main(String[] args) {
        HashMap<Character, ArrayList<Integer>> indexesOfLetters = new HashMap<Character, ArrayList<Integer>>();

        String str = "Hello World";
        
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (indexesOfLetters.containsKey(letter)) {
                indexesOfLetters.get(letter).add(i);
            } else {
                ArrayList<Integer> indexes = new ArrayList<Integer>();
                indexes.add(i);
                indexesOfLetters.put(letter, indexes);
            }
        }
        System.out.println(indexesOfLetters);
    }
}
