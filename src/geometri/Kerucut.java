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
    public double hitungVolume() {
        try {
            this.volume = 1.0/3 * super.hitungLuas()* this.tinggiKerucut;
            return this.volume;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung volume: " + e.getMessage());
            return 0;
        }
    }
    public double hitungLuasPermukaan() {
        try {
            double sisiMiring = Math.sqrt(super.jariJari * super.jariJari + this.tinggiKerucut * this.tinggiKerucut);
            this.luasPermukaan = super.PI * super.jariJari * (super.jariJari + sisiMiring);
            return this.luasPermukaan;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas permukaan: " + e.getMessage());
            return 0;
        }
    }
    @Override
    public double hitungKeliling() {
        return 0;
    }
    
}
