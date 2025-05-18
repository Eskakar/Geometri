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
public class LimasJajarGenjang extends JajarGenjang {
    public double volume;
    public double luasPermukaan;

    public LimasJajarGenjang(double tinggiJajarGenjang, double alasJajarGenjang, double alas, double tinggi, double sisiMiring) {
        super(alasJajarGenjang, tinggiJajarGenjang, sisiMiring);
        this.tinggi = tinggi;
    }
    
    public void hitungVolume() {
    }

    public void hitungLuasPermukaan() {
    }
    
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
