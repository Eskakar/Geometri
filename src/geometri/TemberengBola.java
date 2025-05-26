package geometri;

public class TemberengBola extends Bola {
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;

    public TemberengBola(double jari, double tinggi,double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        this.volume = (this.PI * this.tinggi * this.tinggi * (3 * this.jariJari - this.tinggi)) / 3;
        return this.volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasSelimut = 2 * this.PI * this.jariJari * this.tinggi;
        double jariJariAlas = Math.sqrt(2 * this.jariJari * this.tinggi - Math.pow(this.tinggi, 2));
        double luasALas = this.PI * Math.pow(jariJariAlas, 2);
        this.luasPermukaan = luasSelimut + luasALas;
        return this.luasPermukaan;

    }
}
