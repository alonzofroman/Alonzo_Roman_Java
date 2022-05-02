package com.company;

import com.company.interfaces.Converter;
import org.junit.Test;


import static org.junit.Assert.*;

public class ConverterApplicationTest {

    Converter ifConverter = new ConverterIf();
    Converter switchConverter = new ConverterSwitch();

    @Test
    public void monthOneShouldBeJanuaryInIf() {
        String actualResult = ifConverter.convertMonth(1);
        String expectedResult = "January";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void monthFourteenShouldBeWrongInIf() {
        String actualResult = ifConverter.convertMonth(14);
        String expectedResult = "No month found";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void day4ShouldBeWednesdayInIf() {
        String actualResult = ifConverter.convertDay(4);
        String expectedResult = "Wednesday";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void day8ShouldBeWrongInIf() {
        String actualResult = ifConverter.convertDay(8);
        String expectedResult = "No day found.";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void month4ShouldBeAprilInSwitch() {
        String actualResult = switchConverter.convertMonth(4);
        String expectedResult = "April";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void month16ShouldBeWrongInSwitch() {
        String actualResult = switchConverter.convertMonth(16);
        String expectedResult = "No month found";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void day2ShouldBeMondayInSwitch() {
        String actualResult = switchConverter.convertDay(2);
        String expectedResult = "Monday";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void day10ShouldBeWrongInSwitch() {
        String actualResult = switchConverter.convertDay(10);
        String expectedResult = "No day found";
        assertEquals(expectedResult, actualResult);
    }

}