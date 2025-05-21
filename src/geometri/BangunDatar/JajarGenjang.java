package geometri.BangunDatar;

public class JajarGenjang extends BangunDatar {

    protected double alas;
    protected double tinggi;
    protected double sisiMiring;

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        this(alas, tinggi, sisiMiring, "Jajar Genjang");
    }
    public JajarGenjang(double alas, double tinggi, double sisiMiring, String nama) {
        super(nama);
        this.hitungLuas();
        this.hitungKeliling();
    }
    @Override
    public void hitungKeliling() {
        this.keliling =  2 * (this.alas + this.sisiMiring);
    }
    @Override
    public void hitungLuas() {
        this.luas =  this.alas * this.tinggi;
    }
}
