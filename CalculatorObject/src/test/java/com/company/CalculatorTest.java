package com.company;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldAddTwoIntegers() {
        int actualResult = calc.add(1, 1);
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSubtractTwoIntegers() {
        int actualResult = calc.subtract(23, 52);
        int expectedResult = -29;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldMultiplyTwoIntegers() {
        int actualResult = calc.multiply(34, 2);
        int expectedResult = 68;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldDivideTwoIntegers() {
        int actualResult = calc.divide(12, 3);
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldAddTwoDoubles() {
        double actualResult = calc.add(3.4, 2.3);
        double expectedResult = 5.7;
        assertEquals(expectedResult, actualResult);

    }

}