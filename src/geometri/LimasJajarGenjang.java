package geometri;

public class LimasJajarGenjang extends JajarGenjang {
    public double volume;
    public double luasPermukaan;
    public double tinggiLimas;
    public double tinggiSegitigaPanjang;  
    public double tinggiSegitigaPendek;
    
    public LimasJajarGenjang(double tinggiJajarGenjang, double alasJajarGenjang, double alas, double tinggi, double sisiMiring, double tinggiSegitigaPanjang, double tinggiSegitigaPendek) {
        super(alasJajarGenjang, tinggiJajarGenjang, sisiMiring, "Limas Jajar Genjang");
        this.tinggiLimas = tinggi;
    }
    
    public void hitungVolume() {
        this.volume = 1.0/3 * this.luas * this.tinggiLimas;
    }
    
    private void hitungTinggiSegitigaSisiTegak() {
        // Hitung tinggi segitiga sisi panjang (di sisi alas jajar genjang)
        double setengahAlas = this.alas / 2;
        this.tinggiSegitigaPanjang = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(setengahAlas, 2));
        
        // Hitung tinggi segitiga sisi pendek (di sisi miring jajar genjang)
        double setengahSisiMiring = this.sisiMiring / 2;
        this.tinggiSegitigaPendek = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(setengahSisiMiring, 2));
    }
    public void hitungLuasPermukaan() {
        hitungTinggiSegitigaSisiTegak();
        // Hitung luas 2 segitiga di sisi alas panjang
        double luasSegitigaPanjang = (this.alas * this.tinggiSegitigaPanjang) / 2;
        
        // Hitung luas 2 segitiga di sisi alas pendek (sisi miring)
        double luasSegitigaPendek = (this.sisiMiring * this.tinggiSegitigaPendek) / 2;
        
        // Total luas permukaan = luas alas + semua luas sisi tegak
        this.luasPermukaan = this.luas + (2 * luasSegitigaPanjang) + (2 * luasSegitigaPendek);
    }
    
    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
