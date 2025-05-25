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
    protected double tinggiPrisma;
    protected double volume;
    protected double luasPermukaan;
    public Tabung(double jari, double tinggiPrisma) {
        super(jari, "Tabung");
        this.tinggiPrisma = tinggiPrisma;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;

    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + (2 * this.PI * this.jariJari * this.tinggiPrisma) ;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
