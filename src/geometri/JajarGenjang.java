package geometri;

public class JajarGenjang extends BangunDatar {

    protected double alas;
    protected double tinggi;
    protected double sisiMiring;

    public JajarGenjang(double alas, double tinggi, double sisiMiring, String nama) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        this(alas, tinggi, sisiMiring, "Jajar Genjang");
    }

    @Override
    public double hitungKeliling() {
        try {
            super.keliling =  2 * (this.alas + this.sisiMiring);
            return super.keliling;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung keliling: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public double hitungLuas() {
        try {
            super.luas =  this.alas * this.tinggi;
            return super.luas;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas: " + e.getMessage());
            return 0;
        }
    }

    public double hitungKeliling(int alasBaru, int sisiMiringBaru) {
        try {
            super.keliling =  2 * (alasBaru + sisiMiringBaru);
            return super.keliling;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung keliling: " + e.getMessage());
            return 0;
        }
    }

    public double hitungLuas(int alasBaru, int tinggiBaru) {
        try {
            super.luas =  alasBaru * tinggiBaru;
            return super.luas;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas: " + e.getMessage());
            return 0;
        }
    }
}
