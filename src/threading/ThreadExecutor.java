package threading;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import geometri.BangunDatar;
import geometri.Geometri;

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

        try {
            if (shape.getClass().getSuperclass().equals(BangunDatar.class)) {
                // direct subclass of bangun datar
                BangunDatar bd = (BangunDatar) shape;
                double keliling = bd.hitungKeliling();
                double luas = bd.hitungLuas();
                System.out.printf("%s - [%s] 2D -> Keliling: %.2f, Luas: %.2f%n",
                        threadName, shape.getClass().getSimpleName(), keliling, luas);
            }

            try {
                var volumeMethod = shape.getClass().getMethod("hitungVolume");
                var luasPermukaanMethod = shape.getClass().getMethod("hitungLuasPermukaan");

                double volume = (double) volumeMethod.invoke(shape);
                double luasPermukaan = (double) luasPermukaanMethod.invoke(shape);

                System.out.printf("%s - [%s] Volume: %.2f, Luas Permukaan: %.2f%n",
                        threadName, shape.getClass().getSimpleName(), volume, luasPermukaan);
            } catch (NoSuchMethodException ignored) {
                // gpp kalo 2d dan ga punya vol sm area
            }

        } catch (Exception e) {
            System.err.println("Error processing shape " + shape.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
