package geometri;

public class PrismaSegitiga extends Segitiga {
    protected double tinggiPrisma; 
    protected double volume;
    protected double luasPermukaan;

    public PrismaSegitiga(double alas, double tinggiSegitiga, double tinggiPrisma, double sisiA, double sisiB, double sisiC) {
        super(alas, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggiPrisma = tinggiPrisma;
    }

    public void hitungVolume() { 
        this.volume = this.luas * this.tinggiPrisma;
    }

    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + this.sisiA * this.tinggiPrisma + this.tinggiPrisma * this.sisiB + this.sisiC * this.tinggiPrisma;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
