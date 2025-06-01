package geometri;

public class PrismaPersegi extends Persegi {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaPersegi(double sisi, double tinggiPrisma) {
        super(sisi);
        this.tinggiPrisma = tinggiPrisma;
        super.keliling = 0;
        super.luas = 0;
    }

    public double hitungVolume() {
        this.volume = super.hitungLuas()* this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * super.hitungLuas() + 4 * this.tinggiPrisma * super.sisi;
        return this.luasPermukaan;
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
}
