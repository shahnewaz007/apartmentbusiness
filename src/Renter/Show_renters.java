/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Renter;

/**
 *
 * @author hp
 */
public class Show_renters extends javax.swing.JFrame {

    /**
     * Creates new form Show_renters
     */
    public Show_renters() {
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

        jPanel1 = new javax.swing.JPanel();
        cross_btn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        upper_panel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2_user_id_show_renters = new javax.swing.JTextField();
        jButton1_show_renters = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setMaximumSize(null);
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        cross_btn.setFont(new java.awt.Font("Tactic Round Bld", 0, 24)); // NOI18N
        cross_btn.setForeground(new java.awt.Color(255, 255, 255));
        cross_btn.setText("X");
        cross_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cross_btnMouseClicked(evt);
            }
        });
        jPanel1.add(cross_btn);
        cross_btn.setBounds(1320, 10, 17, 25);

        jLabel10.setBackground(new java.awt.Color(0, 0, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<-BACK");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 590, 110, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Renter");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 380, 180, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Show");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 340, 160, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Renter");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(670, 20, 310, 70);

        upper_panel.setBackground(new java.awt.Color(51, 0, 51));
        upper_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upper panel.jpg"))); // NOI18N
        jPanel1.add(upper_panel);
        upper_panel.setBounds(260, 0, 1220, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Side Panel.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 265, 930);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("USER ID");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 210, 90, 18);

        jTextField2_user_id_show_renters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_user_id_show_rentersActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2_user_id_show_renters);
        jTextField2_user_id_show_renters.setBounds(660, 210, 250, 20);

        jButton1_show_renters.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_show_renters.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1_show_renters.setForeground(new java.awt.Color(0, 0, 102));
        jButton1_show_renters.setText("SHOW");
        jButton1_show_renters.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jButton1_show_renters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_show_rentersActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_show_renters);
        jButton1_show_renters.setBounds(620, 570, 210, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1377, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_user_id_show_rentersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_user_id_show_rentersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_user_id_show_rentersActionPerformed

    private void jButton1_show_rentersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_show_rentersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_show_rentersActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Renters().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void cross_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cross_btnMouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_cross_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Show_renters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_renters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_renters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_renters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_renters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cross_btn;
    private javax.swing.JButton jButton1_show_renters;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2_user_id_show_renters;
    private javax.swing.JLabel upper_panel;
    // End of variables declaration//GEN-END:variables
}