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
 public double jari, sudut;
    public JuringBola(double jari, double sudut,double jarijari) {
        super(jarijari);
        this.jari = jari;
        this.sudut = sudut;
    }
    @Override
    public void hitungVolume() {
        this.volume = (sudut / 360) * (4.0/3) * Math.PI * Math.pow(jari, 3);
    }
    @Override
    public void hitungLuasPermukaan() {
        this.luasPermukaan = (sudut / 360) * 4 * Math.PI * jari * jari;
    }   
}
