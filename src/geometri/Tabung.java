/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class Tabung extends Lingkaran {
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;
    public Tabung(double jari, double tinggiPrisma, double tinggi) {
        super(jari, "Tabung");
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggi;

    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + (2 * this.PI * this.jariJari * this.tinggi) ;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
