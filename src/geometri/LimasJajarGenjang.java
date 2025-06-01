package geometri;

public class LimasJajarGenjang extends JajarGenjang {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;
    public double tinggiSegitigaPanjang;  
    public double tinggiSegitigaPendek;

    public LimasJajarGenjang(double alas, double tinggiJajarGenjang, double sisiMiring,
                              double tinggiLimas, double tinggiSegitigaPanjang, double tinggiSegitigaPendek) {
        super(alas, tinggiJajarGenjang, sisiMiring, "Limas Jajar Genjang");
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaPanjang = tinggiSegitigaPanjang;
        this.tinggiSegitigaPendek = tinggiSegitigaPendek;
    }

    public double hitungVolume() {
        this.volume = (1.0 / 3.0) * super.hitungLuas() * this.tinggiLimas;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        double luasSegitigaPanjang = (super.alas * this.tinggiSegitigaPanjang) / 2;
        double luasSegitigaPendek = (super.sisiMiring * this.tinggiSegitigaPendek) / 2;
        this.luasPermukaan = super.hitungLuas() + (2 * luasSegitigaPanjang) + (2 * luasSegitigaPendek);
        return this.luasPermukaan;
    }

    @Override
    public String toString() {
        return "LimasJajarGenjang";
    }
}
