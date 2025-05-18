package geometri.BangunDatar;
import geometri.Geometri;

public abstract class BangunDatar implements Geometri {
    protected double keliling;
    protected double luas;
    public String Nama;

    public void BangunDatar(String Nama) {
    }
    public abstract void hitungKeliling();
    public abstract void hitungLuas();
    
}
