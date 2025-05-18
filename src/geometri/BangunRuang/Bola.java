/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class Bola extends BangunRuang {
    public double jari;
    Bola(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungVolume() {
        return (4.0/3) * Math.PI * Math.pow(jari, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jari * jari;
    }
}
