/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.JajarGenjang;

/**
 *
 * @author rahadityaputra
 */
public class PrismaJajarGenjang extends JajarGenjang{
    private double tinggiAlas;
    public PrismaJajaranGenjang(double alas, double tinggiAlas, double tinggi) {
        super(alas,tinggiAlas )
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume() {
        return super.luas * tinggi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 2 * super.alas * super.tinggiAlas + 2 * (super.alas + super.tinggiAlas) * tinggi;
    }   
}
