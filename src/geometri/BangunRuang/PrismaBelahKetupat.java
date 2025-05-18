/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.BelahKetupat;

/**
 *
 * @author rahadityaputra
 */
public class PrismaBelahKetupat extends BelahKetupat {
    private double tinggi;
    public PrismaBelahKetupat(double d1, double d2, double tinggi) {
        super(double d1, double d2);
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume() {
        return 0.5 * super.luas * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        double sisi = Math.sqrt(Math.pow(d1/2, 2) + Math.pow(d2/2, 2));
        return 2 * 0.5 * super.d1 * super.d2 + 4 * sisi * tinggi;
    }  
}
