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
    public double volume;
    public double luasPermukaan;
    public double tinggi;

    public LimasSegitiga(double alas, double tinggiLimas, double tinggi, double sisiA, double sisiB, double  sisiC) {
        super(alas, tinggi, sisiA, sisiB, sisiC);
        this.tinggi = tinggi;
    }

    public void hitungVolume() {

    }

    public void hitungLuasPermukaan() {

    }
}
