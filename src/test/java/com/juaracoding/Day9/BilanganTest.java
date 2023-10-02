package com.juaracoding.Day9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BilanganTest {

    // test untuk menguji hasil output bilangan genap
    @Test
    public void testBilanganGenap(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(4),"genap");
    }

    // test untuk menguji hasil output bilangan ganjil
    @Test
    public void testBilanganGanjil(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(5),"ganjil");
    }
}
