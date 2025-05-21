/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class JuringBola extends Bola{
    public double  sudut;
    public JuringBola( double sudut,double jarijari) {
        super(jarijari, "Juring Bola");
        this.sudut = sudut;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    @Override
    public void hitungVolume() {
        this.volume = (this.sudut / 360) * this.volume;
    }
    @Override
    public void hitungLuasPermukaan() {
        this.luasPermukaan = (this.sudut / 360) * 4 * this.PI * this.jariJari * this.jariJari;
    }   

}
