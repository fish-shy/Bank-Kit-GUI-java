/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bank;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hafiz
 */
public class Transfer extends javax.swing.JFrame {

    String noRekening;

    void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    /**
     * Creates new form mentransefer
     */
    public Transfer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNoRekeningKe = new javax.swing.JTextField();
        jTextFieldSaldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBackButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldNoRekeningKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 56, 144, -1));
        getContentPane().add(jTextFieldSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 116, 144, -1));

        jLabel1.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nomor Rekening Tujuan :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 37, -1, -1));

        jLabel3.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jumlah Transfer :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 97, -1, -1));

        jLabel4.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rp.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 122, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transfer");

        jLabel5.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Transfer");

        jBackButton.setBackground(new java.awt.Color(204, 204, 204));
        jBackButton.setText("<");
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Transaksi Lain");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBackButton)
                    .addComponent(jLabel6))
                .addGap(99, 99, 99))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String noRekeningAsal = "97778"; // Nomor rekening asal
        String noRekeningTujuan = jTextFieldNoRekeningKe.getText().trim();
        String jumlahStr = jTextFieldSaldo.getText().trim();

        if (noRekeningTujuan.isEmpty() || jumlahStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan semua data!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int jumlahTransfer;
        try {
            jumlahTransfer = Integer.parseInt(jumlahStr);
            if (jumlahTransfer <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah transfer harus lebih dari nol!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah dalam format angka!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection connection = null;
        Statement statement = null;

        try {
            // Hubungkan ke database
            DB db = new DB();
            connection = db.buatConnection();
            if (connection == null) {
                JOptionPane.showMessageDialog(this, "Gagal terhubung ke database!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            statement = connection.createStatement();

            // Periksa rekening tujuan
            String cekRekeningTujuan = "SELECT * FROM rekening WHERE NoRekening = '" + noRekeningTujuan + "'";
            java.sql.ResultSet resultTujuan = statement.executeQuery(cekRekeningTujuan);

            if (!resultTujuan.next()) {
                JOptionPane.showMessageDialog(this, "Rekening tujuan tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Periksa saldo rekening asal
            String cekSaldoAsal = "SELECT Saldo FROM rekening WHERE NoRekening = '" + noRekeningAsal + "'";
            java.sql.ResultSet resultAsal = statement.executeQuery(cekSaldoAsal);

            if (resultAsal.next()) {
                int saldoAsal = resultAsal.getInt("Saldo");
                if (saldoAsal < jumlahTransfer) {
                    JOptionPane.showMessageDialog(this, "Saldo tidak mencukupi!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String updateAsal = "UPDATE rekening SET saldo = saldo - " + jumlahTransfer
                        + " WHERE NoRekening = '" + noRekeningAsal + "'";
                statement.executeUpdate(updateAsal);

                String updateTujuan = "UPDATE rekening SET saldo = saldo + " + jumlahTransfer
                        + " WHERE NoRekening = '" + noRekeningTujuan + "'";
                statement.executeUpdate(updateTujuan);

                String transaksiId = java.util.UUID.randomUUID().toString();
                String riwayatAsal = "INSERT INTO riwayat (NoRekening, jumlah, Tipe, TransaksiID) VALUES ('"
                        + noRekeningAsal + "', " + jumlahTransfer + ", 'Transfer Keluar', '" + transaksiId.substring(0, 6) + "')";
                statement.executeUpdate(riwayatAsal);

                String riwayatTujuan = "INSERT INTO riwayat (NoRekening, jumlah, Tipe, TransaksiID) VALUES ('"
                        + noRekeningTujuan + "', " + jumlahTransfer + ", 'Transfer Masuk', '" + transaksiId.substring(1, 7) + "')";
                statement.executeUpdate(riwayatTujuan);

                JOptionPane.showMessageDialog(this, "Transfer berhasil!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Teller back = new Teller();
        
        back.setNoRekening(noRekening);
        back.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        Teller back = new Teller();
        
        back.setNoRekening(noRekening);
        back.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBackButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNoRekeningKe;
    private javax.swing.JTextField jTextFieldSaldo;
    // End of variables declaration//GEN-END:variables
}
