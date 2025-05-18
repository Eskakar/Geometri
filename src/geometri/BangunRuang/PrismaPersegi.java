/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaPersegi extends PrismaPersegiPanjang {
     private double sisi;
    public PrismaPersegi(double sisi, double tinggi) {
        super(tinggi);
        this.sisi = sisi;
    }
    @Override
    public double hitungVolume() {
        return sisi * sisi * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * sisi * sisi + 4 * sisi * tinggi;
    }
}
