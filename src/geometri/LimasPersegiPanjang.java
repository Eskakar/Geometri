/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class LimasPersegiPanjang extends PersegiPanjang {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, "Limas Persegi Panjang");
        this.tinggiLimas = tinggiLimas;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggiLimas;

    }

    public void hitungLuasPermukaan() {
        double tinggiSisiMiring1 = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(this.panjang / 2, 2));
        double tinggiSisiMiring2 = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(this.lebar / 2, 2));
        this.luasPermukaan = this.luas + (tinggiSisiMiring1 * this.panjang ) + (tinggiSisiMiring2 * this.lebar);

    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
