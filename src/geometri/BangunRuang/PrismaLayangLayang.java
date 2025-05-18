/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.LayangLayang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaLayangLayang extends LayangLayang {
    protected double tinggi;
    public PrismaLayangLayang(double d1, double d2, double tinggi) {
        super(d1, d2, );
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume() {
        return 0.5 * super.luas * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * 0.5 * super.d1 * super.d2 + 4 * ((super.d1 +super.d2)/4) * tinggi;
    }
}
