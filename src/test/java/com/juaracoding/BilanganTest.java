package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BilanganTest {
    @Test
    public void testBilanganGenap(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(4),"genap");
    }
    @Test
    public void testBilanganGanjil(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(5),"genap");
    }
}
