package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KotakTest {

    // test untuk mencari luas kotak
    @Test
    public void testLuasKotak(){
        Kotak kotak = new Kotak();
        Assert.assertEquals(kotak.luas(10), 100);
    }

    // test untuk mencari volume kotak
    @Test
    public void testVolumeKotak(){
        Kotak kotak = new Kotak();
        Assert.assertEquals(kotak.volume(10), 1000);
    }
}
