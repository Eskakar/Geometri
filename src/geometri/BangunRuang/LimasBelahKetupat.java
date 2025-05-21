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
    protected double volume;
    protected double luasPermukaan;
    protected double tinggi;
    protected double sisiMiring;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double tinggiLimas, double tinggiBelahKetupat) {
        super(diagonal1, diagonal2, "Limas Belah Ketupat");
        this.tinggi = tinggiLimas;
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
