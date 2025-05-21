/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;



public class LimasTrapesium extends Trapesium{
    public double volume;
    public double luasPermukaan;
    public double tinggi;


    public LimasTrapesium(double tinggi, double tinggiTrapesium, double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri) {
        
        super(sisiAtas,sisiBawah,  sisiKanan,  sisiKiri, tinggiTrapesium, "Limas Trapesium");
        this.tinggi = tinggi;
        this.hitungLuas();
        this.hitungKeliling();
    }

    public void hitungVolume() {

        this.volume = 1.0/3 * this.luas * this.tinggi;
    }

    public void hitungLuasPermukaan() {

    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
