/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PajakKendaraan;

/**
 *
 * @author Elsha Anggun 2211110031
 */
public class Sedan extends Mobil {
    String tipePenggunaan;

    // Konstruktor default
    public Sedan() {
        super();
        this.tipePenggunaan = "Data Kosong";
    }

    // Konstruktor dengan parameter
    public Sedan(String nomorPlat, String merk, float harga, int kapasitasCC, String tipePenggunaan) {
        super(nomorPlat, merk, harga, kapasitasCC);
        this.tipePenggunaan = tipePenggunaan;
    }

    // Method infoSedan
    public void infoSedan() {
        System.out.println("Tipe Penggunaan: " + tipePenggunaan);
    }

    // Override hitungPajak berdasarkan tipePenggunaan
    @Override
    public float hitungPajak() {
        float pajakMobil = super.hitungPajak();
        if (tipePenggunaan.equals("Pribadi")) {
            return pajakMobil + (pajakMobil * 0.2f);
        } else if (tipePenggunaan.equals("Komersial")) {
            return pajakMobil + (pajakMobil * 0.3f);
        } else {
            return 0;
        }
    }

    // Override tampilInfo
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        infoSedan();
        System.out.println("Pajak Sedan: Rp " + hitungPajak());
    }
}
