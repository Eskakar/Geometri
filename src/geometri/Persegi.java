package geometri;

public class Persegi extends BangunDatar implements Runnable {
    private Thread thread;

    protected double sisi;
    public Persegi(double sisi) {
        this(sisi, "Persegi");
    }
    public Persegi(double sisi, String nama) {
        super(nama);
        this.sisi = sisi;
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public double hitungLuas() {
        this.luas = this.sisi * this.sisi;
        return this.luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = 4 * this.sisi;
        return this.keliling;
    }

    @Override
    public void run() {
        hitungKeliling();
        hitungLuas();
    }
    
    public void waitDone() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
