package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RPGInheritanceTest {

    Farmer Bob = new Farmer("Bob");
    Warrior Leorio = new Warrior("Leorio");
    Constable Stephan = new Constable("Stephan", "Farmer");



    @Test
    public void characterBobShouldHave75Strength() {
        int expectedResult = 75;
        int actualResult = Bob.getStrength();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void characterLeorioShouldBeNamedLeorio() {
        String expectedResult = "Leorio";
        String actualResult = Leorio.getName();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void characterLeorioShouldHave100ShieldStrength() {
        int expectedResult = 100;
        int actualResult = Leorio.getShieldStrength();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void characterStephanShouldHaveJurisdictionOverFarmers() {
        String expectedResult = "Farmer";
        String actualResult = Stephan.getJurisdiction();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void characterLeorioAttackingBobShouldDo100Damage() {
        int expectedResult = 0;
        Leorio.attackACharacter(Bob);
        int actualResult = Bob.getHealth();
        assertEquals(expectedResult, actualResult);
    };

    @Test
    public void characterStephanAttackingLeorioShouldLeave95Shield() {
        int expectedResult = 95;
        Stephan.attackACharacter(Leorio);
        int actualResult = Leorio.getShieldStrength();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void characterStephanShouldHave30SpeedAfterHeStartsRunning() {
        int expectedResult = 30;
        Stephan.startRunning();
        int actualResult = Stephan.getSpeed();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void characterJasmineShouldCatchStephan() {
        boolean expectedResult = true;
        boolean actualResult = Leorio.catchACharacter(Stephan);
        assertEquals(expectedResult, actualResult);
    }



}
