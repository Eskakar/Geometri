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
        super.luas = this.sisi * this.sisi;
        return super.luas;
    }

    @Override
    public double hitungKeliling() {
        super.keliling = 4 * this.sisi;
        return super.keliling;
    }
}
