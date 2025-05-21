package geometri.BangunDatar;

public class Persegi extends BangunDatar {

    protected double sisi;
    public Persegi(double sisi) {
        this(sisi, "Persegi");
    }
    public Persegi(double sisi, String nama) {
        super(nama);
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }
    
    @Override
    public void hitungLuas() {
        this.luas = this.sisi * this.sisi;
        
    }
    @Override
    public void hitungKeliling() {
        this.keliling = 4 * this.sisi;
    }

}
