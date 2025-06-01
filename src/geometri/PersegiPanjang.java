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
        super.keliling = 2 * (this.panjang + this.lebar);
        return super.keliling;
    }

    @Override
    public double hitungLuas() {
        super.luas = this.panjang * this.lebar;
        return super.luas;
    }
}
