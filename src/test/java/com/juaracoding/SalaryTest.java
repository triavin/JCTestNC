package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTest {
    @Test
    void testSalaryLaki(){
        Salary salary = new Salary();

        Assert.assertEquals(
                salary.cekGajiBersih(
                        7000,
                        "laki-laki"),
                6300);
    }
    @Test
    void testSalaryPerempuan(){
        Salary salary = new Salary();

        Assert.assertEquals(
                salary.cekGajiBersih(
                        7000,
                        "perempuan"),
                6650);
    }
    @Test
    void testSalaryNonPajak(){
        Salary salary = new Salary();

        Assert.assertEquals(
                salary.cekGajiBersih(
                        6000,
                        "perempuan"),
                6000);
    }
}
