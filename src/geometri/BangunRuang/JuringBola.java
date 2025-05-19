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
        super(jarijari);
        
        this.sudut = sudut;
    }
    @Override
    public void hitungVolume() {
        this.volume = (sudut / 360) * (4.0/3) * Math.PI * Math.pow(this.jariJari, 3);
    }
    @Override
    public void hitungLuasPermukaan() {
        this.luasPermukaan = (sudut / 360) * 4 * Math.PI * this.jariJari * this.jariJari;
    }   

}
