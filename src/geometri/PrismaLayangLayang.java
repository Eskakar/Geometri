package geometri;

public class PrismaLayangLayang extends LayangLayang {
    protected double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaLayangLayang(double d1, double d2,double sisi1, double sisi2, double tinggiPrisma) {
        super(d1, d2, sisi1, sisi2);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + 2 * this.tinggiPrisma * this.sisiA + 2 * this.tinggiPrisma * this.sisiB;
        return this.luasPermukaan;
    }
}
