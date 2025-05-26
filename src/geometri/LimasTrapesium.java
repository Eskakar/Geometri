package geometri;

public final class LimasTrapesium extends Trapesium{
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;


    public LimasTrapesium(double tinggi, double tinggiTrapesium, double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri) {
        
        super(sisiAtas,sisiBawah,  sisiKanan,  sisiKiri, tinggiTrapesium, "Limas Trapesium");
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggi;
        return this.volume;
    }
    private double getTinggiSisiTegak(double sisi) {
        return Math.sqrt(Math.pow(sisi/2,2)+ Math.pow(this.tinggi,2));
    }
    private double getLuasSisiTegak(double sisi) {
        return sisi * (0.5) * getTinggiSisiTegak(sisi);
    }
    public double hitungLuasPermukaan() {
        double LuasSisiTegakAtas = getLuasSisiTegak(this.sisiAtas);
        double LuasSisiTegakBawah = getLuasSisiTegak(this.sisiBawah);
        double LuasSisiTegakKanan = getLuasSisiTegak(this.sisiKanan);
        double LuasSisiTegaKiri = getLuasSisiTegak(this.sisiKiri);
        this.luasPermukaan = LuasSisiTegakAtas + LuasSisiTegakBawah + LuasSisiTegakKanan + LuasSisiTegaKiri + this.luas;
        return this.luasPermukaan;
    }
}
