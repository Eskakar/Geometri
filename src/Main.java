import java.util.*;

import geometri.BangunDatar;
import geometri.Lingkaran;
import geometri.Persegi;
import geometri.Segitiga;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Geometri ===");
        System.out.println("1. Bangun Datar");
        System.out.println("2. Bangun Ruang");
        System.out.print("Pilih jenis bangun (1/2): ");
        int jenis = sc.nextInt();

        BangunDatar bangun = null;

        if (jenis == 1) {
            System.out.println("-- Menu Bangun Datar --");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Trapesium");
            System.out.println("5. Jajar Ganjang");
            System.out.println("6. Belah Ketupat");
            System.out.println("7. Layang Layang");
            System.out.println("8. Lingkaran");
            System.out.println("9. Juring Lingkaran");
            System.out.println("10. Tembereng Lingkaran");
            System.out.println("11. Segitiga");
            System.out.print("Pilih bangun datar (1-11): ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan sisi: ");
                    double sisi = sc.nextDouble();
                    bangun = new Persegi(sisi);
                }
                case 2 -> {
                    System.out.print("Masukkan jari-jari: ");
                    double r = sc.nextDouble();
                    bangun = new Lingkaran(r);
                }
                case 3 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 4 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 5 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 5 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 6 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 7 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 8 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 9 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 10 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 11 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                case 12 -> {
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Segitiga(a, t);
                }
                default -> System.out.println("Pilihan tidak valid");
            }
        } else if (jenis == 2) {
            System.out.println("-- Menu Bangun Ruang --");
            System.out.println("1. Prisma Persegi");
            System.out.println("2. Prisma Persegi Panjang");
            System.out.println("3. Prisma Segitiga");
            System.out.println("4. Prisma Trapesium");
            System.out.println("5. Prisma Jajar Ganjang");
            System.out.println("6. Prisma Belah Ketupat");
            System.out.println("7. Prisma Layang Layang");
            System.out.println("8. Tabung");
            System.out.println("10. Limas Persegi");
            System.out.println("12. Limas Persegi Panjang");
            System.out.println("13. Limas Segitiga");
            System.out.println("14. Limas Trapesium");
            System.out.println("15. Limas Jajar Ganjang");
            System.out.println("16. Limas Belah Ketupat");
            System.out.println("17  Kerucut");
            System.out.println("17  Kerucut Terpancung");
            System.out.println("10.Tembereng Bola");
            System.out.println("9. Juring Bola");

            System.out.print("Pilih bangun ruang (1-3): ");

            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan sisi: ");
                    double sisi = sc.nextDouble();
                    bangun = new Kubus(sisi);
                }
                case 2 -> {
                    System.out.print("Masukkan panjang: ");
                    double p = sc.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double l = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();
                    bangun = new Balok(p, l, t);
                }
                case 3 -> {
                    System.out.print("Masukkan jari-jari: ");
                    double r = sc.nextDouble();
                    bangun = new Bola(r);
                }
                default -> System.out.println("Pilihan tidak valid");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }

        if (bangun != null) {
            Thread t1 = new HitungLuasThread(bangun);
            Thread t2 = new HitungKelilingThread(bangun);
            Thread t3 = new HitungVolumeThread(bangun);

            t1.start();
            t2.start();
            t3.start();
        }
    }
}
