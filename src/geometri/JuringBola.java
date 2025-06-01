package geometri;

public class JuringBola extends Bola{
    public double  sudut;
    public JuringBola( double sudut,double jarijari) {
        super(jarijari, "Juring Bola");
        this.sudut = sudut;
    }
    @Override
    public double hitungVolume() {
        super.volume = (this.sudut / 360) * super.volume;
        return super.volume;
    }
    @Override
    public double hitungLuasPermukaan() {
        super.luasPermukaan = (this.sudut / 360) * 4 * super.PI * super.jariJari * super.jariJari;
        return super.luasPermukaan;
    }   

}
