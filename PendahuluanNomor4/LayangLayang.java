package PendahuluanNomor4;

public class LayangLayang extends BangunDatar implements Geometri {
    double d1;
    double d2;
    double sisiMiringAtas;
    double sisiMiringBawah;

    public LayangLayang(double d1, double d2, double sisiMiringAtas, double sisiMiringBawah) {
        this.d1 = d1;
        this.d2 = d2;
        this.sisiMiringAtas = sisiMiringAtas;
        this.sisiMiringBawah = sisiMiringBawah;
    }
    
    @Override
    public void hitungLuas(){
        luas = 0.5*d1*d2;
        System.out.println("Luas Layang-Layang = "+luas);
    }
    
    @Override
    public void hitungKeliling(){
        keliling = (sisiMiringAtas*2)+(sisiMiringBawah*2);
        System.out.println("Keliling Layang-Layang = "+keliling);
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
