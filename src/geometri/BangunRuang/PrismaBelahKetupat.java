/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.BelahKetupat;

/**
 *
 * @author rahadityaputra
 */
public class PrismaBelahKetupat extends BelahKetupat {
    public double tinggi;
    public double volume;
    public double luasPermukaan;
    public PrismaBelahKetupat(double d1, double d2, double sisiBelahKetupat, double tinggi) {
        super(d1, d2, sisiBelahKetupat);
        this.tinggi = tinggi;
    }
    public void hitungVolume() {
        double luasAlas = super.luas;
        this.volume = 0.5 * luasAlas * this.luasPermukaan;
    }
    public void hitungLuasPermukaan() {
        double diagonalAlas1 = super.diagonal1;
        double diagonalAlas2 = super.diagonal2;
        double sisi = Math.sqrt(Math.pow(diagonalAlas1/2, 2) + Math.pow(diagonalAlas2/2, 2));
        this.luasPermukaan = 2 * 0.5 * diagonalAlas1 * diagonalAlas2 + 4 * sisi * this.tinggi;
    }  
}
