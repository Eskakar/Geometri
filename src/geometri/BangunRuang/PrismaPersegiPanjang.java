/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaPersegiPanjang {
    public double panjang, lebar;
    public PrismaPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(tinggi);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * panjang * lebar + 2 * (panjang + lebar) * tinggi;
    }
}
