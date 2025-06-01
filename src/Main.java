import java.util.ArrayList;
import java.util.List;
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
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Geometri> shapes = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Menu Geometri ===");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Layang-layang");
            System.out.println("8. Belah Ketupat");
            System.out.println("9. Juring Lingkaran");
            System.out.println("10. Tembereng Lingkaran");
            System.out.println("11. Limas Persegi");
            System.out.println("12. Limas Persegi Panjang");
            System.out.println("13. Limas Segitiga");
            System.out.println("14. Limas Trapesium");
            System.out.println("15. Limas Layang-Layang");
            System.out.println("16. Limas Belah Ketupat");
            System.out.println("17. Limas Jajar Genjang");
            System.out.println("18. Prisma Persegi");
            System.out.println("19. Prisma Persegi Panjang");
            System.out.println("20. Prisma Segitiga");
            System.out.println("21. Prisma Trapesium");
            System.out.println("22. Prisma Layang-Layang");
            System.out.println("23. Prisma Belah Ketupat");
            System.out.println("24. Prisma Jajar Genjang");
            System.out.println("25. Tabung");
            System.out.println("26. Kerucut");
            System.out.println("27. Kerucut Terpancung");
            System.out.println("28. Bola");
            System.out.println("29. Cincin Bola");
            System.out.println("30. Juring Bola");
            System.out.println("31. Tembereng Bola");
            System.out.println("0. Selesai dan Proses");
            System.out.print("Pilih bentuk geometri: ");
            
            int choice = scanner.nextInt();
            if (choice == 0) break;

            Geometri shape = createShape(choice);
            if (shape != null) {
                shapes.add(shape);
                System.out.println("Bentuk berhasil ditambahkan.\n");
            } else {
                System.out.println("Pilihan tidak valid atau input salah.\n");
            }
        }

        ThreadExecutor.processShapes(shapes);
    }

    private static Geometri createShape(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Sisi: ");
                return new Persegi(scanner.nextDouble());
            case 2:
                System.out.print("Panjang: ");
                double p = scanner.nextDouble();
                System.out.print("Lebar: ");
                double l = scanner.nextDouble();
                return new PersegiPanjang(p, l);
            case 3:
                System.out.print("Jari-jari: ");
                return new Lingkaran(scanner.nextDouble());
            case 4:
                System.out.print("Alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Tinggi: ");
                double tinggi = scanner.nextDouble();
                System.out.print("Sisi A, B, C: ");
                return new Segitiga(alas, tinggi, scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 5:
                System.out.print("Alas: ");
                double ja = scanner.nextDouble();
                System.out.print("Tinggi: ");
                double jt = scanner.nextDouble();
                System.out.print("Sisi Miring: ");
                return new JajarGenjang(ja, jt, scanner.nextDouble());
            case 6:
                System.out.print("Alas 1, Alas 2, Tinggi, Sisi A, Sisi B: ");
                return new Trapesium(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 7:
                System.out.print("Diagonal 1, Diagonal 2, Sisi A, Sisi B: ");
                return new LayangLayang(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 8:
                System.out.print("Diagonal 1, Diagonal 2: ");
                return new BelahKetupat(scanner.nextDouble(), scanner.nextDouble());
            case 9:
                System.out.print("Sudut (°), π, jari-jari: ");
                return new JuringLingkaran(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 10:
                System.out.print("Tali busur, tinggi, jari-jari, π: ");
                return new TemberengLingkaran(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 11:
                System.out.print("Sisi alas, tinggi: ");
                return new LimasPersegi(scanner.nextDouble(), scanner.nextDouble());
            case 12:
                System.out.print("Panjang, lebar, tinggi: ");
                return new LimasPersegiPanjang(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 13:
                System.out.print("Alas, tinggi alas, tinggi limas, sisi A, B, C: ");
                return new LimasSegitiga(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 14:
                System.out.print("Alas 1, Alas 2, tinggi alas, tinggi limas, sisi A, B: ");
                return new LimasTrapesium(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 15:
                System.out.print("Diagonal 1, Diagonal 2, Sisi A, B, tinggi, sisi samping A, B: ");
                return new LimasLayangLayang(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 16:
                System.out.print("Diagonal 1, Diagonal 2, tinggi limas: ");
                return new LimasBelahKetupat(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 17:
                System.out.print("Alas, tinggi alas, sisi miring, tinggi limas, panjang alas, lebar alas: ");
                return new LimasJajarGenjang(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 18:
                System.out.print("Sisi alas, tinggi prisma: ");
                return new PrismaPersegi(scanner.nextDouble(), scanner.nextDouble());
            case 19:
                System.out.print("Panjang, lebar, tinggi: ");
                return new PrismaPersegiPanjang(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 20:
                System.out.print("Alas, tinggi alas, tinggi prisma, sisi A, B, C: ");
                return new PrismaSegitiga(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 21:
                System.out.print("Alas 1, Alas 2, tinggi alas, sisi A, B, tinggi prisma: ");
                scanner.nextLine(); // flush newline
                return new PrismaTrapesium(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), "Prisma Trapesium");
            case 22:
                System.out.print("Diagonal 1, Diagonal 2, sisi A, B, tinggi: ");
                return new PrismaLayangLayang(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 23:
                System.out.print("Diagonal 1, Diagonal 2, tinggi: ");
                return new PrismaBelahKetupat(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 24:
                System.out.print("Alas, tinggi alas, tinggi prisma, sisi miring: ");
                return new PrismaJajarGenjang(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 25:
                System.out.print("Jari-jari, tinggi: ");
                return new Tabung(scanner.nextDouble(), scanner.nextDouble());
            case 26:
                System.out.print("Garis pelukis, jari-jari: ");
                return new Kerucut(scanner.nextDouble(), scanner.nextDouble());
            case 27:
                System.out.print("Tinggi, jari-jari atas, jari-jari bawah: ");
                return new KerucutTerpancung(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 28:
                System.out.print("Jari-jari: ");
                return new Bola(scanner.nextDouble());
            case 29:
                System.out.print("Tebal cincin, jari-jari dalam, jari-jari luar: ");
                return new CincinBola(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case 30:
                System.out.print("Sudut (°), jari-jari: ");
                return new JuringBola(scanner.nextDouble(), scanner.nextDouble());
            case 31:
                System.out.print("Jari-jari, tinggi, jari-jari bola: ");
                return new TemberengBola(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            default:
                return null;
        }
    }
}
