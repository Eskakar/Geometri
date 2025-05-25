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
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;
    public PrismaBelahKetupat(double d1, double d2, double tinggiPrisma) {
        super(d1, d2);
        this.tinggiPrisma = tinggiPrisma;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
    }
    public void hitungLuasPermukaan() {
        double diagonalAlas1 = super.diagonal1;
        double diagonalAlas2 = super.diagonal2;
        double sisi = Math.sqrt(Math.pow(diagonalAlas1/2, 2) + Math.pow(diagonalAlas2/2, 2));
        this.luasPermukaan = 2 * 0.5 * diagonalAlas1 * diagonalAlas2 + 4 * sisi * this.tinggiPrisma;
    }  
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
