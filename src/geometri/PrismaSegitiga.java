package geometri;

public class PrismaSegitiga extends Segitiga {
    protected double tinggiPrisma; 
    protected double volume;
    protected double luasPermukaan;

    public PrismaSegitiga(double alas, double tinggiSegitiga, double tinggiPrisma, double sisiA, double sisiB, double sisiC) {
        super(alas, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggiPrisma = tinggiPrisma;

    }

    public double hitungVolume() { 
        this.volume = super.hitungLuas() * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * super.hitungLuas() + super.sisiA * this.tinggiPrisma + this.tinggiPrisma * super.sisiB + super.sisiC * this.tinggiPrisma;
        return this.luasPermukaan;
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
}
