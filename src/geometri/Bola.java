/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

public class Bola extends Lingkaran {
  protected double volume;
  protected double luasPermukaan;

  public Bola(double jariJari) {
    this(jariJari, "Bola");
  }

  public Bola(double jariJari, String nama) {
    super(jariJari, nama);
  }

  public double hitungVolume() {
    try {
      this.volume = (4.0 / 3) * super.PI * Math.pow(super.jariJari, 3);
      return this.volume;
    } catch (Exception e) {
        System.err.println("Error menghitung volume: " + e.getMessage());
        return 0;
    }
  }

  public double hitungLuasPermukaan() {
    try {
      this.luasPermukaan = 4 * super.PI * super.jariJari * super.jariJari;
      return this.luasPermukaan;
    } catch (Exception e) {
        System.err.println("Error menghitung luas permukaan: " + e.getMessage());
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
