/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;
import geometri.BangunDatar.Segitiga;

/**
 *
 * @author rahadityaputra
 */
public class PrismaSegitiga extends Segitiga {
    public double alas, tinggiSegitiga,tinggi, volume, luasPermukaan;
    public PrismaSegitiga(double alas, double tinggiSegitiga, double tinggi, double sisiA, double sisiB, double sisiC) {
        super(alas, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggi = tinggi;
    }
    public void hitungVolume() { 
        this.volume = 0;
    }
    public void hitungLuasPermukaan() {
        this.luasPermukaan = 0;
    }
}
