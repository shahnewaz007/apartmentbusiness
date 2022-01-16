/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Renter;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hp
 */
public class Add_renters extends javax.swing.JFrame {
    
    
    int reqID,flatID,userID,rentFee;
    String BuildingName,UserName;

    /**
     * Creates new form Add_renters
     */
    public Add_renters() {
        initComponents();
    }
    
    
    
    
         public ArrayList<Renter>renterList(){
    ArrayList<Renter>renterList = new ArrayList<>();
    
    
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
            
            
                   
                        
                        
                        
                        
                        
            
                
                
             String sql = "Select ReqID, FlatID, UserID, BuildingName from RENTREQUEST";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                       
                        
                      
                        
                        
                        ResultSet rs = pst.executeQuery();
                        
                        Renter renter;
                        while(rs.next())
                        {
                           renter  = new Renter(rs.getInt("ReqID"), rs.getInt("FlatID"),rs.getInt("UserID"),rs.getString("BuildingName") );
                           renterList.add(renter);
                        }
            
            
            
            
          
            





           


} catch (Exception e) {
    e.printStackTrace();
}
        
   return renterList;      
}
         
         
         
         
               
         public void show_flat()
    {
       
        ArrayList<Renter>list = renterList();
        DefaultTableModel model = (DefaultTableModel)renter_table.getModel();
        
        Object[] row = new Object[5];
        for(int i =0; i<list.size(); i++)
        {
            
            row[0]=list.get(i).getRegID();
           
            row[1]=list.get(i). getflatID();
            row[2]=list.get(i).getUserID();
             row[3]=list.get(i).getBuildingName();
            
            model.addRow(row);
            
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

        jPanel2 = new javax.swing.JPanel();
        cross_btn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        upper_panel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        renter_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(null);

        cross_btn.setFont(new java.awt.Font("Tactic Round Bld", 0, 24)); // NOI18N
        cross_btn.setForeground(new java.awt.Color(255, 255, 255));
        cross_btn.setText("X");
        cross_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cross_btnMouseClicked(evt);
            }
        });
        jPanel2.add(cross_btn);
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
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 590, 110, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Renter");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 380, 180, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(90, 340, 110, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Renter Request List");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(630, 20, 430, 70);

        upper_panel.setBackground(new java.awt.Color(51, 0, 51));
        upper_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upper panel.jpg"))); // NOI18N
        jPanel2.add(upper_panel);
        upper_panel.setBounds(260, 0, 1220, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Side Panel.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, -20, 265, 930);

        renter_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Flat ID", "UserID", "Building Name"
            }
        ));
        renter_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                renter_tableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                renter_tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(renter_table);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(320, 180, 990, 460);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Ignore");
        jPanel2.add(jButton1);
        jButton1.setBounds(810, 670, 140, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Accept");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(610, 670, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Renters().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        
        
        DefaultTableModel model = (DefaultTableModel)renter_table.getModel();
        model.setRowCount(0);
        show_flat();

    }//GEN-LAST:event_formWindowOpened

    private void renter_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renter_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_renter_tableMouseClicked

    private void renter_tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renter_tableMousePressed
        // TODO add your handling code here:
        
        int index = renter_table.getSelectedRow();
        TableModel model = renter_table.getModel();
        
        reqID = Integer.parseInt(model.getValueAt(index,0).toString());
        flatID = Integer.parseInt(model.getValueAt(index,1).toString());
        userID = Integer.parseInt(model.getValueAt(index,2).toString());
        BuildingName = model.getValueAt(index,3).toString();
        
        
        
        
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
               
                
             String sql = "Select RentFee from FLAT WHERE Flatid=?";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, flatID);
                        
                      
                        
                        
                        ResultSet rs = pst.executeQuery();
                        
                        
                        while(rs.next())
                        {
                           rentFee  = rs.getInt("RentFee");
                           
                        }
            
    

} catch (Exception e) {
    e.printStackTrace();
}
        
       
   try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
               
                
             String sql = "Select FirstName from GUSER WHERE UserID=?";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, userID);
                        
                      
                        
                        
                        ResultSet rs = pst.executeQuery();
                        
                        
                        while(rs.next())
                        {
                           UserName  = rs.getString("FirstName");
                           
                        }
            
    

} catch (Exception e) {
    e.printStackTrace();
}
   
   
   System.out.println(UserName+"   "+rentFee);
     
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_renter_tableMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
               
                
             String sql = "Insert into RENTER"
                    +"(UserID,Building_Name,Flat_no,RentFee,UserName)"
                    +"values(?,?,?,?,?)";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, userID);
                        pst.setString(2, BuildingName);
                        pst.setInt(3, flatID);
                        pst.setInt(4, rentFee);
                        pst.setString(5, UserName);
                           
                     
                        
                        
                        pst.executeUpdate();
                        
                      
            
    

} catch (Exception e) {
    e.printStackTrace();
}
        
        
        
        
        
        
         try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");


  
           
                
                
            String sql = "DELETE FROM RENTREQUEST WHERE ReqID = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
             pst.setInt(1, reqID);
            
          
            pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)renter_table.getModel();
           model.setRowCount(0);
        
       
            show_flat();
            
            
            
            
            
            
            
            
            
            
            
            
            



} catch (Exception e) {
e.printStackTrace();
}      
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_renters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_renters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_renters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_renters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_renters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cross_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable renter_table;
    private javax.swing.JLabel upper_panel;
    // End of variables declaration//GEN-END:variables
}