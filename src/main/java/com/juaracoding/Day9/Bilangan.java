package com.juaracoding.Day9;

public class Bilangan {
    public String cekGenapGanjil(int angka){
        // memeriksa apakah bilangan genap
        if (angka % 2 == 0){
            // jika True maka akan mengembalikan hasil genap
            return "genap";
        }else{
            // jika True maka akan mengembalikan hasil ganjil
            return "ganjil";
        }
    }
}
