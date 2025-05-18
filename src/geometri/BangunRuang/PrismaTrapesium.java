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
    public PrismaTrapesium(double sisiA, double sisiB, double sisiC, double sisiD, double tinggiTrapesium, double tinggi,String Nama) {
        super(sisiA, sisiB, sisiC, sisiC, tinggiTrapesium,Nama);
        this.tinggi = tinggi;
    }
    public void hitungVolume() { 
        this.volume = 0;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 0;
    }
}
