/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PajakKendaraan;

/**
 *
 * @author Elsha Anggun 2211110031
 */
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