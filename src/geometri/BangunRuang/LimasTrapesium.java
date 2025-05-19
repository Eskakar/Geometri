/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

import geometri.BangunDatar.Trapesium;


public class LimasTrapesium extends Trapesium{
    public double volume;
    public double luasPermukaan;
    public double tinggi;


    public LimasTrapesium(double tinggi, double tinggiTrapesium, double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, String Nama) {
        
        super(sisiAtas,sisiBawah,  sisiKanan,  sisiKiri, tinggiTrapesium, Nama);
        this.tinggi = tinggi;
    }

    public void hitungVolume() {

    }

    public void hitungLuasPermukaan() {

    }
}
