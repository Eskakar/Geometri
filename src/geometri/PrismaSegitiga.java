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
        this.volume = this.luas * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + this.sisiA * this.tinggiPrisma + this.tinggiPrisma * this.sisiB + this.sisiC * this.tinggiPrisma;
        return this.luasPermukaan;
    }
}
