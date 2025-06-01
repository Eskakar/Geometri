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
        this.volume = super.hitungLuas() * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * super.hitungLuas() + 2 * this.tinggiPrisma * super.panjang + 2 * this.tinggiPrisma * super.lebar;
        return this.luasPermukaan;
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
}
