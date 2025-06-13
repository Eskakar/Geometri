import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import geometri.BangunDatar;
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
import geometri.view.MainGUI;

public class Main {
  public static void main(String[] args) {
    MainGUI mainGUI = new MainGUI();
    mainGUI.setVisible(true);
    // Scanner scanner = new Scanner(System.in);
    // List<Geometri> shapes = new ArrayList<>();
    //// Random rand = new Random();
    //
    // String[] options = {
    // "0. Semua Geometri",
    // "1. Segitiga",
    // "2. Persegi",
    // "3. Persegi Panjang",
    // "4. Lingkaran",
    // "5. Trapesium",
    // "6. Jajar Genjang",
    // "7. Belah Ketupat",
    // "8. Layang-Layang",
    // "9. Juring Lingkaran",
    // "10. Tembereng Lingkaran",
    // "11. Bola",
    // "12. Tabung",
    // "13. Kerucut",
    // "14. Kerucut Terpancung",
    // "15. Cincin Bola",
    // "16. Juring Bola",
    // "17. Tembereng Bola",
    // "18. Limas Persegi",
    // "19. Limas Persegi Panjang",
    // "20. Limas Segitiga",
    // "21. Limas Belah Ketupat",
    // "22. Limas Jajar Genjang",
    // "23. Limas Trapesium",
    // "24. Limas Layang-Layang",
    // "25. Prisma Persegi",
    // "26. Prisma Persegi Panjang",
    // "27. Prisma Segitiga",
    // "28. Prisma Belah Ketupat",
    // "29. Prisma Jajar Genjang",
    // "30. Prisma Trapesium",
    // "31. Prisma Layang-Layang"
    // };
    //
    // System.out.println("Pilih metode input:");
    // System.out.println("1. Input manual");
    // System.out.println("2. Generate otomatis (random)");
    // System.out.print("Pilihan: ");
    // int mode = scanner.nextInt();
    //
    // if (mode == 1) {
    // boolean lanjut = true;
    // while (lanjut) {
    // for (String option : options) {
    // System.out.println(option);
    // }
    // System.out.print("Masukkan nomor geometri: ");
    // int choice = scanner.nextInt();
    //
    // try {
    // Geometri shape = generateManualShape(choice, scanner);
    // shapes.add(shape);
    // } catch (IllegalArgumentException e) {
    // System.out.println("Error: " + e.getMessage());
    // }
    //
    // System.out.print("Ingin input bangun lain? (y/n): ");
    // String again = scanner.next();
    // lanjut = again.equalsIgnoreCase("y");
    // }
    // } else if (mode == 2) {
    // for (String option : options) {
    // System.out.println(option);
    // }
    //
    // System.out.print("Masukkan nomor geometri: ");
    // int choice = scanner.nextInt();
    // System.out.print("Masukkan jumlah objek per bentuk: ");
    // int jumlah = scanner.nextInt();
    //
    // if (choice == 0) {
    // for (int i = 1; i <= 31; i++) {
    // for (int j = 0; j < jumlah; j++) {
    // shapes.add(generateRandomShape(i));
    // }
    // }
    // } else {
    // for (int i = 0; i < jumlah; i++) {
    // shapes.add(generateRandomShape(choice));
    // }
    // }
    // } else {
    // System.out.println("Pilihan tidak valid.");
    // scanner.close();
    // return;
    // }
    //
    //// Proses dan tampilkan hasil
    // ThreadExecutor.processShapes(shapes);
    // scanner.close();
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
      case 17 -> new TemberengBola(r(), r());
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
        System.out.print("Alas: ");
        double a = scanner.nextDouble();
        System.out.print("Tinggi: ");
        double t = scanner.nextDouble();
        System.out.print("Sisi A: ");
        double s1 = scanner.nextDouble();
        System.out.print("Sisi B: ");
        double s2 = scanner.nextDouble();
        System.out.print("Sisi C: ");
        double s3 = scanner.nextDouble();
        yield new Segitiga(a, t, s1, s2, s3);
      }

      case 2 -> {
        System.out.print("Sisi: ");
        double sisi = scanner.nextDouble();
        BangunDatar Persegi = new Persegi(sisi);
        yield Persegi;
      }

      case 3 -> {
        System.out.print("Panjang: ");
        double p = scanner.nextDouble();
        System.out.print("Lebar: ");
        double l = scanner.nextDouble();
        BangunDatar PersegiPanjang = new PersegiPanjang(p, l);
        yield PersegiPanjang;
      }
      case 4 -> {
        System.out.print("Jari jari: ");
        double r = scanner.nextDouble();
        BangunDatar lingkaran = new Lingkaran(r);
        yield lingkaran;
      }
      case 5 -> {
        System.out.print("Sisi atas: ");
        double sisiAtas = scanner.nextDouble();
        System.out.print("Sisi bawah: ");
        double sisiBawah = scanner.nextDouble();
        System.out.print("Sisi kanan: ");
        double sisiKanan = scanner.nextDouble();
        System.out.print("Sisi kiri: ");
        double sisiKiri = scanner.nextDouble();
        System.out.print("Tinggi : ");
        double tinggi = scanner.nextDouble();
        BangunDatar trapesium = new Trapesium(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggi);
        yield trapesium;
      }

      case 6 -> {
        System.out.print("Tinggi: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Alas : ");
        double alas = scanner.nextDouble();
        System.out.print("Sisi Miring : ");
        double sisiMiring = scanner.nextDouble();
        BangunDatar jajarGenjang = new JajarGenjang(alas, tinggi, sisiMiring);
        yield jajarGenjang;
      }

      case 7 -> {
        System.out.print("Diagonal 1: ");
        double diagonal1 = scanner.nextDouble();
        System.out.print("Diagonal 2: ");
        double diagonal2 = scanner.nextDouble();
        BangunDatar belahKetupat = new BelahKetupat(diagonal1, diagonal2);
        yield belahKetupat;
      }

      case 8 -> {
        System.out.print("Diagonal 1: ");
        double diagonal1 = scanner.nextDouble();
        System.out.print("Diagonal 2: ");
        double diagonal2 = scanner.nextDouble();
        System.out.print("Sisi A: ");
        double sisiA = scanner.nextDouble();
        System.out.print("Sisi B: ");
        double sisiB = scanner.nextDouble();
        BangunDatar layangLayang = new LayangLayang(diagonal1, diagonal2, sisiA, sisiB);
        yield layangLayang;
      }

      case 9 -> {
        System.out.print("Sudut Pusat: ");
        double sudutPusat = scanner.nextDouble();
        System.out.print("Busur: ");
        double busur = scanner.nextDouble();
        System.out.print("Jari-jari: ");
        double r = scanner.nextDouble();
        Lingkaran juringLingkaran = new JuringLingkaran(sudutPusat, busur, r);
        yield juringLingkaran;
      }

      case 10 -> {
        System.out.print("Jari-jari: ");
        double jariJari = scanner.nextDouble();
        System.out.print("Tinggi Tembereng: ");
        double tinggiTembereng = scanner.nextDouble();
        System.out.print("Panjang Tali Busur: ");
        double panjangTaliBusur = scanner.nextDouble();
        System.out.print("Sudut Pusat (derajat): ");
        double sudutPusat = scanner.nextDouble();
        Lingkaran TemberengLingkaran = new TemberengLingkaran(sudutPusat, tinggiTembereng, panjangTaliBusur, jariJari);
        yield TemberengLingkaran;
      }
      case 11 -> {
        System.out.print("Jari-jari: ");
        double jariJari = scanner.nextDouble();
        Lingkaran Bola = new Bola(jariJari);
        yield Bola;
      }
      case 12 -> {
        System.out.print("Jari-jari: ");
        double jariJari = scanner.nextDouble();
        System.out.print("Tinggi: ");
        double tinggi = scanner.nextDouble();
        Lingkaran Tabung = new Tabung(jariJari, tinggi);
        yield Tabung;
      }
      case 13 -> {
        System.out.print("Jari-jari Alas: ");
        double jariJariAlas = scanner.nextDouble();
        System.out.print("Tinggi: ");
        double tinggi = scanner.nextDouble();
        Lingkaran Kerucut = new Kerucut(tinggi, jariJariAlas);
        yield Kerucut;
      }
      case 14 -> {
        System.out.print("Jari-jari Atas: ");
        double jariJariAtas = scanner.nextDouble();
        System.out.print("Jari-jari Bawah: ");
        double jariJariBawah = scanner.nextDouble();
        System.out.print("Tinggi: ");
        double tinggi = scanner.nextDouble();
        Kerucut KerucutTerpancung = new KerucutTerpancung(tinggi, jariJariBawah, jariJariAtas);
        yield KerucutTerpancung;
      }
      case 15 -> {
        System.out.print("Jari-jari Dalam: ");
        double jariJariDalam = scanner.nextDouble();
        System.out.print("Jari-jari Luar: ");
        double jariJariLuar = scanner.nextDouble();
        System.out.print("Tinggi: ");
        double tinggi = scanner.nextDouble();
        Bola CincinBola = new CincinBola(jariJariDalam, jariJariLuar, tinggi);
        yield CincinBola;
      }
      case 16 -> {
        System.out.print("Sudut (derajat): ");
        double sudut = scanner.nextDouble();
        System.out.print("Jari-jari: ");
        double jariJari = scanner.nextDouble();
        Bola JuringBola = new JuringBola(sudut, jariJari);
        yield JuringBola;
      }
      case 17 -> {
        System.out.print("Jari-jari Bola: ");
        System.out.print("Tinggi Tembereng: ");
        double tinggiTembereng = scanner.nextDouble();
        System.out.print("Jari-jari Lingkaran Potongan: ");
        double jariLingkaranPotongan = scanner.nextDouble();
        Bola TemberengBola = new TemberengBola(tinggiTembereng, jariLingkaranPotongan);
        yield TemberengBola;
      }
      case 18 -> {
        System.out.print("Sisi Alas: ");
        double sisiAlas = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiLimas = scanner.nextDouble();
        Persegi LimasPersegi = new LimasPersegi(sisiAlas, tinggiLimas);
        yield LimasPersegi;
      }
      case 19 -> {
        System.out.print("Panjang Alas: ");
        double panjangAlas = scanner.nextDouble();
        System.out.print("Lebar Alas: ");
        double lebarAlas = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiLimas = scanner.nextDouble();
        PersegiPanjang LimasPersegiPanjang = new LimasPersegiPanjang(panjangAlas, lebarAlas, tinggiLimas);
        yield LimasPersegiPanjang;
      }
      case 20 -> {
        System.out.print("Sisi Alas 1: ");
        double sisiAlas1 = scanner.nextDouble();
        System.out.print("Sisi Alas 2: ");
        double sisiAlas2 = scanner.nextDouble();
        System.out.print("Sisi Alas 3: ");
        double sisiAlas3 = scanner.nextDouble();
        System.out.print("Alas Segitiga: ");
        double alasSegitiga = scanner.nextDouble();
        System.out.print("Tinggi Segitiga: ");
        double tinggiSegitiga = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiLimas = scanner.nextDouble();
        Segitiga LimasSegitiga = new LimasSegitiga(alasSegitiga, tinggiLimas, tinggiSegitiga, sisiAlas1, sisiAlas2,
            sisiAlas3);
        yield LimasSegitiga;
      }
      case 21 -> {
        System.out.print("Diagonal 1 Alas: ");
        double diagonal1Alas = scanner.nextDouble();
        System.out.print("Diagonal 2 Alas: ");
        double diagonal2Alas = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiLimas = scanner.nextDouble();
        BelahKetupat LimasBelahKetupat = new LimasBelahKetupat(diagonal1Alas, diagonal2Alas, tinggiLimas);
        yield LimasBelahKetupat;
      }
      case 22 -> {
        System.out.print("Alas Jajar Genjang: ");
        double alasJajarGenjang = scanner.nextDouble();
        System.out.print("Tinggi Jajar Genjang: ");
        double tinggiJajarGenjang = scanner.nextDouble();
        System.out.print("Sisi Miring Jajar Genjang: ");
        double sisiMiringJajarGenjang = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiLimas = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiSegitigaPanjang = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiSegitigaPendek = scanner.nextDouble();

        JajarGenjang LimasJajarGenjang = new LimasJajarGenjang(alasJajarGenjang, tinggiJajarGenjang,
            sisiMiringJajarGenjang, tinggiLimas, tinggiSegitigaPanjang, tinggiSegitigaPendek);
        yield LimasJajarGenjang;
      }
      case 23 ->

      {
        System.out.print("Sisi Atas Alas: ");
        double sisiAtasAlas = scanner.nextDouble();
        System.out.print("Sisi Bawah Alas: ");
        double sisiBawahAlas = scanner.nextDouble();
        System.out.print("Sisi Miring 1 Alas: ");
        double sisiKananAlas = scanner.nextDouble();
        System.out.print("Sisi Miring 2 Alas: ");
        double sisiKiriAlas = scanner.nextDouble();
        System.out.print("Tinggi Alas Trapesium: ");
        double tinggiAlasTrapesium = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiLimas = scanner.nextDouble();
        Trapesium LimasTrapesium = new LimasTrapesium(tinggiLimas, tinggiAlasTrapesium, sisiAtasAlas, sisiBawahAlas,
            sisiKananAlas,
            sisiKiriAlas);
        yield LimasTrapesium;
      }
      case 24 -> {
        System.out.print("Diagonal 1 Alas: ");
        double diagonal1Alas = scanner.nextDouble();
        System.out.print("Diagonal 2 Alas: ");
        double diagonal2Alas = scanner.nextDouble();
        System.out.print("Sisi Atas Alas: ");
        double sisiAtasAlas = scanner.nextDouble();
        System.out.print("Sisi Bawah Alas: ");
        double sisiBawahAlas = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiLimas = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiSisiTegak1 = scanner.nextDouble();
        System.out.print("Tinggi Limas: ");
        double tinggiSisiTegak2 = scanner.nextDouble();
        LayangLayang LimasLayangLayang = new LimasLayangLayang(tinggiLimas, tinggiSisiTegak1, tinggiSisiTegak2,
            diagonal1Alas, diagonal2Alas, sisiAtasAlas,
            sisiBawahAlas);
        yield LimasLayangLayang;
      }
      case 25 -> {
        System.out.print("Sisi Alas: ");
        double sisiAlas = scanner.nextDouble();
        System.out.print("Tinggi Prisma: ");
        double tinggiPrisma = scanner.nextDouble();
        Persegi PrismaPersegi = new PrismaPersegi(sisiAlas, tinggiPrisma);
        yield PrismaPersegi;
      }
      case 26 -> {
        System.out.print("Panjang Alas: ");
        double panjangAlas = scanner.nextDouble();
        System.out.print("Lebar Alas: ");
        double lebarAlas = scanner.nextDouble();
        System.out.print("Tinggi Prisma: ");
        double tinggiPrisma = scanner.nextDouble();
        PersegiPanjang PrismaPersegiPanjang = new PrismaPersegiPanjang(panjangAlas, lebarAlas, tinggiPrisma);
        yield PrismaPersegiPanjang;
      }
      case 27 -> {
        System.out.print("Sisi Alas 1: ");
        double sisiAlas1 = scanner.nextDouble();
        System.out.print("Sisi Alas 2: ");
        double sisiAlas2 = scanner.nextDouble();
        System.out.print("Sisi Alas 3: ");
        double sisiAlas3 = scanner.nextDouble();
        System.out.print("Alas Segitiga: ");
        double alasSegitiga = scanner.nextDouble();
        System.out.print("Tinggi Segitiga: ");
        double tinggiSegitiga = scanner.nextDouble();
        System.out.print("Tinggi Prisma: ");
        double tinggiPrisma = scanner.nextDouble();
        Segitiga PrismaSegitiga = new PrismaSegitiga(alasSegitiga, tinggiSegitiga, tinggiPrisma, sisiAlas1, sisiAlas2,
            sisiAlas3);
        yield PrismaSegitiga;
      }
      case 28 -> {
        System.out.print("Diagonal 1 Alas: ");
        double diagonal1Alas = scanner.nextDouble();
        System.out.print("Diagonal 2 Alas: ");
        double diagonal2Alas = scanner.nextDouble();
        System.out.print("Tinggi Prisma: ");
        double tinggiPrisma = scanner.nextDouble();
        BelahKetupat PrismaBelahKetupat = new PrismaBelahKetupat(diagonal1Alas, diagonal2Alas, tinggiPrisma);
        yield PrismaBelahKetupat;
      }
      case 29 -> {
        System.out.print("Alas Jajar Genjang: ");
        double alasJajarGenjang = scanner.nextDouble();
        System.out.print("Tinggi Jajar Genjang: ");
        double tinggiJajarGenjang = scanner.nextDouble();
        System.out.print("Sisi Miring Jajar Genjang: ");
        double sisiMiringJajarGenjang = scanner.nextDouble();
        System.out.print("Tinggi Prisma: ");
        double tinggiPrisma = scanner.nextDouble();
        JajarGenjang PrismaJajarGenjang = new PrismaJajarGenjang(alasJajarGenjang, tinggiJajarGenjang,
            tinggiPrisma, sisiMiringJajarGenjang);
        yield PrismaJajarGenjang;
      }
      case 30 -> {
        System.out.print("Sisi Atas Alas: ");
        double sisiAtasAlas = scanner.nextDouble();
        System.out.print("Sisi Bawah Alas: ");
        double sisiBawahAlas = scanner.nextDouble();
        System.out.print("Sisi Miring 1 Alas: ");
        double sisiKananAlas = scanner.nextDouble();
        System.out.print("Sisi Miring 2 Alas: ");
        double sisiKiriALas = scanner.nextDouble();
        System.out.print("Tinggi Alas Trapesium: ");
        double tinggiAlasTrapesium = scanner.nextDouble();
        System.out.print("Tinggi Prisma: ");
        double tinggiPrisma = scanner.nextDouble();
        Trapesium PrismaTrapesium = new PrismaTrapesium(sisiAtasAlas, sisiBawahAlas, sisiKananAlas,
            sisiKiriALas, tinggiAlasTrapesium, tinggiPrisma, "Prisma Trapesium");
        yield PrismaTrapesium;
      }
      case 31 -> {
        System.out.print("Diagonal 1 Alas: ");
        double diagonal1Alas = scanner.nextDouble();
        System.out.print("Diagonal 2 Alas: ");
        double diagonal2Alas = scanner.nextDouble();
        System.out.print("Sisi Atas Alas: ");
        double sisiAtasAlas = scanner.nextDouble();
        System.out.print("Sisi Bawah Alas: ");
        double sisiBawahAlas = scanner.nextDouble();
        System.out.print("Tinggi Prisma: ");
        double tinggiPrisma = scanner.nextDouble();
        LayangLayang PrismaLayangLayang = new PrismaLayangLayang(diagonal1Alas, diagonal2Alas, sisiAtasAlas,
            sisiBawahAlas, tinggiPrisma);
        yield PrismaLayangLayang;
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
