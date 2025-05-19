/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

import geometri.BangunDatar.Lingkaran;

/**
 *
 * @author rahadityaputra
 */
public class Bola extends Lingkaran {
    protected double volume;
    protected double luasPermukaan;

    Bola(double jariJari) {
        super(jariJari);
    }

    public void hitungVolume() {
        this.volume = (4.0/3) * Math.PI * Math.pow(jariJari, 3);
    }

    public void hitungLuasPermukaan() {
        this.luasPermukaan = 4 * Math.PI * jariJari * jariJari;
    }
    
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
