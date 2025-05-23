/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

import geometri.BangunDatar.LayangLayang;

/**
 *
 * @author rahadityaputra
 */

public class LimasLayangLayang extends LayangLayang {
    private double volume;
    private double luasPermukaan;
    private double tinggiLimas;
    private double tinggiSisiTegak1;
    private double tinggiSisiTegak2;

    public LimasLayangLayang(double tinggiLimas, double tinggiSisiTegak1, double tinggiSisiTegak2, double diagonal1, double diagonal2, double sisi1, double sisi2) {
        super(diagonal1, diagonal2, sisi1, sisi2);
        this.tinggiSisiTegak1  = tinggiSisiTegak1;
        this.tinggiSisiTegak2  = tinggiSisiTegak2;
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
