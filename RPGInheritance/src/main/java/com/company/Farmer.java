package com.company;

public class Farmer extends Character {

    protected boolean harvesting;
    protected boolean plowing;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean harvesting, boolean plowing) {
        this.name = name;
        this.strength = 75;
        this.health = 100;
        this.stamina = 75;
        this.speed = 10;
        this.attackPower = 1;
        this.running = false;
        this.arrested = false;
        this.harvesting = false;
        this.plowing = false;
    }


}
