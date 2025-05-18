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
public class CincinBola {
    public double r1, r2;
    public CincinBola(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
    public double hitungVolume() {
        return (4.0/3) * Math.PI * (Math.pow(r1, 3) - Math.pow(r2, 3));
    }
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * (r1 * r1 - r2 * r2);
    }
}
