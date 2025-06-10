package geometri;

public class TemberengBola extends Bola {
  protected double tinggi;
  protected double volume;
  protected double luasPermukaan;

  public TemberengBola(double tinggi, double jarijari) {
    super(jarijari);
    this.tinggi = tinggi;
  }

  @Override
  public double hitungVolume() {
    try {
      this.volume = (super.PI * this.tinggi * this.tinggi * (3 * super.jariJari - this.tinggi)) / 3;
      return this.volume;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung volume  : " + e.getMessage());
      return 0;
    }
  }

  @Override
  public double hitungLuasPermukaan() {
    try {
      double luasSelimut = 2 * super.PI * super.jariJari * this.tinggi;
      double jariJariAlas = Math.sqrt(2 * super.jariJari * this.tinggi - Math.pow(this.tinggi, 2));
      double luasALas = super.PI * Math.pow(jariJariAlas, 2);
      this.luasPermukaan = luasSelimut + luasALas;
      return this.luasPermukaan;
    } catch (RuntimeException e) {
      System.err.println("Error menghitung luas permukaan  : " + e.getMessage());
      return 0;
    }

  }
}
