/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectaplikasi;

/**
 *
 * @author UsEr
 */
public class lingkaran extends javax.swing.JFrame {

    /**
     * Creates new form lingkaran
     */
    public lingkaran() {
        initComponents();
        reset();
    }
    void reset(){
        tJarijari.setText(null);
        tDiameter.setText(null);
        vLuas.setText(null);
        vKeliling.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tJarijari = new java.awt.TextField();
        tDiameter = new java.awt.TextField();
        bHitung = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bKembali = new javax.swing.JButton();
        vLuas = new javax.swing.JLabel();
        vKeliling = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectaplikasi/oval.png"))); // NOI18N
        jLabel1.setText("LINGKARAN");

        jLabel2.setText("JARI JARI");

        jLabel3.setText("DIAMETER");

        bHitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectaplikasi/calculator.png"))); // NOI18N
        bHitung.setText("HITUNG");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });

        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectaplikasi/circular.png"))); // NOI18N
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectaplikasi/back.png"))); // NOI18N
        bKembali.setText("KEMBALI");
        bKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKembaliActionPerformed(evt);
            }
        });

        vLuas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vLuas.setText("jLabel4");

        vKeliling.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vKeliling.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(bHitung)
                .addGap(18, 18, 18)
                .addComponent(bReset)
                .addGap(18, 18, 18)
                .addComponent(bKembali)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tJarijari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tDiameter, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vKeliling)
                            .addComponent(vLuas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tJarijari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung)
                    .addComponent(bReset)
                    .addComponent(bKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(vLuas)
                .addGap(18, 18, 18)
                .addComponent(vKeliling)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembaliActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_bKembaliActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        // TODO add your handling code here:
        double Jarijari = Double.parseDouble(tJarijari.getText());
        double Diameter = Double.parseDouble(tDiameter.getText());
        double Luas = Math.PI * Jarijari;
        double Keliling = 2 * Math.PI * Jarijari;
        vLuas.setText("JariJari:" + Jarijari);
        vKeliling.setText("Keliling:" + Diameter);
    }//GEN-LAST:event_bHitungActionPerformed

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
            java.util.logging.Logger.getLogger(lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lingkaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bKembali;
    private javax.swing.JButton bReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.TextField tDiameter;
    private java.awt.TextField tJarijari;
    private javax.swing.JLabel vKeliling;
    private javax.swing.JLabel vLuas;
    // End of variables declaration//GEN-END:variables
}