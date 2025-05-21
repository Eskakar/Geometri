/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;


/**
 *
 * @author rahadityaputra
 */
public class Kerucut extends Lingkaran{
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;
    public Kerucut(double tinggi,double jarijari){
        this(tinggi, jarijari, "Kerucut");

    }
    public Kerucut(double tinggi,double jarijari, String nama){
        super(jarijari, nama);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();

    }
    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggi;
    }
    public void hitungLuasPermukaan() {
        double sisiMiring = Math.sqrt(this.jariJari * this.jariJari + this.tinggi * this.tinggi);
        this.luasPermukaan = this.PI * this.jariJari * (this.jariJari + sisiMiring);
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
    

}
