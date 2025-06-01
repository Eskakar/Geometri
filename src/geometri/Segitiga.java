package geometri;

public class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;
    
    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

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
    }

   @Override

    public double hitungKeliling() {
        super.keliling = this.sisiA + this.sisiB + this.sisiC;
        return super.keliling;
    }

    @Override
    public double hitungLuas() {
        super.luas = 0.5 * this.alas * this.tinggi;
        return super.luas;
    }
}

