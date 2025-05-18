/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.Persegi;

/**
 *
 * @author rahadityaputra
 */
public class PrismaPersegiPanjang extends PersegiPanjang {
    public double panjang, lebar;
    public PrismaPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume() {
        return super.luas * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * super.panjang * super.lebar + 2 * (super.panjang + super.lebar) * tinggi;
    }
}
