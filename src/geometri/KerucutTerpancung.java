package geometri;

public class KerucutTerpancung extends Kerucut{
    protected double jarijariAtas;
    public KerucutTerpancung(double tinggiKerucut,double jarijari,double jarijariAtas){
        super(tinggiKerucut,jarijari, "Kerucut Terpancung");
        this.jarijariAtas = jarijariAtas;
    }
    
    @Override
    public double hitungVolume() {
        this.volume = (1.0 / 3) * this.PI * this.tinggiKerucut *
                (this.jariJari * this.jariJari + this.jariJari * this.jarijariAtas + this.jarijariAtas * this.jarijariAtas);
        return this.volume;
    }
    @Override
    public double hitungLuasPermukaan() {
        double s = Math.sqrt((this.jariJari - this.jarijariAtas) * (this.jariJari - this.jarijariAtas) + this.tinggiKerucut * this.tinggiKerucut);
        double luasSelimut = this.PI * (this.jariJari + this.jarijariAtas) * s;
        double luasAlasBawah = this.PI * this.jariJari * this.jariJari;
        double luasAlasAtas = this.PI * this.jarijariAtas * this.jarijariAtas;
        this.luas = luasSelimut + luasAlasBawah + luasAlasAtas;
        return this.luasPermukaan;

    }

}
