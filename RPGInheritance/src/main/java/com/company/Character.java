package com.company;

public abstract class Character {
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;
    protected boolean running;
    protected boolean arrested;

    protected int shieldStrength;

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    public void attackACharacter(Character target) {
        if (target.getShieldStrength() == 0) {
            int remainingHealth = target.getHealth() - this.attackPower;
            target.setHealth(remainingHealth);
        } else {
            int remainingShield = target.getShieldStrength() - this.attackPower;
            target.setShieldStrength(remainingShield);
        }
    }

    public boolean catchACharacter(Character target) {
        if (target.getSpeed() < this.getSpeed()) {
            return true;
        } else {
            return false;
        }
    }

    public void startRunning() {
        if (this.running = true) {
            int runningSpeed = this.getSpeed() + 10;
            this.setSpeed(runningSpeed);
        }
    }

    public void stopRunning() {
        if (this.isRunning() == true) {
            int normalSpeed = this.getSpeed() - 10;
            this.setSpeed(normalSpeed);
        }
    }


}
