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
    }

   @Override

    public double hitungKeliling() {
        try {
            super.keliling = this.sisiA + this.sisiB + this.sisiC;
            return super.keliling;
        } catch (RuntimeException e) {
          System.err.println("Error menghitung keliling  : " + e.getMessage());
          return 0;
        }
    }

    @Override
    public double hitungLuas() {
        try {
            super.luas = 0.5 * this.alas * this.tinggi;
            return super.luas;
        } catch (RuntimeException e) {
          System.err.println("Error menghitung luas  : " + e.getMessage());
          return 0;
        }
    }
    
    public boolean isValidTriangle() {
    boolean ok = (sisiA + sisiB > sisiC) && (sisiA + sisiC > sisiB) && (sisiB + sisiC > sisiA);
    return ok;
}

}

