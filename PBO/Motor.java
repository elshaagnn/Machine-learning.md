/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PajakKendaraan;

/**
 *
 * @author Elsha Anggun 2211110031
 */
public class Motor extends Kendaraan implements Pajak {
    String jenisMotor;
    int kapasitasCC;

    // Konstruktor default
    public Motor() {
        super();
        this.jenisMotor = "Data Kosong";
        this.kapasitasCC = 0;
    }

    // Konstruktor dengan parameter
    public Motor(String nomorPlat, String merk, float harga, String jenisMotor, int kapasitasCC) {
        super(nomorPlat, merk, harga);
        this.jenisMotor = jenisMotor;
        this.kapasitasCC = kapasitasCC;
    }

    // Method infoMotor
    public void infoMotor() {
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println("Kapasitas CC: " + kapasitasCC);
    }

    // Override hitungPajak
    @Override
    public float hitungPajak() {
        return harga * 10000 * kapasitasCC / 100;
    }

    // Override tampilInfo
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        infoMotor();
        System.out.println("Pajak Motor: Rp " + hitungPajak());
    }
}