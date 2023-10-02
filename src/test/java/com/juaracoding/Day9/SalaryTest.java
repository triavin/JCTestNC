package com.juaracoding.Day9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTest {

    // test untuk mencari gaji bersih laki-laki jika nilai gaji >= 7000
    @Test
    void testSalaryLaki(){
        Salary salary = new Salary();

        Assert.assertEquals(
                salary.cekGajiBersih(
                        7000,
                        "laki-laki"),
                6300);
    }

    // test untuk mencari gaji bersih perempuan jika nilai gaji >= 7000
    @Test
    void testSalaryPerempuan(){
        Salary salary = new Salary();

        Assert.assertEquals(
                salary.cekGajiBersih(
                        7000,
                        "perempuan"),
                6650);
    }

    // test untuk mencari gaji bersih jika nilai gaji < 7000
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
