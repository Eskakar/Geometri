/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.PersegiPanjang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaPersegiPanjang extends PersegiPanjang {
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;
    public PrismaPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggi;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + 2 * this.tinggi * this.panjang + 2 * this.tinggi * this.lebar;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
