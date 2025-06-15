package geometri;

public class PersegiPanjang extends BangunDatar {
    protected double panjang;
    protected double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this(panjang, lebar, "Persegi Panjang");
    }

    public PersegiPanjang(double panjang, double lebar, String nama) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        try {
            super.keliling = 2 * (this.panjang + this.lebar);
            return super.keliling;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung keliling  : " + e.getMessage());
            return 0;
        }
    }

    @Override
    public double hitungLuas() {
        try {
            super.luas = this.panjang * this.lebar;
            return super.luas;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas  : " + e.getMessage());
            return 0;
        }
    }

    public double hitungKeliling(double panjangBaru, double lebarBaru) {
        try {
            super.keliling = 2 * (panjangBaru + lebarBaru);
            return super.keliling;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung keliling  : " + e.getMessage());
            return 0;
        }
    }

    public double hitungLuas(double panjangBaru, double lebarBaru) {
        try {
            super.luas = panjangBaru * lebarBaru;
            return super.luas;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas  : " + e.getMessage());
            return 0;
        }
    }
}
