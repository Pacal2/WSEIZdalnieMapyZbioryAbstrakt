package com.company;

public class Armor extends Item{

    private int defense;
    private int durability;

    public Armor(String name, int weight, int cost, int defense, int durability) {
        super(name, weight, cost);
        this.defense = defense;
        this.durability = durability;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    void printAdditionalData() {
        System.out.println("Atak: " + defense);
        System.out.println("Trwałość: " + durability + "/100");
    }

}
