package aula10.ex4;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws IOException{ 
        Scanner input = new Scanner(new FileReader("words.txt")); 
        ArrayList<String> twoPlusCharWords = new ArrayList<String>();
        ArrayList<String> lastCharS = new ArrayList<String>();

        while (input.hasNext()) { 
            String word = input.next(); 
            //System.out.println(word);
            if (word.length() > 2) {
                twoPlusCharWords.add(word);
            }
            if (word.charAt(word.length()-1) == (char)'s') {
                lastCharS.add(word);
            }
        }
        input.close();

        for (int i = 0; i < twoPlusCharWords.size(); i++) {
            String word = twoPlusCharWords.get(i);
            if (word.matches(".*[^a-zA-Z].*")) {
                twoPlusCharWords.remove(i);
                i--;
            }
        }

        for (String string : twoPlusCharWords) {
            System.out.println(string);
        }
        System.out.println();

        for (String string : lastCharS) {
            System.out.println(string);
        }

    } 
}
