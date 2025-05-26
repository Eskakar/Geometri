package geometri;

public class JuringBola extends Bola{
    public double  sudut;
    public JuringBola( double sudut,double jarijari) {
        super(jarijari, "Juring Bola");
        this.sudut = sudut;
    }
    @Override
    public void hitungVolume() {
        this.volume = (this.sudut / 360) * this.volume;
    }
    @Override
    public void hitungLuasPermukaan() {
        this.luasPermukaan = (this.sudut / 360) * 4 * this.PI * this.jariJari * this.jariJari;
    }   

}
