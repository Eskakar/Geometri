package geometri;

public class Segitiga extends BangunDatar implements Runnable {
    protected double alas;
    protected double tinggi;
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;
    private Thread thread;

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
        
        thread = new Thread(this);
        thread.start();
    }

   @Override

    public double hitungKeliling() {
        this.keliling = this.sisiA + this.sisiB + this.sisiC;
        return this.luas;
    }

    @Override
    public double hitungLuas() {
        this.luas = 0.5 * this.alas * this.tinggi;
        return this.luas;
    }
    
    @Override
    public void run() {
        hitungKeliling();
        hitungLuas();
    }
}

