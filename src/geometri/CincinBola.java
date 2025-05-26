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
        this.volume = (4.0/3) * this.PI * (Math.pow(this.r1, 3) - Math.pow(this.r2, 3));
        return this.volume;
    }
    @Override
    public double hitungLuasPermukaan() {
        this.luasPermukaan= 4 * this.PI * (this.r1 * this.r1 - this.r2 * this.r2);
        return this.luasPermukaan;
    }
    
}
