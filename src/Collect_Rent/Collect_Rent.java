package Collect_Rent;


import Home.*;
import java.awt.Toolkit;
import java.awt.Toolkit;
import Property.*;
import Renter.*;
import Collect_Rent.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AYoN
 */
public class Collect_Rent extends javax.swing.JFrame {

    /**
     * Creates new form Collect_Rent
     */
    public Collect_Rent() {
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

        bg = new javax.swing.JPanel();
        cross_btn = new javax.swing.JLabel();
        property_btn1 = new javax.swing.JLabel();
        Renter_btn1 = new javax.swing.JLabel();
        CRent_btn1 = new javax.swing.JLabel();
        Profit_btn = new javax.swing.JLabel();
        sidepanel = new javax.swing.JLabel();
        uppertext = new javax.swing.JLabel();
        upper_panel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Add_Property = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Add_Property1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bg.setPreferredSize(new java.awt.Dimension(1366, 768));
        bg.setLayout(null);

        cross_btn.setFont(new java.awt.Font("Tactic Round Bld", 0, 24)); // NOI18N
        cross_btn.setForeground(new java.awt.Color(255, 255, 255));
        cross_btn.setText("X");
        cross_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cross_btnMouseClicked(evt);
            }
        });
        bg.add(cross_btn);
        cross_btn.setBounds(1320, 10, 17, 25);

        property_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Property Btn.png"))); // NOI18N
        property_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                property_btn1MouseClicked(evt);
            }
        });
        bg.add(property_btn1);
        property_btn1.setBounds(10, 180, 250, 80);

        Renter_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Renter Btn.png"))); // NOI18N
        Renter_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Renter_btn1MouseClicked(evt);
            }
        });
        bg.add(Renter_btn1);
        Renter_btn1.setBounds(10, 280, 250, 80);

        CRent_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Collect_Rent Btn.png"))); // NOI18N
        CRent_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CRent_btn1MouseClicked(evt);
            }
        });
        bg.add(CRent_btn1);
        CRent_btn1.setBounds(10, 390, 250, 80);

        Profit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Profit Btn.png"))); // NOI18N
        bg.add(Profit_btn);
        Profit_btn.setBounds(10, 500, 250, 80);

        sidepanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Side Panel.jpg"))); // NOI18N
        bg.add(sidepanel);
        sidepanel.setBounds(0, -20, 265, 930);

        uppertext.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uppertext.setForeground(new java.awt.Color(255, 255, 255));
        uppertext.setText("Collect Rent");
        bg.add(uppertext);
        uppertext.setBounds(680, 20, 310, 70);

        upper_panel.setBackground(new java.awt.Color(51, 0, 51));
        upper_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upper panel.jpg"))); // NOI18N
        bg.add(upper_panel);
        upper_panel.setBounds(260, 0, 1220, 120);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("CHECK RENT REQUEST");
        bg.add(jLabel3);
        jLabel3.setBounds(420, 160, 260, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("SHOW RENT HISTORY");
        bg.add(jLabel4);
        jLabel4.setBounds(960, 170, 250, 30);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bg.add(jSeparator1);
        jSeparator1.setBounds(810, 220, 20, 340);

        Add_Property.setIcon(new javax.swing.ImageIcon(getClass().getResource("/renter pic/collect Money.png"))); // NOI18N
        Add_Property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_PropertyMouseClicked(evt);
            }
        });
        bg.add(Add_Property);
        Add_Property.setBounds(450, 330, 170, 170);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Collect Rent");
        bg.add(jLabel5);
        jLabel5.setBounds(470, 500, 130, 40);

        Add_Property1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/renter pic/check r.png"))); // NOI18N
        Add_Property1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_Property1MouseClicked(evt);
            }
        });
        bg.add(Add_Property1);
        Add_Property1.setBounds(1020, 330, 170, 170);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Check Rent ");
        bg.add(jLabel6);
        jLabel6.setBounds(1050, 500, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Renter_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Renter_btn1MouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
        new Renters().setVisible(true);

    }//GEN-LAST:event_Renter_btn1MouseClicked

    private void CRent_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRent_btn1MouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
        new Collect_Rent().setVisible(true);

    }//GEN-LAST:event_CRent_btn1MouseClicked

    private void Add_PropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_PropertyMouseClicked

        this.setVisible(false);
        new Collectinfo().setVisible(true);
    }//GEN-LAST:event_Add_PropertyMouseClicked

    private void Add_Property1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Property1MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
      new Showinfo().setVisible(true);
    }//GEN-LAST:event_Add_Property1MouseClicked

    private void property_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_property_btn1MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
      new HomePage().setVisible(true);
        
        
    }//GEN-LAST:event_property_btn1MouseClicked

    private void cross_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cross_btnMouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_cross_btnMouseClicked
    
    
       //a.setVisibility(true);
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
            java.util.logging.Logger.getLogger(Collect_Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Collect_Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Collect_Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Collect_Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Collect_Rent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Property;
    private javax.swing.JLabel Add_Property1;
    private javax.swing.JLabel CRent_btn1;
    private javax.swing.JLabel Profit_btn;
    private javax.swing.JLabel Renter_btn1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel cross_btn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel property_btn1;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JLabel upper_panel;
    private javax.swing.JLabel uppertext;
    // End of variables declaration//GEN-END:variables
}
