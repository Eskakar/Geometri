package geometri.BangunDatar;
import geometri.Geometri;
public abstract class BangunDatar implements Geometri {

    private double keliling;

    private double luas;

    private String Nama;

    public void BangunDatar(String Nama) {
    }

    public String getNama() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public abstract void hitungKeliling();

    public abstract void hitungLuas();
}
