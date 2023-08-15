package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;




public class vbarang extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    public vbarang() {
        initComponents();
    }

    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EdKategori_Barang = new javax.swing.JTextField();
        EdNama_Barang = new javax.swing.JTextField();
        EdKode_Barang = new javax.swing.JTextField();
        Bt_tampil = new javax.swing.JButton();
        Bt_Kembali = new javax.swing.JButton();
        Bt_edit = new javax.swing.JButton();
        Bt_simpan = new javax.swing.JButton();
        Bt_hapus = new javax.swing.JButton();
        EdHarga_Barang = new javax.swing.JTextField();
        EdSatuan_Barang = new javax.swing.JTextField();
        EdJumlah_Barang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(120, 70));
        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));

        jPanel1.setLayout(null);

        jLabel2.setText("KODE BARANG");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 116, 110, 20);

        jLabel3.setText("NAMA BARANG");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 160, 120, 14);

        jLabel4.setText("KATEGORI");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 200, 90, 14);

        EdKategori_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdKategori_BarangActionPerformed(evt);
            }
        });
        jPanel1.add(EdKategori_Barang);
        EdKategori_Barang.setBounds(150, 190, 260, 30);

        EdNama_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdNama_BarangActionPerformed(evt);
            }
        });
        jPanel1.add(EdNama_Barang);
        EdNama_Barang.setBounds(150, 150, 260, 30);

        EdKode_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdKode_BarangActionPerformed(evt);
            }
        });
        jPanel1.add(EdKode_Barang);
        EdKode_Barang.setBounds(150, 110, 260, 30);

        Bt_tampil.setText("tampilkan");
        Bt_tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_tampilActionPerformed(evt);
            }
        });
        jPanel1.add(Bt_tampil);
        Bt_tampil.setBounds(300, 400, 90, 23);

        Bt_Kembali.setText("kembali");
        Bt_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(Bt_Kembali);
        Bt_Kembali.setBounds(300, 520, 90, 23);

        Bt_edit.setText("update");
        Bt_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_editActionPerformed(evt);
            }
        });
        jPanel1.add(Bt_edit);
        Bt_edit.setBounds(300, 440, 90, 23);

        Bt_simpan.setText("simpan");
        Bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(Bt_simpan);
        Bt_simpan.setBounds(300, 360, 90, 23);

        Bt_hapus.setText("clear");
        Bt_hapus.setActionCommand("");
        Bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(Bt_hapus);
        Bt_hapus.setBounds(300, 480, 90, 23);

        EdHarga_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdHarga_BarangActionPerformed(evt);
            }
        });
        jPanel1.add(EdHarga_Barang);
        EdHarga_Barang.setBounds(150, 230, 260, 30);

        EdSatuan_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdSatuan_BarangActionPerformed(evt);
            }
        });
        jPanel1.add(EdSatuan_Barang);
        EdSatuan_Barang.setBounds(150, 310, 260, 30);

        EdJumlah_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdJumlah_BarangActionPerformed(evt);
            }
        });
        jPanel1.add(EdJumlah_Barang);
        EdJumlah_Barang.setBounds(150, 270, 260, 30);

        jLabel6.setText("JUMLAH BARANG");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 280, 160, 20);

        jLabel7.setText("SATUAN BARANG");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 320, 150, 14);

        jLabel5.setText("HARGA BARANG");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 240, 140, 14);

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tbl_barang);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(440, 110, 620, 440);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Untitled.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 1100, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    // BUTTON
    private void Bt_tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_tampilActionPerformed
 try{
      conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mukti");
      String sql =  "SELECT * from \"DATA\"";    
      pst = conn.prepareStatement(sql);
          rst = pst.executeQuery();
          tbl_barang.setModel(DbUtils.resultSetToTableModel(rst));
                  }
 catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, ex);
 }
          //System.out.println("databas gagal terkoneksi");}
    }//GEN-LAST:event_Bt_tampilActionPerformed

    private void Bt_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_KembaliActionPerformed
     if (JOptionPane.showConfirmDialog(null, "Yakin Keluar?", "", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        dispose();
        new vmenu().setVisible(true);}
    }//GEN-LAST:event_Bt_KembaliActionPerformed

    private void Bt_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_editActionPerformed
try {
    String sql = "UPDATE \"DATA\""
                +"SET \"NAMA BARANG\"=?, \"KATEGORI BARANG\"=?, \"HARGA BARANG\"=?, \"SATUAN BARANG\"=?, \"JUMLAH BARANG\"=?"
                +"WHERE \"KODE BARANG\""+"=?";
                
                pst = conn.prepareStatement(sql);
          pst.setString(6, EdKode_Barang.getText());
          pst.setString(1, EdNama_Barang.getText());
          pst.setString(2, EdKategori_Barang.getText());
          pst.setString(3, EdHarga_Barang.getText());
          pst.setString(4, EdSatuan_Barang.getText());
           pst.setString(5,EdJumlah_Barang.getText());
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null, "Update success");
}
catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
}
         
    }//GEN-LAST:event_Bt_editActionPerformed

    private void Bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_simpanActionPerformed
      try {
          String sql = "INSERT into\"DATA\""
                  +"(  \"NAMA BARANG\",  \"KATEGORI BARANG\", \"HARGA BARANG\", \"SATUAN BARANG\",   \"JUMLAH BARANG\")"
                  +"Values (?,?,?,?,?)";
             
          
          conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mukti");
          
          pst = conn.prepareStatement(sql);
        //  pst.setString(1, EdKode_Barang.getText()); //
          pst.setString(1, EdNama_Barang.getText());
          pst.setString(2, EdKategori_Barang.getText());
          pst.setString(3, EdHarga_Barang.getText());
          pst.setString(4, EdSatuan_Barang.getText());
          pst.setString(5, EdJumlah_Barang.getText());
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null, "Insert success");
          
          
      } catch (SQLException ex) {
          System.out.println("database gagal terkoneksi");
           System.out.println(ex.getClass().getName() + ": "+ ex.getMessage());
        }
    }//GEN-LAST:event_Bt_simpanActionPerformed

    private void EdKode_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdKode_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdKode_BarangActionPerformed

    private void Bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_hapusActionPerformed
try{
    String sql = "DELETE from \"DATA\" Where \"KODE BARANG\""+"=?";
    
    conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mukti");
    pst = conn.prepareStatement(sql);
    pst.setString(1, EdKode_Barang.getText());
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null, "success :D");
}catch (SQLException ex) {
          System.out.println("gagal ");
           System.out.println(ex.getClass().getName() + ": "+ ex.getMessage());
        }
    }//GEN-LAST:event_Bt_hapusActionPerformed

    
    
    
    
    
    
    //text field/KOLOM
    private void EdNama_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdNama_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdNama_BarangActionPerformed

    private void EdKategori_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdKategori_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdKategori_BarangActionPerformed

    private void EdHarga_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdHarga_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdHarga_BarangActionPerformed

    private void EdSatuan_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdSatuan_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdSatuan_BarangActionPerformed

    private void EdJumlah_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdJumlah_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdJumlah_BarangActionPerformed

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
            java.util.logging.Logger.getLogger(vbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vbarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Kembali;
    private javax.swing.JButton Bt_edit;
    private javax.swing.JButton Bt_hapus;
    private javax.swing.JButton Bt_simpan;
    private javax.swing.JButton Bt_tampil;
    private javax.swing.JTextField EdHarga_Barang;
    private javax.swing.JTextField EdJumlah_Barang;
    private javax.swing.JTextField EdKategori_Barang;
    private javax.swing.JTextField EdKode_Barang;
    private javax.swing.JTextField EdNama_Barang;
    private javax.swing.JTextField EdSatuan_Barang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_barang;
    // End of variables declaration//GEN-END:variables

}
