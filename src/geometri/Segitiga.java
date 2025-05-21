package geometri;

public class Segitiga extends BangunDatar {

    protected double alas;
    protected double tinggi;
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this(alas, tinggi, sisiA, sisiB, sisiC, "Segitiga");
    }
    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC, String nama) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.hitungLuas();
        this.hitungKeliling();
    }

   @Override
    public void hitungKeliling() {
        this.keliling = this.sisiA + this.sisiB + this.sisiC;
    }
    @Override
    public void hitungLuas() {
        this.luas = 0.5 * this.alas * this.tinggi;
    }
}
