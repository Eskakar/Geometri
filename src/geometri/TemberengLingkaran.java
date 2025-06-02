package geometri;

public class TemberengLingkaran extends Lingkaran {
    private double luas;
    private double keliling;
    protected double busur;
    protected double tinggi;
    protected double taliBusur;
    protected double sudut;

    public TemberengLingkaran(double busur,double tinggi, double taliBusur, double  jariJari) {
        super(jariJari, "Tembereng Lingkaran");
        this.busur = busur;
        this.tinggi = tinggi;
        this.taliBusur = taliBusur;
    }

    @Override
    public double hitungKeliling() {
        this.sudut = 2 * Math.acos((super.jariJari - this.tinggi) / super.jariJari);
        this.keliling = sudut * super.jariJari + 2 * Math.sqrt(2 * super.jariJari * this.tinggi - this.tinggi * this.tinggi);
        return this.keliling;
    }
     @Override
    public double hitungLuas() {
        this.luas = (super.jariJari * super.jariJari * Math.acos((super.jariJari - this.tinggi) / super.jariJari) - (super.jariJari - this.tinggi) * Math.sqrt(2 * super.jariJari * this.tinggi - this.tinggi * this.tinggi));
        return this.luas;
    }
}
