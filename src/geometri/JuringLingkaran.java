package geometri;

public class JuringLingkaran extends Lingkaran {
    private double luas;
    private double keliling;
    protected double sudutPusat; 
    protected double busur;

    public JuringLingkaran(double sudutPusat, double busur, double jariJari) {
        super(jariJari, "Juring Lingkaran");
        this.sudutPusat = sudutPusat;
        this.busur = busur;
    }

    @Override
    public double hitungKeliling(){
        this.keliling = 2 * super.jariJari + (this.sudutPusat / 360.0) * 2 * super.PI * super.jariJari;
        return this.keliling;
        
    };
    @Override
    public double hitungLuas(){
        this.luas = (this.sudutPusat / 360.0) * super.hitungLuas();
        return this.luas;
    };
}
