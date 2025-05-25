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
    protected double tinggiKerucut;
    protected double volume;
    protected double luasPermukaan;
    public Kerucut(double tinggi,double jarijari){
        this(tinggi, jarijari, "Kerucut");

    }
    public Kerucut(double tinggiKerucut,double jarijari, String nama){
        super(jarijari, nama);
        this.tinggiKerucut = tinggiKerucut;
        this.hitungVolume();
        this.hitungLuasPermukaan();

    }
    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggiKerucut;
    }
    public void hitungLuasPermukaan() {
        double sisiMiring = Math.sqrt(this.jariJari * this.jariJari + this.tinggiKerucut * this.tinggiKerucut);
        this.luasPermukaan = this.PI * this.jariJari * (this.jariJari + sisiMiring);
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
    

}
