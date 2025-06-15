package geometri;

public class LimasSegitiga extends Segitiga {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;

    public LimasSegitiga(double alas, double tinggiLimas, double tinggi, double sisiA, double sisiB, double  sisiC) {
        super(alas, tinggi, sisiA, sisiB, sisiC, "Limas Segitiga");
        this.tinggiLimas = tinggiLimas;

    }

    public double hitungVolume() {
        try {
            this.volume = 1.0/3 * super.hitungLuas() * this.tinggiLimas;
            return this.volume;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung volume: " + e.getMessage());
            return 0;
        }
    }

    private double hitungTinggiSisiMiring(double sisi){
        try {
            double tinggiSegitiga = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(sisi/ 2, 2)); 
            return tinggiSegitiga;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung tinggi sisi miring: " + e.getMessage());
            return 0;
        }
    }
    
    public double hitungLuasPermukaan() {
        try {
            double luasA = 0.5 * super.sisiA * hitungTinggiSisiMiring(super.sisiA);
            double luasB = 0.5 * super.sisiB * hitungTinggiSisiMiring(super.sisiB);
            double luasC = 0.5 * super.sisiC * hitungTinggiSisiMiring(super.sisiC);
            this.luasPermukaan = super.hitungLuas() + luasA + luasB + luasC;
            return this.luasPermukaan;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas permukaan : " + e.getMessage());
            return 0;
        }
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
