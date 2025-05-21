package geometri.BangunDatar;

public class LayangLayang extends BangunDatar {
    protected double diagoal1;
    protected double diagonal2;
    protected double sisiA;
    protected double sisiB;
    
    public LayangLayang(double diagonal1,double diagonal2,double sisiA, double sisiB){
        this(diagonal1, diagonal2, sisiA, sisiB, "Layang-Layang");
    }
    public LayangLayang(double diagonal1,double diagonal2,double sisiA, double sisiB, String nama){
        super(nama);
        this.diagoal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.hitungLuas();
        this.hitungKeliling();
    }
    @Override
    public void hitungKeliling(){
        this.keliling = 2 * (this.sisiA + this.sisiB);
    }
    @Override
    public void hitungLuas(){
        this.luas = 0.5 * diagoal1 * diagonal2;
    }
}
