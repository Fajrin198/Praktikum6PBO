/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PendahuluanNomor4;

/**
 *
 * @author MY ASUS
 */
public class Trapesium extends BangunDatar implements Geometri {
    double sisiAtas;
    double sisiBawah;
    double sisiMiring;
    double tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double sisiMiring, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
    }
    
    @Override
    public void hitungLuas(){
        luas = 0.5 *(sisiAtas+sisiBawah)*tinggi;
        System.out.println("Luas Trapesium = "+luas);
    }
    
    @Override
    public void hitungKeliling(){
        keliling = tinggi+sisiAtas+sisiBawah+sisiMiring;
        System.out.println("Keliling Trapesium = "+keliling);
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
