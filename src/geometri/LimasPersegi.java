/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class LimasPersegi extends Persegi {
    public double volume;
    public double luasPermukaan;
    public double tinggi;
    protected double tinggiSisiMiring;

    public LimasPersegi(double sisi, double tinggi) {
        super(sisi, "Limas Persegi");
        this.tinggi = tinggi;
        this.hitungTinggiSisiMiring();
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }


    private void hitungTinggiSisiMiring() {
        this.tinggiSisiMiring = Math.sqrt(Math.pow(this.tinggi, 2) + Math.pow(this.sisi / 2, 2));
    }

    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggi;
    }

    public void hitungLuasPermukaan() {
        this.luasPermukaan = this.luas + (4 * 0.5 * this.sisi * this.tinggiSisiMiring);
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
