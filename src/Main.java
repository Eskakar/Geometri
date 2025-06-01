import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import geometri.JajarGenjang;
import geometri.LimasPersegi;
import geometri.Persegi;
import geometri.PrismaLayangLayang;
import geometri.Segitiga;

public class Main {
    public static void main(String[] args) {
        // objects
        Segitiga segitiga = new Segitiga(6, 4, 5, 6, 7, "Segitiga");
        PrismaLayangLayang prisma = new PrismaLayangLayang(8, 6, 5, 4, 10);
        Persegi persegi = new Persegi(5, "Persegi");
        LimasPersegi limas = new LimasPersegi(5, 7);
        JajarGenjang jajarGenjang = new JajarGenjang(6, 4, 5);

        // pool
        ExecutorService executor = Executors.newFixedThreadPool(5);

        executor.execute(() -> {
            System.out.println(segitiga + ":");
            System.out.println("  Luas     = " + segitiga.hitungLuas());
            System.out.println("  Keliling = " + segitiga.hitungKeliling());
        });

        executor.execute(() -> {
            double volume = prisma.hitungVolume();
            double luasPermukaan = prisma.hitungLuasPermukaan();
            System.out.println(prisma + ":");
            System.out.println("Prisma Volume         = " + volume);
            System.out.println("  Luas Permukaan = " + luasPermukaan);
        });

        executor.execute(() -> {
            double luas = persegi.hitungLuas();
            double keliling = persegi.hitungKeliling();
            System.out.println(persegi + ":");
            System.out.println("  Luas     = " + luas);
            System.out.println("  Keliling = " + keliling);
        });

        executor.execute(() -> {
            double volume = limas.hitungVolume();
            double luasPermukaan = limas.hitungLuasPermukaan();
            System.out.println(limas + ":");
            System.out.println("  Volume         = " + volume);
            System.out.println("  Luas Permukaan = " + luasPermukaan);
        });

        executor.execute(() -> {
            double luas = jajarGenjang.hitungLuas();
            double keliling = jajarGenjang.hitungKeliling();
            System.out.println(jajarGenjang + ":");
            System.out.println("  Luas     = " + luas);
            System.out.println("  Keliling = " + keliling);
        });

        executor.shutdown();
    }
}
