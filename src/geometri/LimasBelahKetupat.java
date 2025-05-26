package geometri;

public class LimasBelahKetupat extends BelahKetupat {
    protected double volume;
    protected double luasPermukaan;
    protected double tinggiLimas;
    protected double sisiMiring;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double tinggiLimas, double tinggiBelahKetupat) {
        super(diagonal1, diagonal2, "Limas Belah Ketupat");
        this.tinggiLimas = tinggiLimas;
        this.hitungLuasPermukaan();
        this.hitungVolume();
    }
    
    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggiLimas;
    }

    private double hitungTinggiSegitigaSisiTegak(){
        return Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(this.sisi / 2, 2));
    }
            
    public void hitungLuasPermukaan() {
        double luasSegitiga = 0.5 * this.sisi * hitungTinggiSegitigaSisiTegak();
        double luasSeluruhSegitiga = 4 * luasSegitiga;
        
        this.luasPermukaan = this.luas + luasSeluruhSegitiga;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
