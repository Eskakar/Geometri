/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class TemberengBola extends Bola{
     protected double tinggi;
     protected double volume;
     protected double luasPermukaan;
    public TemberengBola(double jari, double tinggi,double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }

    @Override
    public void hitungVolume() {
        this.volume = (this.PI * this.tinggi * this.tinggi * (3 * this.jariJari - this.tinggi)) / 3;
    }
    @Override
    public void hitungLuasPermukaan() {
        double luasSelimut = 2 * this.PI * this.jariJari * this.tinggi;
        double jariJariAlas = Math.sqrt(2 * this.jariJari * this.tinggi - Math.pow(this.tinggi, 2));
        double luasALas = this.PI * Math.pow(jariJariAlas, 2);
        this.luasPermukaan = luasSelimut + luasALas;

    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
