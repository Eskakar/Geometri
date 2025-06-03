package geometri;

public class LimasLayangLayang extends LayangLayang {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;
    public double tinggiSisiTegak1;
    public double tinggiSisiTegak2;

    public LimasLayangLayang(double tinggiLimas, double tinggiSisiTegak1, double tinggiSisiTegak2,
                              double diagonal1, double diagonal2, double sisiA, double sisiB) {
        super(diagonal1, diagonal2, sisiA, sisiB, "Limas Layang Layang");
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak1 = tinggiSisiTegak1;
        this.tinggiSisiTegak2 = tinggiSisiTegak2;

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
            double luasSegitiga1 = (super.sisiA * this.tinggiSisiTegak1) / 2;
            double luasSegitiga2 = (super.sisiB * this.tinggiSisiTegak2) / 2;
            this.luasPermukaan = super.hitungLuas() + (2 * luasSegitiga1) + (2 * luasSegitiga2);
            return this.luasPermukaan;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas permukaan: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {
        return "LimasLayangLayang";
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
}
