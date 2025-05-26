package geometri;

public class PrismaJajarGenjang extends JajarGenjang{
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaJajarGenjang(double alas, double tinggiAlas, double tinggiPrisma, double sisiMiringAlas) {
        super(alas,tinggiAlas, sisiMiringAlas);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        this.volume = this.luas * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        double tinggiAlas = super.tinggi;
        double alasJajarGenjang = super.alas;
        this.luasPermukaan = 2 * alasJajarGenjang * tinggiAlas + 2 * (alasJajarGenjang + tinggiAlas) * tinggiPrisma;
        return this.luasPermukaan;
    }   
}
