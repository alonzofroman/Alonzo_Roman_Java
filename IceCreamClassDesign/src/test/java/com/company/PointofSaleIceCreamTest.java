package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PointofSaleIceCreamTest {

    com.company.pointofsale.IceCream iceCream =
            new com.company.pointofsale.IceCream("Chocolate",5.50,100);

    @Test
    public void flavorShouldBeChocolate() {
        String expectedResult = "Chocolate";
        String actualResult = iceCream.getFlavor();
    }

    @Test
    public void priceShouldBeFiveFifty() {
        double expectedResult = 5.50;
        double actualResult = iceCream.getPrice();
        assertEquals(expectedResult, actualResult, 0.2);
    }

    @Test
    public void salesShouldDecreaseQuantity() {
        int expectedResult = 90;
        int actualResult = iceCream.MakeASale(10);
        assertEquals(expectedResult, actualResult);
    }

}
