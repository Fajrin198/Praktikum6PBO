/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PendahuluanNomor4;

/**
 *
 * @author MY ASUS
 */ 
public class SegiTiga extends BangunDatar implements Geometri {
    double alas;
    double tinggi;
    double sisiMiring;

    public SegiTiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }
    
    @Override
    public void hitungKeliling() {
        keliling = tinggi+sisiMiring+alas;
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }

    @Override
    public void hitungLuas() {
        luas = 0.5*alas*tinggi;
        System.out.println("Luas Persegi Panjang = "+luas);
    }

    @Override
    public double getKeliling() {
        return keliling;
    }

    @Override
    public double getLuas() {
        return luas;
    }
}
