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

/**
 *
 * @author Ayon
 */
public class Profile extends javax.swing.JFrame {
    
    int renterID, FlatNo;
    String BuildingName,fName,lName; 
                           

    /**
     * Creates new form Profile
     */
    public Profile() {
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
        message = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Bulding_Name = new javax.swing.JLabel();
        Flat_No = new javax.swing.JLabel();
        renter_ID1 = new javax.swing.JLabel();
        user_ID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
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
        jLabel2.setText("Profile");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(670, 20, 310, 70);

        upper_panel.setBackground(new java.awt.Color(51, 0, 51));
        upper_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upper panel.jpg"))); // NOI18N
        jPanel1.add(upper_panel);
        upper_panel.setBounds(260, 0, 1220, 120);

        CRent_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img User/Pay Rent.png"))); // NOI18N
        CRent_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CRent_btn1MouseClicked(evt);
            }
        });
        jPanel1.add(CRent_btn1);
        CRent_btn1.setBounds(10, 370, 250, 80);

        property_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img User/Profile.png"))); // NOI18N
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

        message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        message.setForeground(new java.awt.Color(153, 153, 0));
        jPanel1.add(message);
        message.setBounds(760, 740, 80, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img User/avatar.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 140, 260, 250);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Building Name:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(650, 590, 100, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Name: ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(650, 430, 70, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("User ID: ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(650, 470, 70, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Renter ID:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(650, 510, 70, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Flat No: ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(650, 550, 70, 17);

        Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 102, 102));
        Name.setText("Null");
        jPanel1.add(Name);
        Name.setBounds(710, 430, 190, 20);

        Bulding_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bulding_Name.setForeground(new java.awt.Color(102, 102, 102));
        Bulding_Name.setText("Null");
        jPanel1.add(Bulding_Name);
        Bulding_Name.setBounds(760, 580, 130, 40);

        Flat_No.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Flat_No.setForeground(new java.awt.Color(102, 102, 102));
        Flat_No.setText("Null");
        jPanel1.add(Flat_No);
        Flat_No.setBounds(720, 550, 160, 30);

        renter_ID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        renter_ID1.setForeground(new java.awt.Color(102, 102, 102));
        renter_ID1.setText("Null");
        jPanel1.add(renter_ID1);
        renter_ID1.setBounds(730, 510, 40, 20);

        user_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_ID.setForeground(new java.awt.Color(102, 102, 102));
        user_ID.setText("Null");
        jPanel1.add(user_ID);
        user_ID.setBounds(720, 470, 40, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1377, Short.MAX_VALUE)
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

    private void Renter_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Renter_btn1MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        new GHome().setVisible(true);
        
        
    }//GEN-LAST:event_Renter_btn1MouseClicked

    private void CRent_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRent_btn1MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        new PayRent().setVisible(true);
    }//GEN-LAST:event_CRent_btn1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        
           try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
               
                
             String sql = "Select GUSER.FirstName, GUSER.LastName, RenterID, Building_Name, Flat_no from RENTER INNER JOIN GUSER ON RENTER.UserID=GUSER.UserID WHERE RENTER.UserID=?";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, Integer.parseInt(SignIn.UserId));
                        
                      
                        
                        
                        ResultSet rs = pst.executeQuery();
                        
                        
                        while(rs.next())
                        {
                           renterID  = rs.getInt("RenterID");
                           FlatNo = rs.getInt("Flat_no");
                          
                           BuildingName = rs.getString("Building_Name");
                           fName = rs.getString("FirstName");
                           lName = rs.getString("LastName");
                           
                           
                        }
                        
                      
    

} catch (Exception e) {
    e.printStackTrace();
}
           
           
    Name.setText(String.valueOf(renterID)); 
    user_ID.setText(String.valueOf(SignIn.UserId));
    Bulding_Name.setText(BuildingName); 
    Flat_No.setText(String.valueOf(FlatNo)); 
    Name.setText(fName+" "+lName);
    renter_ID1.setText(String.valueOf(renterID));
           
           
           
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bulding_Name;
    private javax.swing.JLabel CRent_btn1;
    private javax.swing.JLabel Flat_No;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Renter_btn1;
    private javax.swing.JLabel cross_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message;
    private javax.swing.JLabel property_btn1;
    private javax.swing.JLabel renter_ID1;
    private javax.swing.JLabel upper_panel;
    private javax.swing.JLabel user_ID;
    // End of variables declaration//GEN-END:variables
}
