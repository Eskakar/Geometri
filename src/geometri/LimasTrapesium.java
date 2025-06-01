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
        this.volume = 1.0/3 * super.hitungLuas() * this.tinggiLimas;
        return this.volume;
    }
    private double getTinggiSisiTegak(double sisi) {
        double tinggiTegak = Math.sqrt(Math.pow(sisi/2,2)+ Math.pow(this.tinggiLimas,2));
        return tinggiTegak;
    }
    private double getLuasSisiTegak(double sisi) {
        double luasSisiTegak = sisi * (0.5) * getTinggiSisiTegak(sisi);
        return luasSisiTegak;
    }
    public double hitungLuasPermukaan() {
        double LuasSisiTegakAtas = getLuasSisiTegak(super.sisiAtas);
        double LuasSisiTegakBawah = getLuasSisiTegak(super.sisiBawah);
        double LuasSisiTegakKanan = getLuasSisiTegak(super.sisiKanan);
        double LuasSisiTegaKiri = getLuasSisiTegak(super.sisiKiri);
        this.luasPermukaan = LuasSisiTegakAtas + LuasSisiTegakBawah + LuasSisiTegakKanan + LuasSisiTegaKiri + super.hitungLuas();
        return this.luasPermukaan;
    }
      @Override
    public double hitungKeliling() {
      return 0;
    }
}
