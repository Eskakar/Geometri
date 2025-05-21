package geometri;

public class Trapesium extends BangunDatar {

    protected double sisiAtas;
    protected double sisiBawah;
    protected double sisiKanan;
    protected double sisiKiri;
    protected double tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggi) {
        this(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggi, "Trapesium");
    }

    public Trapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggi,String Nama) {
        super("Trapesium");
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKanan = sisiKanan;
        this.sisiKiri = sisiKiri;
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }
    @Override
    public void hitungKeliling() {
        this.keliling = this.sisiAtas + this.sisiBawah + this.sisiKanan + this.sisiKiri;
    }
     @Override
    public void hitungLuas() {
        this.luas = 0.5 * (this.sisiAtas + this.sisiBawah) * this.tinggi;
    }
}
