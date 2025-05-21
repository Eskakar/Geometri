/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.Persegi;

/**
 *
 * @author rahadityaputra
 */
public class PrismaPersegi extends Persegi {
    public double tinggi;
    public double volume;
    public double luasPermukaan;

    public PrismaPersegi(double sisi, double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggi;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + 4 * this.tinggi * this.sisi;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
