package geometri;

public class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi(double sisi) {
        this(sisi, "Persegi");
    }

    public Persegi(double sisi, String nama) {
        super(nama);
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        try {
            super.luas = this.sisi * this.sisi;
            return super.luas;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas  : " + e.getMessage());
            return 0;
        }
    }

    @Override
    public double hitungKeliling() {
        try {
            super.keliling = 4 * this.sisi;
            return super.keliling;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung keliling  : " + e.getMessage());
            return 0;
        }
    }
}
