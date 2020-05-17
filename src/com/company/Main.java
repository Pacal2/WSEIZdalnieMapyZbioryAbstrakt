package com.company;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {


        // Zadanie 1
        MapAssignment mapAssignment = new MapAssignment();
        /*
        LinkedHashMap<String, Float> subjectsAndMarks = mapAssignment.setUpHashMap(3);
        // Zadanie 2
        mapAssignment.showHashMapContent(subjectsAndMarks);

        // Zadanie 3
         */
        LinkedHashMap<String, Person> personMap = mapAssignment.setUpPersonMap();
        mapAssignment.showPersonMapContent(personMap);

    }
}