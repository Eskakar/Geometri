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
        this.volume = super.hitungLuas() * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * super.hitungLuas() + 2 * this.tinggiPrisma * super.sisiA + 2 * this.tinggiPrisma * super.sisiB;
        return this.luasPermukaan;
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
}
