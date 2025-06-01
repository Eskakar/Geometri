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

    public Trapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggi, String Nama) {
        super("Trapesium");
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKanan = sisiKanan;
        this.sisiKiri = sisiKiri;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        super.keliling = this.sisiAtas + this.sisiBawah + this.sisiKanan + this.sisiKiri;
        return super.keliling;
    }

    @Override
    public double hitungLuas() {
        super.luas = 0.5 * (this.sisiAtas + this.sisiBawah) * this.tinggi;
        return super.luas;
    }
}
