package geometri;

public class Kerucut extends Lingkaran{
    protected double tinggiKerucut;
    protected double volume;
    protected double luasPermukaan;
    public Kerucut(double tinggi,double jarijari){
        this(tinggi, jarijari, "Kerucut");

    }
    public Kerucut(double tinggiKerucut,double jarijari, String nama){
        super(jarijari, nama);
        this.tinggiKerucut = tinggiKerucut;

    }
    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggiKerucut;
    }
    public void hitungLuasPermukaan() {
        double sisiMiring = Math.sqrt(this.jariJari * this.jariJari + this.tinggiKerucut * this.tinggiKerucut);
        this.luasPermukaan = this.PI * this.jariJari * (this.jariJari + sisiMiring);
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
    

}
