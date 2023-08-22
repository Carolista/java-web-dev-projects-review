package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsSuperBonus {

    public static void main(String[] args) {

        String quoteFromFile = "";

        try {
            File textFromFile = new File("src/main/java/org/launchcode/quote.txt"); // Jonathan Mills
            Scanner myReader = new Scanner(textFromFile);
            if (myReader.hasNextLine()) {
                quoteFromFile = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when trying to read quote from file.");
        }

        char[] charArray = quoteFromFile.toUpperCase().toCharArray();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        HashMap<Character, Integer> counts = new HashMap<>();

        for (char letter : charArray) {
            if (alphabet.indexOf(letter) >= 0) {
                if (counts.containsKey(letter)) {
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    counts.put(letter, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }

    }
}



