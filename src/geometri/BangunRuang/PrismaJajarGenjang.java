/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaJajarGenjang {
    public double alas, tinggiAlas;
    public PrismaJajaranGenjang(double alas, double tinggiAlas, double tinggi) {
        super(tinggi);
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
    }
    @Override
    public double hitungVolume() {
        return alas * tinggiAlas * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * alas * tinggiAlas + 2 * (alas + tinggiAlas) * tinggi;
    }   
}
