package geometri.view;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
// Asumsikan semua kelas geometri seperti BangunDatar, Bola, Segitiga, dll., sudah tersedia di package geometri
import geometri.*;
import threading.ThreadExecutor;

public class MainGUI extends JFrame {
  public MainGUI() {
    segitiga = new Segitiga(0, 0, 0, 0, 0);
    initComponents();
  }

  private void processAndDisplayResultsRandom(List<String> results, String previousCard) {
    if (shapes.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Belum ada bangun yang ditambahkan atau digenerate.", "Informasi",
          JOptionPane.INFORMATION_MESSAGE);
      return;
    }
    resultsTextArea.setText(""); // Bersihkan hasil sebelumnya

    for (int i = 0; i < results.size(); i++) {
      String numberedResult = (i + 1) + ". " + results.get(i) + "\n\n";
      resultsTextArea.append(numberedResult);
    }

    shapes.clear(); // Bersihkan shapes setelah diproses
    cardLayout.show(mainPanel, "RESULTS");
  }

  // untuk menamilkan yang manual input
  private void processAndDisplayResultsManual(String previousCard) {
    if (shapes.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Belum ada bangun yang ditambahkan atau digenerate.", "Informasi",
          JOptionPane.INFORMATION_MESSAGE);
      return;
    }

    resultsTextArea.setText(""); // Bersihkan hasil sebelumnya
    for (Geometri shape : shapes) {
      resultsTextArea.append(shape.getNama() + ":\n");
      // resultsTextArea.append(" Luas: " + String.format("%.2f", shape.hitungLuas())
      // + "\n");
      // Menggunakan instanceof untuk memeriksa tipe dan memanggil method yang sesuai
      if (shape instanceof BelahKetupat && shape.getNama().equals("Belah Ketupat")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", belahKetupat.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", belahKetupat.getKeliling()) + "\n");
      } else if (shape instanceof JajarGenjang && shape.getNama().equals("Jajar Genjang")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", jajarGenjang.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", jajarGenjang.getKeliling()) + "\n");
      } else if (shape instanceof JuringLingkaran && shape.getNama().equals("Juring Lingkaran")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", juringLingkaran.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", juringLingkaran.getKeliling()) + "\n");
      } else if (shape instanceof LayangLayang && shape.getNama().equals("Layang-Layang")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", layangLayang.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", layangLayang.getKeliling()) + "\n");
      } else if (shape instanceof Lingkaran && shape.getNama().equals("Lingkaran")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", lingkaran.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", lingkaran.getKeliling()) + "\n");
      } else if (shape instanceof Persegi && shape.getNama().equals("Persegi")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", persegi.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", persegi.getKeliling()) + "\n");
      } else if (shape instanceof PersegiPanjang && shape.getNama().equals("Persegi Panjang")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", persegiPanjang.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", persegiPanjang.getKeliling()) + "\n");
      } else if (shape instanceof Segitiga && shape.getNama().equals("Segitiga")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", segitiga.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", segitiga.getKeliling()) + "\n");
      } else if (shape instanceof TemberengLingkaran && shape.getNama().equals("Tembereng Lingkaran")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", temberengLingkaran.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", temberengLingkaran.getKeliling()) + "\n");
      } else if (shape instanceof Trapesium && shape.getNama().equals("Trapesium")) {
        resultsTextArea.append("  Luas: " + String.format("%.2f", trapesium.getLuas()) + "\n");
        resultsTextArea.append("  Keliling: " + String.format("%.2f", trapesium.getKeliling()) + "\n");
      } else if (shape instanceof Bola && shape.getNama().equals("Bola")) {
        resultsTextArea.append("  Volume: " + String.format("%.2f", ((Bola) shape).hitungVolume()) + "\n");
        resultsTextArea
            .append("  Luas Permukaan: " + String.format("%.2f", ((Bola) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof Tabung) {
        resultsTextArea.append("  Volume: " + String.format("%.2f", ((Tabung) shape).hitungVolume()) + "\n");
        resultsTextArea
            .append("  Luas Permukaan: " + String.format("%.2f", ((Tabung) shape).hitungLuasPermukaan()) + "\n");
      }  else if (shape instanceof Kerucut && shape.getNama().equals("Kerucut")) {
        resultsTextArea.append("  Volume: " + String.format("%.2f", ((Kerucut) shape).hitungVolume()) + "\n");
        resultsTextArea
            .append("  Luas Permukaan: " + String.format("%.2f", ((Kerucut) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof KerucutTerpancung) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((KerucutTerpancung) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((KerucutTerpancung) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof CincinBola) {
        resultsTextArea.append("  Volume: " + String.format("%.2f", ((CincinBola) shape).hitungVolume()) + "\n");
        resultsTextArea
            .append(
                "  Luas Permukaan: " + String.format("%.2f", ((CincinBola) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof JuringBola) {
        resultsTextArea.append("  Volume: " + String.format("%.2f", ((JuringBola) shape).hitungVolume()) + "\n");
        resultsTextArea
            .append(
                "  Luas Permukaan: " + String.format("%.2f", ((JuringBola) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof TemberengBola) {
        resultsTextArea.append("  Volume: " + String.format("%.2f", ((TemberengBola) shape).hitungVolume()) + "\n");
        resultsTextArea
            .append(
                "  Luas Permukaan: " + String.format("%.2f", ((TemberengBola) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof LimasPersegi) {
        resultsTextArea.append("  Volume: " + String.format("%.2f", ((LimasPersegi) shape).hitungVolume()) + "\n");
        resultsTextArea
            .append(
                "  Luas Permukaan: " + String.format("%.2f", ((LimasPersegi) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof LimasPersegiPanjang) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((LimasPersegiPanjang) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((LimasPersegiPanjang) shape).hitungLuasPermukaan())
                + "\n");
      } else if (shape instanceof LimasSegitiga) {
        resultsTextArea.append("  Volume: " + String.format("%.2f", ((LimasSegitiga) shape).hitungVolume()) + "\n");
        resultsTextArea
            .append(
                "  Luas Permukaan: " + String.format("%.2f", ((LimasSegitiga) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof LimasBelahKetupat) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((LimasBelahKetupat) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((LimasBelahKetupat) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof LimasJajarGenjang) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((LimasJajarGenjang) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((LimasJajarGenjang) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof LimasTrapesium) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((LimasTrapesium) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((LimasTrapesium) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof LimasLayangLayang) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((LimasLayangLayang) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((LimasLayangLayang) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof PrismaPersegi) {
        resultsTextArea.append("  Volume: " + String.format("%.2f", ((PrismaPersegi) shape).hitungVolume()) + "\n");
        resultsTextArea
            .append(
                "  Luas Permukaan: " + String.format("%.2f", ((PrismaPersegi) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof PrismaPersegiPanjang) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((PrismaPersegiPanjang) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((PrismaPersegiPanjang) shape).hitungLuasPermukaan())
                + "\n");
      } else if (shape instanceof PrismaSegitiga) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((PrismaSegitiga) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((PrismaSegitiga) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof PrismaBelahKetupat) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((PrismaBelahKetupat) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((PrismaBelahKetupat) shape).hitungLuasPermukaan())
                + "\n");
      } else if (shape instanceof PrismaJajarGenjang) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((PrismaJajarGenjang) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((PrismaJajarGenjang) shape).hitungLuasPermukaan())
                + "\n");
      } else if (shape instanceof PrismaTrapesium) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((PrismaTrapesium) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((PrismaTrapesium) shape).hitungLuasPermukaan()) + "\n");
      } else if (shape instanceof PrismaLayangLayang) {
        resultsTextArea
            .append("  Volume: " + String.format("%.2f", ((PrismaLayangLayang) shape).hitungVolume()) + "\n");
        resultsTextArea.append(
            "  Luas Permukaan: " + String.format("%.2f", ((PrismaLayangLayang) shape).hitungLuasPermukaan())
                + "\n");
      }      // bola dan kerucut disini karna turunan bola tidak bisa dibedakan dengan bola
      resultsTextArea.append("\n");
    }
    shapes.clear(); // Bersihkan shapes setelah diproses
    cardLayout.show(mainPanel, "RESULTS");
  }

  // untuk tampilan input manual, otomatis tergenerate
  private void updateDynamicInputPanel() {
    dynamicInputPanel.removeAll();
    String selectedShape = (String) shapeComboBox.getSelectedItem();
    if (selectedShape == null) {
      dynamicInputPanel.revalidate();
      dynamicInputPanel.repaint();
      return;
    }

    switch (selectedShape) {
      case "Segitiga":
        addInputFieldDynamicInput("Alas:", "alas");
        addInputFieldDynamicInput("Tinggi:", "tinggi");
        addInputFieldDynamicInput("Sisi A:", "sisi1");
        addInputFieldDynamicInput("Sisi B:", "sisi2");
        addInputFieldDynamicInput("Sisi C:", "sisi3");
        break;
      case "Persegi":
        addInputFieldDynamicInput("Sisi:", "sisi");
        break;
      case "Persegi Panjang":
        addInputFieldDynamicInput("Panjang:", "panjang");
        addInputFieldDynamicInput("Lebar:", "lebar");
        break;
      case "Lingkaran":
        addInputFieldDynamicInput("Jari-jari:", "jariJari");
        break;
      case "Trapesium":
        addInputFieldDynamicInput("Sisi atas:", "sisiAtas");
        addInputFieldDynamicInput("Sisi bawah:", "sisiBawah");
        addInputFieldDynamicInput("Sisi kanan:", "sisiKanan");
        addInputFieldDynamicInput("Sisi kiri:", "sisiKiri");
        addInputFieldDynamicInput("Tinggi:", "tinggi");
        break;
      case "Jajar Genjang":
        addInputFieldDynamicInput("Alas:", "alas");
        addInputFieldDynamicInput("Tinggi:", "tinggi");
        addInputFieldDynamicInput("Sisi Miring:", "sisiMiring");
        break;
      case "Belah Ketupat":
        addInputFieldDynamicInput("Diagonal 1:", "d1");
        addInputFieldDynamicInput("Diagonal 2:", "d2");
        break;
      case "Layang-Layang":
        addInputFieldDynamicInput("Diagonal 1:", "d1");
        addInputFieldDynamicInput("Diagonal 2:", "d2");
        addInputFieldDynamicInput("Sisi A:", "sisiA");
        addInputFieldDynamicInput("Sisi B:", "sisiB");
        break;
      case "Juring Lingkaran":
        addInputFieldDynamicInput("Jari-jari:", "jariJari");
        addInputFieldDynamicInput("Sudut Pusat (derajat):", "sudutPusat");
        // addInputField("Busur:", "busur"); // Busur biasanya dihitung, bukan diinput
        // manual
        break;
      case "Tembereng Lingkaran":
        addInputFieldDynamicInput("Jari-jari:", "jariJari");
        addInputFieldDynamicInput("Tinggi Tembereng:", "tinggiTembereng");
        addInputFieldDynamicInput("Panjang Tali Busur:", "panjangTaliBusur");
        addInputFieldDynamicInput("Sudut Pusat (derajat):", "sudutPusat");
        break;
      case "Bola":
        addInputFieldDynamicInput("Jari-jari:", "jariJari");
        break;
      case "Tabung":
        addInputFieldDynamicInput("Jari-jari:", "jariJari");
        addInputFieldDynamicInput("Tinggi:", "tinggi");
        break;
      case "Kerucut":
        addInputFieldDynamicInput("Jari-jari Alas:", "jariJariAlas");
        addInputFieldDynamicInput("Tinggi:", "tinggi");
        break;
      case "Kerucut Terpancung":
        addInputFieldDynamicInput("Jari-jari Atas:", "jariJariAtas");
        addInputFieldDynamicInput("Jari-jari Bawah:", "jariJariBawah");
        addInputFieldDynamicInput("Tinggi:", "tinggi");
        break;
      case "Cincin Bola":
        addInputFieldDynamicInput("Jari-jari Dalam:", "jariJariDalam");
        addInputFieldDynamicInput("Jari-jari Luar:", "jariJariLuar");
        addInputFieldDynamicInput("Tinggi:", "tinggi");
        break;
      case "Juring Bola":
        addInputFieldDynamicInput("Jari-jari:", "jariJari");
        addInputFieldDynamicInput("Sudut (derajat):", "sudut");
        break;
      case "Tembereng Bola":
        addInputFieldDynamicInput("Jari-jari Bola:", "jariJariBola"); // Tambahkan ini jika dibutuhkan
        addInputFieldDynamicInput("Tinggi Tembereng:", "tinggiTembereng");
        // addInputField("Jari-jari Lingkaran Potongan:", "jariLingkaranPotongan"); //
        // Ini sering dihitung
        break;
      case "Limas Persegi":
        addInputFieldDynamicInput("Sisi Alas:", "sisiAlas");
        addInputFieldDynamicInput("Tinggi Limas:", "tinggiLimas");
        break;
      case "Limas Persegi Panjang":
        addInputFieldDynamicInput("Panjang Alas:", "panjangAlas");
        addInputFieldDynamicInput("Lebar Alas:", "lebarAlas");
        addInputFieldDynamicInput("Tinggi Limas:", "tinggiLimas");
        break;
      case "Limas Segitiga":
        addInputFieldDynamicInput("Alas Segitiga:", "alasSegitiga");
        addInputFieldDynamicInput("Tinggi Segitiga Alas:", "tinggiSegitiga");
        addInputFieldDynamicInput("Tinggi Limas:", "tinggiLimas");
        addInputFieldDynamicInput("Sisi Alas 1 (opsional):", "sisiAlas1"); // Opsional untuk keliling alas
        addInputFieldDynamicInput("Sisi Alas 2 (opsional):", "sisiAlas2");
        addInputFieldDynamicInput("Sisi Alas 3 (opsional):", "sisiAlas3");
        break;
      case "Limas Belah Ketupat":
        addInputFieldDynamicInput("Diagonal 1 Alas:", "d1Alas");
        addInputFieldDynamicInput("Diagonal 2 Alas:", "d2Alas");
        addInputFieldDynamicInput("Tinggi Limas:", "tinggiLimas");
        break;
      case "Limas Jajar Genjang":
        addInputFieldDynamicInput("Alas Jajar Genjang:", "alasJajarGenjang");
        addInputFieldDynamicInput("Tinggi Jajar Genjang:", "tinggiJajarGenjang");
        addInputFieldDynamicInput("Sisi Miring Jajar Genjang (opsional):", "sisiMiringJajarGenjang");
        addInputFieldDynamicInput("Tinggi Limas:", "tinggiLimas");
        // addInputField("Tinggi Sisi Tegak Panjang (optional):",
        // "tinggiSegitigaPanjang");
        // addInputField("Tinggi Sisi Tegak Pendek (optional):",
        // "tinggiSegitigaPendek");
        break;
      case "Limas Trapesium":
        addInputFieldDynamicInput("Sisi Atas Alas:", "sisiAtasAlas");
        addInputFieldDynamicInput("Sisi Bawah Alas:", "sisiBawahAlas");
        addInputFieldDynamicInput("Tinggi Alas Trapesium:", "tinggiAlasTrapesium");
        addInputFieldDynamicInput("Sisi Kanan Alas (opsional):", "sisiKananAlas");
        addInputFieldDynamicInput("Sisi Kiri Alas (opsional):", "sisiKiriAlas");
        addInputFieldDynamicInput("Tinggi Limas:", "tinggiLimas");
        break;
      case "Limas Layang-Layang":
        addInputFieldDynamicInput("Diagonal 1 Alas:", "d1Alas");
        addInputFieldDynamicInput("Diagonal 2 Alas:", "d2Alas");
        addInputFieldDynamicInput("Tinggi Limas:", "tinggiLimas");
        addInputFieldDynamicInput("Sisi A Alas (opsional):", "sisiAAlas"); // Sisi yang sama panjang di layang-layang
        addInputFieldDynamicInput("Sisi B Alas (opsional):", "sisiBAlas");
        break;
      case "Prisma Persegi":
        addInputFieldDynamicInput("Sisi Alas:", "sisiAlas");
        addInputFieldDynamicInput("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Persegi Panjang":
        addInputFieldDynamicInput("Panjang Alas:", "panjangAlas");
        addInputFieldDynamicInput("Lebar Alas:", "lebarAlas");
        addInputFieldDynamicInput("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Segitiga":
        addInputFieldDynamicInput("Alas Segitiga:", "alasSegitiga");
        addInputFieldDynamicInput("Tinggi Segitiga Alas:", "tinggiSegitiga");
        addInputFieldDynamicInput("Tinggi Prisma:", "tinggiPrisma");
        addInputFieldDynamicInput("Sisi Alas 1 (opsional):", "sisiAlas1");
        addInputFieldDynamicInput("Sisi Alas 2 (opsional):", "sisiAlas2");
        addInputFieldDynamicInput("Sisi Alas 3 (opsional):", "sisiAlas3");
        break;
      case "Prisma Belah Ketupat":
        addInputFieldDynamicInput("Diagonal 1 Alas:", "d1Alas");
        addInputFieldDynamicInput("Diagonal 2 Alas:", "d2Alas");
        addInputFieldDynamicInput("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Jajar Genjang":
        addInputFieldDynamicInput("Alas Jajar Genjang:", "alasJajarGenjang");
        addInputFieldDynamicInput("Tinggi Jajar Genjang:", "tinggiJajarGenjang");
        addInputFieldDynamicInput("Sisi Miring Jajar Genjang (opsional):", "sisiMiringJajarGenjang");
        addInputFieldDynamicInput("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Trapesium":
        addInputFieldDynamicInput("Sisi Atas Alas:", "sisiAtasAlas");
        addInputFieldDynamicInput("Sisi Bawah Alas:", "sisiBawahAlas");
        addInputFieldDynamicInput("Tinggi Alas Trapesium:", "tinggiAlasTrapesium");
        addInputFieldDynamicInput("Sisi Kanan Alas (opsional):", "sisiKananAlas");
        addInputFieldDynamicInput("Sisi Kiri Alas (opsional):", "sisiKiriAlas");
        addInputFieldDynamicInput("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Layang-Layang":
        addInputFieldDynamicInput("Diagonal 1 Alas:", "d1Alas");
        addInputFieldDynamicInput("Diagonal 2 Alas:", "d2Alas");
        addInputFieldDynamicInput("Tinggi Prisma:", "tinggiPrisma");
        addInputFieldDynamicInput("Sisi A Alas (opsional):", "sisiAAlas");
        addInputFieldDynamicInput("Sisi B Alas (opsional):", "sisiBAlas");
        break;
      default:
        dynamicInputPanel.add(createLabel("Pilih bentuk untuk input parameter.", 10));
        break;
    }
    dynamicInputPanel.revalidate();
    dynamicInputPanel.repaint();
  }

  // ini fungsi tampilan input manual
  private void addInputFieldDynamicInput(String labelText, String name) {
    JLabel label = createLabel(labelText, 20);
    JTextField textField = new JTextField(10); // Memberikan lebar awal sekitar 10 karakter
    textField.setFont(new Font(textField.getFont().getName(), Font.PLAIN, 20));
    textField.setName(name); // Untuk mengambil nilai nanti

    GridBagConstraints gbc = new GridBagConstraints();
    // Memberi padding 5px di setiap sisi komponen (atas, kiri, bawah, kanan)
    gbc.insets = new Insets(5, 5, 5, 5);

    // --- Pengaturan untuk LABEL ---
    gbc.gridx = 0; // Tempatkan di kolom pertama (indeks 0)
    gbc.gridy = GridBagConstraints.RELATIVE; // Tempatkan di baris berikutnya yang tersedia
    gbc.anchor = GridBagConstraints.WEST; // Rata kiri di dalam selnya
    gbc.fill = GridBagConstraints.NONE; // Label tidak meregang
    gbc.weightx = 0; // Label tidak mengambil ruang horizontal ekstra
    dynamicInputPanel.add(label, gbc);

    // --- Pengaturan untuk TEXTFIELD ---
    gbc.gridx = 1; // Tempatkan di kolom kedua (indeks 1), tepat di samping label
    gbc.gridy = GridBagConstraints.RELATIVE; // Tempatkan di baris berikutnya yang tersedia (ini akan membuat pasangan
                                             // per baris)
    gbc.anchor = GridBagConstraints.WEST; // Rata kiri di dalam selnya
    gbc.weightx = 1.0; // Field akan mengambil semua ruang horizontal ekstra yang tersedia di kolomnya
    dynamicInputPanel.add(textField, gbc);
  }

  // Mengambil value
  // Mengubah getFieldValue untuk menangani input opsional dengan nilai default
  // 0.0
  private double getFieldValue(JPanel panel, String fieldName) {
    for (Component comp : panel.getComponents()) {
      if (comp instanceof JTextField) {
        JTextField tf = (JTextField) comp;
        // Pastikan nama field cocok dan text field tidak kosong
        if (fieldName.equals(tf.getName())) {
          String text = tf.getText().trim();
          if (text.isEmpty()) {
            // Jika field opsional dan kosong, kembalikan 0.0
            if (fieldName.contains("optional")) { // Penanda 'optional' di label/nama
              return 0.0;
            } else {
              throw new IllegalArgumentException("Field '" + fieldName + "' tidak boleh kosong.");
            }
          }
          try {
            return Double.parseDouble(text);
          } catch (NumberFormatException e) {
            throw new NumberFormatException("Nilai untuk '" + fieldName + "' tidak valid: " + text);
          }
        }
      }
    }
    // Jika field tidak ditemukan (mungkin opsional dan tidak ditampilkan),
    // kembalikan 0.0
    // Ini perlu disesuaikan dengan logika addInputField dan konstruktor geometri
    // Anda
    return 0.0; // Mengembalikan 0.0 jika field tidak ditemukan (asumsi opsional)
  }

  private void clearInputFields(JPanel panel) {
    for (Component comp : panel.getComponents()) {
      if (comp instanceof JTextField) {
        ((JTextField) comp).setText("");
      }
    }
  }

  // mengambil inputan berdassrkan shape yang dipilih dan nama field
  private BangunDatar generateManualShape(int choice, JPanel inputPanel) {
    try {
      switch (choice) {
        case 1: // Segitiga
          double alas = getFieldValue(inputPanel, "alas");
          double tinggi = getFieldValue(inputPanel, "tinggi");
          double s1 = getFieldValue(inputPanel, "sisi1");
          double s2 = getFieldValue(inputPanel, "sisi2");
          double s3 = getFieldValue(inputPanel, "sisi3");
          if (segitiga != null && segitiga.getLuas() != 0) {
            ((Segitiga) segitiga).hitungLuas(alas, tinggi);
            ((Segitiga) segitiga).hitungKeliling(s1, s2, s3);
            return segitiga;
          } else {
            segitiga = new Segitiga(alas, tinggi, s1, s2, s3);
            segitiga.hitungLuas();
            segitiga.hitungKeliling();
            return segitiga;
          }

        case 2: // Persegi
          double sisi = getFieldValue(inputPanel, "sisi");
          if (persegi != null && persegi.getLuas() != 0) {
            ((Persegi) persegi).hitungLuas(sisi);
            ((Persegi) persegi).hitungKeliling(sisi);
            return persegi;
          } else {
            persegi = new Persegi(sisi);
            persegi.hitungLuas();
            persegi.hitungKeliling();
            return persegi;
          }

        case 3: // Persegi Panjang
          double p = getFieldValue(inputPanel, "panjang");
          double l = getFieldValue(inputPanel, "lebar");
          if (persegiPanjang != null && persegiPanjang.getLuas() != 0) {
            ((PersegiPanjang) persegiPanjang).hitungLuas(p, l);
            ((PersegiPanjang) persegiPanjang).hitungKeliling(p, l);
            return persegiPanjang;
          } else {
            persegiPanjang = new PersegiPanjang(p, l);
            persegiPanjang.hitungLuas();
            persegiPanjang.hitungKeliling();
            return persegiPanjang;
          }

        case 4: // Lingkaran
          double r = getFieldValue(inputPanel, "jariJari");
          if (lingkaran != null && lingkaran.getLuas() != 0) {
            ((Lingkaran) lingkaran).hitungLuas(r);
            ((Lingkaran) lingkaran).hitungKeliling(r);
            return lingkaran;
          } else {
            lingkaran = new Lingkaran(r);
            lingkaran.hitungLuas();
            lingkaran.hitungKeliling();
            return lingkaran;
          }

        case 5: // Trapesium
          double sisiAtas = getFieldValue(inputPanel, "sisiAtas");
          double sisiBawah = getFieldValue(inputPanel, "sisiBawah");
          double sisiKanan = getFieldValue(inputPanel, "sisiKanan");
          double sisiKiri = getFieldValue(inputPanel, "sisiKiri");
          double tinggiTrapesium = getFieldValue(inputPanel, "tinggi");
          if (trapesium != null && trapesium.getLuas() != 0) {
            ((Trapesium) trapesium).hitungLuas(sisiAtas, sisiBawah, tinggiTrapesium);
            ((Trapesium) trapesium).hitungKeliling(sisiAtas, sisiBawah, sisiKanan, sisiKiri);
            return trapesium;
          } else {
            trapesium = new Trapesium(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggiTrapesium);
            trapesium.hitungLuas();
            trapesium.hitungKeliling();
            return trapesium;
          }

        case 6: // Jajar Genjang
          double alasJG = getFieldValue(inputPanel, "alas");
          double tinggiJG = getFieldValue(inputPanel, "tinggi");
          double sisiMiringJG = getFieldValue(inputPanel, "sisiMiring");
          if (jajarGenjang != null && jajarGenjang.getLuas() != 0) {
            ((JajarGenjang) jajarGenjang).hitungLuas(alasJG, tinggiJG);
            ((JajarGenjang) jajarGenjang).hitungKeliling(alasJG, sisiMiringJG);
            return jajarGenjang;
          } else {
            jajarGenjang = new JajarGenjang(alasJG, tinggiJG, sisiMiringJG);
            jajarGenjang.hitungLuas();
            jajarGenjang.hitungKeliling();
            return jajarGenjang;
          }

        case 7: // Belah Ketupat
          double d1 = getFieldValue(inputPanel, "d1");
          double d2 = getFieldValue(inputPanel, "d2");
          if (belahKetupat != null && belahKetupat.getLuas() != 0) {
            ((BelahKetupat) belahKetupat).hitungLuas(d1, d2);
            ((BelahKetupat) belahKetupat).hitungKeliling(d1, d2);
            return belahKetupat;
          } else {
            belahKetupat = new BelahKetupat(d1, d2);
            belahKetupat.hitungLuas();
            belahKetupat.hitungKeliling();
            return belahKetupat;
          }

        case 8: // Layang-Layang
          double d1LL = getFieldValue(inputPanel, "d1");
          double d2LL = getFieldValue(inputPanel, "d2");
          double sisiALL = getFieldValue(inputPanel, "sisiA");
          double sisiBLL = getFieldValue(inputPanel, "sisiB");
          if (layangLayang != null && layangLayang.getLuas() != 0) {
            ((LayangLayang) layangLayang).hitungLuas(d1LL, d2LL);
            ((LayangLayang) layangLayang).hitungKeliling(sisiALL, sisiBLL);
            return layangLayang;
          } else {
            layangLayang = new LayangLayang(d1LL, d2LL, sisiALL, sisiBLL);
            layangLayang.hitungLuas();
            layangLayang.hitungKeliling();
            return layangLayang;
          }

        case 9: // Juring Lingkaran
          double rJL = getFieldValue(inputPanel, "jariJari");
          double sudutPusatJL = getFieldValue(inputPanel, "sudutPusat");
          if (juringLingkaran != null && juringLingkaran.getLuas() != 0) {
            ((JuringLingkaran) juringLingkaran).hitungLuas(sudutPusatJL, rJL);
            ((JuringLingkaran) juringLingkaran).hitungKeliling(sudutPusatJL, rJL);
            return juringLingkaran;
          } else {
            juringLingkaran = new JuringLingkaran(sudutPusatJL, 0, rJL);
            juringLingkaran.hitungLuas();
            juringLingkaran.hitungKeliling();
            return juringLingkaran;
          }

        case 10: // Tembereng Lingkaran
          double jariJariTL = getFieldValue(inputPanel, "jariJari");
          double tinggiTemberengTL = getFieldValue(inputPanel, "tinggiTembereng");
          double panjangTaliBusurTL = getFieldValue(inputPanel, "panjangTaliBusur");
          double sudutPusatTL = getFieldValue(inputPanel, "sudutPusat");
          if (temberengLingkaran != null && temberengLingkaran.getLuas() != 0) {
            ((TemberengLingkaran) temberengLingkaran).hitungLuas(jariJariTL, tinggiTemberengTL);
            ((TemberengLingkaran) temberengLingkaran).hitungKeliling(jariJariTL, panjangTaliBusurTL);
            return temberengLingkaran;
          } else {
            temberengLingkaran = new TemberengLingkaran(sudutPusatTL, tinggiTemberengTL, panjangTaliBusurTL,
                jariJariTL);
            temberengLingkaran.hitungLuas();
            temberengLingkaran.hitungKeliling();
            return temberengLingkaran;
          }

        case 11: // Bola
          double rBola = getFieldValue(inputPanel, "jariJari");
          bola = new Bola(rBola);
          return bola;
        case 12: // Tabung
          double rTabung = getFieldValue(inputPanel, "jariJari");
          double tinggiTabung = getFieldValue(inputPanel, "tinggi");
          return new Tabung(rTabung, tinggiTabung);
        case 13: // Kerucut
          double jariJariAlasKerucut = getFieldValue(inputPanel, "jariJariAlas");
          double tinggiKerucut = getFieldValue(inputPanel, "tinggi");
          return new Kerucut(tinggiKerucut, jariJariAlasKerucut);
        case 14: // Kerucut Terpancung
          double jariJariAtasKT = getFieldValue(inputPanel, "jariJariAtas");
          double jariJariBawahKT = getFieldValue(inputPanel, "jariJariBawah");
          double tinggiKT = getFieldValue(inputPanel, "tinggi");
          return new KerucutTerpancung(tinggiKT, jariJariBawahKT, jariJariAtasKT);
        case 15: // Cincin Bola
          double jariJariDalamCB = getFieldValue(inputPanel, "jariJariDalam");
          double jariJariLuarCB = getFieldValue(inputPanel, "jariJariLuar");
          double tinggiCB = getFieldValue(inputPanel, "tinggi");
          return new CincinBola(jariJariDalamCB, jariJariLuarCB, tinggiCB);
        case 16: // Juring Bola
          double sudutJB = getFieldValue(inputPanel, "sudut");
          double jariJariJB = getFieldValue(inputPanel, "jariJari");
          return new JuringBola(sudutJB, jariJariJB);
        case 17: // Tembereng Bola
          double tinggiTemberengTB = getFieldValue(inputPanel, "tinggiTembereng");
          double jariJariBolaTB = getFieldValue(inputPanel, "jariJariBola");
          // double jariLingkaranPotonganTB = getFieldValue(inputPanel,
          // "jariLingkaranPotongan");
          return new TemberengBola(tinggiTemberengTB, jariJariBolaTB); // Asumsi constructor sesuai
        case 18: // Limas Persegi
          double sisiAlasLP = getFieldValue(inputPanel, "sisiAlas");
          double tinggiLimasLP = getFieldValue(inputPanel, "tinggiLimas");
          return new LimasPersegi(sisiAlasLP, tinggiLimasLP);
        case 19: // Limas Persegi Panjang
          double panjangAlasLPP = getFieldValue(inputPanel, "panjangAlas");
          double lebarAlasLPP = getFieldValue(inputPanel, "lebarAlas");
          double tinggiLimasLPP = getFieldValue(inputPanel, "tinggiLimas");
          return new LimasPersegiPanjang(panjangAlasLPP, lebarAlasLPP, tinggiLimasLPP);
        case 20: // Limas Segitiga
          double alasSegitigaLS = getFieldValue(inputPanel, "alasSegitiga");
          double tinggiSegitigaLS = getFieldValue(inputPanel, "tinggiSegitiga");
          double tinggiLimasLS = getFieldValue(inputPanel, "tinggiLimas");
          // Parameter opsional
          double sisiAlas1LS = getFieldValue(inputPanel, "sisiAlas1");
          double sisiAlas2LS = getFieldValue(inputPanel, "sisiAlas2");
          double sisiAlas3LS = getFieldValue(inputPanel, "sisiAlas3");
          return new LimasSegitiga(alasSegitigaLS, tinggiLimasLS, tinggiSegitigaLS, sisiAlas1LS, sisiAlas2LS,
              sisiAlas3LS);
        case 21: // Limas Belah Ketupat
          double d1AlasLBK = getFieldValue(inputPanel, "d1Alas");
          double d2AlasLBK = getFieldValue(inputPanel, "d2Alas");
          double tinggiLimasLBK = getFieldValue(inputPanel, "tinggiLimas");
          return new LimasBelahKetupat(d1AlasLBK, d2AlasLBK, tinggiLimasLBK);
        case 22: // Limas Jajar Genjang
          double alasJGJG = getFieldValue(inputPanel, "alasJajarGenjang");
          double tinggiJGJG = getFieldValue(inputPanel, "tinggiJajarGenjang");
          double tinggiLimasJGJG = getFieldValue(inputPanel, "tinggiLimas");
          double sisiMiringJGJG = getFieldValue(inputPanel, "sisiMiringJajarGenjang"); // Opsional
          return new LimasJajarGenjang(alasJGJG, tinggiJGJG, sisiMiringJGJG, tinggiLimasJGJG, 0, 0); // 0 untuk optional
                                                                                                     // tinggi sisi
                                                                                                     // tegak
        case 23: // Limas Trapesium
          double sisiAtasAlasLT = getFieldValue(inputPanel, "sisiAtasAlas");
          double sisiBawahAlasLT = getFieldValue(inputPanel, "sisiBawahAlas");
          double tinggiAlasTrapesiumLT = getFieldValue(inputPanel, "tinggiAlasTrapesium");
          double tinggiLimasLT = getFieldValue(inputPanel, "tinggiLimas");
          double sisiKananAlasLT = getFieldValue(inputPanel, "sisiKananAlas"); // Opsional
          double sisiKiriAlasLT = getFieldValue(inputPanel, "sisiKiriAlas"); // Opsional
          return new LimasTrapesium(tinggiLimasLT, tinggiAlasTrapesiumLT, sisiAtasAlasLT, sisiBawahAlasLT,
              sisiKananAlasLT, sisiKiriAlasLT);
        case 24: // Limas Layang-Layang
          double d1AlasLLL = getFieldValue(inputPanel, "d1Alas");
          double d2AlasLLL = getFieldValue(inputPanel, "d2Alas");
          double tinggiLimasLLL = getFieldValue(inputPanel, "tinggiLimas");
          double sisiAAlasLLL = getFieldValue(inputPanel, "sisiAAlas"); // Opsional
          double sisiBAlasLLL = getFieldValue(inputPanel, "sisiBAlas"); // Opsional
          return new LimasLayangLayang(tinggiLimasLLL, 0, 0, d1AlasLLL, d2AlasLLL, sisiAAlasLLL, sisiBAlasLLL); // 0
                                                                                                                // untuk
                                                                                                                // optional
                                                                                                                // tinggi
                                                                                                                // sisi
                                                                                                                // tegak
        case 25: // Prisma Persegi
          double sisiAlasPP = getFieldValue(inputPanel, "sisiAlas");
          double tinggiPrismaPP = getFieldValue(inputPanel, "tinggiPrisma");
          return new PrismaPersegi(sisiAlasPP, tinggiPrismaPP);
        case 26: // Prisma Persegi Panjang
          double panjangAlasPPP = getFieldValue(inputPanel, "panjangAlas");
          double lebarAlasPPP = getFieldValue(inputPanel, "lebarAlas");
          double tinggiPrismaPPP = getFieldValue(inputPanel, "tinggiPrisma");
          return new PrismaPersegiPanjang(panjangAlasPPP, lebarAlasPPP, tinggiPrismaPPP);
        case 27: // Prisma Segitiga
          double alasSegitigaPS = getFieldValue(inputPanel, "alasSegitiga");
          double tinggiSegitigaPS = getFieldValue(inputPanel, "tinggiSegitiga");
          double tinggiPrismaPS = getFieldValue(inputPanel, "tinggiPrisma");
          double sisiAlas1PS = getFieldValue(inputPanel, "sisiAlas1");
          double sisiAlas2PS = getFieldValue(inputPanel, "sisiAlas2");
          double sisiAlas3PS = getFieldValue(inputPanel, "sisiAlas3");
          return new PrismaSegitiga(alasSegitigaPS, tinggiSegitigaPS, tinggiPrismaPS, sisiAlas1PS, sisiAlas2PS,
              sisiAlas3PS);
        case 28: // Prisma Belah Ketupat
          double d1AlasPBK = getFieldValue(inputPanel, "d1Alas");
          double d2AlasPBK = getFieldValue(inputPanel, "d2Alas");
          double tinggiPrismaPBK = getFieldValue(inputPanel, "tinggiPrisma");
          return new PrismaBelahKetupat(d1AlasPBK, d2AlasPBK, tinggiPrismaPBK);
        case 29: // Prisma Jajar Genjang
          double alasPJG = getFieldValue(inputPanel, "alasJajarGenjang");
          double tinggiPJG = getFieldValue(inputPanel, "tinggiJajarGenjang");
          double tinggiPrismaPJG = getFieldValue(inputPanel, "tinggiPrisma");
          double sisiMiringPJG = getFieldValue(inputPanel, "sisiMiringJajarGenjang"); // Opsional
          return new PrismaJajarGenjang(alasPJG, tinggiPJG, tinggiPrismaPJG, sisiMiringPJG);
        case 30: // Prisma Trapesium
          double sisiAtasAlasPT = getFieldValue(inputPanel, "sisiAtasAlas");
          double sisiBawahAlasPT = getFieldValue(inputPanel, "sisiBawahAlas");
          double tinggiAlasTrapesiumPT = getFieldValue(inputPanel, "tinggiAlasTrapesium");
          double tinggiPrismaPT = getFieldValue(inputPanel, "tinggiPrisma");
          double sisiKananAlasPT = getFieldValue(inputPanel, "sisiKananAlas"); // Opsional
          double sisiKiriAlasPT = getFieldValue(inputPanel, "sisiKiriAlas"); // Opsional
          return new PrismaTrapesium(sisiAtasAlasPT, sisiBawahAlasPT, sisiKananAlasPT, sisiKiriAlasPT,
              tinggiAlasTrapesiumPT, tinggiPrismaPT, "Prisma Trapesium");
        case 31: // Prisma Layang-Layang
          double d1AlasPLL = getFieldValue(inputPanel, "d1Alas");
          double d2AlasPLL = getFieldValue(inputPanel, "d2Alas");
          double tinggiPrismaPLL = getFieldValue(inputPanel, "tinggiPrisma");
          double sisiAAlasPLL = getFieldValue(inputPanel, "sisiAAlas"); // Opsional
          double sisiBAlasPLL = getFieldValue(inputPanel, "sisiBAlas"); // Opsional
          return new PrismaLayangLayang(d1AlasPLL, d2AlasPLL, sisiAAlasPLL, sisiBAlasPLL, tinggiPrismaPLL);
        default:
          throw new IllegalArgumentException("Pilihan geometri tidak valid.");
      }
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(
          "Input tidak valid. Harap masukkan nilai numerik yang benar untuk semua parameter.");
    } catch (IllegalArgumentException e) {
      throw e;
    }
  }

  private BangunDatar generateRandomShape(int choice) {
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

  private void initComponents() {
    setTitle("Aplikasi Geometri");
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null); // Center the window

    cardLayout = new CardLayout();
    mainPanel = new JPanel(cardLayout);
    add(mainPanel);

    // --- Panel untuk pemilihan mode manual atau auto generate ---
    modeSelectionPanel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.WEST;

    modeButtonGroup = new ButtonGroup();
    manualModeRadioButton = createRadioButton("Manual", true, modeButtonGroup);
    randomModeRadioButton = createRadioButton("Random", false, modeButtonGroup);
    continueButton = createButton("Lanjut"); // Inisialisasi di sini
    modeSelectionPanel.add(createLabel("Pilih metode input:", 20), gbc);
    gbc.gridy++;
    modeSelectionPanel.add(manualModeRadioButton, gbc);
    gbc.gridy++;
    modeSelectionPanel.add(randomModeRadioButton, gbc);
    gbc.gridy++;
    modeSelectionPanel.add(continueButton, gbc);
    mainPanel.add(modeSelectionPanel, "MODE_SELECTION");

    // --- Panel untuk mode manual
    shapeInputPanel = new JPanel(new BorderLayout(10, 10)); // Border layout untuk keseluruhan panel
    JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
    shapeComboBox = createComboBox(shapeOptions, 18);
    topPanel.add(createLabel("Pilih geometri:", 20));
    topPanel.add(shapeComboBox);
    dynamicInputPanel = new JPanel(new GridBagLayout());

    addShapeButton = createButton("Hitung");
    backToModeButtonManual = createButton("Kembali");

    JPanel bottomButtonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
    bottomButtonsPanel.add(backToModeButtonManual);
    bottomButtonsPanel.add(addShapeButton); // Tombol tambah objek setelah generate

    JPanel centerWrapperPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    centerWrapperPanel.add(dynamicInputPanel);
    shapeInputPanel.add(topPanel, BorderLayout.NORTH);
    shapeInputPanel.add(centerWrapperPanel, BorderLayout.CENTER);
    shapeInputPanel.add(bottomButtonsPanel, BorderLayout.SOUTH);

    mainPanel.add(shapeInputPanel, "SHAPE_INPUT");

    randomInputPanel = new JPanel(new BorderLayout(10, 10));
    JPanel generateTimeInputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Center alignment
    generateTime = new JTextField(10); // Lebar kolom 10 karakter
    generateTime.setFont(new Font(generateTime.getFont().getName(), Font.PLAIN, 20));
    generateTimeLabel = createLabel("Dibuat berapa kali ? = ", 20);
    generateTimeInputPanel.add(generateTimeLabel);
    generateTimeInputPanel.add(generateTime);

    randomInputPanel.add(generateTimeInputPanel, BorderLayout.CENTER);

    JPanel bottomButtonsPanel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
    processRandomButton = createButton("Proses dan Tampilkan");
    backToModeButtonRandom = createButton("Kembali"); // Tombol kembali khusus untuk mode random

    bottomButtonsPanel2.add(backToModeButtonRandom);
    bottomButtonsPanel2.add(processRandomButton);
    randomInputPanel.add(bottomButtonsPanel2, BorderLayout.SOUTH);

    mainPanel.add(randomInputPanel, "RANDOM_INPUT");

    // --- Panel untuk hasil operasi (RESULTS) ---
    resultsPanel = new JPanel(new BorderLayout(10, 10));
    resultsTextArea = new JTextArea();
    resultsTextArea.setEditable(false);
    resultsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
    backToInputButton = createButton("Kembali ke Input");

    resultsPanel.add(new JScrollPane(resultsTextArea), BorderLayout.CENTER);
    JPanel resultsBottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    resultsBottomPanel.add(backToInputButton);
    resultsPanel.add(resultsBottomPanel, BorderLayout.SOUTH);

    mainPanel.add(resultsPanel, "RESULTS");

    // --- Event Listeners ---
    continueButton.addActionListener(e -> {
      isManualMode = manualModeRadioButton.isSelected();
      if (isManualMode) {
        updateDynamicInputPanel(); // Perbarui input panel sesuai pilihan bentuk
        cardLayout.show(mainPanel, "SHAPE_INPUT");
      } else {
        cardLayout.show(mainPanel, "RANDOM_INPUT");
      }
    });
    // memilih bangun datar apa sekaligus menampilkan input data dan textnya
    shapeComboBox.addActionListener(e -> updateDynamicInputPanel());
    // ini membuat object berdasarkan bangun yang dipilih
    addShapeButton.addActionListener(e -> {
      try {
        // mengambil id geometri
        int choice = shapeComboBox.getSelectedIndex() + 1; // 1-indexed
        // manggil fungsi untuk membuat object
        BangunDatar shape = generateManualShape(choice, dynamicInputPanel);
        if (shape != null) {
          shapes.add(shape);
          processAndDisplayResultsManual("SHAPE_INPUT");// editan nabil
          JOptionPane.showMessageDialog(this, shapeOptions[choice - 1] + " berhasil ditambahkan!");
          clearInputFields(dynamicInputPanel);
        }
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Input tidak valid. Harap masukkan angka.", "Error",
            JOptionPane.ERROR_MESSAGE);
      } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    });
    // setelah dibuat object nya bisa langsung diproses hitung dan tampilkan di
    // panel SHAPE_Input

    processRandomButton.addActionListener(e -> {
      try {
        int count = Integer.parseInt(generateTime.getText());
        if (count <= 0) {
          JOptionPane.showMessageDialog(this, "Jumlah generate harus lebih dari 0.", "Error",
              JOptionPane.ERROR_MESSAGE);
          return;
        }
        shapes.clear(); // Clear previous shapes
        for (int i = 1; i < 32; i++) {
          for (int j = 0; j < count; j++) {
            shapes.add(generateRandomShape(i));
          }
          // Generate random shape from all available shapes
          // Pilihan random dari semua shape yang ada
        }
        List<String> results = ThreadExecutor.processShapes(shapes);
        processAndDisplayResultsRandom(results, "RANDOM_INPUT");
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Input jumlah generate tidak valid. Harap masukkan angka.", "Error",
            JOptionPane.ERROR_MESSAGE);
      } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    });

    // Listeners untuk tombol kembali
    backToModeButtonManual.addActionListener(e -> {
      shapes.clear(); // Bersihkan shapes jika kembali ke mode selection
      cardLayout.show(mainPanel, "MODE_SELECTION");
    });

    backToModeButtonRandom.addActionListener(e -> {
      shapes.clear(); // Bersihkan shapes jika kembali ke mode selection
      cardLayout.show(mainPanel, "MODE_SELECTION");
    });

    backToInputButton.addActionListener(e -> {
      // Kembali ke panel input yang sesuai dengan mode terakhir
      if (isManualMode) {
        cardLayout.show(mainPanel, "SHAPE_INPUT");
      } else {
        cardLayout.show(mainPanel, "RANDOM_INPUT");
      }
      resultsTextArea.setText("");
    });

    // Initial setup - tampilkan panel pemilihan mode saat aplikasi dimulai
    cardLayout.show(mainPanel, "MODE_SELECTION");

  }

  private static double r() {
    return 1 + Math.random() * 10; // Nilai random antara 1.0 sampai 11.0
  }

  private static double r(double min, double max) {
    return min + Math.random() * (max - min);
  }

  public static JButton createButton(String buttonText) {
    JButton button = new JButton(buttonText);
    Dimension fixedSize = new Dimension(200, 50);
    button.setPreferredSize(fixedSize);
    button.setMinimumSize(fixedSize);
    button.setMaximumSize(fixedSize);
    return button;
  }

  public static JLabel createLabel(String labelText, int fontSize) {
    JLabel label = new JLabel(labelText);
    label.setFont(new Font(label.getFont().getName(), Font.PLAIN, fontSize)); // Mengambil nama font default jika tidak
    return label;
  }

  public static JRadioButton createRadioButton(String text, boolean isSelected, ButtonGroup group) {
    JRadioButton radioButton = new JRadioButton(text);
    radioButton.setFont(new Font(radioButton.getFont().getName(), Font.PLAIN, 18));
    radioButton.setSelected(isSelected);

    if (group != null) {
      group.add(radioButton);
    }
    return radioButton;
  }

  public static <E> JComboBox<E> createComboBox(E[] items, int fontSize) {
    JComboBox<E> comboBox = new JComboBox<>(items);
    comboBox.setFont(new Font(comboBox.getFont().getName(), Font.PLAIN, fontSize));
    return comboBox;
  }

  // deklarasi komponen komponen
  private CardLayout cardLayout;
  private JPanel mainPanel;

  // panel untuk seleksi mode
  private JPanel modeSelectionPanel;
  private JRadioButton manualModeRadioButton;
  private JRadioButton randomModeRadioButton;
  private ButtonGroup modeButtonGroup;
  private JButton continueButton; // Pindahkan deklarasi ke sini agar bisa diakses di listener

  // panel untuk seleksi input manual
  private JPanel shapeInputPanel;
  private JComboBox<String> shapeComboBox;
  private JPanel dynamicInputPanel;
  private JButton addShapeButton;

  private JButton backToModeButtonManual; // Tombol kembali untuk mode manual
  private JButton backToModeButtonRandom; // Tombol kembali untuk mode random

  // panel untuk randomInputPanel
  private JPanel randomInputPanel;
  private JButton processRandomButton; // Ubah nama agar jelas untuk mode random
  private JLabel generateTimeLabel; // Pindahkan deklarasi ke sini
  private JTextField generateTime; // Pindahkan deklarasi ke sini

  // panel untuk hasil operasi
  private JPanel resultsPanel;
  private JTextArea resultsTextArea;
  private JButton backToInputButton;

  private List<Geometri> shapes = new ArrayList<>();
  private boolean isManualMode = true; // Default mode
                                       //
  private final String[] shapeOptions = {
      "Segitiga", "Persegi", "Persegi Panjang", "Lingkaran", "Trapesium",
      "Jajar Genjang", "Belah Ketupat", "Layang-Layang", "Juring Lingkaran",
      "Tembereng Lingkaran", "Bola", "Tabung", "Kerucut", "Kerucut Terpancung",
      "Cincin Bola", "Juring Bola", "Tembereng Bola", "Limas Persegi",
      "Limas Persegi Panjang", "Limas Segitiga", "Limas Belah Ketupat",
      "Limas Jajar Genjang", "Limas Trapesium", "Limas Layang-Layang",
      "Prisma Persegi", "Prisma Persegi Panjang", "Prisma Segitiga",
      "Prisma Belah Ketupat", "Prisma Jajar Genjang", "Prisma Trapesium",
      "Prisma Layang-Layang"
  };

  private BangunDatar segitiga;
  private BangunDatar persegi;
  private BangunDatar persegiPanjang;
  private BangunDatar lingkaran;
  private BangunDatar trapesium;
  private BangunDatar jajarGenjang;
  private BangunDatar belahKetupat;
  private BangunDatar layangLayang;
  private BangunDatar juringLingkaran;
  private BangunDatar temberengLingkaran;
  private Bola bola;
  private Tabung tabung;
  private Kerucut kerucut;
  private KerucutTerpancung kerucutTerpancung;
  private CincinBola cincinBola;
  private JuringBola juringBola;
  private TemberengBola temberengBola;
  private LimasPersegi limasPersegi;
  private LimasPersegiPanjang limasPersegiPanjang;
  private LimasSegitiga limasSegitiga;
  private LimasBelahKetupat limasBelahKetupat;
  private LimasJajarGenjang limasJajarGenjang;
  private LimasTrapesium limasTrapesium;
  private LimasLayangLayang limasLayangLayang;
  private PrismaPersegi prismaPersegi;
  private PrismaPersegiPanjang prismaPersegiPanjang;
  private PrismaSegitiga prismaSegitiga;
  private PrismaBelahKetupat prismaBelahKetupat;
  private PrismaJajarGenjang prismaJajarGenjang;
  private PrismaTrapesium prismaTrapesium;
  private PrismaLayangLayang prismaLayangLayang;

}
