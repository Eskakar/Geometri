/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author rahadityaputra
 */
public class PrismaJajarGenjang extends JajarGenjang{
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;
    public PrismaJajarGenjang(double alas, double tinggiAlas, double tinggiPrisma, double sisiMiringAlas) {
        super(alas,tinggiAlas, sisiMiringAlas);
        this.tinggiPrisma = tinggiPrisma;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    public void hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
    }
    public void hitungLuasPermukaan() {
        double tinggiAlas = super.tinggi;
        double alasJajarGenjang = super.alas;
        this.luasPermukaan = 2 * alasJajarGenjang * tinggiAlas + 2 * (alasJajarGenjang + tinggiAlas) * tinggiPrisma;
    }   
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
