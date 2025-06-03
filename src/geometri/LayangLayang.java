package geometri;

public class LayangLayang extends BangunDatar {
    protected double diagonal1;
    protected double diagonal2;
    protected double sisiA;
    protected double sisiB;
    
    public LayangLayang(double diagonal1,double diagonal2,double sisiA, double sisiB){
        this(diagonal1, diagonal2, sisiA, sisiB, "Layang-Layang");
    }

    public LayangLayang(double diagonal1,double diagonal2,double sisiA, double sisiB, String nama){
        super(nama);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    @Override
    public double hitungKeliling(){
        try {
            super.keliling = 2 * (this.sisiA + this.sisiB);
            return super.keliling;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung keliling: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public double hitungLuas(){
        try {
            super.luas = 0.5 * diagonal1 * diagonal2;
            return super.luas;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas: " + e.getMessage());
            return 0;
        }
    }
}
