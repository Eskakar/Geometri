import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import geometri.*;
import threading.ThreadExecutor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Geometri> shapes = new ArrayList<>();

        String[] options = {
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

        System.out.println("Pilih jenis geometri:");
        for (String option : options) {
            System.out.println(option);
        }

        System.out.print("Masukkan nomor geometri: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Masukkan jumlah objek yang ingin dihitung: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n[Data ke-" + (i + 1) + "]");

            switch (choice) {
                case 1 -> { // Segitiga
                    System.out.print("Alas: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Tinggi: ");
                    double tinggi = scanner.nextDouble();
                    System.out.print("Sisi A: ");
                    double a = scanner.nextDouble();
                    System.out.print("Sisi B: ");
                    double b = scanner.nextDouble();
                    System.out.print("Sisi C: ");
                    double c = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new Segitiga(alas, tinggi, a, b, c));
                }
                case 2 -> {
                    System.out.print("Sisi: ");
                    double sisi = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new Persegi(sisi));
                }
                case 3 -> {
                    System.out.print("Panjang: ");
                    double p = scanner.nextDouble();
                    System.out.print("Lebar: ");
                    double l = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new PersegiPanjang(p, l));
                }
                case 4 -> {
                    System.out.print("Jari-jari: ");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new Lingkaran(r));
                }
                case 5 -> {
                    System.out.print("Sisi Atas: ");
                    double atas = scanner.nextDouble();
                    System.out.print("Sisi Bawah: ");
                    double bawah = scanner.nextDouble();
                    System.out.print("Sisi Kanan: ");
                    double kanan = scanner.nextDouble();
                    System.out.print("Sisi Kiri: ");
                    double kiri = scanner.nextDouble();
                    System.out.print("Tinggi: ");
                    double t = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new Trapesium(atas, bawah, kanan, kiri, t));
                }
                case 6 -> {
                    System.out.print("Alas: ");
                    double a = scanner.nextDouble();
                    System.out.print("Tinggi: ");
                    double t = scanner.nextDouble();
                    System.out.print("Sisi miring: ");
                    double sm = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new JajarGenjang(a, t, sm));
                }
                case 7 -> {
                    System.out.print("Diagonal 1: ");
                    double d1 = scanner.nextDouble();
                    System.out.print("Diagonal 2: ");
                    double d2 = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new BelahKetupat(d1, d2));
                }
                case 8 -> {
                    System.out.print("Diagonal 1: ");
                    double d1 = scanner.nextDouble();
                    System.out.print("Diagonal 2: ");
                    double d2 = scanner.nextDouble();
                    System.out.print("Sisi A: ");
                    double sa = scanner.nextDouble();
                    System.out.print("Sisi B: ");
                    double sb = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new LayangLayang(d1, d2, sa, sb));
                }
                case 9 -> {
                    System.out.print("Sudut pusat (°): ");
                    double sudut = scanner.nextDouble();
                    System.out.print("Busur: ");
                    double busur = scanner.nextDouble();
                    System.out.print("Jari-jari: ");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new JuringLingkaran(sudut, busur, r));
                }
                case 10 -> {
                    System.out.print("Busur: ");
                    double busur = scanner.nextDouble();
                    System.out.print("Tinggi: ");
                    double tinggi = scanner.nextDouble();
                    System.out.print("Tali busur: ");
                    double tb = scanner.nextDouble();
                    System.out.print("Jari-jari: ");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new TemberengLingkaran(busur, tinggi, tb, r));
                }
                case 11 -> {
                    System.out.print("Jari-jari bola: ");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new Bola(r));
                }
                case 12 -> {
                    System.out.print("Jari-jari: ");
                    double r = scanner.nextDouble();
                    System.out.print("Tinggi: ");
                    double t = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new Tabung(r, t));
                }
                case 13 -> {
                    System.out.print("Tinggi: ");
                    double t = scanner.nextDouble();
                    System.out.print("Jari-jari: ");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new Kerucut(t, r));
                }
                case 14 -> {
                    System.out.print("Tinggi: ");
                    double t = scanner.nextDouble();
                    System.out.print("Jari-jari bawah: ");
                    double r1 = scanner.nextDouble();
                    System.out.print("Jari-jari atas: ");
                    double r2 = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new KerucutTerpancung(t, r1, r2));
                }
                case 15 -> {
                    System.out.print("r1: ");
                    double r1 = scanner.nextDouble();
                    System.out.print("r2: ");
                    double r2 = scanner.nextDouble();
                    System.out.print("Jari-jari: ");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new CincinBola(r1, r2, r));
                }
                case 16 -> {
                    System.out.print("Sudut: ");
                    double sudut = scanner.nextDouble();
                    System.out.print("Jari-jari: ");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new JuringBola(sudut, r));
                }
                case 17 -> {
                    System.out.print("Jari-jari tembereng: ");
                    double rt = scanner.nextDouble();
                    System.out.print("Tinggi: ");
                    double tinggi = scanner.nextDouble();
                    System.out.print("Jari-jari bola: ");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new TemberengBola(rt, tinggi, r));
                }
                case 18 -> {
                    System.out.print("Sisi: ");
                    double sisi = scanner.nextDouble();
                    System.out.print("Tinggi limas: ");
                    double tinggi = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new LimasPersegi(sisi, tinggi));
                }
                case 19 -> {
                    System.out.print("Panjang: ");
                    double p = scanner.nextDouble();
                    System.out.print("Lebar: ");
                    double l = scanner.nextDouble();
                    System.out.print("Tinggi limas: ");
                    double t = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new LimasPersegiPanjang(p, l, t));
                }
                case 20 -> {
                    System.out.print("Alas: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Tinggi limas: ");
                    double tl = scanner.nextDouble();
                    System.out.print("Tinggi segitiga: ");
                    double ts = scanner.nextDouble();
                    System.out.print("Sisi A: ");
                    double a = scanner.nextDouble();
                    System.out.print("Sisi B: ");
                    double b = scanner.nextDouble();
                    System.out.print("Sisi C: ");
                    double c = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new LimasSegitiga(alas, tl, ts, a, b, c));
                }
                case 21 -> { // Limas Belah Ketupat
                    System.out.print("Diagonal 1: ");
                    double d1 = scanner.nextDouble();
                    System.out.print("Diagonal 2: ");
                    double d2 = scanner.nextDouble();
                    System.out.print("Tinggi limas: ");
                    double tinggi = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new LimasBelahKetupat(d1, d2, tinggi));
                }
                case 22 -> { // Limas Jajar Genjang
                    System.out.print("Alas: ");
                    double a = scanner.nextDouble();
                    System.out.print("Tinggi alas: ");
                    double ta = scanner.nextDouble();
                    System.out.print("Sisi miring: ");
                    double sm = scanner.nextDouble();
                    System.out.print("Tinggi limas: ");
                    double tinggi = scanner.nextDouble();
                    System.out.print("Tinggi segitiga panjang: ");
                    double tinggiSP= scanner.nextDouble();
                    System.out.print("Tinggi segitiga pendek: ");
                    double tinggiSpen = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new LimasJajarGenjang(a, ta, sm, tinggi,tinggiSP,tinggiSpen));
                }
                case 23 -> { // Limas Trapesium
                    System.out.print("Atas: ");
                    double atas = scanner.nextDouble();
                    System.out.print("Bawah: ");
                    double bawah = scanner.nextDouble();
                    System.out.print("Kanan: ");
                    double kanan = scanner.nextDouble();
                    System.out.print("Kiri: ");
                    double kiri = scanner.nextDouble();
                    System.out.print("Tinggi trapesium: ");
                    double tinggit = scanner.nextDouble();
                    System.out.print("Tinggi limas: ");
                    double tinggil = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new LimasTrapesium(atas, bawah, kanan, kiri, tinggit, tinggil));
                }
                case 24 -> { // Limas Layang-Layang
                    System.out.print("Diagonal 1: ");
                    double d1 = scanner.nextDouble();
                    System.out.print("Diagonal 2: ");
                    double d2 = scanner.nextDouble();
                    System.out.print("Sisi A: ");
                    double a = scanner.nextDouble();
                    System.out.print("Sisi B: ");
                    double b = scanner.nextDouble();
                    System.out.print("Tinggi limas: ");
                    double tinggi = scanner.nextDouble();
                    System.out.print("Tinggi sisi tegak 1: ");
                    double tinggiTegak1 = scanner.nextDouble();
                    System.out.print("Tinggi sisi tegak 2: ");
                    double tinggiTegak2 = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new LimasLayangLayang( tinggi,tinggiTegak1,tinggiTegak2,d1, d2, a, b));
                }
                case 25 -> { // Prisma Persegi
                    System.out.print("Sisi: ");
                    double sisi = scanner.nextDouble();
                    System.out.print("Tinggi prisma: ");
                    double tinggi = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new PrismaPersegi(sisi, tinggi));
                }
                case 26 -> { // Prisma Persegi Panjang
                    System.out.print("Panjang: ");
                    double p = scanner.nextDouble();
                    System.out.print("Lebar: ");
                    double l = scanner.nextDouble();
                    System.out.print("Tinggi prisma: ");
                    double t = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new PrismaPersegiPanjang(p, l, t));
                }
                case 27 -> { // Prisma Segitiga
                    System.out.print("Alas: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Tinggi segitiga: ");
                    double tinggis = scanner.nextDouble();
                    System.out.print("Tinggi prisma: ");
                    double tinggip = scanner.nextDouble();
                    System.out.print("Sisi A: ");
                    double a = scanner.nextDouble();
                    System.out.print("Sisi B: ");
                    double b = scanner.nextDouble();
                    System.out.print("Sisi C: ");
                    double c = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new PrismaSegitiga(alas, tinggis, tinggip, a, b, c));
                }
                case 28 -> { // Prisma Belah Ketupat
                    System.out.print("Diagonal 1: ");
                    double d1 = scanner.nextDouble();
                    System.out.print("Diagonal 2: ");
                    double d2 = scanner.nextDouble();
                    System.out.print("Tinggi prisma: ");
                    double tinggi = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new PrismaBelahKetupat(d1, d2, tinggi));
                }
                case 29 -> { // Prisma Jajar Genjang
                    System.out.print("Alas: ");
                    double a = scanner.nextDouble();
                    System.out.print("Tinggi alas: ");
                    double ta = scanner.nextDouble();
                    System.out.print("Sisi miring: ");
                    double sm = scanner.nextDouble();
                    System.out.print("Tinggi prisma: ");
                    double tinggi = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new PrismaJajarGenjang(a, ta, sm, tinggi));
                }
                case 30 -> { // Prisma Trapesium
                    System.out.print("Atas: ");
                    double atas = scanner.nextDouble();
                    System.out.print("Bawah: ");
                    double bawah = scanner.nextDouble();
                    System.out.print("Kanan: ");
                    double kanan = scanner.nextDouble();
                    System.out.print("Kiri: ");
                    double kiri = scanner.nextDouble();
                    System.out.print("Tinggi trapesium: ");
                    double tinggit = scanner.nextDouble();
                    System.out.print("Tinggi prisma: ");
                    double tinggip = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new PrismaTrapesium(atas, bawah, kanan, kiri, tinggit, tinggip,"Prisma Trapesium"));
                }
                case 31 -> { // Prisma Layang-Layang
                    System.out.print("Diagonal 1: ");
                    double d1 = scanner.nextDouble();
                    System.out.print("Diagonal 2: ");
                    double d2 = scanner.nextDouble();
                    System.out.print("Sisi A: ");
                    double a = scanner.nextDouble();
                    System.out.print("Sisi B: ");
                    double b = scanner.nextDouble();
                    System.out.print("Tinggi prisma: ");
                    double tinggi = scanner.nextDouble();
                    scanner.nextLine();
                    shapes.add(new PrismaLayangLayang(d1, d2, a, b, tinggi));
                }

                default -> System.out.println("Pilihan belum didukung atau belum ditambahkan.");
            }
        }

        // Proses perhitungan dengan thread
        ThreadExecutor.processShapes(shapes);
        scanner.close();
    }
}
