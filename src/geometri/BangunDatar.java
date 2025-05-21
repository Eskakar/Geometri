package geometri;

public abstract class BangunDatar implements Geometri {
    protected double keliling;
    protected double luas;
    protected String nama;
    public  BangunDatar(String nama) {
        this.nama = nama;
    }
    public abstract void hitungKeliling();
    @Override
    public abstract void hitungLuas();

    public double getLuas() {
        return this.luas;
    }
    public double getKeliling() {
        return this.keliling;
    }
}
