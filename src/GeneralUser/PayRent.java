/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralUser;

import Home.SignIn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 import java.text.SimpleDateFormat;

/**
 *
 * @author Ayon
 */
public class PayRent extends javax.swing.JFrame {

    /**
     * Creates new form PayRent
     */
    
    int renterID, FlatNo,RentFee;
    String BuildingName;
    
    
    public PayRent() {
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
        jLabel2 = new javax.swing.JLabel();
        upper_panel = new javax.swing.JLabel();
        CRent_btn1 = new javax.swing.JLabel();
        property_btn1 = new javax.swing.JLabel();
        Renter_btn1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        Trx_no = new javax.swing.JTextField();
        Flat_No = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Bulding_Name = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        renter_ID = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Rent_Fee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pay Rent");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(670, 20, 310, 70);

        upper_panel.setBackground(new java.awt.Color(51, 0, 51));
        upper_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upper panel.jpg"))); // NOI18N
        jPanel1.add(upper_panel);
        upper_panel.setBounds(260, 0, 1220, 120);

        CRent_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img User/Pay Rent.png"))); // NOI18N
        jPanel1.add(CRent_btn1);
        CRent_btn1.setBounds(10, 370, 250, 80);

        property_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img User/Profile.png"))); // NOI18N
        property_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                property_btn1MouseClicked(evt);
            }
        });
        jPanel1.add(property_btn1);
        property_btn1.setBounds(10, 510, 250, 80);

        Renter_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img User/Search flat.png"))); // NOI18N
        Renter_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Renter_btn1MouseClicked(evt);
            }
        });
        jPanel1.add(Renter_btn1);
        Renter_btn1.setBounds(10, 230, 250, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Side Panel.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 265, 930);

        message1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        message1.setForeground(new java.awt.Color(153, 153, 0));
        jPanel1.add(message1);
        message1.setBounds(700, 730, 120, 20);

        Trx_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Trx_no.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        Trx_no.setOpaque(false);
        Trx_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trx_noActionPerformed(evt);
            }
        });
        jPanel1.add(Trx_no);
        Trx_no.setBounds(660, 520, 260, 30);

        Flat_No.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Flat_No.setForeground(new java.awt.Color(102, 102, 102));
        Flat_No.setText("Null");
        jPanel1.add(Flat_No);
        Flat_No.setBounds(720, 360, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("number and submit.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 230, 1103, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Bkash Marcent Number: 01785499257");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 120, 720, 80);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("After paying the amount, Please fill up the form with Bkash Transection ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(350, 180, 1103, 80);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 660, 110, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Date:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 600, 40, 17);

        Bulding_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bulding_Name.setForeground(new java.awt.Color(102, 102, 102));
        Bulding_Name.setText("Null");
        jPanel1.add(Bulding_Name);
        Bulding_Name.setBounds(770, 390, 130, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Flat No:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(660, 370, 70, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Building Name: ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(660, 410, 100, 17);

        jDateChooser1.setForeground(new java.awt.Color(0, 102, 102));
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(710, 590, 110, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Transection Number: ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(660, 490, 140, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Renter ID:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(660, 330, 70, 17);

        renter_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        renter_ID.setForeground(new java.awt.Color(102, 102, 102));
        renter_ID.setText("Null");
        jPanel1.add(renter_ID);
        renter_ID.setBounds(740, 310, 80, 50);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Rent Fee:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(660, 450, 70, 17);

        Rent_Fee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Rent_Fee.setForeground(new java.awt.Color(102, 102, 102));
        Rent_Fee.setText("Null");
        jPanel1.add(Rent_Fee);
        Rent_Fee.setBounds(730, 440, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cross_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cross_btnMouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_cross_btnMouseClicked

    private void Trx_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trx_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Trx_noActionPerformed

    private void Renter_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Renter_btn1MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        new GHome().setVisible(true);
    }//GEN-LAST:event_Renter_btn1MouseClicked

    private void property_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_property_btn1MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Profile().setVisible(true);
    }//GEN-LAST:event_property_btn1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
           try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
               
                
             String sql = "Select RenterID, Building_Name, Flat_no, RentFee from RENTER WHERE UserID=?";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, Integer.parseInt(SignIn.UserId));
                        
                      
                        
                        
                        ResultSet rs = pst.executeQuery();
                        
                        
                        while(rs.next())
                        {
                           renterID  = rs.getInt("RenterID");
                           FlatNo = rs.getInt("Flat_no");
                           RentFee = rs.getInt("RentFee");
                           BuildingName = rs.getString("Building_Name");
                           
                           
                        }
                        
                      
    

} catch (Exception e) {
    e.printStackTrace();
}
           
    renter_ID.setText(String.valueOf(renterID)); 
    Rent_Fee.setText(String.valueOf(RentFee)); 
    Bulding_Name.setText(BuildingName); 
    Flat_No.setText(String.valueOf(FlatNo)); 
     
       
    
    
    
    
    
    
    
    
    
    
    
           
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
       SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
       String date = dcn.format(jDateChooser1.getDate() );
       
       String trx = Trx_no.getText();
       
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
               
                
             String sql = "Insert into PAYRENTREQUEST"
                    +"(RenterID,FlatID,Rentfee,PayDate,Trxno)"
                    +"values(?,?,?,?,?)";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, renterID);
                        pst.setInt(2, FlatNo);
                        pst.setInt(3, RentFee);
                        pst.setString(4, date);
                        pst.setString(5, trx);
                           
                     
                        
                        
                        pst.executeUpdate();
                        
                        message1.setText("Submitted!!");
                        
                      
            
    

} catch (Exception e) {
    e.printStackTrace();
}
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PayRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayRent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bulding_Name;
    private javax.swing.JLabel CRent_btn1;
    private javax.swing.JLabel Flat_No;
    private javax.swing.JLabel Rent_Fee;
    private javax.swing.JLabel Renter_btn1;
    private javax.swing.JTextField Trx_no;
    private javax.swing.JLabel cross_btn;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel property_btn1;
    private javax.swing.JLabel renter_ID;
    private javax.swing.JLabel upper_panel;
    // End of variables declaration//GEN-END:variables
}
