import java.util.ArrayList;
import java.util.List;

import geometri.*;

import threading.ThreadExecutor;

public class Main {
    public static void main(String[] args) {
        List<Geometri> shapes = new ArrayList<>();

        // 2D: Persegi — luas = 100, keliling = 40
        shapes.add(new Persegi(10));

        // 2D: Layang-layang — luas = 24, keliling = 18
        shapes.add(new LayangLayang(8, 6, 5, 4));

        // 3D: LimasPersegi — luas permukaan = 360, volume = 400
        shapes.add(new LimasPersegi(10, 12));

        // 3D: PrismaLayangLayang — luas permukaan = 228, volume = 240
        shapes.add(new PrismaLayangLayang(8, 6, 5, 4, 10));

        // 2D: BelahKetupat — luas = 24.0, keliling ≈ 20
        shapes.add(new BelahKetupat(8, 6));

        // 3D: Bola — luas permukaan ≈ 615.75, volume ≈ 1436.76
        shapes.add(new Bola(7));

        // 3D: CincinBola — (Assuming spherical cap subtraction logic) luas permukaan
        // and volume ≈ depends on full formula
        shapes.add(new CincinBola(3, 2, 5)); // jari-jari = 5

        // 2D: JajarGenjang — luas = 60.0, keliling = 34.0
        shapes.add(new JajarGenjang(10, 6, 7));

        // 3D: JuringBola — luas permukaan ≈ 157.08, volume ≈ 261.80
        shapes.add(new JuringBola(90, 5)); // 90° sector of a 5-radius sphere

        // 2D: JuringLingkaran — luas ≈ 10.99, keliling = 17.14
        shapes.add(new JuringLingkaran(60, 3.14, 7));

        // 3D: Kerucut — luas permukaan ≈ 201.06, volume ≈ 201.06
        shapes.add(new Kerucut(12, 4));

        // 3D: KerucutTerpancung — luas permukaan ≈ 306.13, volume ≈ 603.19
        shapes.add(new KerucutTerpancung(10, 5, 3));

        // 2D: LayangLayang — luas = 30.0, keliling = 18.0
        shapes.add(new LayangLayang(10, 6, 5, 4));

        // 3D: LimasBelahKetupat — luas permukaan ≈ 154.93, volume = 96.0
        shapes.add(new LimasBelahKetupat(8, 6, 12));

        // 3D: LimasJajarGenjang — luas permukaan ≈ 320.0, volume = 240.0
        shapes.add(new LimasJajarGenjang(10, 6, 7, 12, 8, 6));

        // 3D: LimasLayangLayang — luas permukaan ≈ 247.68, volume = 120.0
        shapes.add(new LimasLayangLayang(14, 10, 8, 10, 6, 5, 4));

        // 3D: LimasPersegi — luas permukaan ≈ 156.0, volume = 120.0
        shapes.add(new LimasPersegi(6, 10));

        // 3D: LimasPersegiPanjang — luas permukaan ≈ 214.0, volume = 133.33
        shapes.add(new LimasPersegiPanjang(8, 5, 10));

        // 3D: LimasSegitiga — luas permukaan ≈ 135.0, volume = 40.0
        shapes.add(new LimasSegitiga(6, 10, 4, 5, 5, 5));

        // 3D: LimasTrapesium — luas permukaan ≈ 195.64, volume = 132.0
        shapes.add(new LimasTrapesium(12, 6, 4, 8, 5, 5));

        // 2D: Lingkaran — luas ≈ 153.94, keliling ≈ 43.98
        shapes.add(new Lingkaran(7));

        // 2D: Persegi — luas = 36.0, keliling = 24.0
        shapes.add(new Persegi(6));

        // 2D: Persegi Panjang — luas = 40.0, keliling = 26.0
        shapes.add(new PersegiPanjang(8, 5));

        // 3D: PrismaBelahKetupat — luas permukaan ≈ 244.0, volume = 96.0
        shapes.add(new PrismaBelahKetupat(8, 6, 4));

        // 3D: PrismaJajarGenjang — luas permukaan = 232.0, volume = 240.0
        shapes.add(new PrismaJajarGenjang(10, 6, 4, 7));

        // 3D: PrismaLayangLayang — luas permukaan = 236.0, volume = 120.0
        shapes.add(new PrismaLayangLayang(10, 6, 5, 4, 4));

        // 3D: PrismaPersegi — luas permukaan = 216.0, volume = 144.0
        shapes.add(new PrismaPersegi(6, 4));

        // 3D: PrismaPersegiPanjang — luas permukaan = 236.0, volume = 160.0
        shapes.add(new PrismaPersegiPanjang(8, 5, 4));

        // 3D: PrismaSegitiga — luas permukaan = 200.0, volume = 60.0
        shapes.add(new PrismaSegitiga(6, 4, 5, 5, 5, 5));

        // 3D: PrismaTrapesium — luas permukaan = 280.0, volume = 144.0
        shapes.add(new PrismaTrapesium(4, 8, 5, 5, 6, 6, "Prisma Trapesium"));

        // 2D: Segitiga — luas = 12.0, keliling = 15
        shapes.add(new Segitiga(6, 4, 5, 5, 5));

        // 3D: Tabung — luas permukaan ≈ 659.73, volume ≈ 615.75
        shapes.add(new Tabung(7, 4));

        // 3D: TemberengBola — (Approximated) luas permukaan ≈ 153.94, volume ≈ 83.78
        shapes.add(new TemberengBola(5, 3, 5));

        // 2D: TemberengLingkaran — (Approximated) luas ≈ 45.75, keliling ≈ 25.14
        shapes.add(new TemberengLingkaran(12, 4, 10, 7));

        // 2D: Trapesium — luas = 36.0, keliling = 22.0
        shapes.add(new Trapesium(4, 8, 5, 5, 6));

        // Run threaded calculation
        ThreadExecutor.processShapes(shapes);
    }
}