/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class TemberengBola {
     private double jari, tinggi;
    public TemberengBola(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    public double hitungVolume() {
        return (Math.PI * tinggi * tinggi * (3*jari - tinggi)) / 3;
    }
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jari * tinggi;
    }
}
