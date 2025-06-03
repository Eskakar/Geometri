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
            this.luasPermukaan = 2 * super.hitungLuas() + (2 * super.PI * super.jariJari * this.tinggiPrisma) ;
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
}
