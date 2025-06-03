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
        try {
            this.keliling = 2 * super.jariJari + (this.sudutPusat / 360.0) * 2 * super.PI * super.jariJari;
            return this.keliling;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung keliling: " + e.getMessage());
            return 0;
        }
        
    };
    @Override
    public double hitungLuas(){
        try {
            this.luas = (this.sudutPusat / 360.0) * super.hitungLuas();
            return this.luas;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas: " + e.getMessage());
            return 0;
        }
    };
}
