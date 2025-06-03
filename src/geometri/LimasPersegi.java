package geometri;

public class LimasPersegi extends Persegi {
    public double luasPermukaan;
    public double volume;
    public double tinggiLimas;
    protected double tinggiSisiMiring;

    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi, "Limas Persegi");
        this.tinggiLimas = tinggiLimas;
    }

    private double hitungTinggiSisiMiring() {
        try {
            this.tinggiSisiMiring = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(super.sisi / 2.0, 2));
            return this.tinggiSisiMiring;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung tinggi sisi miring: " + e.getMessage());
            return 0;
        }
    }

    public double hitungVolume() {
        try {
            this.volume = (1.0 / 3.0) * super.hitungLuas() * this.tinggiLimas;
            return this.volume;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung volume: " + e.getMessage());
            return 0;
        }
    }

    public double hitungLuasPermukaan() {
        try {
            double tinggiSisi = this.hitungTinggiSisiMiring();
            this.luasPermukaan = super.hitungLuas() + (4 * 0.5 * super.sisi * tinggiSisi);
            return this.luasPermukaan;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas permukaan: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {
        return "LimasPersegi";
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
}
