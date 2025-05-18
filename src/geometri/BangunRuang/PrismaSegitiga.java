/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaSegitiga extends BangunRuang {
    public double alas, tinggiSegitiga;
    public PrismaSegitiga(double alas, double tinggiSegitiga, double tinggi) {
        super(tinggi);
        this.alas = alas;
        this.tinggiSegitiga = tinggiSegitiga;
    }
    @Override
    public double hitungVolume() {
        return 0.5 * alas * tinggiSegitiga * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (0.5 * alas * tinggiSegitiga) + 3 * (alas * tinggi);
    }
}
