/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class PrismaLayangLayang extends LayangLayang {
    protected double tinggiPrisma;
    public double volume;
    public double luasPermukaan;
    public PrismaLayangLayang(double d1, double d2,double sisi1, double sisi2, double tinggiPrisma) {
        super(d1, d2, sisi1, sisi2);
        this.tinggiPrisma = tinggiPrisma;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + 2 * this.tinggiPrisma * this.sisiA + 2 * this.tinggiPrisma * this.sisiB;
    }
     public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
