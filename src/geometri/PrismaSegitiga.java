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
        try {
            this.volume = super.hitungLuas() * this.tinggiPrisma;
            return this.volume;
        } catch (RuntimeException e) {
          System.err.println("Error menghitung volume  : " + e.getMessage());
          return 0;
        }
    }

    public double hitungLuasPermukaan() {
        try {
            this.luasPermukaan = 2 * super.hitungLuas() + super.sisiA * this.tinggiPrisma + this.tinggiPrisma * super.sisiB + super.sisiC * this.tinggiPrisma;
            return this.luasPermukaan;
        } catch (RuntimeException e) {
          System.err.println("Error menghitung luas permukaan  : " + e.getMessage());
          return 0;
        }
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
    double getVolume(){
        return this.volume;
    }
    double getLuasPermukaan(){
        return this.luasPermukaan;
    }
}
