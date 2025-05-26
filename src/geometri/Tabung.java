package geometri;

public class Tabung extends Lingkaran {
    protected double tinggiPrisma;
    protected double volume;
    protected double luasPermukaan;

    public Tabung(double jari, double tinggiPrisma) {
        super(jari, "Tabung");
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
        return this.volume;

    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + (2 * this.PI * this.jariJari * this.tinggiPrisma) ;
        return this.luasPermukaan;
    }
}
