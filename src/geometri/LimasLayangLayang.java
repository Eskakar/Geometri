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
    public double tinggiLimas;
    public double tinggiSisiTegak1;
    public double tinggiSisiTegak2;

    public LimasLayangLayang(double tinggiLimas, double tinggiSisiTegak1, double tinggiSisiTegak2, double diagonal1, double diagonal2, double sisiA, double sisiB) {
        super(diagonal1, diagonal2, sisiA, sisiB, "Limas Layang Layang");
        this.tinggiSisiTegak1  = tinggiSisiTegak1;
        this.tinggiSisiTegak2  = tinggiSisiTegak2;
        this.tinggiLimas = tinggiLimas;
        this.hitungLuasPermukaan();
        this.hitungVolume();
    }

    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggiLimas;
    }

    public void hitungLuasPermukaan() {
        double luasSegitiga1 = (this.sisiA * this.tinggiSisiTegak1) / 2;
        double luasSegitiga2 = (this.sisiB * this.tinggiSisiTegak2) / 2;
        
        // Total luas permukaan = luas alas + jumlah luas semua sisi tegak
        this.luasPermukaan = this.luas + (2 * luasSegitiga1) + (2 * luasSegitiga2);
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
