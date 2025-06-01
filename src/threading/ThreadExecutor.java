package threading;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import geometri.BangunDatar;
import geometri.Geometri;
import geometri.LimasPersegi;

public class ThreadExecutor {

    public static void processShapes(List<Geometri> shapes) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (Geometri shape : shapes) {
            executor.submit(() -> processShape(shape));
        }

        executor.shutdown();
    }

    private static void processShape(Geometri shape) {
        String threadName = Thread.currentThread().getName();

        if (shape instanceof BangunDatar) {
            BangunDatar bd = (BangunDatar) shape;
            System.out.printf("%s - [%s] Keliling: %.2f, Luas: %.2f%n",
                    threadName, shape.getClass().getSimpleName(),
                    bd.hitungKeliling(), bd.hitungLuas());
        }

        if (shape instanceof LimasPersegi) {
            LimasPersegi lp = (LimasPersegi) shape;
            System.out.printf("%s - [%s] Volume: %.2f, Luas Permukaan: %.2f%n",
                    threadName, shape.getClass().getSimpleName(),
                    lp.hitungVolume(), lp.hitungLuasPermukaan());
        }
    }
}
