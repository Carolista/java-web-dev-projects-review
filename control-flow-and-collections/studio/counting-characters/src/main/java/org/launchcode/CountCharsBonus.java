package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string to count its characters: ");
        String userString = input.nextLine();

        char[] charArray = userString.toUpperCase().toCharArray();

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

        input.close();

    }

}

// TEST INPUT
// Courage doesn't always roar. Sometimes courage is the quiet voice at the end of the day saying 'I will try again tomorrow'.

