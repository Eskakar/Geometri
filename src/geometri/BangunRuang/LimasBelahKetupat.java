/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

import geometri.BangunDatar.BelahKetupat;

/**
 *
 * @author rahadityaputra
 */

public class LimasBelahKetupat extends BelahKetupat {
    public double volume;
    public double luasPermukaan;
    public double tinggi;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double tinggiLimas, double tinggiBelahKetupat, double sisi) {
        super(diagonal1, diagonal2, sisi);
        this.tinggi = tinggiLimas;
    }
    
    public void hitungVolume() {
        
    }

    public void hitungLuasPermukaan() {
        
    }
}
