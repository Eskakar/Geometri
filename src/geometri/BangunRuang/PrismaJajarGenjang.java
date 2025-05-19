/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.JajarGenjang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaJajarGenjang extends JajarGenjang{
    public double tinggi;
    public double volume;
    public double luasPermukaan;
    public PrismaJajarGenjang(double alas, double tinggiAlas, double tinggi, double sisiMiringAlas) {
        super(alas,tinggiAlas, sisiMiringAlas);
        this.tinggi = tinggi;
    }
    public void hitungVolume() {
        double luasAlas = super.luas;
        this.volume = luasAlas * tinggi;
    }
    public void hitungLuasPermukaan() {
        double tinggiAlas = super.tinggi;
        double alasJajarGenjang = super.alas;
        this.luasPermukaan = 2 * alasJajarGenjang * tinggiAlas + 2 * (alasJajarGenjang + tinggiAlas) * tinggi;
    }   
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
