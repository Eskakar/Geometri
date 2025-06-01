package geometri;

public class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi(double sisi) {
        this(sisi, "Persegi");
    }

    public Persegi(double sisi, String nama) {
        super(nama);
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        this.luas = this.sisi * this.sisi;
        return this.luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = 4 * this.sisi;
        return this.keliling;
    }
}
