package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Address add1 = new Address("123 Main St", "New York", "NY", 10001);
    Address add2 = new Address("456 Central St", "Los Angeles", "CA", 90001);
    Address add3 = new Address("789 Central St", "Los Angeles", "CA", 90001);

    Customer Jack = new Customer("Jack", "Smith", "jacksmith@email.com", 1234567, add1, add1, false);
    Customer Jill = new Customer("Jill", "Jameson", "jilljameson@email.com", 9876543, add2, add3, true);

    @Test
    public void customerJackHasTheLastNameSmith() {
        String expectedResult = "Smith";
        String actualResult = Jack.getLastName();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void customerJillHasARewardsMembership() {
        boolean expectedResult = true;
        boolean actualResult = Jill.isRewardsMember();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void customerJackHasTheEmailjacksmithAtGmailDotCom() {
        String expectedResult = "jacksmith@email.com";
        String actualResult = Jack.getEmail();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void customerJackLivesInNewYorkCity() {
        String expectedResult = "New York";
        String actualResult = Jack.getHomeAddress().getCity();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void customerJillLivesInCalifornia() {
        String expectedResult = "CA";
        String actualResult = Jill.getHomeAddress().getState();
        assertEquals(expectedResult, actualResult);
    }


}