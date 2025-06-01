package geometri;

public class JajarGenjang extends BangunDatar {

    protected double alas;
    protected double tinggi;
    protected double sisiMiring;

    public JajarGenjang(double alas, double tinggi, double sisiMiring, String nama) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        this(alas, tinggi, sisiMiring, "Jajar Genjang");
    }

    @Override
    public double hitungKeliling() {
        super.keliling =  2 * (this.alas + this.sisiMiring);
        return super.keliling;
    }

    @Override
    public double hitungLuas() {
        super.luas =  this.alas * this.tinggi;
        return super.luas;
    }
}
