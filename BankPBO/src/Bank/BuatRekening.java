package Bank;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import  javax.swing.JOptionPane;
/**
 *
 * @author Hafiz
 */
public class BuatRekening extends javax.swing.JFrame {

    DB db = new DB();
    private Connection connection = null;

    /**
     * Creates new form BuatRekening
     */
    public BuatRekening() {

        initComponents();
        connection = db.buatConnection();
        if (connection == null) {
            jLabelError.setText("Database connection failed!");
            return;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTTL = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldNIK = new javax.swing.JTextField();
        jTextFieldNo = new javax.swing.JTextField();
        jTextFieldAlamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();
        jBackButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldTTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 181, 167, -1));
        getContentPane().add(jTextFieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 82, 167, -1));
        getContentPane().add(jTextFieldNIK, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 128, 167, -1));
        getContentPane().add(jTextFieldNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 82, 122, -1));

        jTextFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 234, 167, 80));

        jLabel1.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" NIK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 109, -1, -1));

        jLabel2.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 63, -1, -1));

        jLabel3.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tanggal Lahir (YYYY-MM-DD)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 162, -1, -1));

        jLabel4.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 215, -1, -1));

        jLabel5.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nomor HP :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 63, -1, -1));

        jLabel6.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PIN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 110, -1, -1));
        getContentPane().add(jTextFieldPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 129, 122, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        jButton1.setText("Buat Rekening");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 294, 122, -1));
        getContentPane().add(jLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 234, 122, 74));

        jBackButton.setBackground(new java.awt.Color(204, 204, 204));
        jBackButton.setText("<");
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pembuatan Rekening");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlamatActionPerformed
    private String generateNoRekening() {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = db.buatConnection();
            statement = connection.createStatement();
            Random random = new Random();
            int number;

            while (true) {
                number = random.nextInt(90000) + 10000; // Generates a random 5-digit number
                String query = "SELECT COUNT(*) FROM rekening WHERE NoRekening = '" + number + "'";
                resultSet = statement.executeQuery(query);

                if (resultSet.next() && resultSet.getInt(1) == 0) {
                    break; 
                }
            }

            return String.valueOf(number);
            
        }catch(SQLException e){
            

}
            finally {
            if (resultSet != null) try { resultSet.close(); } catch (SQLException ignored) {}
            if (statement != null) try { statement.close(); } catch (SQLException ignored) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignored) {}
        }
    
       return "";
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabelError.setText("");

        String nama = jTextFieldNama.getText().trim();
        String nik = jTextFieldNIK.getText().trim();
        String ttl = jTextFieldTTL.getText().trim();
        String alamat = jTextFieldAlamat.getText().trim();
        String noHpText = jTextFieldNo.getText().trim();
        String pinText = jTextFieldPin.getText().trim();

        if (nama.isEmpty() || nik.isEmpty() || ttl.isEmpty() || alamat.isEmpty() || noHpText.isEmpty() || pinText.isEmpty()) {
            jLabelError.setText("semua harus diisi!");
            return;
        }

        if (nik.length() != 16 || !nik.matches("\\d+")) {
            jLabelError.setText("NIK harus 16 angka!");
            return;
        }

        if (pinText.length() != 4 || !pinText.matches("\\d+")) {
            jLabelError.setText("PIN harus 4 angka!");
            return;
        }

        try {
            LocalDate.parse(ttl, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException e) {
            jLabelError.setText("TTL harus memakai format yyyy-MM-dd !");
            return;
        }

        int pin;
        long noHp,nikNo;
        
        try {
            noHp = Long.parseLong(noHpText);
        } catch (NumberFormatException e) {
            jLabelError.setText("No hp harus memakai angka!");
            return;
        }
        
        try {
            pin = Integer.parseInt(pinText);
        } catch (NumberFormatException e) {
            jLabelError.setText("pin harus memakai angka!");
            return;
        }
        
        try {
            nikNo = Long.parseLong(nik);
        } catch (NumberFormatException e) {
            jLabelError.setText("Nik harus memakai angka!");
            return;
        }

        double saldo = 0.0; 
        String noRekening = generateNoRekening();

        Connection connection = null;
        Statement statement = null;

        try {
            connection = db.buatConnection();
            if (connection == null) {
                jLabelError.setText("Database connection berhasil!");
                return;
            }

            statement = connection.createStatement();

            String query = "INSERT INTO rekening (`Nama`, `NIK`, `TTL`, `Alamat`, `No`, `Pin`, `Saldo`, `NoRekening`) VALUES ('"
                    + nama + "', '"
                    + nik + "', '"
                    + ttl + "', '"
                    + alamat + "', "
                    + noHp + ", "
                    + pin + ", "
                    + saldo + ", '"
                    + noRekening + "')";

            int rowsInserted = statement.executeUpdate(query);
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Berhasil membuat akun No rekening anda " + noRekening, "Succes", JOptionPane.INFORMATION_MESSAGE);
            } else {
                jLabelError.setText("gagal membuat akun");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            jLabelError.setText("Error creating account: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        CustomerServices back = new CustomerServices();
        back.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        CustomerServices back = new CustomerServices();
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
            java.util.logging.Logger.getLogger(BuatRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuatRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuatRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuatRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuatRekening().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldNIK;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNo;
    private javax.swing.JTextField jTextFieldPin;
    private javax.swing.JTextField jTextFieldTTL;
    // End of variables declaration//GEN-END:variables
}
