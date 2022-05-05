package com.company;

public class Constable extends Character {

    protected String jurisdiction;

    public Constable(String name, String jurisdiction) {
        this.name = name;
        this.strength = 60;
        this.health = 100;
        this.stamina = 60;
        this.speed = 20;
        this.attackPower = 5;
        this.running = false;
        this.arrested = false;
        this.jurisdiction = jurisdiction;
    }

    public Constable() {

    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


}
