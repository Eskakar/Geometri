package geometri;

public class PrismaJajarGenjang extends JajarGenjang{
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaJajarGenjang(double alas, double tinggiAlas, double tinggiPrisma, double sisiMiringAlas) {
        super(alas,tinggiAlas, sisiMiringAlas);
        this.tinggiPrisma = tinggiPrisma;
        super.keliling = 0;
        super.luas = 0;
        
    }

    public double hitungVolume() {
        this.volume = super.hitungLuas() * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        double tinggiAlas = super.tinggi;
        double alasJajarGenjang = super.alas;
        this.luasPermukaan = 2 * alasJajarGenjang * tinggiAlas + 2 * (alasJajarGenjang + tinggiAlas) * this.tinggiPrisma;
        return this.luasPermukaan;
    }  
      @Override
    public double hitungKeliling() {
      return 0;
    }
}
