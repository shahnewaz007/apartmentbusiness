package Collect_Rent;


import Home.*;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AYoN
 */
public class Showinfo extends javax.swing.JFrame {
    
    int renterIdInt1 ;
    int renterIdInt2 ;
    String username;
    int flatno;
    String month;
    int year;
    
    /**
     * Creates new form Showinfo
     */
    public Showinfo() {
        initComponents();
    }
    
    public ArrayList<collecttable> collect(){
        ArrayList<collecttable> collect = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
            String query2 = "select DISTINCT  RenterID, FlatID, Trxno, datename(month, Date) as [Month], year(Date) as [Year] from CollectRent";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query2);
            collecttable clt;
            
            while(rs.next()){
                clt = new collecttable(rs.getInt("RenterID"), rs.getInt("FlatID"), rs.getString("Trxno"), rs.getString("Month"), rs.getInt("Year"));
                collect.add(clt);
            }
        }
    catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        return collect;
    }
    
    public void show_data2(){
         ArrayList<collecttable> showlist2 = collect();
           DefaultTableModel model = (DefaultTableModel)allusertableshow.getModel();
           Object[] row = new Object[5];
           for(int i=0;i<showlist2.size();i++){
               row[0] = showlist2.get(i).getrenterID();
               row[1] = showlist2.get(i).getflatID();
               row[2] = showlist2.get(i).gettrnxno();
               row[3] = showlist2.get(i).getmonth();
               row[4] = showlist2.get(i).getyear();
               model.addRow(row);
           }
    }
    
    public ArrayList<collectionshow> Usercollectionshow(){
        
        ArrayList<collectionshow> Usercollectionshow = new ArrayList<>();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
            
            String query1 = "select CollectID,UserName, FlatID, datename(month, Date) as [Month], year(Date) as [Year] from RENTER, CollectRent where (RENTER.RenterID = ? AND CollectRent.RenterID = ?)";
            PreparedStatement pst2 = connection.prepareStatement(query1);
            pst2.setInt(1,renterIdInt1);
            pst2.setInt(2,renterIdInt2);
            ResultSet rs = pst2.executeQuery();
            collectionshow show;
            
            while(rs.next()){
                show = new collectionshow(rs.getInt("CollectID"), rs.getString("UserName"), rs.getInt("FlatID"), rs.getString("Month"), rs.getString("Year"));
                Usercollectionshow.add(show);
            }
            
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        return Usercollectionshow;
    }
    
    public void show_data(){
         ArrayList<collectionshow> showlist = Usercollectionshow();
           DefaultTableModel model = (DefaultTableModel)oneusertableshow.getModel();
           Object[] row = new Object[5];
           for(int i=0;i<showlist.size();i++){
               row[0] = showlist.get(i).getcollectID();
               row[1] = showlist.get(i).getusername();
               row[2] = showlist.get(i).getflatID();
               row[3] = showlist.get(i).getmonth();
               row[4] = showlist.get(i).getyear();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        cross_btn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sidepannel = new javax.swing.JLabel();
        upper_panel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allusertableshow = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        userid3 = new javax.swing.JLabel();
        useridtext3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        oneusertableshow = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkbtnforuser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("<Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 670, 180, 40);

        cross_btn.setFont(new java.awt.Font("Tactic Round Bld", 0, 24)); // NOI18N
        cross_btn.setForeground(new java.awt.Color(255, 255, 255));
        cross_btn.setText("X");
        cross_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cross_btnMouseClicked(evt);
            }
        });
        getContentPane().add(cross_btn);
        cross_btn.setBounds(1320, 10, 17, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Information");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 450, 220, 80);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Check Rent");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 380, 230, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RENT INFORMATION");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(690, 30, 270, 50);

        sidepannel.setForeground(new java.awt.Color(255, 255, 255));
        sidepannel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Side Panel.jpg"))); // NOI18N
        getContentPane().add(sidepannel);
        sidepannel.setBounds(0, 0, 260, 900);

        upper_panel.setBackground(new java.awt.Color(51, 0, 51));
        upper_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upper panel.jpg"))); // NOI18N
        getContentPane().add(upper_panel);
        upper_panel.setBounds(260, 0, 1160, 120);

        allusertableshow.setBackground(new java.awt.Color(204, 204, 204));
        allusertableshow.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        allusertableshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RenterID", "Flatid", "Trnx No", "Month", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allusertableshow.setShowHorizontalLines(false);
        allusertableshow.setShowVerticalLines(false);
        allusertableshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allusertableshowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allusertableshow);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(290, 380, 380, 210);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(700, 180, 10, 520);

        userid3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userid3.setForeground(new java.awt.Color(102, 102, 102));
        userid3.setText("Renter Id");
        getContentPane().add(userid3);
        userid3.setBounds(740, 250, 70, 20);

        useridtext3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        useridtext3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        useridtext3.setOpaque(false);
        useridtext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridtext3ActionPerformed(evt);
            }
        });
        getContentPane().add(useridtext3);
        useridtext3.setBounds(740, 270, 160, 30);

        oneusertableshow.setBackground(new java.awt.Color(204, 204, 204));
        oneusertableshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CollectID", "UserName", "Flat No", "Month", "Year"
            }
        ));
        oneusertableshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneusertableshowMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                oneusertableshowMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(oneusertableshow);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(720, 380, 310, 210);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("COLLECT RENT TABLE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 180, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("CHECK EACH USER'S RENT STATUS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(810, 180, 320, 30);

        checkbtnforuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        checkbtnforuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkbtnforuserMouseClicked(evt);
            }
        });
        getContentPane().add(checkbtnforuser);
        checkbtnforuser.setBounds(920, 270, 100, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 270, 100, 30);

        Print.setBackground(new java.awt.Color(0, 51, 153));
        Print.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("PRINT");
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
        });
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        getContentPane().add(Print);
        Print.setBounds(1220, 630, 80, 30);

        area.setColumns(20);
        area.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        area.setRows(5);
        jScrollPane3.setViewportView(area);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(1050, 310, 270, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void useridtext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridtext3ActionPerformed

    }//GEN-LAST:event_useridtext3ActionPerformed

    private void checkbtnforuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbtnforuserMouseClicked
        
        renterIdInt1=(int) Integer.parseInt(useridtext3.getText());
        renterIdInt2= (int) Integer.parseInt(useridtext3.getText());
        DefaultTableModel model = (DefaultTableModel)oneusertableshow.getModel();
        model.setRowCount(0);
        show_data();
    }//GEN-LAST:event_checkbtnforuserMouseClicked

    private void oneusertableshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneusertableshowMouseClicked
        /*int index = oneusertableshow.getSelectedRow();
        TableModel model = oneusertableshow.getModel();
        
        username = (model.getValueAt(index,1).toString());
        flatno = Integer.parseInt(model.getValueAt(index,2).toString());
        month = (model.getValueAt(index,3).toString());
        year = Integer.parseInt(model.getValueAt(index,3).toString());
        renterIdInt1=(int) Integer.parseInt(useridtext3.getText());
        
        System.out.println(username);
        System.out.println(flatno);
        System.out.println(month);
        System.out.println(year);
        
        area.setText("...............................................................................\n");
        area.setText(area.getText()+"APARTMENT BUSINESS MANAGEMENT SYSTEM\n");
        area.setText(area.getText()+"....................................................................................\n");
        
        Date obj = new Date();
        
        String date = obj.toString();
        
        area.setText(area.getText()+"\n"+date+"\n\n");
        area.setText(area.getText()+"Renter ID:  "+renterIdInt1+"\n\n");
        area.setText(area.getText()+"Renter Name: "+username+"\n\n");
        area.setText(area.getText()+"Month: "+month+"\n\n");
        area.setText(area.getText()+"Year: "+year+"\n\n");
        area.setText(area.getText()+"\n\n                                  Signature");*/
        
    }//GEN-LAST:event_oneusertableshowMouseClicked

    private void oneusertableshowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneusertableshowMousePressed
        int index = oneusertableshow.getSelectedRow();
        TableModel model = oneusertableshow.getModel();
        
        username = (model.getValueAt(index,1).toString());
        flatno = Integer.parseInt(model.getValueAt(index,2).toString());
        month = (model.getValueAt(index,3).toString());
        year = Integer.parseInt(model.getValueAt(index,4).toString());
        renterIdInt1=(int) Integer.parseInt(useridtext3.getText());
        
        
        area.setText("...................................................................................\n");
        area.setText(area.getText()+"APARTMENT BUSINESS MANAGEMENT SYSTEM\n");
        area.setText(area.getText()+"...................................................................................\n");
        
        Date obj = new Date();
        
        String date = obj.toString();
        
        area.setText(area.getText()+"\n  "+date+"\n\n");
        area.setText(area.getText()+"  RENTER ID:  "+renterIdInt1+"\n\n");
        area.setText(area.getText()+"  RENTER NAME: "+username+"\n\n");
        area.setText(area.getText()+"  MONTH: "+month+"\n\n");
        area.setText(area.getText()+"  YEAR: "+year+"\n\n");
        area.setText(area.getText()+"  STATUS: Paid\n\n");
        area.setText(area.getText()+"  \n\n                                                Signature");
    }//GEN-LAST:event_oneusertableshowMousePressed

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
        
    }//GEN-LAST:event_PrintMouseClicked

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try {
            area.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Showinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        DefaultTableModel model = (DefaultTableModel)allusertableshow.getModel();
        model.setRowCount(0);
        show_data2();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void allusertableshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allusertableshowMouseClicked
        int index = allusertableshow.getSelectedRow();
        TableModel model = allusertableshow.getModel();
        
        useridtext3.setText(model.getValueAt(index,0).toString());
    }//GEN-LAST:event_allusertableshowMouseClicked

    private void cross_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cross_btnMouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_cross_btnMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
        new Collect_Rent().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Showinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Showinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Showinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Showinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Showinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JTable allusertableshow;
    private javax.swing.JTextArea area;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel checkbtnforuser;
    private javax.swing.JLabel cross_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable oneusertableshow;
    private javax.swing.JLabel sidepannel;
    private javax.swing.JLabel upper_panel;
    private javax.swing.JLabel userid3;
    private javax.swing.JTextField useridtext3;
    // End of variables declaration//GEN-END:variables

}
