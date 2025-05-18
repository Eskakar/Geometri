/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

import geometri.BangunDatar.Segitiga;

/**
 *
 * @author rahadityaputra
 */
public class LimasSegitiga extends Segitiga {
    private double volume;
    private double luasPermukaan;
    private double tinggiLimas;
    private double alas;

    public LimasSegitiga(double alas, double tinggiLimas, double tinggi, double sisiA, double sisiB, double  sisiC) {
        super(alas, tinggi, sisiA, sisiB, sisiC);
        this.tinggiLimas = tinggiLimas;
        this.alas = alas;
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
