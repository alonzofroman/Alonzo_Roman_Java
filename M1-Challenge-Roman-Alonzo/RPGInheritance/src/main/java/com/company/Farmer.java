package com.company;

public class Farmer extends Character {


    protected boolean harvesting;
    protected boolean plowing;

    public Farmer(String name) {
        this.name = name;
        this.strength = 75;
        this.health = 100;
        this.stamina = 75;
        this.speed = 10;
        this.attackPower = 1;
        this.shieldStrength = 0;
        this.running = false;
        this.arrested = false;
        this.harvesting = false;
        this.plowing = false;
    }

    public Farmer() {

    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }


//   Methods and abilities
    public void attackACharacter() {

    }

    public void startHarvesting() {
        setHarvesting(true);
    }

    public void stopHarvesting() {
        setHarvesting(false);
    }

    public void startPlowing() {
        setPlowing(true);
    }

    public void stopPlowing() {
        setPlowing(false);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "harvesting=" + harvesting +
                ", plowing=" + plowing +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", arrested=" + arrested +
                '}';
    }
}
