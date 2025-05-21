/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.Trapesium;

/**
 *
 * @author rahadityaputra
 */
public class PrismaTrapesium extends Trapesium {
    public double tinggi;
    public double volume;
    public double luasPermukaan;
    public PrismaTrapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggiTrapesium, double tinggi,String Nama) {
        super(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggiTrapesium,Nama);
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }
    public void hitungVolume() { 
        this.volume = this.luas * this.tinggi;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + this.sisiAtas * this.tinggi + this.tinggi * this.sisiBawah + this.sisiKanan * this.tinggi + this.sisiKiri * this.tinggi;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
