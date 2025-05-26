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
        this.volume = 1.0/3 * this.luas * this.tinggiLimas;
        return this.volume;

    }

    public double hitungLuasPermukaan() {
        double tinggiSisiMiring1 = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(this.panjang / 2, 2));
        double tinggiSisiMiring2 = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(this.lebar / 2, 2));
        this.luasPermukaan = this.luas + (tinggiSisiMiring1 * this.panjang ) + (tinggiSisiMiring2 * this.lebar);
        return this.luasPermukaan;
    }
}
