/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.BangunRuang;

/**
 *
 * @author rahadityaputra
 */

// ini perlu extend bola
public class CincinBola extends Bola{
    public double r1;
    public double r2;
    public CincinBola(double r1, double r2,double jarijari) {
        super(jarijari, "Cincin Bola");
        this.r1 = r1;
        this.r2 = r2;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    @Override
    public void hitungVolume() {
        this.volume = (4.0/3) * this.PI * (Math.pow(this.r1, 3) - Math.pow(this.r2, 3));
    }
    @Override
    public void hitungLuasPermukaan() {
        this.luasPermukaan= 4 * this.PI * (this.r1 * this.r1 - this.r2 * this.r2);
    }
    
}
