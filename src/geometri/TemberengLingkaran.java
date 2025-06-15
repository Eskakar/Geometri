package geometri;

public class TemberengLingkaran extends Lingkaran {
  private double luas;
  private double keliling;
  protected double sudutPusat;
  protected double tinggi;
  protected double taliBusur;
  protected double sudut;

  public TemberengLingkaran(double sudutPusat, double tinggi, double taliBusur, double jariJari) {
    super(jariJari, "Tembereng Lingkaran");
    this.sudutPusat = sudutPusat;
    this.tinggi = tinggi;
    this.taliBusur = taliBusur;
  }

  @Override
  public double hitungKeliling() {
    try {
      this.sudut = 2 * Math.acos((super.jariJari - this.tinggi) / super.jariJari);
      this.keliling = sudut * super.jariJari
          + 2 * Math.sqrt(2 * super.jariJari * this.tinggi - this.tinggi * this.tinggi);
      return this.keliling;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung keliling  : " + e.getMessage());
      return 0;
    }
  }

  @Override
  public double hitungLuas() {
    try {
      this.luas = (super.jariJari * super.jariJari * Math.acos((super.jariJari - this.tinggi) / super.jariJari)
          - (super.jariJari - this.tinggi) * Math.sqrt(2 * super.jariJari * this.tinggi - this.tinggi * this.tinggi));
      return this.luas;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung luas  : " + e.getMessage());
      return 0;
    }
  }

  public double hitungKeliling(double jariJariBaru, double tinggiBaru) {
    try {
      this.sudut = 2 * Math.acos((jariJariBaru - tinggiBaru) / jariJariBaru);
      this.keliling = sudut * jariJariBaru 
          + 2 * Math.sqrt(2 * jariJariBaru * tinggiBaru - tinggiBaru * tinggiBaru);
      return this.keliling;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung keliling  : " + e.getMessage());
      return 0;
    }
  }

  public double hitungLuas(double jariJariBaru, double tinggiBaru) {
    try {
      this.luas = (jariJariBaru * jariJariBaru * Math.acos((jariJariBaru - tinggiBaru) / jariJariBaru)
          - (jariJariBaru - tinggiBaru) * Math.sqrt(2 * jariJariBaru * tinggiBaru - tinggiBaru * tinggiBaru));
      return this.luas;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung luas  : " + e.getMessage());
      return 0;
    }
  }
}
