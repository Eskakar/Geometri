/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

import geometri.BangunDatar.Trapesium;


public class LimasTrapesium extends Trapesium{
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;
    public double tinggiTrapeisum;


    public LimasTrapesium(double tinggiLimas, double tinggiTrapesium, double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, String Nama) {
        
        super(sisiAtas,sisiBawah,  sisiKanan,  sisiKiri, tinggiTrapesium, Nama);
    }

    public void hitungVolume() {

    }

    public void hitungLuasPermukaan() {

    }
}
