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
    private double volume;
    private double luasPermukaan;
    private double tinggiLimas;
    private double tinggiBelahKetupat;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double tinggiLimas, double tinggiBelahKetupat, double sisi) {
        super(diagonal1, diagonal2, sisi);
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
