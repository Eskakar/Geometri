package geometri;

public class LimasSegitiga extends Segitiga {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;

    public LimasSegitiga(double alas, double tinggiLimas, double tinggi, double sisiA, double sisiB, double  sisiC) {
        super(alas, tinggi, sisiA, sisiB, sisiC, "Limas Segitiga");
        this.tinggiLimas = tinggiLimas;
        super.keliling = 0;
        super.luas = 0;
    }

    public void hitungVolume() {
        this.volume = 1.0/3 * super.hitungLuas() * this.tinggiLimas;
    }
    private double hitungTinggiSisiMiring(double sisi){
        double tinggiSegitiga = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(sisi/ 2, 2)); 
        return tinggiSegitiga;
    }
    
    
    public double hitungLuasPermukaan() {
        double luasA = 0.5 * this.sisiA * hitungTinggiSisiMiring(super.sisiA);
        double luasB = 0.5 * this.sisiB * hitungTinggiSisiMiring(super.sisiB);
        double luasC = 0.5 * this.sisiC * hitungTinggiSisiMiring(super.sisiC);
        this.luasPermukaan = super.hitungLuas() + luasA + luasB + luasC;
        return this.luasPermukaan;
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
    
}
