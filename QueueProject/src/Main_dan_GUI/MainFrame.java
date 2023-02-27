package Main_dan_GUI;

import Class.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    Queue[] queue;

    public MainFrame() {
        initComponents();
        queue = new Queue[3];
        queue[0] = new Queue();
        queue[1] = new Queue();
        queue[2] = new Queue();
        jmlCosS1.setText(String.valueOf(daftarCos1.getRowCount()));
        jmlCosS2.setText(String.valueOf(daftarCos2.getRowCount()));
        jmlCosS3.setText(String.valueOf(daftarCos3.getRowCount()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJmlCos1 = new javax.swing.JLabel();
        jmlCosS1 = new javax.swing.JLabel();
        buttonHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        tabbed = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarCos1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        daftarCos2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        daftarCos3 = new javax.swing.JTable();
        lblJmlCos2 = new javax.swing.JLabel();
        jmlCosS2 = new javax.swing.JLabel();
        lblJmlCos3 = new javax.swing.JLabel();
        jmlCosS3 = new javax.swing.JLabel();
        cariButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jadwal Potong Rambut Hari Ini");

        lblJmlCos1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblJmlCos1.setText("Chandra : ");

        jmlCosS1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        tabbed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabbedMousePressed(evt);
            }
        });

        daftarCos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jam ", "Nama Pemesan"
            }
        ));
        daftarCos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                daftarCos1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(daftarCos1);

        tabbed.addTab("Chandra", jScrollPane1);

        daftarCos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jam", "Nama Pemesan"
            }
        ));
        jScrollPane2.setViewportView(daftarCos2);
        if (daftarCos2.getColumnModel().getColumnCount() > 0) {
            daftarCos2.getColumnModel().getColumn(0).setResizable(false);
        }

        tabbed.addTab("Agus", jScrollPane2);

        daftarCos3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jam", "Nama Pemesan"
            }
        ));
        jScrollPane3.setViewportView(daftarCos3);

        tabbed.addTab("Gopinda", jScrollPane3);

        lblJmlCos2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblJmlCos2.setText("Agus  : ");

        jmlCosS2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblJmlCos3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblJmlCos3.setText("Gopinda : ");

        jmlCosS3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cariButton.setText("Cari");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cariButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambah))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblJmlCos1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jmlCosS1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblJmlCos2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jmlCosS2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblJmlCos3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jmlCosS3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJmlCos1)
                            .addComponent(jmlCosS1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblJmlCos2))
                    .addComponent(jmlCosS2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblJmlCos3)
                    .addComponent(jmlCosS3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cariButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed

        int s1 = daftarCos1.getRowCount(); // variable untuk menyimpan jumlah baris tabel studio 1
        int s2 = daftarCos2.getRowCount(); // variable untuk menyimpan jumlah baris tabel studio 2
        int s3 = daftarCos3.getRowCount(); // variable untuk menyimpan jumlah baris tabel studio 3

        if (s1 != 0 || s2 != 0 || s3 != 0) {

            if (tabbed.getSelectedIndex() == 0) {
                queue[0].dequeue();

            } else if (tabbed.getSelectedIndex() == 1) {
                queue[1].dequeue();
            } else if (tabbed.getSelectedIndex() == 2) {
                queue[2].dequeue();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Belum Ada Data Pemesan", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.tampilAntrianS1();
        this.tampilAntrianS2();
        this.tampilAntrianS3();
        jmlCosS1.setText(String.valueOf(daftarCos1.getRowCount()));
        jmlCosS2.setText(String.valueOf(daftarCos2.getRowCount()));
        jmlCosS3.setText(String.valueOf(daftarCos3.getRowCount()));
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        Tambah tambah1 = new Tambah(this, true, queue, queue[0], queue[1], queue[2]);
        tambah1.setVisible(true);
        this.tampilAntrianS1();
        this.tampilAntrianS2();
        this.tampilAntrianS3();
        jmlCosS1.setText(String.valueOf(daftarCos1.getRowCount()));
        jmlCosS2.setText(String.valueOf(daftarCos2.getRowCount()));
        jmlCosS3.setText(String.valueOf(daftarCos3.getRowCount()));
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tabbedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedMouseClicked

    }//GEN-LAST:event_tabbedMouseClicked

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        // TODO add your handling code here:
        Cari car = new Cari(this, true, queue, queue[0], queue[1], queue[2]);
        car.setVisible(true);
    }//GEN-LAST:event_cariButtonActionPerformed

    private void tabbedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabbedMousePressed

    private void daftarCos1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarCos1MousePressed

    }//GEN-LAST:event_daftarCos1MousePressed

    void tampilAntrianS1() {
        String[] kolom = {"Jam", "Nama Pemesan"};
        Object[][] objData = new Object[queue[0].size()][kolom.length];
        int i = 0;
        ListNode help = queue[0].getFirst();
        while (help != null) {
            String[] arrData = {String.valueOf(help.getData().getJam()),
                String.valueOf(help.getData().getNama())};
            objData[i] = arrData;
            help = help.getNext();
            i++;
        }
        DefaultTableModel tabelModel = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        daftarCos1.setModel(tabelModel);
    }

    void tampilAntrianS2() {
        String[] kolom = {"Jam", "Nama Pemesan"};
        Object[][] objData = new Object[queue[1].size()][kolom.length];
        int i = 0;
        ListNode help = queue[1].getFirst();
        while (help != null) {
            String[] arrData = {String.valueOf(help.getData().getJam()),
                String.valueOf(help.getData().getNama())};
            objData[i] = arrData;
            help = help.getNext();
            i++;
        }
        DefaultTableModel tabelModel = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        daftarCos2.setModel(tabelModel);
    }

    void tampilAntrianS3() {
        String[] kolom = {"Jam", "Nama Pemesan"};
        Object[][] objData = new Object[queue[2].size()][kolom.length];
        int i = 0;
        ListNode help = queue[2].getFirst();
        while (help != null) {
            String[] arrData = {String.valueOf(help.getData().getJam()),
                String.valueOf(help.getData().getNama())};
            objData[i] = arrData;
            help = help.getNext();
            i++;
        }
        DefaultTableModel tabelModel = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        daftarCos3.setModel(tabelModel);
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton cariButton;
    private javax.swing.JTable daftarCos1;
    private javax.swing.JTable daftarCos2;
    private javax.swing.JTable daftarCos3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jmlCosS1;
    private javax.swing.JLabel jmlCosS2;
    private javax.swing.JLabel jmlCosS3;
    private javax.swing.JLabel lblJmlCos1;
    private javax.swing.JLabel lblJmlCos2;
    private javax.swing.JLabel lblJmlCos3;
    private javax.swing.JTabbedPane tabbed;
    // End of variables declaration//GEN-END:variables
}
