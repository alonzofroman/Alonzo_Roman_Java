package com.company;

public class Warrior extends Character {
    protected int shieldStrength;

    public Warrior(String name) {
        this.name = name;
        this.strength = 75;
        this.health = 100;
        this.stamina = 100;
        this.speed = 50;
        this.attackPower = 100;
        this.shieldStrength = 100;
        this.running = false;
        this.arrested = false;
    }

    public Warrior() {

    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
