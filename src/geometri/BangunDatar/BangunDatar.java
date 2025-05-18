package geometri.BangunDatar;
import geometri.Geometri;
public abstract class BangunDatar implements Geometri {

    protected double keliling;

    protected double luas;

    protected String nama;

    public  BangunDatar(String nama) {

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
