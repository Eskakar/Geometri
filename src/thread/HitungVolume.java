package thread;

public class HitungVolume {
 private Bangun bangun;
    public HitungVolumeThread(Bangun bangun) {
        this.bangun = bangun;
    }
    public void run() {
        if (bangun instanceof BangunRuang)
            System.out.println("Volume: " + ((BangunRuang) bangun).hitungVolume());
    }
}
