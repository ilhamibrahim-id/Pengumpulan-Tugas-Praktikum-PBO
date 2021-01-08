package Frontend;

import Backend.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmMobil extends javax.swing.JFrame {

    public FrmMobil() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        kosongkanForm();
        addItemTypeMobil();
        selectedType("");
        tampilkanData();
    }

    public void addItemTypeMobil() {
        DefaultComboBoxModel mdl = new DefaultComboBoxModel();
        cmbType.setModel(mdl);
        mdl.addElement("Manual");
        mdl.addElement("Matic");
    }

    public void selectedType(String isi) {
        if (cmbType.getSelectedIndex() == 0) {
            txtJenisTransmisi.setEnabled(false);
            txtJenisMesin.setEnabled(true);
            txtJenisTransmisi.setText("-");
            txtJenisMesin.setText(isi);
        } else if (cmbType.getSelectedIndex() == 1) {
            txtJenisTransmisi.setEnabled(true);
            txtJenisMesin.setEnabled(false);
            txtJenisTransmisi.setText(isi);
            txtJenisMesin.setText("-");
        }
    }

    public void kosongkanForm() {
        txtId.setText("0");
        txtMerek.setText("");
        txtPlat.setText("");
        txtCc.setText("");
        txtHarga.setText("");
        txtBahanBakar.setText("");
        if (cmbType.getSelectedIndex() == 0) {
            txtJenisTransmisi.setEnabled(false);
            txtJenisMesin.setEnabled(true);
            txtJenisTransmisi.setText("-");
            txtJenisMesin.setText("");
        } else if (cmbType.getSelectedIndex() == 1) {
            txtJenisTransmisi.setEnabled(true);
            txtJenisMesin.setEnabled(false);
            txtJenisTransmisi.setText("");
            txtJenisMesin.setText("-");
        }
    }

    public void tampilkanData() {
        String[] kolom = {"ID", "Plat", "Merek", "CC", "Bahan Bakar", "Jenis Mesin", "Jenis Transmisi", "Harga/hari"};
        ArrayList<MobilManual> mob = new MobilManual().getAll();
        ArrayList<MobilMatic> mob1 = new MobilMatic().getAll();
        Object rowData[] = new Object[8];

        tblMobil.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (int i = 0; i < mob.size(); i++) {
            rowData[0] = mob.get(i).getIdMobil();
            rowData[1] = mob.get(i).getPlat();
            rowData[2] = mob.get(i).getMerek();
            rowData[3] = mob.get(i).getCc();
            rowData[4] = mob.get(i).getBahanBakar();
            rowData[5] = mob.get(i).getJenisMesin();
            rowData[6] = mob1.get(i).getJenisTransmisi();
            rowData[7] = mob.get(i).getHarga();

            ((DefaultTableModel) tblMobil.getModel()).addRow(rowData);
        }
    }

    public void cari(String keyword) {
        String[] kolom = {"ID", "Plat", "Merek", "CC", "Bahan Bakar", "Jenis Mesin", "Jenis Transmisi", "Harga/hari"};
        ArrayList<MobilManual> mob = new MobilManual().search(keyword);
        ArrayList<MobilMatic> mob1 = new MobilMatic().search(keyword);
        Object rowData[] = new Object[8];

        tblMobil.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (int i = 0; i < mob.size(); i++) {
            rowData[0] = mob.get(i).getIdMobil();
            rowData[1] = mob.get(i).getPlat();
            rowData[2] = mob.get(i).getMerek();
            rowData[3] = mob.get(i).getCc();
            rowData[4] = mob.get(i).getBahanBakar();
            rowData[5] = mob.get(i).getJenisMesin();
            rowData[6] = mob1.get(i).getJenisTransmisi();
            rowData[7] = mob.get(i).getHarga();

            ((DefaultTableModel) tblMobil.getModel()).addRow(rowData);
        }
    }

    public boolean cekData() {
        boolean cek = false;
        ArrayList<MobilManual> mob = new MobilManual().getAll();
        for (int i = 0; i < mob.size(); i++) {
            if (txtPlat.getText().equals(mob.get(i).getPlat())) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public int cekTypeMobil() {
        int x = 0;
        ArrayList<MobilManual> mob = new MobilManual().getAll();
        for (int i = 0; i < mob.size(); i++) {
            if (txtMerek.getText().equals(mob.get(i).getMerek())) {
                if (mob.get(i).getJenisMesin().equals("-")) {
                    x = 1;
                }
                break;
            }
        }
        return x;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMobil = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPlat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMerek = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCc = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtBahanBakar = new javax.swing.JTextField();
        txtJenisMesin = new javax.swing.JTextField();
        txtJenisTransmisi = new javax.swing.JTextField();
        cmbType = new javax.swing.JComboBox<>();
        btnSetType = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

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
        tblMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMobil);

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel4.setText("ID MOBIL :");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel5.setText("PLAT MOBIL :");

        txtPlat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel6.setText("MEREK MOBIL :");

        txtMerek.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel7.setText("CC MOBIL :");

        txtCc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnSimpan.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTambahBaru.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        btnTambahBaru.setText("TAMBAH BARU");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        txtCari.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabel8.setText("HARGA PERHARI :");

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabel9.setText("BAHAN BAKAR :");

        jLabel10.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabel10.setText("JENIS MESIN :");

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabel11.setText("JENIS TRANSMISI :");

        txtHarga.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtBahanBakar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtJenisMesin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtJenisTransmisi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSetType.setText("GO");
        btnSetType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetTypeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("? ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("RENTAL");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
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
        jButton3.setSelected(true);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnTambahBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCc, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(566, 566, 566)
                                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel12)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnSetType)
                                    .addGap(156, 156, 156))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(91, 91, 91)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtBahanBakar)
                                        .addComponent(txtJenisTransmisi)
                                        .addComponent(txtJenisMesin, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSetType)
                    .addComponent(cmbType)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBahanBakar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPlat)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJenisMesin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtJenisTransmisi))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambahBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnSetTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetTypeActionPerformed
        selectedType("");
    }//GEN-LAST:event_btnSetTypeActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (cekData()) {
            JOptionPane.showMessageDialog(this, "NIK sudah terdaftar!");
            kosongkanForm();
        } else {
            if (cmbType.getSelectedIndex() == 0) {
                MobilManual mob = new MobilManual();
                mob.setIdMobil(Integer.parseInt(txtId.getText()));
                mob.setMerek(txtMerek.getText());
                mob.setPlat(txtPlat.getText());
                mob.setCc(txtCc.getText());
                mob.setJenisMesin(txtJenisMesin.getText());
                mob.setBahanBakar(txtBahanBakar.getText());
                mob.setHarga(Integer.parseInt(txtHarga.getText()));
                mob.save();
                txtId.setText(Integer.toString(mob.getIdMobil()));
                tampilkanData();
                kosongkanForm();
            } else if (cmbType.getSelectedIndex() == 1) {
                MobilMatic mob = new MobilMatic();
                mob.setIdMobil(Integer.parseInt(txtId.getText()));
                mob.setMerek(txtMerek.getText());
                mob.setPlat(txtPlat.getText());
                mob.setCc(txtCc.getText());
                mob.setJenisTransmisi(txtJenisTransmisi.getText());
                mob.setBahanBakar(txtBahanBakar.getText());
                mob.setHarga(Integer.parseInt(txtHarga.getText()));
                mob.save();
                txtId.setText(Integer.toString(mob.getIdMobil()));
                tampilkanData();
                kosongkanForm();
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblMobil.getModel();
        int row = tblMobil.getSelectedRow();

        MobilManual mob = new MobilManual().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        mob.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblMobil.getModel();
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMobilMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblMobil.getModel();
        int row = tblMobil.getSelectedRow();

        txtId.setText(model.getValueAt(row, 0).toString());
        txtPlat.setText(model.getValueAt(row, 1).toString());
        txtMerek.setText(model.getValueAt(row, 2).toString());
        txtCc.setText(model.getValueAt(row, 3).toString());
        txtBahanBakar.setText(model.getValueAt(row, 4).toString());
        txtJenisMesin.setText(model.getValueAt(row, 5).toString());
        txtJenisTransmisi.setText(model.getValueAt(row, 6).toString());
        txtHarga.setText(model.getValueAt(row, 7).toString());
        if (cekTypeMobil() == 0) {
            cmbType.setSelectedIndex(0);
            selectedType(model.getValueAt(row, 5).toString());
        } else if (cekTypeMobil() == 1) {
            cmbType.setSelectedIndex(1);
            selectedType(model.getValueAt(row, 6).toString());
        }
    }//GEN-LAST:event_tblMobilMouseClicked

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblMobil.getModel();
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
            java.util.logging.Logger.getLogger(FrmMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSetType;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMobil;
    private javax.swing.JTextField txtBahanBakar;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCc;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJenisMesin;
    private javax.swing.JTextField txtJenisTransmisi;
    private javax.swing.JTextField txtMerek;
    private javax.swing.JTextField txtPlat;
    // End of variables declaration//GEN-END:variables
}
