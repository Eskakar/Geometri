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
        this.volume = super.hitungLuas() * this.tinggiPrisma;
        return this.volume;

    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * super.hitungLuas() + (2 * super.PI * super.jariJari * this.tinggiPrisma) ;
        return this.luasPermukaan;
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
}
