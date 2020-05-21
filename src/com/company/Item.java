package com.company;

public abstract class Item {
    protected String name;
    protected int weight;
    protected int cost;

    public Item(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public void printData() {
        System.out.println("Nazwa: " + name);
        System.out.println("Waga: " + weight + " kg");
        System.out.println("Cena: " + cost + " złotych monet");
        printAdditionalData();
    }

    abstract void printAdditionalData();
}
