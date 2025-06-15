package threading;

import java.util.List;
import java.util.concurrent.*;
import java.util.ArrayList;

import geometri.BangunDatar;
import geometri.Geometri;

import geometri.TemberengLingkaran;
import geometri.JuringLingkaran;

public class ThreadExecutor {
    
     public static List<String> processShapes(List<Geometri> shapes) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        
        List<Future<String>> futures = new ArrayList<>();
        
        List<String> results = new ArrayList<>();

        for (Geometri shape : shapes) {
            Future<String> future = executor.submit(() -> processShape(shape));
            futures.add(future);
        }

        executor.shutdown();

        for (Future<String> future : futures) {
            try {
                String result = future.get();
                if (result != null) {
                    results.add(result);
                }
            } catch (InterruptedException | ExecutionException e) {
                System.err.println("Error retrieving shape processing result: " + e.getMessage());
            }
        }

        return results;
    }

    private static String processShape(Geometri shape) {
        String threadName = Thread.currentThread().getName();

        try {
            if (shape.getClass().getSuperclass().equals(BangunDatar.class) || shape.getClass().equals(TemberengLingkaran.class) || shape.getClass().equals(JuringLingkaran.class)) {
                BangunDatar bd = (BangunDatar) shape;
                double keliling = bd.hitungKeliling();
                double luas = bd.hitungLuas();
                return String.format("""
                        %s - [%s] 2D ->
                            %-16s: %.2f
                            %-16s: %.2f\n""",
                        threadName, shape.getClass().getSimpleName(), "Keliling", keliling, "Luas", luas);
            }

            try {
                var volumeMethod = shape.getClass().getMethod("hitungVolume");
                var luasPermukaanMethod = shape.getClass().getMethod("hitungLuasPermukaan");

                double volume = (double) volumeMethod.invoke(shape);
                double luasPermukaan = (double) luasPermukaanMethod.invoke(shape);

                return String.format("""
                        %s - [%s] 3D ->
                            %-16s: %.2f
                            %-16s: %.2f\n""",
                        threadName, shape.getClass().getSimpleName(), "Volume", volume, "Luas Permukaan",
                        luasPermukaan);
            } catch (NoSuchMethodException ignored) {
                // gpp kalo 2d dan ga punya vol sm area
            }

        } catch (Exception e) {
            System.err.println("Error processing shape " + shape.getClass().getSimpleName() + ": " + e.getMessage());
        }
        
        return null;
    }
}
