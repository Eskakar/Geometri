package geometri;

public class JuringLingkaran extends Lingkaran {

    protected double sudutPusat; 
    protected double busur;

    public JuringLingkaran(double sudutPusat, double busur, double jariJari) {
        super(jariJari, "Juring Lingkaran");
        this.sudutPusat = sudutPusat;
        this.busur = busur;
    }

    @Override
    public double hitungKeliling(){
        this.keliling = 2 * this.jariJari + (this.sudutPusat / 360.0) * 2 * this.PI * this.jariJari;
        return this.keliling;
        
    };
    @Override
    public double hitungLuas(){
        this.luas = (this.sudutPusat / 360.0) * this.luas;
        return this.luas;
    };
}
