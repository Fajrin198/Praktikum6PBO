package PendahuluanNomor4;

public class BelahKetupat extends BangunDatar implements Geometri {
    double d1;
    double d2;
    double s;

    public BelahKetupat(double d1, double d2, double s) {
        this.d1 = d1;
        this.d2 = d2;
        this.s = s;
    }
    
    @Override
    public void hitungLuas(){
        luas = 0.5*d1*d2;
        System.out.println("Luas Belah Ketupat = "+luas);
    }
    
    @Override
    public void hitungKeliling(){
        keliling = 4*s;
        System.out.println("Keliling Belah Ketupat = "+keliling);
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
