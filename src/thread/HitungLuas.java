package thread;

public class HitungLuas {
 private Bangun bangun;
    public HitungLuasThread(Bangun bangun) {
        this.bangun = bangun;
    }
    public void run() {
        if (bangun instanceof BangunDatar)
            System.out.println("Luas: " + ((BangunDatar) bangun).hitungLuas());
        else if (bangun instanceof BangunRuang)
            System.out.println("Luas Permukaan: " + ((BangunRuang) bangun).hitungLuasPermukaan());
    }
}
