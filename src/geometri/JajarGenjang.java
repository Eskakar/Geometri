package geometri;

public class JajarGenjang extends BangunDatar {

    protected double alas;
    protected double tinggi;
    protected double sisiMiring;

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        this(alas, tinggi, sisiMiring, "Jajar Genjang");
    }
    public JajarGenjang(double alas, double tinggi, double sisiMiring, String nama) {
        super(nama);
    }
    @Override
    public double hitungKeliling() {
        this.keliling =  2 * (this.alas + this.sisiMiring);
        return this.keliling;
    }
    @Override
    public double hitungLuas() {
        this.luas =  this.alas * this.tinggi;
        return this.luas;
    }
}
