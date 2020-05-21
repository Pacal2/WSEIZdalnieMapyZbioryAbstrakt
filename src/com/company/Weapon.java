package com.company;

public class Weapon extends Item{

    private int attack;
    private int durability;

    public Weapon(String name, int weight, int cost, int attack, int durability) {
        super(name, weight, cost);
        this.attack = attack;
        this.durability = durability;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    void printAdditionalData() {
        System.out.println("Atak: " + attack);
        System.out.println("Trwałość: " + durability + "/100");
    }
}
