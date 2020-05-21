package com.company;

import org.w3c.dom.ls.LSOutput;

public class Person {

    // Przygotuj klasę Person (name, surname, age).
    // Utwórz mapę, w której kluczem będzie numer PESEL, a wartością – obiekt klasy Person.
    // Dodaj kilka par do mapy.
    // Przygotuj metodę, która jako parametr otrzyma mapę i wyświetli jej zawartość.
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showData(){
        System.out.println("Imię: " + this.name + " " + this.surname);
        System.out.println("Wiek: " + this.age);
    }


}
