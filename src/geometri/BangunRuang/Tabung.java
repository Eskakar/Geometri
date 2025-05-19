/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.Lingkaran;

/**
 *
 * @author rahadityaputra
 */
public class Tabung extends Lingkaran {
    public double tinggi;
    public double volume;
    public double luasPermukaan;
    public Tabung(double jari, double tinggiPrisma, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    public void hitungVolume() {
        this.volume = 0;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 0;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
