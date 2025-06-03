package geometri;

public final class LimasTrapesium extends Trapesium{
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;


    public LimasTrapesium(double tinggi, double tinggiTrapesium, double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri) {
        
        super(sisiAtas,sisiBawah,  sisiKanan,  sisiKiri, tinggiTrapesium, "Limas Trapesium");
        this.tinggiLimas = tinggi;

    }

    public double hitungVolume() {
        try {
            this.volume = 1.0/3 * super.hitungLuas() * this.tinggiLimas;
            return this.volume;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung volume  : " + e.getMessage());
            return 0;
        }
    }
    private double getTinggiSisiTegak(double sisi) {
        try {
            double tinggiTegak = Math.sqrt(Math.pow(sisi/2,2)+ Math.pow(this.tinggiLimas,2));
            return tinggiTegak;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung tinggi sisi tegak  : " + e.getMessage());
            return 0;
        }
    }
    private double getLuasSisiTegak(double sisi) {
        try {
            double luasSisiTegak = sisi * (0.5) * getTinggiSisiTegak(sisi);
            return luasSisiTegak;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas sisi tegak  : " + e.getMessage());
            return 0;
        }
    }

    public double hitungLuasPermukaan() {
        try {
            double LuasSisiTegakAtas = getLuasSisiTegak(super.sisiAtas);
            double LuasSisiTegakBawah = getLuasSisiTegak(super.sisiBawah);
            double LuasSisiTegakKanan = getLuasSisiTegak(super.sisiKanan);
            double LuasSisiTegaKiri = getLuasSisiTegak(super.sisiKiri);
            this.luasPermukaan = LuasSisiTegakAtas + LuasSisiTegakBawah + LuasSisiTegakKanan + LuasSisiTegaKiri + super.hitungLuas();
            return this.luasPermukaan;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas permukaan  : " + e.getMessage());
            return 0;
        }
    }
      @Override
    public double hitungKeliling() {
      return 0;
    }
}
