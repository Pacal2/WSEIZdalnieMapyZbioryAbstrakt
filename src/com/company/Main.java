package com.company;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        // Zadanie 1
        System.out.println("\nZadanie I");
        MapAssignment mapAssignment = new MapAssignment();

        LinkedHashMap<String, Float> subjectsAndMarks = mapAssignment.setUpHashMap(3);
        // Zadanie 2
        System.out.println("\nZadanie II");
        mapAssignment.printHashMapContent(subjectsAndMarks);

        // Zadanie 3
        System.out.println("\nZadanie III");
        LinkedHashMap<String, Person> personMap = mapAssignment.setUpPersonMap();
        mapAssignment.printPersonMapContent(personMap);

        // Zadanie 4
        System.out.println("\nZadanie IV");
        SetAssignment setAssignment = new SetAssignment();
        setAssignment.uniqueSignAmount("Anagram");
        // Specjalnie dobrane słowo z dużą literą by pokazać różnicę w następnym zadaniu

        // Zadanie 5
        System.out.println("\nZadanie V");
        setAssignment.updatedUniqueSignAmount("Anagram");

        // Zadanie 6
        System.out.println("\nZadanie VI");
        Weapon Claymore = new Weapon("Claymore", 3, 10, 12, 100);
        Armor Chainmail = new Armor("Kolczuga", 10, 10, 8, 100);
        Claymore.printData();
        Chainmail.printData();



    }
}