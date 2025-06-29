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
    // sebenarnya ga butuh alas sama tinggi, kita tahu 3 sisi bisa cari luas
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
      if (!isValidTriangle()) {
        throw new IllegalArgumentException("Sisi-sisi tidak membentuk segitiga yang valid.");
      }
      super.keliling = this.sisiA + this.sisiB + this.sisiC;
      //System.err.println("Ini biasa");
      return super.keliling;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung keliling  : " + e.getMessage());
      return 0;
    }
  }

  @Override
  public double hitungLuas() {
    try {
      double s = hitungKeliling() / 2;
      super.luas = Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
      //System.err.println("Ini biasa");
      return super.luas;

    } catch (RuntimeException e) {
      System.err.println("Error menghitung luas  : " + e.getMessage());
      return 0;
    }
  }

  public double hitungLuas(double alasBaru, double tinggiBaru) {
    try {
      super.luas = 0.5 * alasBaru * tinggiBaru;
      //System.err.println("Ini Overloading");
      return super.luas;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung luas  : " + e.getMessage());
      return 0;
    }
  }

  public double hitungKeliling(Double sisiA,Double sisiB,Double sisiC){
      try {
      if (!isValidTriangle()) {
        throw new IllegalArgumentException("Sisi-sisi tidak membentuk segitiga yang valid.");
      }
      //System.err.println("Ini Overloading");
      super.keliling = sisiA + sisiB + sisiC;
      return super.keliling;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung keliling  : " + e.getMessage());
      super.keliling = sisiA + sisiB + sisiC;
      return super.keliling;
    }
  }

  public boolean isValidTriangle() {
    boolean ok = (sisiA + sisiB > sisiC) && (sisiA + sisiC > sisiB) && (sisiB + sisiC > sisiA);
    return ok;
  }

}
