package geometri;
public class BelahKetupat extends BangunDatar {

    protected double diagonal1;
    protected double diagonal2;
    protected double sisi;

    public BelahKetupat(double diagonal1, double diagonal2) {
        this(diagonal1, diagonal2, "Belah Ketupat");
    }

    public BelahKetupat(double diagonal1, double diagonal2, String nama) {
        super(nama);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double hitungSisi() {
        try {
            double setengahD1 = this.diagonal1 / 2.0;
            double setengahD2 = this.diagonal2 / 2.0;
            this.sisi = Math.sqrt(setengahD1 * setengahD1 + setengahD2 * setengahD2);
            return this.sisi;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung keliling: " + e.getMessage());
            return 0;
        }
    }

    public double hitungSisi(int diagonal1Baru, int diagonal2Baru) {
        try {
            double setengahD1 = diagonal1Baru / 2.0;
            double setengahD2 = diagonal2Baru / 2.0;
            // cek
            double sisiBaru = Math.sqrt(setengahD1 * setengahD1 + setengahD2 * setengahD2);
            return sisiBaru;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung keliling: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public double hitungKeliling() {
        super.keliling = 4 * this.hitungSisi();
        return super.keliling;
    }

    @Override
    public double hitungLuas() {
        try {
            super.luas = 0.5 * diagonal1 * diagonal2;
            return super.luas;
        } catch (Exception e) {
            System.err.println("Error menghitung luas: " + e.getMessage());
            return 0;
        }
    }

    public double hitungKeliling(int diagonal1Baru, int diagonal2Baru) {
        super.keliling = 4 * this.hitungSisi(diagonal1Baru, diagonal2Baru);
        return super.keliling;
    }

    public double hitungLuas(int diagonal1Baru, int diagonal2Baru) {
        try {
            super.luas = 0.5 * diagonal1Baru * diagonal2Baru;
            return super.luas;
        } catch (Exception e) {
            System.err.println("Error menghitung luas: " + e.getMessage());
            return 0;
        }
    }
}
