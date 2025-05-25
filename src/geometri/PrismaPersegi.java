/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class PrismaPersegi extends Persegi {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaPersegi(double sisi, double tinggiPrisma) {
        super(sisi);
        this.tinggiPrisma = tinggiPrisma;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + 4 * this.tinggiPrisma * this.sisi;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
