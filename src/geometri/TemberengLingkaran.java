package geometri;

public class TemberengLingkaran extends Lingkaran {
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
    public void hitungKeliling() {
        this.sudut = 2 * Math.acos((this.jariJari - this.tinggi) / this.jariJari);
        this.keliling = sudut * this.jariJari + 2 * Math.sqrt(2 * this.jariJari * this.tinggi - this.tinggi * this.tinggi);

    }
     @Override
    public void hitungLuas() {
        this.luas = (this.jariJari * this.jariJari * Math.acos((this.jariJari - this.tinggi) / this.jariJari) - (this.jariJari - this.tinggi) * Math.sqrt(2 * this.jariJari * this.tinggi - this.tinggi * this.tinggi));
    }
}
