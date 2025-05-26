package geometri;

public class PrismaPersegiPanjang extends PersegiPanjang {
    protected double tinggiPrisma;
    protected double volume;
    protected double luasPermukaan;

    public PrismaPersegiPanjang(double panjang, double lebar, double tinggiPrisma) {
        super(panjang, lebar);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + 2 * this.tinggiPrisma * this.panjang + 2 * this.tinggiPrisma * this.lebar;
        return this.luasPermukaan;
    }
}
