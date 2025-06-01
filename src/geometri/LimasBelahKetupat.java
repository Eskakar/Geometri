package geometri;

// harus manggil method hitungSisi() dulu terus di store di super.sisi, masalahnya, kapan kalo di constructor gaboleh????
public class LimasBelahKetupat extends BelahKetupat {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;
    public double sisiMiring;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double tinggiLimas) {
        super(diagonal1, diagonal2, "Limas Belah Ketupat");
        this.tinggiLimas = tinggiLimas;
        super.keliling = 0;
        super.luas = 0;
    }

    private double hitungTinggiSegitigaSisiTegak() {
        double TinggiSisiTegak = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(super.hitungSisi() / 2.0, 2));
        return TinggiSisiTegak ;
    }

    public double hitungVolume() {
        this.volume = (1.0 / 3.0) * super.hitungLuas() * this.tinggiLimas;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        double tinggiSegitiga = hitungTinggiSegitigaSisiTegak();
        double luasSegitiga = 0.5 * super.hitungSisi() * tinggiSegitiga;
        this.luasPermukaan = super.hitungLuas() + (4 * luasSegitiga);
        return this.luasPermukaan;
    }

    @Override
    public String toString() {
        return "LimasBelahKetupat";
    }
     @Override
    public double hitungKeliling() {
      return 0;
    }
}
