package geometri.BangunDatar;
import geometri.Geometri;
public abstract class BangunDatar implements Geometri {

    double keliling;

    double luas;

    String Nama;

    public BangunDatar(String Nama) {
    }
    @Override
    public String getNama() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public abstract void hitungKeliling();
    @Override
    public abstract void hitungLuas();
}
