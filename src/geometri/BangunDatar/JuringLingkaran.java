package geometri.BangunDatar;

public class JuringLingkaran extends Lingkaran {

    protected double sudutPusat; 
    protected double busur;

    public JuringLingkaran(double sudutPusat, double busur, double jariJari) {
        super(jariJari, "Juring Lingkaran");
        this.sudutPusat = sudutPusat;
        this.busur = busur;
        this.hitungLuas();
        this.hitungKeliling();
    }

    @Override
    public void hitungKeliling(){
        this.keliling = 2 * this.jariJari + (this.sudutPusat / 360.0) * 2 * this.PI * this.jariJari;
        
    };
    @Override
    public void hitungLuas(){
        // bingung cuy 
        this.luas = (this.sudutPusat / 360.0) * this.luas;
    };
}
