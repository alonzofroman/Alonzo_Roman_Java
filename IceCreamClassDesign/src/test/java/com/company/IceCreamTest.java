package com.company;

import com.company.factory.Ingredient;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class IceCreamTest {



//    private static ArrayList<String> ingredientList1;
//
//
    @Before
    public void setup() {
        List<Ingredient> testList = new ArrayList<>();


    }


//    private List<Ingredient> testList;

    public List<Ingredient> testList; {
        Ingredient one = new Ingredient();
        one.setName("Vanilla");
        testList.add(one);

        Ingredient two = new Ingredient();
        two.setName("Chocolate");
        testList.add(two);

        Ingredient three = new Ingredient();
        three.setName("Peanuts");
        testList.add(three);

    }


    com.company.factory.IceCream iceCream =
            new com.company.factory.IceCream("Vanilla Sundae", 5.50, 2.50, 0.50, testList);
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
    public void ingredientListShouldHavePeanuts() {
        System.out.println(testList);


    }
}
