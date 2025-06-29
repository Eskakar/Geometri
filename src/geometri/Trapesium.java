package geometri;

public class Trapesium extends BangunDatar {
    protected double sisiAtas;
    protected double sisiBawah;
    protected double sisiKanan;
    protected double sisiKiri;
    protected double tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggi) {
        this(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggi, "Trapesium");
    }

    public Trapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggi, String Nama) {
        super("Trapesium");
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKanan = sisiKanan;
        this.sisiKiri = sisiKiri;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        try {
            super.keliling = this.sisiAtas + this.sisiBawah + this.sisiKanan + this.sisiKiri;
            return super.keliling;
        } catch (RuntimeException e) {
          System.err.println("Error menghitung keliling  : " + e.getMessage());
          return 0;
        }
    }

    @Override
    public double hitungLuas() {
        try {
            super.luas = 0.5 * (this.sisiAtas + this.sisiBawah) * this.tinggi;
            return super.luas;
        } catch (RuntimeException e) {
          System.err.println("Error menghitung luas  : " + e.getMessage());
          return 0;
        }
    }

    public double hitungKeliling(double sisiAtasBaru, double sisiBawahBaru, double sisiKananBaru, double sisiKiriBaru) {
        try {
            super.keliling = sisiAtasBaru + sisiBawahBaru + sisiKananBaru + sisiKiriBaru;
            return super.keliling;
        } catch (RuntimeException e) {
          System.err.println("Error menghitung keliling  : " + e.getMessage());
          return 0;
        }
    }

    public double hitungLuas(double sisiAtasBaru, double sisiBawahBaru, double tinggiBaru) {
        try {
            super.luas = 0.5 * (sisiAtasBaru + sisiBawahBaru) * tinggiBaru;
            return super.luas;
        } catch (RuntimeException e) {
          System.err.println("Error menghitung luas  : " + e.getMessage());
          return 0;
        }
    }
}
