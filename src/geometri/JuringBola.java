package geometri;

public class JuringBola extends Bola{
    public double  sudut;
    public JuringBola( double sudut,double jarijari) {
        super(jarijari, "Juring Bola");
        this.sudut = sudut;
    }
    @Override
    public double hitungVolume() {
        try {
            super.volume = (this.sudut / 360) * super.hitungVolume();
            return super.volume;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung volume: " + e.getMessage());
            return 0;
        }
    }
    @Override
    public double hitungLuasPermukaan() {
        try {
            super.luasPermukaan = (this.sudut / 360) * 4 * super.PI * super.jariJari * super.jariJari;
            return super.luasPermukaan;
        } catch (RuntimeException e) {
            System.err.println("Error menghitung luas permukaan: " + e.getMessage());
            return 0;
        }
    }   

}
