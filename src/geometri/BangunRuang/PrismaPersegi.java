/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaPersegi extends Persegi {
     private double tinggi;
    public PrismaPersegi(double sisi, double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return super.luas * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * super.sisi * super.sisi + 4 * super.sisi * tinggi;
    }
}
