package com.company;



import org.junit.Test;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FactoryIceCreamTest {


//    Class declaration
    com.company.factory.IceCream iceCream =
            new com.company.factory.IceCream("Vanilla Sundae", 5.50, 2.50, 0.50, Collections.singletonList(("Vanilla, Chocolate, Peanuts")));

//    Tests
    @Test
    public void profitShouldBePriceMinusCost() {
        double expectedResult = 3.00;
        double actualResult = iceCream.profit();
        assertEquals(expectedResult, actualResult, 0.2);
    }

    @Test
    public void flavorShouldBeVanillaSundae() {
        String expectedResult = "Vanilla Sundae";
        String actualResult = iceCream.getFlavor();
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void IngredientsShouldBeVanillaChocolateAndPeanuts() {
        List<String> expectedResult = Collections.singletonList(("Vanilla, Chocolate, Peanuts"));
        List<String> actualResult = iceCream.getIngredients();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void ProductionTimeShouldBeFiftySeconds() {
        double expectedResult = 0.50;
        double actualResult = iceCream.getProductionTime();
        assertEquals(expectedResult, actualResult, 0.2);

    }

}
