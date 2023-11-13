/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PendahuluanNomor4;

/**
 *
 * @author MY ASUS
 */
public class JajarGenjang extends BangunDatar implements Geometri {
    double alas;
    double tinggi;
    double sisiMiring;

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }
    
    @Override
    public void hitungLuas(){
        luas = alas*tinggi;
        System.out.println("Luas Jajar Genjang = "+luas);
    }
    
    @Override
    public void hitungKeliling(){
        keliling = (2*alas)+(2*tinggi);
        System.out.println("Luas Jajar Genjang = "+keliling);
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
