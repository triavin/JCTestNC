package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KotakTest {
    @Test
    public void testLuasKotak(){
        Kotak kotak = new Kotak();
        Assert.assertEquals(kotak.luas(10), 100);
    }
    @Test
    public void testVolumeKotak(){
        Kotak kotak = new Kotak();
        Assert.assertEquals(kotak.volume(10), 1000);
    }
}
