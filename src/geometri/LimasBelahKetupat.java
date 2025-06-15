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

    }

    private double hitungTinggiSegitigaSisiTegak() {
        try {
            double TinggiSisiTegak = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(super.hitungSisi() / 2.0, 2));
            return TinggiSisiTegak ;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung tinggi sisi tegak: " + e.getMessage());
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
            double tinggiSegitiga = hitungTinggiSegitigaSisiTegak();
            double luasSegitiga = 0.5 * super.hitungSisi() * tinggiSegitiga;
            this.luasPermukaan = super.hitungLuas() + (4 * luasSegitiga);
            return this.luasPermukaan;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas permukaan: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {
        return "LimasBelahKetupat";
    }
     @Override
    public double hitungKeliling() {
      return 0;
    }
    double getVolume(){
        return this.volume;
    }
    double getLuasPermukaan(){
        return this.luasPermukaan;
    }
}
