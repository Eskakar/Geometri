package geometri.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.*;

// Assuming these classes are in your 'geometri' package
import geometri.*;
import threading.ThreadExecutor; // Assuming this class exists

public class MainGUI extends JFrame {

  private CardLayout cardLayout;
  private JPanel mainPanel;

  private JPanel modeSelectionPanel;
  private JRadioButton manualModeRadioButton;
  private JRadioButton autoModeRadioButton;
  private ButtonGroup modeButtonGroup;

  private JPanel shapeInputPanel;
  private JComboBox<String> shapeComboBox;
  private JPanel dynamicInputPanel;
  private JButton addShapeButton;
  private JButton generateShapesButton;
  private JTextField quantityField;
  private JButton processButton;
  private JButton backToModeButton;

  private JPanel resultsPanel;
  private JTextArea resultsTextArea;
  private JButton backToInputButton;

  private List<BangunDatar> shapes = new ArrayList<>();
  private boolean isManualMode = true; // Default mode

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

  public MainGUI() {
    setTitle("Aplikasi Geometri");
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null); // Center the window
    cardLayout = new CardLayout();
    mainPanel = new JPanel(cardLayout);
    add(mainPanel);

    // --- Mode Selection Panel ---
    modeSelectionPanel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.WEST;

    manualModeRadioButton = new JRadioButton("Input manual");
    manualModeRadioButton.setSelected(true);
    autoModeRadioButton = new JRadioButton("Generate otomatis (random)");
    modeButtonGroup = new ButtonGroup();
    modeButtonGroup.add(manualModeRadioButton);
    modeButtonGroup.add(autoModeRadioButton);

    JButton continueButton = new JButton("Lanjut");

    modeSelectionPanel.add(new JLabel("Pilih metode input:"), gbc);
    gbc.gridy++;
    modeSelectionPanel.add(manualModeRadioButton, gbc);
    gbc.gridy++;
    modeSelectionPanel.add(autoModeRadioButton, gbc);
    gbc.gridy++;
    modeSelectionPanel.add(continueButton, gbc);

    mainPanel.add(modeSelectionPanel, "MODE_SELECTION");

    // --- Shape Input Panel ---
    shapeInputPanel = new JPanel(new BorderLayout(10, 10));
    JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
    JPanel centerInputPanel = new JPanel(new BorderLayout());
    JPanel bottomButtonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));

    shapeComboBox = new JComboBox<>(shapeOptions);
    topPanel.add(new JLabel("Pilih geometri:"));
    topPanel.add(shapeComboBox);

    dynamicInputPanel = new JPanel(new GridLayout(0, 2, 5, 5)); // 0 rows, 2 columns, 5px gap
    centerInputPanel.add(dynamicInputPanel, BorderLayout.NORTH); // Align to top

    addShapeButton = new JButton("Tambah Objek");
    generateShapesButton = new JButton("Generate Objek");
    quantityField = new JTextField(5);
    processButton = new JButton("Proses dan Tampilkan");
    backToModeButton = new JButton("Kembali");

    JPanel autoGeneratePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    autoGeneratePanel.add(new JLabel("Jumlah objek per bentuk:"));
    autoGeneratePanel.add(quantityField);
    autoGeneratePanel.add(generateShapesButton);

    bottomButtonsPanel.add(backToModeButton);
    bottomButtonsPanel.add(processButton);

    shapeInputPanel.add(topPanel, BorderLayout.NORTH);
    shapeInputPanel.add(new JScrollPane(centerInputPanel), BorderLayout.CENTER);
    shapeInputPanel.add(bottomButtonsPanel, BorderLayout.SOUTH);
    bottomButtonsPanel.add(addShapeButton);

    mainPanel.add(shapeInputPanel, "SHAPE_INPUT");

    resultsPanel = new JPanel(new BorderLayout(10, 10));
    resultsTextArea = new JTextArea();
    resultsTextArea.setEditable(false);
    resultsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
    backToInputButton = new JButton("Kembali ke Input");

    resultsPanel.add(new JScrollPane(resultsTextArea), BorderLayout.CENTER);
    JPanel resultsBottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    resultsBottomPanel.add(backToInputButton);
    resultsPanel.add(resultsBottomPanel, BorderLayout.SOUTH);

    mainPanel.add(resultsPanel, "RESULTS");

    // --- Event Listeners ---
    continueButton.addActionListener(e -> {
      isManualMode = manualModeRadioButton.isSelected();
      updateInputPanelForMode();
      cardLayout.show(mainPanel, "SHAPE_INPUT");
    });

    manualModeRadioButton.addActionListener(e -> updateInputPanelForMode());
    autoModeRadioButton.addActionListener(e -> updateInputPanelForMode());

    shapeComboBox.addActionListener(e -> updateDynamicInputPanel());

    addShapeButton.addActionListener(e -> {
      try {
        int choice = shapeComboBox.getSelectedIndex() + 1; // 1-indexed
        BangunDatar shape = generateManualShape(choice, dynamicInputPanel);
        if (shape != null) {
          shapes.add(shape);
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

    generateShapesButton.addActionListener(e -> {
      try {
        int choice = shapeComboBox.getSelectedIndex() + 1; // 1-indexed
        int jumlah = Integer.parseInt(quantityField.getText());

        if (choice == 0) { // All geometries - not supported for specific shape dropdown
          // For "Semua Geometri" (0), we would need a separate option or a way to iterate
          // through all.
          // For now, this is handled when 'choice' is picked from dropdown.
          // If you want "All Geometries" random generation, you need to add a "0. Semua
          // Geometri" to the combobox
          // and handle it in generateRandomShape.
          JOptionPane.showMessageDialog(this,
              "Fitur 'Semua Geometri' untuk generate otomatis dari dropdown belum diimplementasikan. Pilih satu per satu.",
              "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
          for (int i = 0; i < jumlah; i++) {
            shapes.add(generateRandomShape(choice));
          }
          JOptionPane.showMessageDialog(this, jumlah + " " + shapeOptions[choice - 1] + " berhasil digenerate!");
        }
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Jumlah tidak valid. Harap masukkan angka.", "Error",
            JOptionPane.ERROR_MESSAGE);
      } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    });

    processButton.addActionListener(e -> {
      if (shapes.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Belum ada bangun yang ditambahkan atau digenerate.", "Informasi",
            JOptionPane.INFORMATION_MESSAGE);
        return;
      }
      resultsTextArea.setText(""); // Clear previous results
      // This part simulates the ThreadExecutor.processShapes(shapes);
      // You'll need to adapt it to actually use your ThreadExecutor and get its
      // output.
      // For now, I'll just iterate and display
      for (Geometri shape : shapes) {
        resultsTextArea.append(shape.getNama() + ":\n");
        resultsTextArea.append("  Luas: " + String.format("%.2f", shape.hitungLuas()) + "\n");
        if (shape instanceof BangunDatar) {
          resultsTextArea.append("  Keliling: " + String.format("%.2f", shape.hitungKeliling()) + "\n");
        } else if (shape instanceof Bola) {
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((Bola) shape).hitungVolume()) + "\n");
          resultsTextArea
              .append("  Luas Permukaan: " + String.format("%.2f", ((Bola) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof Tabung) {
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((Tabung) shape).hitungVolume()) + "\n");
          resultsTextArea
              .append("  Luas Permukaan: " + String.format("%.2f", ((Tabung) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof Kerucut) {
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
              .append("  Luas Permukaan: " + String.format("%.2f", ((CincinBola) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof JuringBola) {
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((JuringBola) shape).hitungVolume()) + "\n");
          resultsTextArea
              .append("  Luas Permukaan: " + String.format("%.2f", ((JuringBola) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof TemberengBola) {
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((TemberengBola) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((TemberengBola) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof LimasPersegi) {
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((LimasPersegi) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((LimasPersegi) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof LimasPersegiPanjang) {
          resultsTextArea
              .append("  Volume: " + String.format("%.2f", ((LimasPersegiPanjang) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((LimasPersegiPanjang) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof LimasSegitiga) {
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((LimasSegitiga) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
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
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((LimasTrapesium) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((LimasTrapesium) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof LimasLayangLayang) {
          resultsTextArea
              .append("  Volume: " + String.format("%.2f", ((LimasLayangLayang) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((LimasLayangLayang) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof PrismaPersegi) {
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((PrismaPersegi) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((PrismaPersegi) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof PrismaPersegiPanjang) {
          resultsTextArea
              .append("  Volume: " + String.format("%.2f", ((PrismaPersegiPanjang) shape).hitungVolume()) + "\n");
          resultsTextArea.append("  Luas Permukaan: "
              + String.format("%.2f", ((PrismaPersegiPanjang) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof PrismaSegitiga) {
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((PrismaSegitiga) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((PrismaSegitiga) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof PrismaBelahKetupat) {
          resultsTextArea
              .append("  Volume: " + String.format("%.2f", ((PrismaBelahKetupat) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((PrismaBelahKetupat) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof PrismaJajarGenjang) {
          resultsTextArea
              .append("  Volume: " + String.format("%.2f", ((PrismaJajarGenjang) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((PrismaJajarGenjang) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof PrismaTrapesium) {
          resultsTextArea.append("  Volume: " + String.format("%.2f", ((PrismaTrapesium) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((PrismaTrapesium) shape).hitungLuasPermukaan()) + "\n");
        } else if (shape instanceof PrismaLayangLayang) {
          resultsTextArea
              .append("  Volume: " + String.format("%.2f", ((PrismaLayangLayang) shape).hitungVolume()) + "\n");
          resultsTextArea.append(
              "  Luas Permukaan: " + String.format("%.2f", ((PrismaLayangLayang) shape).hitungLuasPermukaan()) + "\n");
        }
        resultsTextArea.append("\n");
      }
      shapes.clear(); // Clear shapes after processing
      cardLayout.show(mainPanel, "RESULTS");
    });

    backToModeButton.addActionListener(e -> {
      shapes.clear(); // Clear shapes if returning to mode selection
      cardLayout.show(mainPanel, "MODE_SELECTION");
    });

    backToInputButton.addActionListener(e -> {
      cardLayout.show(mainPanel, "SHAPE_INPUT");
      resultsTextArea.setText("");
    });

    // Initial setup
    updateInputPanelForMode();
    updateDynamicInputPanel();
  }

  private void updateInputPanelForMode() {
    if (isManualMode) {
      addShapeButton.setVisible(true);
      generateShapesButton.setVisible(false);
      quantityField.setVisible(false);
    } else {
      addShapeButton.setVisible(false);
      generateShapesButton.setVisible(true);
      quantityField.setVisible(true);
    }
    // Repack the frame to adjust layout if components visibility changed
    revalidate();
    repaint();
  }

  private void updateDynamicInputPanel() {
    dynamicInputPanel.removeAll();
    String selectedShape = (String) shapeComboBox.getSelectedItem();
    if (selectedShape == null)
      return;

    switch (selectedShape) {
      case "Segitiga":
        addInputField("Alas:", "alas");
        addInputField("Tinggi:", "tinggi");
        addInputField("Sisi A:", "sisi1");
        addInputField("Sisi B:", "sisi2");
        addInputField("Sisi C:", "sisi3");
        break;
      case "Persegi":
        addInputField("Sisi:", "sisi");
        break;
      case "Persegi Panjang":
        addInputField("Panjang:", "panjang");
        addInputField("Lebar:", "lebar");
        break;
      case "Lingkaran":
        addInputField("Jari-jari:", "jariJari");
        break;
      case "Trapesium":
        addInputField("Sisi atas:", "sisiAtas");
        addInputField("Sisi bawah:", "sisiBawah");
        addInputField("Sisi kanan:", "sisiKanan");
        addInputField("Sisi kiri:", "sisiKiri");
        addInputField("Tinggi:", "tinggi");
        break;
      case "Jajar Genjang":
        addInputField("Alas:", "alas");
        addInputField("Tinggi:", "tinggi");
        addInputField("Sisi Miring:", "sisiMiring");
        break;
      case "Belah Ketupat":
        addInputField("Diagonal 1:", "d1");
        addInputField("Diagonal 2:", "d2");
        break;
      case "Layang-Layang":
        addInputField("Diagonal 1:", "d1");
        addInputField("Diagonal 2:", "d2");
        addInputField("Sisi A:", "sisiA");
        addInputField("Sisi B:", "sisiB");
        break;
      case "Juring Lingkaran":
        addInputField("Sudut Pusat (derajat):", "sudutPusat");
        addInputField("Busur:", "busur");
        addInputField("Jari-jari:", "jariJari");
        break;
      case "Tembereng Lingkaran":
        addInputField("Jari-jari:", "jariJari");
        addInputField("Tinggi Tembereng:", "tinggiTembereng");
        addInputField("Panjang Tali Busur:", "panjangTaliBusur");
        addInputField("Sudut Pusat (derajat):", "sudutPusat");
        break;
      case "Bola":
        addInputField("Jari-jari:", "jariJari");
        break;
      case "Tabung":
        addInputField("Jari-jari:", "jariJari");
        addInputField("Tinggi:", "tinggi");
        break;
      case "Kerucut":
        addInputField("Jari-jari Alas:", "jariJariAlas");
        addInputField("Tinggi:", "tinggi");
        break;
      case "Kerucut Terpancung":
        addInputField("Jari-jari Atas:", "jariJariAtas");
        addInputField("Jari-jari Bawah:", "jariJariBawah");
        addInputField("Tinggi:", "tinggi");
        break;
      case "Cincin Bola":
        addInputField("Jari-jari Dalam:", "jariJariDalam");
        addInputField("Jari-jari Luar:", "jariJariLuar");
        addInputField("Tinggi:", "tinggi");
        break;
      case "Juring Bola":
        addInputField("Sudut (derajat):", "sudut");
        addInputField("Jari-jari:", "jariJari");
        break;
      case "Tembereng Bola":
        addInputField("Tinggi Tembereng:", "tinggiTembereng");
        addInputField("Jari-jari Lingkaran Potongan:", "jariLingkaranPotongan");
        break;
      case "Limas Persegi":
        addInputField("Sisi Alas:", "sisiAlas");
        addInputField("Tinggi Limas:", "tinggiLimas");
        break;
      case "Limas Persegi Panjang":
        addInputField("Panjang Alas:", "panjangAlas");
        addInputField("Lebar Alas:", "lebarAlas");
        addInputField("Tinggi Limas:", "tinggiLimas");
        break;
      case "Limas Segitiga":
        addInputField("Sisi Alas 1:", "sisiAlas1");
        addInputField("Sisi Alas 2:", "sisiAlas2");
        addInputField("Sisi Alas 3:", "sisiAlas3");
        addInputField("Alas Segitiga:", "alasSegitiga");
        addInputField("Tinggi Segitiga Alas:", "tinggiSegitiga");
        addInputField("Tinggi Limas:", "tinggiLimas");
        break;
      case "Limas Belah Ketupat":
        addInputField("Diagonal 1 Alas:", "d1Alas");
        addInputField("Diagonal 2 Alas:", "d2Alas");
        addInputField("Tinggi Limas:", "tinggiLimas");
        break;
      case "Limas Jajar Genjang":
        addInputField("Alas Jajar Genjang:", "alasJajarGenjang");
        addInputField("Tinggi Jajar Genjang:", "tinggiJajarGenjang");
        addInputField("Sisi Miring Jajar Genjang:", "sisiMiringJajarGenjang");
        addInputField("Tinggi Limas:", "tinggiLimas");
        addInputField("Tinggi Sisi Tegak Panjang (optional):", "tinggiSegitigaPanjang"); // Assuming these are
                                                                                         // optional/calculated
        addInputField("Tinggi Sisi Tegak Pendek (optional):", "tinggiSegitigaPendek");
        break;
      case "Limas Trapesium":
        addInputField("Sisi Atas Alas:", "sisiAtasAlas");
        addInputField("Sisi Bawah Alas:", "sisiBawahAlas");
        addInputField("Sisi Kanan Alas:", "sisiKananAlas");
        addInputField("Sisi Kiri Alas:", "sisiKiriAlas");
        addInputField("Tinggi Alas Trapesium:", "tinggiAlasTrapesium");
        addInputField("Tinggi Limas:", "tinggiLimas");
        break;
      case "Limas Layang-Layang":
        addInputField("Diagonal 1 Alas:", "d1Alas");
        addInputField("Diagonal 2 Alas:", "d2Alas");
        addInputField("Sisi Atas Alas:", "sisiAtasAlas");
        addInputField("Sisi Bawah Alas:", "sisiBawahAlas");
        addInputField("Tinggi Limas:", "tinggiLimas");
        addInputField("Tinggi Sisi Tegak 1 (optional):", "tinggiSisiTegak1"); // Assuming these are optional/calculated
        addInputField("Tinggi Sisi Tegak 2 (optional):", "tinggiSisiTegak2");
        break;
      case "Prisma Persegi":
        addInputField("Sisi Alas:", "sisiAlas");
        addInputField("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Persegi Panjang":
        addInputField("Panjang Alas:", "panjangAlas");
        addInputField("Lebar Alas:", "lebarAlas");
        addInputField("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Segitiga":
        addInputField("Sisi Alas 1:", "sisiAlas1");
        addInputField("Sisi Alas 2:", "sisiAlas2");
        addInputField("Sisi Alas 3:", "sisiAlas3");
        addInputField("Alas Segitiga:", "alasSegitiga");
        addInputField("Tinggi Segitiga Alas:", "tinggiSegitiga");
        addInputField("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Belah Ketupat":
        addInputField("Diagonal 1 Alas:", "d1Alas");
        addInputField("Diagonal 2 Alas:", "d2Alas");
        addInputField("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Jajar Genjang":
        addInputField("Alas Jajar Genjang:", "alasJajarGenjang");
        addInputField("Tinggi Jajar Genjang:", "tinggiJajarGenjang");
        addInputField("Sisi Miring Jajar Genjang:", "sisiMiringJajarGenjang");
        addInputField("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Trapesium":
        addInputField("Sisi Atas Alas:", "sisiAtasAlas");
        addInputField("Sisi Bawah Alas:", "sisiBawahAlas");
        addInputField("Sisi Kanan Alas:", "sisiKananAlas");
        addInputField("Sisi Kiri Alas:", "sisiKiriAlas");
        addInputField("Tinggi Alas Trapesium:", "tinggiAlasTrapesium");
        addInputField("Tinggi Prisma:", "tinggiPrisma");
        break;
      case "Prisma Layang-Layang":
        addInputField("Diagonal 1 Alas:", "d1Alas");
        addInputField("Diagonal 2 Alas:", "d2Alas");
        addInputField("Sisi Atas Alas:", "sisiAtasAlas");
        addInputField("Sisi Bawah Alas:", "sisiBawahAlas");
        addInputField("Tinggi Prisma:", "tinggiPrisma");
        break;
      default:
        // No specific inputs needed, or not yet implemented
        dynamicInputPanel.add(new JLabel("Pilih bentuk untuk input parameter."));
        break;
    }
    dynamicInputPanel.revalidate();
    dynamicInputPanel.repaint();
  }

  private void addInputField(String label, String name) {
    JLabel l = new JLabel(label);
    JTextField tf = new JTextField(10);
    tf.setName(name); // Set a name to retrieve it later
    dynamicInputPanel.add(l);
    dynamicInputPanel.add(tf);
  }

  private double getFieldValue(JPanel panel, String fieldName) {
    for (Component comp : panel.getComponents()) {
      if (comp instanceof JTextField) {
        JTextField tf = (JTextField) comp;
        if (fieldName.equals(tf.getName())) {
          return Double.parseDouble(tf.getText());
        }
      }
    }
    throw new IllegalArgumentException("Field not found: " + fieldName);
  }

  private void clearInputFields(JPanel panel) {
    for (Component comp : panel.getComponents()) {
      if (comp instanceof JTextField) {
        ((JTextField) comp).setText("");
      }
    }
  }

  // This method mirrors your generateManualShape, adapted for GUI input
  private BangunDatar generateManualShape(int choice, JPanel inputPanel) {
    try {
      switch (choice) {
        case 1: // Segitiga
          double alas = getFieldValue(inputPanel, "alas");
          double tinggi = getFieldValue(inputPanel, "tinggi");
          double s1 = getFieldValue(inputPanel, "sisi1");
          double s2 = getFieldValue(inputPanel, "sisi2");
          double s3 = getFieldValue(inputPanel, "sisi3");
          return new Segitiga(alas, tinggi, s1, s2, s3);
        case 2: // Persegi
          double sisi = getFieldValue(inputPanel, "sisi");
          return new Persegi(sisi);
        case 3: // Persegi Panjang
          double p = getFieldValue(inputPanel, "panjang");
          double l = getFieldValue(inputPanel, "lebar");
          return new PersegiPanjang(p, l);
        case 4: // Lingkaran
          double r = getFieldValue(inputPanel, "jariJari");
          return new Lingkaran(r);
        case 5: // Trapesium
          double sisiAtas = getFieldValue(inputPanel, "sisiAtas");
          double sisiBawah = getFieldValue(inputPanel, "sisiBawah");
          double sisiKanan = getFieldValue(inputPanel, "sisiKanan");
          double sisiKiri = getFieldValue(inputPanel, "sisiKiri");
          double tinggiTrapesium = getFieldValue(inputPanel, "tinggi");
          return new Trapesium(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggiTrapesium);
        case 6: // Jajar Genjang
          double alasJG = getFieldValue(inputPanel, "alas");
          double tinggiJG = getFieldValue(inputPanel, "tinggi");
          double sisiMiringJG = getFieldValue(inputPanel, "sisiMiring");
          return new JajarGenjang(alasJG, tinggiJG, sisiMiringJG);
        case 7: // Belah Ketupat
          double d1 = getFieldValue(inputPanel, "d1");
          double d2 = getFieldValue(inputPanel, "d2");
          return new BelahKetupat(d1, d2);
        case 8: // Layang-Layang
          double d1LL = getFieldValue(inputPanel, "d1");
          double d2LL = getFieldValue(inputPanel, "d2");
          double sisiALL = getFieldValue(inputPanel, "sisiA");
          double sisiBLL = getFieldValue(inputPanel, "sisiB");
          return new LayangLayang(d1LL, d2LL, sisiALL, sisiBLL);
        case 9: // Juring Lingkaran
          double sudutPusatJL = getFieldValue(inputPanel, "sudutPusat");
          double busurJL = getFieldValue(inputPanel, "busur");
          double rJL = getFieldValue(inputPanel, "jariJari");
          return new JuringLingkaran(sudutPusatJL, busurJL, rJL);
        case 10: // Tembereng Lingkaran
          double jariJariTL = getFieldValue(inputPanel, "jariJari");
          double tinggiTemberengTL = getFieldValue(inputPanel, "tinggiTembereng");
          double panjangTaliBusurTL = getFieldValue(inputPanel, "panjangTaliBusur");
          double sudutPusatTL = getFieldValue(inputPanel, "sudutPusat");
          return new TemberengLingkaran(sudutPusatTL, tinggiTemberengTL, panjangTaliBusurTL, jariJariTL);
        case 11: // Bola
          double rBola = getFieldValue(inputPanel, "jariJari");
          return new Bola(rBola);
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
          double jariLingkaranPotonganTB = getFieldValue(inputPanel, "jariLingkaranPotongan");
          return new TemberengBola(tinggiTemberengTB, jariLingkaranPotonganTB);
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
          double sisiAlas1LS = getFieldValue(inputPanel, "sisiAlas1");
          double sisiAlas2LS = getFieldValue(inputPanel, "sisiAlas2");
          double sisiAlas3LS = getFieldValue(inputPanel, "sisiAlas3");
          double alasSegitigaLS = getFieldValue(inputPanel, "alasSegitiga");
          double tinggiSegitigaLS = getFieldValue(inputPanel, "tinggiSegitiga");
          double tinggiLimasLS = getFieldValue(inputPanel, "tinggiLimas");
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
          double sisiMiringJGJG = getFieldValue(inputPanel, "sisiMiringJajarGenjang");
          double tinggiLimasJGJG = getFieldValue(inputPanel, "tinggiLimas");
          // Note: The original Main.java has optional/calculated parameters for
          // LimasJajarGenjang
          // I'm assuming they are derived or optional here based on your constructor
          double tinggiSegitigaPanjangJGJG = 0; // Default or calculate
          double tinggiSegitigaPendekJGJG = 0; // Default or calculate
          try {
            tinggiSegitigaPanjangJGJG = getFieldValue(inputPanel, "tinggiSegitigaPanjang");
          } catch (IllegalArgumentException e) {
            /* ignore if not present */ }
          try {
            tinggiSegitigaPendekJGJG = getFieldValue(inputPanel, "tinggiSegitigaPendek");
          } catch (IllegalArgumentException e) {
            /* ignore if not present */ }
          return new LimasJajarGenjang(alasJGJG, tinggiJGJG, sisiMiringJGJG, tinggiLimasJGJG, tinggiSegitigaPanjangJGJG,
              tinggiSegitigaPendekJGJG);
        case 23: // Limas Trapesium
          double sisiAtasAlasLT = getFieldValue(inputPanel, "sisiAtasAlas");
          double sisiBawahAlasLT = getFieldValue(inputPanel, "sisiBawahAlas");
          double sisiKananAlasLT = getFieldValue(inputPanel, "sisiKananAlas");
          double sisiKiriAlasLT = getFieldValue(inputPanel, "sisiKiriAlas");
          double tinggiAlasTrapesiumLT = getFieldValue(inputPanel, "tinggiAlasTrapesium");
          double tinggiLimasLT = getFieldValue(inputPanel, "tinggiLimas");
          return new LimasTrapesium(tinggiLimasLT, tinggiAlasTrapesiumLT, sisiAtasAlasLT, sisiBawahAlasLT,
              sisiKananAlasLT, sisiKiriAlasLT);
        case 24: // Limas Layang-Layang
          double d1AlasLLL = getFieldValue(inputPanel, "d1Alas");
          double d2AlasLLL = getFieldValue(inputPanel, "d2Alas");
          double sisiAtasAlasLLL = getFieldValue(inputPanel, "sisiAtasAlas");
          double sisiBawahAlasLLL = getFieldValue(inputPanel, "sisiBawahAlas");
          double tinggiLimasLLL = getFieldValue(inputPanel, "tinggiLimas");
          double tinggiSisiTegak1LLL = 0;
          double tinggiSisiTegak2LLL = 0;
          try {
            tinggiSisiTegak1LLL = getFieldValue(inputPanel, "tinggiSisiTegak1");
          } catch (IllegalArgumentException e) {
            /* ignore */ }
          try {
            tinggiSisiTegak2LLL = getFieldValue(inputPanel, "tinggiSisiTegak2");
          } catch (IllegalArgumentException e) {
            /* ignore */ }
          return new LimasLayangLayang(tinggiLimasLLL, tinggiSisiTegak1LLL, tinggiSisiTegak2LLL, d1AlasLLL, d2AlasLLL,
              sisiAtasAlasLLL, sisiBawahAlasLLL);
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
          double sisiAlas1PS = getFieldValue(inputPanel, "sisiAlas1");
          double sisiAlas2PS = getFieldValue(inputPanel, "sisiAlas2");
          double sisiAlas3PS = getFieldValue(inputPanel, "sisiAlas3");
          double alasSegitigaPS = getFieldValue(inputPanel, "alasSegitiga");
          double tinggiSegitigaPS = getFieldValue(inputPanel, "tinggiSegitiga");
          double tinggiPrismaPS = getFieldValue(inputPanel, "tinggiPrisma");
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
          double sisiMiringPJG = getFieldValue(inputPanel, "sisiMiringJajarGenjang");
          double tinggiPrismaPJG = getFieldValue(inputPanel, "tinggiPrisma");
          return new PrismaJajarGenjang(alasPJG, tinggiPJG, tinggiPrismaPJG, sisiMiringPJG);
        case 30: // Prisma Trapesium
          double sisiAtasAlasPT = getFieldValue(inputPanel, "sisiAtasAlas");
          double sisiBawahAlasPT = getFieldValue(inputPanel, "sisiBawahAlas");
          double sisiKananAlasPT = getFieldValue(inputPanel, "sisiKananAlas");
          double sisiKiriAlasPT = getFieldValue(inputPanel, "sisiKiriAlas");
          double tinggiAlasTrapesiumPT = getFieldValue(inputPanel, "tinggiAlasTrapesium");
          double tinggiPrismaPT = getFieldValue(inputPanel, "tinggiPrisma");
          return new PrismaTrapesium(sisiAtasAlasPT, sisiBawahAlasPT, sisiKananAlasPT, sisiKiriAlasPT,
              tinggiAlasTrapesiumPT, tinggiPrismaPT, "Prisma Trapesium");
        case 31: // Prisma Layang-Layang
          double d1AlasPLL = getFieldValue(inputPanel, "d1Alas");
          double d2AlasPLL = getFieldValue(inputPanel, "d2Alas");
          double sisiAtasAlasPLL = getFieldValue(inputPanel, "sisiAtasAlas");
          double sisiBawahAlasPLL = getFieldValue(inputPanel, "sisiBawahAlas");
          double tinggiPrismaPLL = getFieldValue(inputPanel, "tinggiPrisma");
          return new PrismaLayangLayang(d1AlasPLL, d2AlasPLL, sisiAtasAlasPLL, sisiBawahAlasPLL, tinggiPrismaPLL);
        default:
      }
      throw new IllegalArgumentException("Pilihan geometri tidak valid.");
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Input tidak valid. Harap masukkan nilai numerik untuk semua parameter.");
    }
  }

  // This method mirrors your generateRandomShape
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

  private static double r() {
    return 1 + Math.random() * 10;
  }

  private static double r(double min, double max) {
    return min + Math.random() * (max - min);
  }

  public static void main(String[] args) {
    // Ensure GUI updates are done on the Event Dispatch Thread (EDT)
    SwingUtilities.invokeLater(() -> {
      MainGUI gui = new MainGUI();
      gui.setVisible(true);
    });
  }
}
