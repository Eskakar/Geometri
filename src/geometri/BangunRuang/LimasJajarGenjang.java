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
    private double volume;
    private double luasPermukaan;
    private double tinggiLimas;
    private double tinggiJajarGenjang;
    private double alasJajarGenjang;

    public LimasJajarGenjang(double tinggiLimas, double tinggiJajarGenjang, double alasJajarGenjang, double alas, double tinggi, double sisiMiring) {
        super(alas, tinggi, sisiMiring);
        this.tinggiLimas = tinggiLimas;
        this.tinggiJajarGenjang = tinggiJajarGenjang;
        this.alasJajarGenjang = alasJajarGenjang;
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
