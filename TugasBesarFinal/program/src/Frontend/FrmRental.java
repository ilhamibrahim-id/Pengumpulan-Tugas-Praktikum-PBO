package Frontend;

import Backend.*;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class FrmRental extends javax.swing.JFrame {

    public FrmRental() {
        initComponents();
        tampilkanDataMobil();
        tampilkanDataRental();
        addItemTypeMobil();
        addItemMrkMobil();
        kosongkanForm();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void tampilkanDataRental() {
        String[] kolom = {"ID", "Nama", "Mobil", "Tanggal Pinjam", "Tanggal Kembali", "Total Bayar"};
        ArrayList<Rental> ren = new Rental().getAll();
        Object rowData[] = new Object[6];

        tblRental.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (int i = 0; i < ren.size(); i++) {
            rowData[0] = ren.get(i).getIdRental();
            rowData[1] = ren.get(i).getCustomer().getNama();
            if (ren.get(i).getManual().getJenisMesin().equals("-")) {
                rowData[2] = ren.get(i).getMatic().getMerek();
            } else {
                rowData[2] = ren.get(i).getManual().getMerek();
            }
            rowData[3] = ren.get(i).getTanggalPinjam();
            rowData[4] = ren.get(i).getTanggalKembali();
            rowData[5] = ren.get(i).getTotalBayar();

            ((DefaultTableModel) tblRental.getModel()).addRow(rowData);
        }
    }

    public void tampilkanDataMobil() {
        if (typeMobil.getSelectedIndex() == 0) {
            String[] kolom = {"Merek", "CC", "Bahan Bakar", "Jenis Mesin", "Jenis Transmisi", "Harga/hari"};
            ArrayList<MobilManual> mob = new MobilManual().getAll();
            ArrayList<MobilMatic> mob1 = new MobilMatic().getAll();
            Object rowData[] = new Object[6];

            tblMobil.setModel(new DefaultTableModel(new Object[][]{}, kolom));

            for (int i = 0; i < mob.size(); i++) {
                rowData[0] = mob.get(i).getMerek();
                rowData[1] = mob.get(i).getCc();
                rowData[2] = mob.get(i).getBahanBakar();
                rowData[3] = mob.get(i).getJenisMesin();
                rowData[4] = mob1.get(i).getJenisTransmisi();
                rowData[5] = mob.get(i).getHarga();

                ((DefaultTableModel) tblMobil.getModel()).addRow(rowData);
            }
        } else if (typeMobil.getSelectedIndex() == 1) {
            String[] kolom = {"Merek", "CC", "Bahan Bakar", "Jenis Mesin", "Harga/hari"};
            ArrayList<MobilManual> mob = new MobilManual().getAll();
            Object rowData[] = new Object[5];

            tblMobil.setModel(new DefaultTableModel(new Object[][]{}, kolom));

            for (int i = 0; i < mob.size(); i++) {
                if (mob.get(i).getJenisMesin().equals("-")) {
                    continue;
                } else {
                    rowData[0] = mob.get(i).getMerek();
                    rowData[1] = mob.get(i).getCc();
                    rowData[2] = mob.get(i).getBahanBakar();
                    rowData[3] = mob.get(i).getJenisMesin();
                    rowData[4] = mob.get(i).getHarga();

                    ((DefaultTableModel) tblMobil.getModel()).addRow(rowData);
                }
            }
        } else if (typeMobil.getSelectedIndex() == 2) {
            String[] kolom = {"Merek", "CC", "Bahan Bakar", "Jenis Transmisi", "Harga/hari"};
            ArrayList<MobilMatic> mob = new MobilMatic().getAll();
            Object rowData[] = new Object[5];

            tblMobil.setModel(new DefaultTableModel(new Object[][]{}, kolom));

            for (int i = 0; i < mob.size(); i++) {
                if (mob.get(i).getJenisTransmisi().equals("-")) {
                    continue;
                } else {
                    rowData[0] = mob.get(i).getMerek();
                    rowData[1] = mob.get(i).getCc();
                    rowData[2] = mob.get(i).getBahanBakar();
                    rowData[3] = mob.get(i).getJenisTransmisi();
                    rowData[4] = mob.get(i).getHarga();

                    ((DefaultTableModel) tblMobil.getModel()).addRow(rowData);
                }
            }
        }
    }

    public void addItemTypeMobil() {
        DefaultComboBoxModel mdl = new DefaultComboBoxModel();
        typeMobil.setModel(mdl);
        mdl.addElement("All");
        mdl.addElement("Manual");
        mdl.addElement("Matic");
        mdl.setSelectedItem("All");
    }

    public void addItemMrkMobil() {
        DefaultComboBoxModel mdl = new DefaultComboBoxModel();
        mrkMobil.setModel(mdl);
        ArrayList<MobilMatic> mob = new MobilMatic().getAll();
        for (int i = 0; i < mob.size(); i++) {
            mdl.addElement(mob.get(i).getMerek());
        }
    }

    public void kosongkanForm() {
        txtIdTransaksi.setText("0");
        txtNik.setText("");
        txtTotal.setText("");
        txtTglKembali.setText("");
        txtTglPinjam.setText("");
        txtBlnKembali.setText("");
        txtBlnPinjam.setText("");
        txtThnKembali.setText("");
        txtThnPinjam.setText("");
    }

    public boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    public int cekTypeMobil() {
        int x = 0;
        ArrayList<MobilManual> mob = new MobilManual().getAll();
        for (int i = 0; i < mob.size(); i++) {
            if (mrkMobil.getSelectedItem().equals(mob.get(i).getMerek())) {
                if (mob.get(i).getJenisMesin().equals("-")) {
                    x = 1;
                }
                break;
            }
        }
        return x;
    }

    public int cekIdMobil() {
        int x = 0;
        ArrayList<MobilManual> mob = new MobilManual().getAll();
        for (int i = 0; i < mob.size(); i++) {
            if (mrkMobil.getSelectedItem().equals(mob.get(i).getMerek())) {
                x = mob.get(i).getIdMobil();
                break;
            }
        }
        return x;
    }

    public int cekIdCustomer() {
        int x = 0;
        ArrayList<Customer> cus = new Customer().getAll();
        for (int i = 0; i < cus.size(); i++) {
            if (txtNik.getText().equals(cus.get(i).getNik())) {
                x = cus.get(i).getIdCustomer();
                break;
            }
        }
        return x;
    }

    public boolean cekTahun() {
        int thnP = Integer.parseInt(txtThnPinjam.getText());
        int thnK = Integer.parseInt(txtThnKembali.getText());
        if (thnP > thnK) {
            return false;
        } else {
            return true;
        }
    }

    public boolean cekBulan() {
        boolean balik = false;
        int blnP = Integer.parseInt(txtBlnPinjam.getText());
        int blnK = Integer.parseInt(txtBlnKembali.getText());
        if (txtThnPinjam.getText().equals(txtThnKembali.getText())) {
            if (blnP <= blnK) {
                balik = true;
            }
        } else {
            if (cekTahun()) {
                if (blnP <= blnK) {
                    balik = true;
                }
            }
        }
        return balik;
    }

    public boolean cekTanggal() {
        boolean balik = false;
        int tglK = Integer.parseInt(txtTglKembali.getText());
        int tglP = Integer.parseInt(txtTglPinjam.getText());
        if (txtThnPinjam.getText().equals(txtThnKembali.getText())) {
            if (txtBlnPinjam.getText().equals(txtBlnKembali.getText())) {
                if (tglP < tglK) {
                    balik = true;
                }
            } else {
                if (cekBulan()) {
                    balik = true;
                }
            }
        } else {
            if (cekTahun()) {
                if (txtBlnPinjam.getText().equals(txtBlnKembali.getText())) {
                    if (tglP <= tglK) {
                        balik = true;
                    }
                } else {
                    if (cekBulan()) {
                        balik = true;
                    }
                }
            }
        }
        return balik;
    }

    public int hitungHari() {
        int x = 0;
        if (txtBlnKembali.getText().equals(txtBlnPinjam.getText()) && txtThnKembali.getText().equals(txtThnPinjam.getText())) {
            int tglK = Integer.parseInt(txtTglKembali.getText());
            int tglP = Integer.parseInt(txtTglPinjam.getText());
            x = tglK - tglP;
        } else {
            int blnP = Integer.parseInt(txtBlnPinjam.getText());
            int blnK = Integer.parseInt(txtBlnKembali.getText());
            int tglP = Integer.parseInt(txtTglPinjam.getText());
            int tglK = Integer.parseInt(txtTglKembali.getText());
            if (blnP >= blnK) {
                for (int i = 0; i < 12 - (Integer.parseInt(txtBlnPinjam.getText()) - blnK); i++) {
                    if (blnP % 2 == 0) {
                        if (blnP == 2) {
                            x += 28;
                        } else {
                            x += 31;
                        }
                    } else {
                        x += 30;
                    }
                    if (blnP == 12) {
                        blnP = 1;
                    } else {
                        blnP++;
                    }
                }
                blnP = Integer.parseInt(txtBlnPinjam.getText());
                if (blnP % 2 == 0) {
                    if (blnP == 2) {
                        x = x + (28 - tglP) - 28 + tglK;
                    } else {
                        x = x + (31 - tglP) - 31 + tglK;
                    }
                } else {
                    x = x + (30 - tglP) - 30 + tglK;
                }
                if (!txtThnKembali.getText().equals(txtThnPinjam.getText())) {
                    int jrkT = Integer.parseInt(txtThnKembali.getText()) - Integer.parseInt(txtThnPinjam.getText());
                    if (jrkT > 1) {
                        x += 363 * (jrkT - 1) ;
                    }
                }
            } else {
                for (int i = 0; i < blnK - Integer.parseInt(txtBlnPinjam.getText()); i++) {
                    if (blnP % 2 == 0) {
                        if (blnP == 2) {
                            x += 28;
                        } else {
                            x += 31;
                        }
                    } else {
                        x += 30;
                    }
                    if (blnP == 12) {
                        blnP = 1;
                    } else {
                        blnP++;
                    }
                }
                blnP = Integer.parseInt(txtBlnPinjam.getText());
                if (blnP % 2 == 0) {
                    if (blnP == 2) {
                        x = x + (28 - tglP) - 28 + tglK;
                    } else {
                        x = x + (31 - tglP) - 31 + tglK;
                    }
                } else {
                    x = x + (30 - tglP) - 30 + tglK;
                }
                if (!txtThnKembali.getText().equals(txtThnPinjam.getText())) {
                    int jrkT = Integer.parseInt(txtThnKembali.getText()) - Integer.parseInt(txtThnPinjam.getText());
                    if (jrkT > 1) {
                        x += 363 * jrkT;
                    } else {
                        x += 363;
                    }
                }
            }
        }
        return x + 1;
    }

    public int hitungTotal() {
        int x = 0;
        ArrayList<MobilManual> mob = new MobilManual().getAll();
        for (int i = 0; i < mob.size(); i++) {
            if (mrkMobil.getSelectedItem().equals(mob.get(i).getMerek())) {
                x = mob.get(i).getHarga() * hitungHari();
                break;
            }
        }
        return x;
    }

    public void cari(String keyword) {
        String[] kolom = {"ID", "Nama", "Mobil", "Tanggal Pinjam", "Tanggal Kembali", "Total Bayar"};
        ArrayList<Rental> ren = new Rental().search(keyword);
        Object rowData[] = new Object[6];

        tblRental.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (int i = 0; i < ren.size(); i++) {
            rowData[0] = ren.get(i).getIdRental();
            rowData[1] = ren.get(i).getCustomer().getNama();
            if (ren.get(i).getManual().getJenisMesin().equals("-")) {
                rowData[2] = ren.get(i).getMatic().getMerek();
            } else {
                rowData[2] = ren.get(i).getManual().getMerek();
            }
            rowData[3] = ren.get(i).getTanggalPinjam();
            rowData[4] = ren.get(i).getTanggalKembali();
            rowData[5] = ren.get(i).getTotalBayar();

            ((DefaultTableModel) tblRental.getModel()).addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtNik = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        typeMobil = new javax.swing.JComboBox<>();
        txtBlnPinjam = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMobil = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBlnKembali = new javax.swing.JTextField();
        txtIdTransaksi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnTambahBaru = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mrkMobil = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRental = new javax.swing.JTable();
        txtThnPinjam = new javax.swing.JTextField();
        txtTglPinjam = new javax.swing.JTextField();
        txtTglKembali = new javax.swing.JTextField();
        txtThnKembali = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSimpan.setText("Simpan Data");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHapus.setLabel("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtCari.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("NIK :");

        btnHitung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHitung.setText("Hitung Total Bayar");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Tgl Kembali :");

        typeMobil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typeMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeMobilActionPerformed(evt);
            }
        });

        tblMobil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblMobil);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Tgl Pinjam :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("ID Transaksi :");

        txtIdTransaksi.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Keterangan Mobil :");

        btnTambahBaru.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Merek Mobil :");

        mrkMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblRental.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblRental.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblRental);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Total Bayar :");

        txtTotal.setEnabled(false);

        jLabel7.setText("HARI");

        jLabel8.setText("HARI");

        jLabel9.setText("BULAN");

        jLabel10.setText("BULAN");

        jLabel11.setText("TAHUN");

        jLabel13.setText("TAHUN");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Rp.");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("RENTAL");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton2.setText("CUSTOMER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton3.setText("MOBIL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnTambahBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 597, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdTransaksi)
                                    .addComponent(mrkMobil, 0, 488, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addGap(15, 15, 15)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnHitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTglKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(txtTglPinjam))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBlnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBlnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtThnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtThnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeMobil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(typeMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mrkMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtThnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(txtBlnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtThnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel10)
                                        .addComponent(txtBlnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHitung)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnTambahBaru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCari))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Rental ren = new Rental();
        String pinjam = txtThnPinjam.getText() + "/" + txtBlnPinjam.getText() + "/" + txtTglPinjam.getText();
        String kembali = txtThnKembali.getText() + "/" + txtBlnKembali.getText() + "/" + txtTglKembali.getText();
        boolean tglPinjam = isValidDate(pinjam);
        boolean tglKembali = isValidDate(kembali);
        if (tglKembali == false || tglPinjam == false) {
            JOptionPane.showMessageDialog(this, "Format tanggal salah!");
        } else {
            if (cekIdCustomer() == 0) {
                JOptionPane.showMessageDialog(this, "Customer belum terdaftar!!");
                txtNik.setText("");
            } else {
                Customer newCus = new Customer().getById(cekIdCustomer());
                if (cekTypeMobil() == 0) {
                    MobilManual newMob = new MobilManual().getById(cekIdMobil());
                    ren.setManual(newMob);
                } else {
                    MobilMatic newMob = new MobilMatic().getById(cekIdMobil());
                    ren.setMatic(newMob);
                }
                ren.setCustomer(newCus);
                ren.setIdRental(Integer.parseInt(txtIdTransaksi.getText()));
                ren.setTanggalKembali(kembali);
                ren.setTanggalPinjam(pinjam);
                ren.setTotalBayar(Integer.parseInt(txtTotal.getText()));
                ren.save(cekTypeMobil());
                tampilkanDataRental();
                kosongkanForm();
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblRental.getModel();
        int row = tblRental.getSelectedRow();

        Rental ren = new Rental().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        ren.delete();
        kosongkanForm();
        tampilkanDataRental();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblRental.getModel();
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        if (!cekTanggal()) {
            if (!cekBulan()) {
                if (!cekTahun()) {
                    JOptionPane.showMessageDialog(this, "Tahun pinjam lebih besar dari tahun kembali!");
                } else {
                    JOptionPane.showMessageDialog(this, "Bulan pinjam lebih besar dari Bulan kembali!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tanggal pinjam lebih besar dari Tanggal kembali!");
            }
        } else {
            txtTotal.setText(String.valueOf(hitungTotal()));
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void typeMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeMobilActionPerformed
        tampilkanDataMobil();
    }//GEN-LAST:event_typeMobilActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblRental.getModel();
        cari(txtCari.getText());
    }//GEN-LAST:event_txtCariKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new FrmRental().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new FrmCustomer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new FrmMobil().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> mrkMobil;
    private javax.swing.JTable tblMobil;
    private javax.swing.JTable tblRental;
    private javax.swing.JTextField txtBlnKembali;
    private javax.swing.JTextField txtBlnPinjam;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdTransaksi;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglPinjam;
    private javax.swing.JTextField txtThnKembali;
    private javax.swing.JTextField txtThnPinjam;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JComboBox<String> typeMobil;
    // End of variables declaration//GEN-END:variables
}
