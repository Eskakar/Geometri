/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;


/**
 *
 * @author rahadityaputra
 */

public class LimasLayangLayang extends LayangLayang {
    public double volume;
    public double luasPermukaan;
    public double tinggi;
    public double tinggiSisiTegak1;
    public double tinggiSisiTegak2;

    public LimasLayangLayang(double tinggi, double tinggiSisiTegak1, double tinggiSisiTegak2, double diagonal1, double diagonal2, double sisi1, double sisi2) {
        super(diagonal1, diagonal2, sisi1, sisi2, "Limas Layang Layang");
        this.tinggiSisiTegak1  = tinggiSisiTegak1;
        this.tinggiSisiTegak2  = tinggiSisiTegak2;
        this.tinggi = tinggi;
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
