package geometri;

public class Lingkaran extends BangunDatar {
  protected double jariJari;
  protected final double PI = 3.14;

  public Lingkaran(double jariJari) {
    this(jariJari, "Lingkaran");
  }

  public Lingkaran(double jariJari, String nama) {
    super(nama);
    this.jariJari = jariJari;
  }

  @Override
  public double hitungKeliling() {
    try {
      super.keliling = 2 * this.PI * this.jariJari;
      return super.keliling;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung keliling  : " + e.getMessage());
      return 0;
    }
  }

  @Override
  public double hitungLuas() {
    try {
      super.luas = this.PI * this.jariJari * this.jariJari;
      return super.luas;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung luas  : " + e.getMessage());
      return 0;
    }
  }

  public double hitungKeliling(int diameter) {
    try {
      super.keliling = this.PI * diameter;
      return super.keliling;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung keliling  : " + e.getMessage());
      return 0;
    }
  }

  public double hitungLuas(int jariJariBaru) {
    try {
      super.luas = this.PI * jariJariBaru * jariJariBaru; 
      return super.luas;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung luas  : " + e.getMessage());
      return 0;
    }
  }
}
