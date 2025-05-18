/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class Tabung {
    public double jari, tinggi, tinggiPrisma;
    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume() {
        return Math.PI * jari * jari * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }
}
