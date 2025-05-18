/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.Trapesium;

/**
 *
 * @author rahadityaputra
 */
public class PrismaTrapesium extends Trapesium {
    public double a, b, tinggiTrapesium;
    public PrismaTrapesium(double a, double b, double tinggiTrapesium, double tinggi) {
        super(a, b, tinggiTrapesium);
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume() {
        return super.luas * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * 0.5 * (super.a + super.b) * super.tinggiTrapesium + (super.a + super.b + 2 * super.tinggiTrapesium) * tinggi;
    }
}
