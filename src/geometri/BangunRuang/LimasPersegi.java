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
public class LimasPersegi extends Persegi {
    public double volume;
    public double luasPermukaan;
    public double tinggi;

    public LimasPersegi(double sisi, double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
    }

    public void hitungVolume() {
    }

    public void hitungLuasPermukaan() {

    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
