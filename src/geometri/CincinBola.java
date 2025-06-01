package geometri;

public class CincinBola extends Bola{
    public double r1;
    public double r2;
    public CincinBola(double r1, double r2,double jarijari) {
        super(jarijari, "Cincin Bola");
        this.r1 = r1;
        this.r2 = r2;
    }
    @Override
    public double hitungVolume() {
        super.volume = (4.0/3) * super.PI * (Math.pow(this.r1, 3) - Math.pow(this.r2, 3));
        return super.volume;
    }
    @Override
    public double hitungLuasPermukaan() {
        super.luasPermukaan= 4 * super.PI * (this.r1 * this.r1 - this.r2 * this.r2);
        return super.luasPermukaan;
    }
    
}
