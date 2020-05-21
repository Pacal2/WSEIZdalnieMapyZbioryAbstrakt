package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetAssignment {
    public void uniqueSignAmount(String word) {
        char characters[] = word.toCharArray();
        Set<Character> uniqueCharacters = new HashSet<>();
        for (char c: characters) {
            uniqueCharacters.add(c);
        }
        System.out.println("Słowo " +  word + " zawiera " + uniqueCharacters.size() + " unikalnych znaków.");
    }
    public void updatedUniqueSignAmount(String word) {
        String lowerCaseWord = word.toLowerCase();
        char characters[] = lowerCaseWord.toCharArray();
        Set<Character> uniqueCharacters = new HashSet<>();
        for (char c: characters) {
            uniqueCharacters.add(c);
        }
        System.out.println("Słowo " +  word + " zawiera " + uniqueCharacters.size() + " unikalnych znaków.");
    }

}
