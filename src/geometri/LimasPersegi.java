package geometri;

public class LimasPersegi extends Persegi {
    public double luasPermukaan;
    public double volume;
    public double tinggiLimas;
    protected double tinggiSisiMiring;

    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi, "Limas Persegi");
        this.tinggiLimas = tinggiLimas;
    }

    private double hitungTinggiSisiMiring() {
        this.tinggiSisiMiring = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(this.sisi / 2.0, 2));
        return this.tinggiSisiMiring;
    }

    public double hitungVolume() {
        this.volume = (1.0 / 3.0) * super.hitungLuas() * this.tinggiLimas;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        double tinggiSisi = this.hitungTinggiSisiMiring();
        this.luasPermukaan = super.hitungLuas() + (4 * 0.5 * this.sisi * tinggiSisi);
        
        return this.luasPermukaan;
    }

    @Override
    public String toString() {
        return "LimasPersegi";
    }
}
