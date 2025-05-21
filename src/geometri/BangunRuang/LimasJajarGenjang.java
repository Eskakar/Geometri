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
        super(alasJajarGenjang, tinggiJajarGenjang, sisiMiring, "Limas Jajar Genjang");
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }
    
    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggi;
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
