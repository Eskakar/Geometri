package geometri;

public class PersegiPanjang extends BangunDatar {
    protected double panjang;
    protected double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this(panjang, lebar, "Persegi Panjang");
    }

    public PersegiPanjang(double panjang, double lebar, String nama) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = 2 * (this.panjang + this.lebar);
        return this.keliling;
    }

    @Override
    public double hitungLuas() {
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
}
