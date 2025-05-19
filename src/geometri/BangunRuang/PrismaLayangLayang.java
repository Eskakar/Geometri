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
public class PrismaLayangLayang extends LayangLayang {
    protected double tinggi;
    public double volume;
    public double luasPermukaan;
    public PrismaLayangLayang(double d1, double d2,double sisi1, double sisi2, double tinggi) {
        super(d1, d2, sisi1, sisi2);
        this.tinggi = tinggi;
    }
    public void hitungVolume() {
        this.volume = 0.5 * super.luas * tinggi;
    }
    public void hitungLuasPermukaan() {
        // rumus belum ditulis
        this.luasPermukaan = 0;
    }
     public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
