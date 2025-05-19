/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

import geometri.BangunDatar.PersegiPanjang;

/**
 *
 * @author rahadityaputra
 */
public class LimasPersegiPanjang extends PersegiPanjang {
    public double volume;
    public double luasPermukaan;
    public double tinggi;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
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
