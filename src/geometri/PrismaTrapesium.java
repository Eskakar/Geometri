package geometri;

public class PrismaTrapesium extends Trapesium {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaTrapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggiTrapesium,
        double tinggiPrisma, String Nama) {
      super(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggiTrapesium, Nama);
      this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaTrapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggiTrapesium,
        double tinggiPrisma) {
      this(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggiTrapesium, tinggiPrisma, "PrismaTrapesium");
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
        this.luasPermukaan = 2 * super.hitungLuas() + super.sisiAtas * this.tinggiPrisma
            + this.tinggiPrisma * super.sisiBawah + super.sisiKanan * this.tinggiPrisma
            + super.sisiKiri * this.tinggiPrisma;
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
    double getVolume(){
        return this.volume;
    }
    double getLuasPermukaan(){
        return this.luasPermukaan;
    }
  
}
