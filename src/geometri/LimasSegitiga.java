package geometri;

public class LimasSegitiga extends Segitiga {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;

    public LimasSegitiga(double alas, double tinggiLimas, double tinggi, double sisiA, double sisiB, double  sisiC) {
        super(alas, tinggi, sisiA, sisiB, sisiC, "Limas Segitiga");
        this.tinggiLimas = tinggiLimas;
    }

    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggiLimas;
    }
    private double hitungTinggiSisiMiring(double sisi){
        double tinggiSegitiga = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(sisi/ 2, 2)); 
        return tinggiSegitiga;
    }
    
    
    public void hitungLuasPermukaan() {
         // Luas sisi tegak A
        double luasA = 0.5 * this.sisiA * hitungTinggiSisiMiring(this.sisiA);

        // Luas sisi tegak B
        double luasB = 0.5 * this.sisiB * hitungTinggiSisiMiring(this.sisiB);

        // Luas sisi tegak C
        double luasC = 0.5 * this.sisiC * hitungTinggiSisiMiring(this.sisiC);

        // Total luas permukaan = alas + 3 sisi tegak
        this.luasPermukaan = this.luas + luasA + luasB + luasC;
    }
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
