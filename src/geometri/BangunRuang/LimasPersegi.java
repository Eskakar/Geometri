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
    private double volume;
    private double luasPermukaan;
    private double tinggiLimas;
    // perlu sisi tinggal sisi

    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
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
