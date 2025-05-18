/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaLayangLayang {
    public double d1, d2;
    public PrismaLayangLayang(double d1, double d2, double tinggi) {
        super(tinggi);
        this.d1 = d1;
        this.d2 = d2;
    }
    @Override
    public double hitungVolume() {
        return 0.5 * d1 * d2 * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * 0.5 * d1 * d2 + 4 * ((d1 + d2)/4) * tinggi;
    }
}
