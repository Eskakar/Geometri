package geometri;

public class PrismaTrapesium extends Trapesium {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaTrapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggiTrapesium, double tinggiPrisma,String Nama) {
        super(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggiTrapesium,Nama);
        this.tinggiPrisma = tinggiPrisma;
    }

    public void hitungVolume() { 
        this.volume = this.luas * this.tinggiPrisma;
    }

    public void hitungLuasPermukaan() {
        this.luasPermukaan = 2 * this.luas + this.sisiAtas * this.tinggiPrisma + this.tinggiPrisma * this.sisiBawah + this.sisiKanan * this.tinggiPrisma + this.sisiKiri * this.tinggiPrisma;
    }

    //hitung luas dari trapesium sudah dipakai
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
