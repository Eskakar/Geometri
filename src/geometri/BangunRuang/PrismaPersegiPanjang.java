/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.PersegiPanjang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaPersegiPanjang extends PersegiPanjang {
    public double panjang;
    public double lebar;
    public double tinggi;
    public double volume;
    public double luasPermukaan;
    public PrismaPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    public void hitungVolume() {
        //belum diimplentasikan
        this.volume = 0;
    }
    public void hitungLuasPermukaan() {
        //belum diimplementasikan
        this.luasPermukaan =  0;
    }
}
