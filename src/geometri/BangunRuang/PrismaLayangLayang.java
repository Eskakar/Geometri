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
        this.hitungLuas();
        this.hitungKeliling();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggi;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + 2 * this.tinggi * this.sisiA + 2 * this.tinggi * this.sisiB;
    }
     public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
