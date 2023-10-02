package com.juaracoding.Day9;

public class Salary {
    public double cekGajiBersih(double gaji, String jenisKelamin){
        // menghitung gaji bersih laki-laki jika gaji >= 7000
        if (gaji >= 7000 && jenisKelamin.equals("laki-laki")){
            // mengembalikan nilai gaji bersih
            // gajiBersih = gaji - (gaji * 10%)

            return gaji-(gaji * 0.1);
        }
        // menghitung gaji bersih perempuan jika gaji >= 7000
        else if (gaji >= 7000 && jenisKelamin.equals("perempuan")){
            // mengembalikan nilai gaji bersih
            // gajiBersih = gaji - (gaji * 5%)
            return gaji-(gaji * 0.05);
        }
        // mengembalikan nilai jika gaji < 7000
        else {
            return gaji;
        }
    }
}
