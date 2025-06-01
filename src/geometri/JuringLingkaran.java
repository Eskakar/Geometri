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
        super.keliling = 2 * super.jariJari + (this.sudutPusat / 360.0) * 2 * super.PI * super.jariJari;
        return super.keliling;
        
    };
    @Override
    public double hitungLuas(){
        super.luas = (this.sudutPusat / 360.0) * super.luas;
        return super.luas;
    };
}
