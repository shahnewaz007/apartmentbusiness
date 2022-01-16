/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralUser;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Home.*;

/**
 *
 * @author Ayon
 */
public class GHome extends javax.swing.JFrame {
    
    String SearchBox;
    String SearchBox2;
    String SearchBox3;
    int SearchBoxInt;
    int SearchBoxInt2;
    int SearchBoxInt3;
    int flatID;
    String BuildingName;
    
    String SearchType;

    /**
     * Creates new form GHome
     */
    public GHome() {
        initComponents();
    }
    
    
    
    
      public ArrayList<GFlat>flatList(){
    ArrayList<GFlat>flatList = new ArrayList<>();
    
    
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
            
            
                   
                        
                        
                        
                        
                        
             
                
             if(SearchType == "Room") { 
                SearchBoxInt =Integer.parseInt(SearchBox);
             String sql = "Select FlatId, TotalRooms, RentFee, PROPERTY.BuildingName, Area from FLAT INNER JOIN PROPERTY ON FLAT.BuildingName= PROPERTY.BuildingName WHERE TotalRooms = ? "
                     + "AND FlatId NOT IN (Select Flat_no FROM RENTER)";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, SearchBoxInt);
                        
                        ResultSet rs = pst.executeQuery();
                        
                        GFlat flat;
                        while(rs.next())
                        {
                            flat = new GFlat(rs.getInt("FlatId"), rs.getInt("TotalRooms"), rs.getInt("RentFee"),rs.getString("BuildingName"),rs.getString("Area")  );
                            flatList.add(flat);
                        }
             }
             
             
             
            // 
                     
                     
             else if(SearchType == "Budget") { 
                 SearchBoxInt =Integer.parseInt(SearchBox);
             String sql = "Select FlatId, TotalRooms, RentFee, PROPERTY.BuildingName, Area from FLAT INNER JOIN PROPERTY ON FLAT.BuildingName= PROPERTY.BuildingName WHERE RentFee <= ? "
                     + "AND FlatId NOT IN (Select Flat_no FROM RENTER)";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, SearchBoxInt);
                        
                        ResultSet rs = pst.executeQuery();
                        
                        GFlat flat;
                        while(rs.next())
                        {
                            flat = new GFlat(rs.getInt("FlatId"), rs.getInt("TotalRooms"), rs.getInt("RentFee"),rs.getString("BuildingName"),rs.getString("Area")  );
                            flatList.add(flat);
                        }
             }
            
             
             
             
             else if(SearchType == "Area") {  
             String sql = "Select FlatId, TotalRooms, RentFee, PROPERTY.BuildingName, Area from FLAT INNER JOIN PROPERTY ON FLAT.BuildingName= PROPERTY.BuildingName WHERE PROPERTY.Area like '%"+SearchBox+"%' "
                     + "AND FlatId NOT IN (Select Flat_no FROM RENTER)";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        
                        
                        ResultSet rs = pst.executeQuery();
                        
                        GFlat flat;
                        while(rs.next())
                        {
                            flat = new GFlat(rs.getInt("FlatId"), rs.getInt("TotalRooms"), rs.getInt("RentFee"),rs.getString("BuildingName"),rs.getString("Area")  );
                            flatList.add(flat);
                        }
             }
             
             
              else if(SearchType == "Budget + Area + Room") {
                          SearchBoxInt =Integer.parseInt(SearchBox);
                          SearchBoxInt3 =Integer.parseInt(SearchBox3);
                  
             String sql = "Select FlatId, TotalRooms, RentFee, PROPERTY.BuildingName, Area from FLAT INNER JOIN PROPERTY ON FLAT.BuildingName= PROPERTY.BuildingName WHERE RentFee <= ? AND PROPERTY.Area like '%"+SearchBox2+"%' "
                     + "AND TotalRooms = ? "
                    
                     + "AND FlatId NOT IN (Select Flat_no FROM RENTER)";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, SearchBoxInt);
                         pst.setInt(2, SearchBoxInt3);
                      
                        
                        ResultSet rs = pst.executeQuery();
                        
                        GFlat flat;
                        while(rs.next())
                        {
                            flat = new GFlat(rs.getInt("FlatId"), rs.getInt("TotalRooms"), rs.getInt("RentFee"),rs.getString("BuildingName"),rs.getString("Area")  );
                            flatList.add(flat);
                        }
             }
             
             
             
             
             else if(SearchType == "Budget + Area") {
                          SearchBoxInt =Integer.parseInt(SearchBox);
                          
                  
             String sql = "Select FlatId, TotalRooms, RentFee, PROPERTY.BuildingName, Area from FLAT INNER JOIN PROPERTY ON FLAT.BuildingName= PROPERTY.BuildingName WHERE RentFee <= ? AND PROPERTY.Area like '%"+SearchBox2+"%' "
                    
                    
                     + "AND FlatId NOT IN (Select Flat_no FROM RENTER)";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, SearchBoxInt);
                        
                      
                        
                        ResultSet rs = pst.executeQuery();
                        
                        GFlat flat;
                        while(rs.next())
                        {
                            flat = new GFlat(rs.getInt("FlatId"), rs.getInt("TotalRooms"), rs.getInt("RentFee"),rs.getString("BuildingName"),rs.getString("Area")  );
                            flatList.add(flat);
                        }
             }
             
             
             
              else if(SearchType == "Budget + Room") {
                          SearchBoxInt =Integer.parseInt(SearchBox);
                          SearchBoxInt2 =Integer.parseInt(SearchBox2);
                  
             String sql = "Select FlatId, TotalRooms, RentFee, PROPERTY.BuildingName, Area from FLAT INNER JOIN PROPERTY ON FLAT.BuildingName= PROPERTY.BuildingName WHERE RentFee <= ? AND TotalRooms = ? "
                    
                    
                     + "AND FlatId NOT IN (Select Flat_no FROM RENTER)";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, SearchBoxInt);
                         pst.setInt(2, SearchBoxInt2);
                        
                      
                        
                        ResultSet rs = pst.executeQuery();
                        
                        GFlat flat;
                        while(rs.next())
                        {
                            flat = new GFlat(rs.getInt("FlatId"), rs.getInt("TotalRooms"), rs.getInt("RentFee"),rs.getString("BuildingName"),rs.getString("Area")  );
                            flatList.add(flat);
                        }
             }
             
             else if(SearchType == "Area + Room") {
                          
                          SearchBoxInt2 =Integer.parseInt(SearchBox2);
                  
             String sql = "Select FlatId, TotalRooms, RentFee, PROPERTY.BuildingName, Area from FLAT INNER JOIN PROPERTY ON FLAT.BuildingName= PROPERTY.BuildingName WHERE PROPERTY.Area like '%"+SearchBox+"%'  AND TotalRooms = ? "
                    
                    
                     + "AND FlatId NOT IN (Select Flat_no FROM RENTER)";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        
                        pst.setInt(1, SearchBoxInt2);
                         
                        
                      
                        
                        ResultSet rs = pst.executeQuery();
                        
                        GFlat flat;
                        while(rs.next())
                        {
                            flat = new GFlat(rs.getInt("FlatId"), rs.getInt("TotalRooms"), rs.getInt("RentFee"),rs.getString("BuildingName"),rs.getString("Area")  );
                            flatList.add(flat);
                        }
             }
            
            
            
            
            
            
            





           


} catch (Exception e) {
    e.printStackTrace();
}
         
   return flatList;      
}
      
 
      
              
 public void show_flat()
    {
       
        ArrayList<GFlat>list = flatList();
        DefaultTableModel model = (DefaultTableModel)flat_table.getModel();
        
        Object[] row = new Object[5];
        for(int i =0; i<list.size(); i++)
        {
            
            row[0]=list.get(i).getflatId();
           
            row[1]=list.get(i).gettotalRoom();
            row[2]=list.get(i).getrentFee();
            row[3]=list.get(i).getbuildingName();
            row[4]=list.get(i).getArea();
            
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cross_btn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        upper_panel = new javax.swing.JLabel();
        CRent_btn1 = new javax.swing.JLabel();
        property_btn1 = new javax.swing.JLabel();
        Renter_btn1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        flat_table = new javax.swing.JTable();
        Search_Box_1 = new javax.swing.JTextField();
        Search_Type = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        Search_Box_3 = new javax.swing.JTextField();
        Search_Box_2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GeneralUser/logOut.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 680, 50, 50);

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
        jLabel2.setText("Find Property");
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
        property_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                property_btn1MouseClicked(evt);
            }
        });
        jPanel1.add(property_btn1);
        property_btn1.setBounds(10, 510, 250, 80);

        Renter_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img User/Search flat.png"))); // NOI18N
        jPanel1.add(Renter_btn1);
        Renter_btn1.setBounds(10, 230, 250, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Side Panel.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 265, 930);

        flat_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flat ID", "Total Room", "Rent Fee", "Building Name", "Area"
            }
        ));
        flat_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flat_tableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                flat_tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(flat_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(330, 332, 970, 350);

        Search_Box_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Search_Box_1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        Search_Box_1.setOpaque(false);
        Search_Box_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Box_1ActionPerformed(evt);
            }
        });
        jPanel1.add(Search_Box_1);
        Search_Box_1.setBounds(790, 190, 170, 20);

        Search_Type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search_Type.setForeground(new java.awt.Color(0, 102, 102));
        Search_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Budget", "Area", "Room", "Budget + Area", "Budget + Room", "Area + Room", "Budget + Area + Room" }));
        Search_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_TypeActionPerformed(evt);
            }
        });
        jPanel1.add(Search_Type);
        Search_Type.setBounds(520, 180, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Search By");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 180, 120, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(990, 180, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Send Rent Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(710, 700, 180, 40);

        message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        message.setForeground(new java.awt.Color(153, 153, 0));
        jPanel1.add(message);
        message.setBounds(760, 740, 80, 20);

        Search_Box_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Search_Box_3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        Search_Box_3.setOpaque(false);
        Search_Box_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Box_3ActionPerformed(evt);
            }
        });
        jPanel1.add(Search_Box_3);
        Search_Box_3.setBounds(790, 270, 170, 20);

        Search_Box_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Search_Box_2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        Search_Box_2.setOpaque(false);
        Search_Box_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Box_2ActionPerformed(evt);
            }
        });
        jPanel1.add(Search_Box_2);
        Search_Box_2.setBounds(790, 230, 170, 20);

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

    private void flat_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flat_tableMouseClicked
        // TODO add your handling code here:
/*
        int index = flat_table.getSelectedRow();
        TableModel model = flat_table.getModel();

        flatID = Integer.parseInt(model.getValueAt(index,0).toString());

        System.out.println(flatID);
        */

    }//GEN-LAST:event_flat_tableMouseClicked

    
    
    private void flat_tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flat_tableMousePressed
        // TODO add your handling code here:
        
        message.setText("");

        int index = flat_table.getSelectedRow();
        TableModel model = flat_table.getModel();

        flatID = Integer.parseInt(model.getValueAt(index,0).toString());
        BuildingName = model.getValueAt(index,3).toString();
        
        

        System.out.println(flatID);
        System.out.println(BuildingName);
        System.out.println(SignIn.UserId );
       
     
        
    }//GEN-LAST:event_flat_tableMousePressed

    private void Search_Box_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Box_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_Box_1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        SearchBox = Search_Box_1.getText();
        SearchBox2 = Search_Box_2.getText();
        SearchBox3 = Search_Box_3.getText();
        
       
        
        
        
        
         DefaultTableModel model = (DefaultTableModel)flat_table.getModel();
        model.setRowCount(0);
        show_flat();

        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
         
     try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");




String sql = "Insert into RENTREQUEST"
                    +"(FlatID,BuildingName,UserID)"
                    +"values(?,?,?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, flatID);
            pst.setString(2, BuildingName);
            pst.setString(3,SignIn.UserId );
           
          
            pst.executeUpdate();
            
            message.setText("Sent!!");



} catch (Exception e) {
    e.printStackTrace();
}


        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CRent_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRent_btn1MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        new PayRent().setVisible(true);
    }//GEN-LAST:event_CRent_btn1MouseClicked

    private void property_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_property_btn1MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Profile().setVisible(true);
    }//GEN-LAST:event_property_btn1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
        new SignIn().setVisible(true);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void Search_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_TypeActionPerformed
        // TODO add your handling code here:
        
        SearchType = (String) Search_Type.getSelectedItem();
        
        if(SearchType == "Budget + Area + Room")
        {
            Search_Box_3.setVisible(true);
            Search_Box_2.setVisible(true);
            
        }
        else if(SearchType == "Budget + Area")
        {
           
           Search_Box_2.setVisible(true);
           Search_Box_3.setVisible(false);
        
        }
         else if(SearchType == "Budget + Room")
        {
           
           Search_Box_2.setVisible(true);
           Search_Box_3.setVisible(false);
        
        }
             else if(SearchType == "Area + Room")
        {
           
           Search_Box_2.setVisible(true); 
           Search_Box_3.setVisible(false);
        
        }
        else 
        {
            Search_Box_3.setVisible(false);
            Search_Box_2.setVisible(false);
        
        }
    }//GEN-LAST:event_Search_TypeActionPerformed

    private void Search_Box_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Box_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_Box_3ActionPerformed

    private void Search_Box_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Box_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_Box_2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
         Search_Box_3.setVisible(false);
         Search_Box_2.setVisible(false);
        
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
            java.util.logging.Logger.getLogger(GHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CRent_btn1;
    private javax.swing.JLabel Renter_btn1;
    private javax.swing.JTextField Search_Box_1;
    private javax.swing.JTextField Search_Box_2;
    private javax.swing.JTextField Search_Box_3;
    private javax.swing.JComboBox<String> Search_Type;
    private javax.swing.JLabel cross_btn;
    private javax.swing.JTable flat_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message;
    private javax.swing.JLabel property_btn1;
    private javax.swing.JLabel upper_panel;
    // End of variables declaration//GEN-END:variables
}
