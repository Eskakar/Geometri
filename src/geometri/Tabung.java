package geometri;

public class Tabung extends Lingkaran {
  protected double tinggiTabung;
  protected double volume;
  protected double luasPermukaan;

  public Tabung(double jari, double tinggiTabung) {
    super(jari, "Tabung");
    this.tinggiTabung = tinggiTabung;

  }

  public double hitungVolume() {
    try {
      this.volume = super.hitungLuas() * this.tinggiTabung;
      return this.volume;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung volume  : " + e.getMessage());
      return 0;
    }

  }

  public double hitungLuasPermukaan() {
    try {
      this.luasPermukaan = 2 * super.hitungLuas() + (2 * super.PI * super.jariJari * this.tinggiTabung);
      return this.luasPermukaan;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung luas permukaan  : " + e.getMessage());
      return 0;
    }
  }

  @Override
  public double hitungKeliling() {
    return 0;
  }
  double getVolume(){
      return this.volume;
  }
  double getLuasPermukaan(){
      return this.luasPermukaan;
  }
}
