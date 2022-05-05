package com.company;

import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;


public class CharacterTest {

    Character Bob = new Farmer("Bob");
    Character Leorio = new Warrior("Leorio");
    Character Jasmine = new Warrior("Jasmine");
    Character Stephan = new Constable("Stephan", "Farmer");



    @Test
    public void characterBobShouldHave75Strength() {
        int expectedResult = 75;
        int actualResult = Bob.getStrength();
        assertEquals(expectedResult, actualResult);
    }


}
