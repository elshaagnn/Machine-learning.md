/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PajakKendaraan;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args){
        System.out.println("\n=========Info Kendaraan=========");
        
        //Objek Motor
        Motor motor = new Motor("B 1234 AB", "Honda", 15, "Sport", 150);
        System.out.println("\n-----------Motor-----------");
        motor.tampilInfo();
        
        //Objek Mobil
        Mobil mobil = new Mobil("D 4321 AC", "Toyota", 200, 1000);
        System.out.println("\n-----------Mobil-----------");
        mobil.tampilInfo();
        
        //Objek Sedan Pribadi
        Sedan sedanPribadi = new Sedan("A 1234 BC", "Honda Civic", 100, 2000, "Pribadi");
        System.out.println("\n-----------Sedan Pribadi-----------");
        sedanPribadi.tampilInfo();
        
        //Objek Sedan Komersial
        Sedan sedanKomersial = new Sedan("C 4321 BA", "Mercedes", 120, 1500, "Komersial");
        System.out.println("\n-----------Sedan Komersial-----------");
        sedanKomersial.tampilInfo();
    }
}
