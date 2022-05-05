package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RPGInheritanceTest {

    Farmer Bob = new Farmer("Bob");
    Warrior Leorio = new Warrior("Leorio");
    Warrior Jasmine = new Warrior("Jasmine");
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
    public void characterJasmineShouldHave100ShieldStrength() {
        int expectedResult = 100;
        int actualResult = Jasmine.getShieldStrength();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void characterStephanShouldHaveJurisdictionOverFarmers() {
        String expectedResult = "Farmer";
        String actualResult = Stephan.getJurisdiction();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void characterJasmineAttackingBobShouldDo100Damage() {
        int expectedResult = 0;
        Jasmine.attackACharacter(Bob);
        int actualResult = Bob.getHealth();
        assertEquals(expectedResult, actualResult);
    };

    @Test
    public void characterStephanAttackingJasmineShouldLeave95Shield() {
        int expectedResult = 95;
        Stephan.attackACharacter(Jasmine);
        int actualResult = Jasmine.getShieldStrength();
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
    public void JasmineShouldCatchStephan() {
        boolean expectedResult = true;
        boolean actualResult = Jasmine.catchACharacter(Stephan);
        assertEquals(expectedResult, actualResult);
    }


}
