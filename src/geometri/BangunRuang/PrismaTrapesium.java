/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaTrapesium {
    public double a, b, tinggiTrapesium;
    public PrismaTrapesium(double a, double b, double tinggiTrapesium, double tinggi) {
        super(tinggi);
        this.a = a;
        this.b = b;
        this.tinggiTrapesium = tinggiTrapesium;
    }
    @Override
    public double hitungVolume() {
        return 0.5 * (a + b) * tinggiTrapesium * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * 0.5 * (a + b) * tinggiTrapesium + (a + b + 2 * tinggiTrapesium) * tinggi;
    }
}
