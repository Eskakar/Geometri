package thread;

public class HitungKeliling {
  private Bangun bangun;
    public HitungKelilingThread(Bangun bangun) {
        this.bangun = bangun;
    }
    public void run() {
        if (bangun instanceof BangunDatar)
            System.out.println("Keliling: " + ((BangunDatar) bangun).hitungKeliling());
    }
}
