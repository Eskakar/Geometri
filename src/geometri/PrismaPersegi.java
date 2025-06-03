package geometri;

public class PrismaPersegi extends Persegi {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaPersegi(double sisi, double tinggiPrisma) {
        super(sisi);
        this.tinggiPrisma = tinggiPrisma;

    }

    public double hitungVolume() {
        try {
            this.volume = super.hitungLuas()* this.tinggiPrisma;
            return this.volume;
        } catch (RuntimeException e) {
          System.err.println("Error menghitung volume  : " + e.getMessage());
          return 0;
        }
    }

    public double hitungLuasPermukaan() {
        try {
            this.luasPermukaan = 2 * super.hitungLuas() + 4 * this.tinggiPrisma * super.sisi;
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
