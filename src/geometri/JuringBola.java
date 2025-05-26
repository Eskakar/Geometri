package geometri;

public class JuringBola extends Bola{
    public double  sudut;
    public JuringBola( double sudut,double jarijari) {
        super(jarijari, "Juring Bola");
        this.sudut = sudut;
    }
    @Override
    public double hitungVolume() {
        this.volume = (this.sudut / 360) * this.volume;
        return this.volume;
    }
    @Override
    public double hitungLuasPermukaan() {
        this.luasPermukaan = (this.sudut / 360) * 4 * this.PI * super.jariJari * super.jariJari;
        return this.luasPermukaan;
    }   

}
