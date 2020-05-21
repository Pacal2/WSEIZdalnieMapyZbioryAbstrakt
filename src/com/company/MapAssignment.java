package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapAssignment {


    public LinkedHashMap<String, Float> setUpHashMap (int amount) {
        Scanner input = new Scanner(System.in);
        LinkedHashMap<String, Float> subjectsAndMarks = new LinkedHashMap<>();

        for (int i = 1; i <= amount; i++) {
            String subjectName;
            Float subjectMark;
            System.out.println("Wprowadź nazwę przedmiotu (" + i + "): ");
            subjectName = input.nextLine();
            System.out.println("Wprowadź ocenę za przemiot: ");
            subjectMark = input.nextFloat();
            input.nextLine();
            subjectsAndMarks.put(subjectName, subjectMark);
        }

        return subjectsAndMarks;
    }

    public void printHashMapContent(LinkedHashMap<String, Float> hashMap) {
        for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public LinkedHashMap<String, Person> setUpPersonMap() {
        LinkedHashMap<String, Person> personMap = new LinkedHashMap<>();
        personMap.put("8805174456", new Person("Han", "Solo", 32));
        personMap.put("7912044907", new Person("Darth", "Vader", 41));
        personMap.put("6313279443", new Person("Obi-wan", "Kenobi", 57));
        return personMap;
    }

    public void printPersonMapContent(LinkedHashMap<String, Person> personMap) {
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            System.out.println("PESEL:  " + entry.getKey());
            entry.getValue().showData();
        }
    }

}
