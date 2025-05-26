package geometri;

public class PrismaBelahKetupat extends BelahKetupat {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaBelahKetupat(double d1, double d2, double tinggiPrisma) {
        super(d1, d2);
        this.tinggiPrisma = tinggiPrisma;
    }

    public void hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
    }

    public void hitungLuasPermukaan() {
        double diagonalAlas1 = super.diagonal1;
        double diagonalAlas2 = super.diagonal2;
        double sisi = Math.sqrt(Math.pow(diagonalAlas1/2, 2) + Math.pow(diagonalAlas2/2, 2));
        this.luasPermukaan = 2 * 0.5 * diagonalAlas1 * diagonalAlas2 + 4 * sisi * this.tinggiPrisma;
    }  

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
