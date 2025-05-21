/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class KerucutTerpancung extends Kerucut{
    protected double jarijariAtas;
    public KerucutTerpancung(double tinggi,double jarijari,double jarijariAtas){
        super(tinggi,jarijari, "Kerucut Terpancung");
        this.jarijariAtas = jarijariAtas;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    
    @Override
    public void hitungVolume() {
        this.volume = (1.0 / 3) * this.PI * this.tinggi *
                (this.jariJari * this.jariJari + this.jariJari * this.jarijariAtas + this.jarijariAtas * this.jarijariAtas);
    }
    @Override
    public void hitungLuasPermukaan() {
        double s = Math.sqrt((this.jariJari - this.jarijariAtas) * (this.jariJari - this.jarijariAtas) + this.tinggi * this.tinggi);
        double luasSelimut = this.PI * (this.jariJari + this.jarijariAtas) * s;
        double luasAlasBawah = this.PI * this.jariJari * this.jariJari;
        double luasAlasAtas = this.PI * this.jarijariAtas * this.jarijariAtas;
        this.luas = luasSelimut + luasAlasBawah + luasAlasAtas;

    }

}
