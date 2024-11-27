# <h1 align="center">Laporan Praktikum</h1>

<p align="center">Elsha Anggun </p>

## Dasar teori
```Java
public class Kendaraan {
    String nomorPlat, merk;
    float harga;
    
    // Konstruktor default
    public Kendaraan() {
        this.nomorPlat = "Data Kosong";
        this.merk = "Data Kosong";
        this.harga = 0;
    }
    
    // Konstruktor dengan parameter
    public Kendaraan(String nomorPlat, String merk, float harga) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.harga = harga;
    }
    
    // Method tampil info
    public void tampilInfo() {
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Merk: " + merk);
        System.out.println("Harga: " + harga);
    }
}
```
Penjelasan :

nfjvjbfjb 

## Hasil output
```Java
=========Info Kendaraan=========

-----------Motor-----------
Nomor Plat: B 1234 AB
Merk: Honda
Harga: 15.0
Jenis Motor: Sport
Kapasitas CC: 150
Pajak Motor: Rp 225000.0

-----------Mobil-----------
Nomor Plat: D 4321 AC
Merk: Toyota
Harga: 200.0
Kapasitas CC: 1000 CC
Pajak Mobil: Rp 1000000.0

-----------Sedan Pribadi-----------
Nomor Plat: A 1234 BC
Merk: Honda Civic
Harga: 100.0
Kapasitas CC: 2000 CC
Pajak Mobil: Rp 1200000.0
Tipe Penggunaan: Pribadi
Pajak Sedan: Rp 1200000.0

-----------Sedan Komersial-----------
Nomor Plat: C 4321 BA
Merk: Mercedes
Harga: 120.0
Kapasitas CC: 1500 CC
Pajak Mobil: Rp 1170000.0
Tipe Penggunaan: Komersial
Pajak Sedan: Rp 1170000.0
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  0.841 s
Finished at: 2024-11-27T23:52:36+07:00
------------------------------------------------------------------------
```
