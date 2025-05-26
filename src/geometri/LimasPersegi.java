package geometri;

public class LimasPersegi extends Persegi {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;
    protected double tinggiSisiMiring;

    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi, "Limas Persegi");
        this.tinggiLimas = tinggiLimas;
    }

    private double hitungTinggiSisiMiring() {
        this.tinggiSisiMiring = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(this.sisi / 2, 2));
        return this.tinggiSisiMiring;
    }

    public double hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggiLimas;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = this.luas + (4 * 0.5 * this.sisi * this.hitungTinggiSisiMiring());
        return this.luasPermukaan;
    }
}
