/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class TemberengBola extends Bola{
     public double tinggi, volume, luasPermukaan;
    public TemberengBola(double jari, double tinggi,double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
    }
    @Override
    public void hitungVolume() {
        this.volume = 0;
    }
    @Override
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 0;
    }
}
