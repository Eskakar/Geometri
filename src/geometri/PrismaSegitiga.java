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
    protected double tinggiPrisma; 
    protected double volume;
    protected double luasPermukaan;
    public PrismaSegitiga(double alas, double tinggiSegitiga, double tinggiPrisma, double sisiA, double sisiB, double sisiC) {
        super(alas, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggiPrisma = tinggiPrisma;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    public void hitungVolume() { 
        this.volume = this.luas * this.tinggiPrisma;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + this.sisiA * this.tinggiPrisma + this.tinggiPrisma * this.sisiB + this.sisiC * this.tinggiPrisma;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
