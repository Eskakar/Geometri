package geometri;

public class PrismaBelahKetupat extends BelahKetupat {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaBelahKetupat(double d1, double d2, double tinggiPrisma) {
        super(d1, d2);
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
            double diagonalAlas1 = super.diagonal1;
            double diagonalAlas2 = super.diagonal2;
            double sisi = Math.sqrt(Math.pow(diagonalAlas1/2, 2) + Math.pow(diagonalAlas2/2, 2));
            this.luasPermukaan = 2 * 0.5 * diagonalAlas1 * diagonalAlas2 + 4 * sisi * this.tinggiPrisma;
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
