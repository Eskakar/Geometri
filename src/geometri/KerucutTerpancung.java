package geometri;

public class KerucutTerpancung extends Kerucut{
    protected double jarijariAtas;
    public KerucutTerpancung(double tinggiKerucut,double jarijari,double jarijariAtas){
        super(tinggiKerucut,jarijari, "Kerucut Terpancung");
        this.jarijariAtas = jarijariAtas;
    }
    
    @Override
    public double hitungVolume() {
        super.volume = (1.0 / 3) * super.PI * super.tinggiKerucut *
                (super.jariJari * super.jariJari + super.jariJari * this.jarijariAtas + this.jarijariAtas * this.jarijariAtas);
        return super.volume;
    }
    @Override
    public double hitungLuasPermukaan() {
        double s = Math.sqrt((super.jariJari - this.jarijariAtas) * (super.jariJari - this.jarijariAtas) + super.tinggiKerucut * super.tinggiKerucut);
        double luasSelimut = super.PI * (super.jariJari + this.jarijariAtas) * s;
        double luasAlasBawah = super.PI * super.jariJari * super.jariJari;
        double luasAlasAtas = super.PI * this.jarijariAtas * this.jarijariAtas;
        super.luasPermukaan = luasSelimut + luasAlasBawah + luasAlasAtas;
        return super.luasPermukaan;

    }

}
