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
            this.luasPermukaan = 2 * super.hitungLuas() + 2 * this.tinggiPrisma * super.panjang + 2 * this.tinggiPrisma * super.lebar;
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
