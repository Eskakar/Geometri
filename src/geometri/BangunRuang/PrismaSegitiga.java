/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.Segitiga;

/**
 *
 * @author rahadityaputra
 */
public class PrismaSegitiga extends Segitiga {
    public double alas, tinggiSegitiga;
    public PrismaSegitiga(double alas, double tinggiSegitiga, double tinggi) {
        super(alas, tinggiSegitiga);
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume() {
        return 0.5 * super.luas * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (0.5 * super.alas * super.tinggiSegitiga) + 3 * (super.alas * super.tinggi);
    }
}
