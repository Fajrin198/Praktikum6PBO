package PendahuluanNomor4;

public class PersegiPanjang extends BangunDatar implements Geometri {

    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public void hitungKeliling() {
        keliling = (2*panjang) + (2*lebar);
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }

    @Override
    public void hitungLuas() {
        luas = panjang * lebar;
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
