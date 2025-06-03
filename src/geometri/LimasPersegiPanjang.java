package geometri;

public class LimasPersegiPanjang extends PersegiPanjang {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimas) {
        super(panjang, lebar, "Limas Persegi Panjang");
        this.tinggiLimas = tinggiLimas;

    }

    public double hitungVolume() {
        try {
            this.volume = 1.0/3 * super.hitungLuas() * this.tinggiLimas;
            return this.volume;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung volume: " + e.getMessage());
            return 0;
        }

    }

    public double hitungLuasPermukaan() {
        try {
            double tinggiSisiMiring1 = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(super.panjang / 2, 2));
            double tinggiSisiMiring2 = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(super.lebar / 2, 2));
            this.luasPermukaan = super.hitungLuas() + (tinggiSisiMiring1 * super.panjang ) + (tinggiSisiMiring2 * super.lebar);
            return this.luasPermukaan;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas permukaan: " + e.getMessage());
            return 0;
        }
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
}
