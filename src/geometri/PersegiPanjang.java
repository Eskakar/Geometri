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
        this.hitungLuas();
        this.hitungKeliling();
    }

    @Override
    public void hitungKeliling() {
        this.keliling = 2 * (this.panjang + this.lebar);
    }
    @Override
    public void hitungLuas() {
        this.luas = this.panjang * this.lebar;
    }
}
