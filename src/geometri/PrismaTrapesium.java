package geometri;

public class PrismaTrapesium extends Trapesium {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaTrapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggiTrapesium, double tinggiPrisma,String Nama) {
        super(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggiTrapesium,Nama);
        this.tinggiPrisma = tinggiPrisma;
        super.keliling = 0;
        super.luas = 0;
    }

    public double hitungVolume() { 
        this.volume = super.hitungLuas() * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        this.luasPermukaan = 2 * super.hitungLuas() + super.sisiAtas * this.tinggiPrisma + this.tinggiPrisma * super.sisiBawah + super.sisiKanan * this.tinggiPrisma + super.sisiKiri * this.tinggiPrisma;
        return this.luasPermukaan;
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }

}
