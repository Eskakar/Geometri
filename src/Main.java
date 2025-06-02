import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import geometri.BelahKetupat;
import geometri.Bola;
import geometri.CincinBola;
import geometri.Geometri;
import geometri.JajarGenjang;
import geometri.JuringBola;
import geometri.JuringLingkaran;
import geometri.Kerucut;
import geometri.KerucutTerpancung;
import geometri.LayangLayang;
import geometri.LimasBelahKetupat;
import geometri.LimasJajarGenjang;
import geometri.LimasLayangLayang;
import geometri.LimasPersegi;
import geometri.LimasPersegiPanjang;
import geometri.LimasSegitiga;
import geometri.LimasTrapesium;
import geometri.Lingkaran;
import geometri.Persegi;
import geometri.PersegiPanjang;
import geometri.PrismaBelahKetupat;
import geometri.PrismaJajarGenjang;
import geometri.PrismaLayangLayang;
import geometri.PrismaPersegi;
import geometri.PrismaPersegiPanjang;
import geometri.PrismaSegitiga;
import geometri.PrismaTrapesium;
import geometri.Segitiga;
import geometri.Tabung;
import geometri.TemberengBola;
import geometri.TemberengLingkaran;
import geometri.Trapesium;
import threading.ThreadExecutor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Geometri> shapes = new ArrayList<>();
        Random rand = new Random();

        String[] options = {
            "0. Semua Geometri",
            "1. Segitiga",
            "2. Persegi",
            "3. Persegi Panjang",
            "4. Lingkaran",
            "5. Trapesium",
            "6. Jajar Genjang",
            "7. Belah Ketupat",
            "8. Layang-Layang",
            "9. Juring Lingkaran",
            "10. Tembereng Lingkaran",
            "11. Bola",
            "12. Tabung",
            "13. Kerucut",
            "14. Kerucut Terpancung",
            "15. Cincin Bola",
            "16. Juring Bola",
            "17. Tembereng Bola",
            "18. Limas Persegi",
            "19. Limas Persegi Panjang",
            "20. Limas Segitiga",
            "21. Limas Belah Ketupat",
            "22. Limas Jajar Genjang",
            "23. Limas Trapesium",
            "24. Limas Layang-Layang",
            "25. Prisma Persegi",
            "26. Prisma Persegi Panjang",
            "27. Prisma Segitiga",
            "28. Prisma Belah Ketupat",
            "29. Prisma Jajar Genjang",
            "30. Prisma Trapesium",
            "31. Prisma Layang-Layang"
        };

        System.out.println("Pilih metode input:");
        System.out.println("1. Input manual");
        System.out.println("2. Generate otomatis (random)");
        System.out.print("Pilihan: ");
        int mode = scanner.nextInt();

        if (mode == 1) {
            boolean lanjut = true;
            while (lanjut) {
                for (String option : options) {
                    System.out.println(option);
                }
                System.out.print("Masukkan nomor geometri: ");
                int choice = scanner.nextInt();

                try {
                    Geometri shape = generateManualShape(choice, scanner);
                    shapes.add(shape);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                System.out.print("Ingin input bangun lain? (y/n): ");
                String again = scanner.next();
                lanjut = again.equalsIgnoreCase("y");
            }
        } else if (mode == 2) {
            for (String option : options) {
                System.out.println(option);
            }

            System.out.print("Masukkan nomor geometri: ");
            int choice = scanner.nextInt();
            System.out.print("Masukkan jumlah objek per bentuk: ");
            int jumlah = scanner.nextInt();

            if (choice == 0) {
                for (int i = 1; i <= 31; i++) {
                    for (int j = 0; j < jumlah; j++) {
                        shapes.add(generateRandomShape(i));
                    }
                }
            } else {
                for (int i = 0; i < jumlah; i++) {
                    shapes.add(generateRandomShape(choice));
                }
            }
        } else {
            System.out.println("Pilihan tidak valid.");
            scanner.close();
            return;
        }

        // Proses dan tampilkan hasil
        ThreadExecutor.processShapes(shapes);
        scanner.close();
    }

    private static Geometri generateRandomShape(int choice) {
        return switch (choice) {
            case 1 -> new Segitiga(r(), r(), r(), r(), r());
            case 2 -> new Persegi(r());
            case 3 -> new PersegiPanjang(r(), r());
            case 4 -> new Lingkaran(r());
            case 5 -> new Trapesium(r(), r(), r(), r(), r());
            case 6 -> new JajarGenjang(r(), r(), r());
            case 7 -> new BelahKetupat(r(), r());
            case 8 -> new LayangLayang(r(), r(), r(), r());
            case 9 -> new JuringLingkaran(r(1, 360), r(), r());
            case 10 -> new TemberengLingkaran(r(), r(), r(), r());
            case 11 -> new Bola(r());
            case 12 -> new Tabung(r(), r());
            case 13 -> new Kerucut(r(), r());
            case 14 -> new KerucutTerpancung(r(), r(), r());
            case 15 -> new CincinBola(r(), r(), r());
            case 16 -> new JuringBola(r(1, 360), r());
            case 17 -> new TemberengBola(r(), r(), r());
            case 18 -> new LimasPersegi(r(), r());
            case 19 -> new LimasPersegiPanjang(r(), r(), r());
            case 20 -> new LimasSegitiga(r(), r(), r(), r(), r(), r());
            case 21 -> new LimasBelahKetupat(r(), r(), r());
            case 22 -> new LimasJajarGenjang(r(), r(), r(), r(), r(), r());
            case 23 -> new LimasTrapesium(r(), r(), r(), r(), r(), r());
            case 24 -> new LimasLayangLayang(r(), r(), r(), r(), r(), r(), r());
            case 25 -> new PrismaPersegi(r(), r());
            case 26 -> new PrismaPersegiPanjang(r(), r(), r());
            case 27 -> new PrismaSegitiga(r(), r(), r(), r(), r(), r());
            case 28 -> new PrismaBelahKetupat(r(), r(), r());
            case 29 -> new PrismaJajarGenjang(r(), r(), r(), r());
            case 30 -> new PrismaTrapesium(r(), r(), r(), r(), r(), r(), "Prisma Trapesium");
            case 31 -> new PrismaLayangLayang(r(), r(), r(), r(), r());
            default -> throw new IllegalArgumentException("Pilihan tidak valid: " + choice);
        };
    }

    private static Geometri generateManualShape(int choice, Scanner scanner) {
        return switch (choice) {
            case 1 -> {
                System.out.print("Alas: "); double a = scanner.nextDouble();
                System.out.print("Tinggi: "); double t = scanner.nextDouble();
                System.out.print("Sisi A: "); double s1 = scanner.nextDouble();
                System.out.print("Sisi B: "); double s2 = scanner.nextDouble();
                System.out.print("Sisi C: "); double s3 = scanner.nextDouble();
                yield new Segitiga(a, t, s1, s2, s3);
            }
            case 2 -> {
                System.out.print("Sisi: "); double sisi = scanner.nextDouble();
                yield new Persegi(sisi);
            }
            case 3 -> {
                System.out.print("Panjang: "); double p = scanner.nextDouble();
                System.out.print("Lebar: "); double l = scanner.nextDouble();
                yield new PersegiPanjang(p, l);
            }
            case 4 -> {
                System.out.print("Jari-jari: "); double r = scanner.nextDouble();
                yield new Lingkaran(r);
            }
            // Tambahkan case lain sesuai kebutuhanmu
            default -> throw new IllegalArgumentException("Input manual belum diimplementasikan untuk bangun ini.");
        };
    }

    private static double r() {
        return 1 + Math.random() * 10;
    }

    private static double r(double min, double max) {
        return min + Math.random() * (max - min);
    }
}
