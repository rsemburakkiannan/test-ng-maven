package com.example;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddition() {
        int num1 = 5;
        int num2 = 7;
        int expectedResult = 12;
        int actualResult = num1 + num2;
        assertEquals(actualResult, expectedResult, "Addition result is incorrect");
    }
}
