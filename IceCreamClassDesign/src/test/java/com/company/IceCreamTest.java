package com.company;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class IceCreamTest {

    private static ArrayList<String> ingredientList1;


    @Before
    public void setup() {
        ingredientList1 = new ArrayList<>();
        ingredientList1.add("Vanilla");
        ingredientList1.add("Chocolate");
        ingredientList1.add("Peanuts");
    }



    com.company.factory.IceCream iceCream =
            new com.company.factory.IceCream("Vanilla Sundae", 5.50, 2.50, 0.50, ingredientList1);
    @Test
    public void profitShouldBePriceMinusCost() {
        double expectedResult = 3.00;
        double actualResult = iceCream.profit();
        assertEquals(expectedResult, actualResult, 0.2);
    }
}
