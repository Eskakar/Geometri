/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class PrismaPersegiPanjang extends PersegiPanjang {
    protected double tinggiPrisma;
    protected double volume;
    protected double luasPermukaan;
    public PrismaPersegiPanjang(double panjang, double lebar, double tinggiPrisma) {
        super(panjang, lebar);
        this.tinggiPrisma = tinggiPrisma;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + 2 * this.tinggiPrisma * this.panjang + 2 * this.tinggiPrisma * this.lebar;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
