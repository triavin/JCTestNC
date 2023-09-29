package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();

        int a = 1234;
        int b = 5678;

        int expected = 6912;
        int actual = calculator.add(a,b);

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void testSubtrack(){
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        int expected = 5;
        int actual = calculator.add(a,b);

        Assert.assertEquals(actual, expected);

    }
}