/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PajakKendaraan;

/**
 *
 * @author Elsha Anggun 2211110031
 */
public class Mobil extends Kendaraan implements Pajak {
    int kapasitasCC;
    
    // Konstruktor default
    public Mobil() {
        super();
        this.kapasitasCC = 0;
    }
    
    // Konstruktor dengan parameter
    public Mobil(String nomorPlat, String merk, float harga, int kapasitasCC) {
        super(nomorPlat, merk, harga);
        this.kapasitasCC = kapasitasCC;
    }
    
    // Method info mobil
    public void infoMobil() {
        System.out.println("Kapasitas CC: " + kapasitasCC + " CC");
    }
    
    // Implementasi hitungPajak
    @Override
    public float hitungPajak() {
        return harga * 10000 * kapasitasCC / 2000;
    }
    
    // Override tampilinfo
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        infoMobil();
        System.out.println("Pajak Mobil: Rp " + hitungPajak());
    }
}
