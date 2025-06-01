/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

public class Bola extends Lingkaran {
  protected double volume;
  protected double luasPermukaan;

  Bola(double jariJari) {
    this(jariJari, "Bola");
  }

  Bola(double jariJari, String nama) {
    super(jariJari, nama);
    super.keliling = 0;
    super.luas = 0;
  }

  public double hitungVolume() {
    this.volume = (4.0 / 3) * super.PI * Math.pow(super.jariJari, 3);
    return this.volume;
  }

  public double hitungLuasPermukaan() {
    this.luasPermukaan = 4 * super.PI * super.jariJari * super.jariJari;
    return this.luasPermukaan;
  }
  @Override
  public double hitungKeliling() {
    return 0;
  }

}
