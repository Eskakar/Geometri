/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class PrismaBelahKetupat extends BelahKetupat {
    public double tinggi;
    public double volume;
    public double luasPermukaan;
    public PrismaBelahKetupat(double d1, double d2, double tinggi) {
        super(d1, d2);
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggi;
    }
    public void hitungLuasPermukaan() {
        double diagonalAlas1 = super.diagonal1;
        double diagonalAlas2 = super.diagonal2;
        double sisi = Math.sqrt(Math.pow(diagonalAlas1/2, 2) + Math.pow(diagonalAlas2/2, 2));
        this.luasPermukaan = 2 * 0.5 * diagonalAlas1 * diagonalAlas2 + 4 * sisi * this.tinggi;
    }  
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
