package geometri;

public abstract class BangunDatar implements Geometri {
    protected double keliling;
    protected double luas;
    protected String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    @Override
    public abstract double hitungKeliling();

    @Override
    public abstract double hitungLuas();

    public double getLuas() {
        return this.luas;
    }
    public double getKeliling() {
        return this.keliling;
    }
}
