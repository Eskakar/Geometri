package geometri;

public class Lingkaran extends BangunDatar {

    protected double jariJari;
    protected final double PI = 3.14;

    public Lingkaran(double jariJari) {
        this(jariJari, "Lingkaran");
    }

    public Lingkaran(double jariJari, String nama) {
        super(nama);
        this.jariJari = jariJari;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = this.PI * this.jariJari * this.jariJari;
        return this.keliling;
    }
     @Override
    public double hitungLuas() {
        this.luas = this.PI * this.jariJari * this.jariJari;
        return this.luas;
    }
}
