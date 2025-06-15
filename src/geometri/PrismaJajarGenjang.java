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
          double tinggiAlas = super.tinggi;
          double alasJajarGenjang = super.alas;
          this.luasPermukaan = 2 * alasJajarGenjang * tinggiAlas + 2 * (alasJajarGenjang + tinggiAlas) * this.tinggiPrisma;
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
