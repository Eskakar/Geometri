/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class PrismaSegitiga extends Segitiga {
    protected double tinggi; 
    protected double volume;
    protected double luasPermukaan;
    public PrismaSegitiga(double alas, double tinggiSegitiga, double tinggi, double sisiA, double sisiB, double sisiC) {
        super(alas, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }
    public void hitungVolume() { 
        this.volume = this.luas * this.tinggi;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + this.sisiA * this.tinggi + this.tinggi * this.sisiB + this.sisiC * this.tinggi;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
