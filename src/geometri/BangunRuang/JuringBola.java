/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */
public class JuringBola {
 public double jari, sudut;
    public JuringBola(double jari, double sudut) {
        this.jari = jari;
        this.sudut = sudut;
    }
    public double hitungVolume() {
        return (sudut / 360) * (4.0/3) * Math.PI * Math.pow(jari, 3);
    }
    public double hitungLuasPermukaan() {
        return (sudut / 360) * 4 * Math.PI * jari * jari;
    }   
}
