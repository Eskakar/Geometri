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
    public double jari, tinggi;
    public Tabung(double jari, double tinggiPrisma) {
        super(jari)
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume() {
        return super.luas * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * super.jari * (super.jari + tinggi);
    }
}
