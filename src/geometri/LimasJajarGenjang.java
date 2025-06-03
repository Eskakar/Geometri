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
         try {
            this.volume = (1.0 / 3.0) * super.hitungLuas() * this.tinggiLimas;
            return this.volume;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas volume: " + e.getMessage());
            return 0;
        }
    }

    public double hitungLuasPermukaan() {
        try {
            double luasSegitigaPanjang = (super.alas * this.tinggiSegitigaPanjang) / 2;
            double luasSegitigaPendek = (super.sisiMiring * this.tinggiSegitigaPendek) / 2;
            this.luasPermukaan = super.hitungLuas() + (2 * luasSegitigaPanjang) + (2 * luasSegitigaPendek);
            return this.luasPermukaan;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas permukaan: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {
        return "LimasJajarGenjang";
    }
    @Override
    public double hitungKeliling() {
      return 0;
    }
}
