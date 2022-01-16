package Collect_Rent;


import Home.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class Collectinfo extends javax.swing.JFrame {

    /**
     * Creates new form Collectinfo
     */
    public Collectinfo() {
        initComponents();
    }
    
    public ArrayList<paymentreq> allpaymentreq(){
        
        ArrayList<paymentreq> allpaymentreq = new ArrayList<>();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
            
            String query1 = "Select * from PAYRENTREQUEST";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
            paymentreq payreq;
            
            while(rs.next()){
                payreq = new paymentreq(rs.getInt("RequestID"), rs.getInt("RenterID"), rs.getInt("FlatID"), rs.getInt("Rentfee"), rs.getString("PayDate"), rs.getString("Trxno"));
                allpaymentreq.add(payreq);
            }
            
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        return allpaymentreq;
    }
    
    
    
    public void show_data(){
         ArrayList<paymentreq> showlist = allpaymentreq();
           DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
           Object[] row = new Object[6];
           for(int i=0;i<showlist.size();i++){
               row[0] = showlist.get(i).getrequestID();
               row[1] = showlist.get(i).getrenterID();
               row[2] = showlist.get(i).getflatID();
               row[3] = showlist.get(i).getrentfee();
               row[4] = showlist.get(i).getpayDate();
               row[5] = showlist.get(i).gettrxno();
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

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cross_btn = new javax.swing.JLabel();
        sidepannel = new javax.swing.JLabel();
        uppertext = new javax.swing.JLabel();
        upper_panel = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        flatno = new javax.swing.JTextField();
        buildingid = new javax.swing.JLabel();
        rentreqtext = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        uppertext1 = new javax.swing.JLabel();
        collectbtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        showbtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        useridtext1 = new javax.swing.JTextField();
        userid1 = new javax.swing.JLabel();
        buildingid1 = new javax.swing.JLabel();
        trxno = new javax.swing.JTextField();
        uppertext2 = new javax.swing.JLabel();
        uppertext3 = new javax.swing.JLabel();

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Information");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 450, 220, 80);

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

        sidepannel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Side Panel.jpg"))); // NOI18N
        getContentPane().add(sidepannel);
        sidepannel.setBounds(0, -20, 265, 930);

        uppertext.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uppertext.setForeground(new java.awt.Color(255, 255, 255));
        uppertext.setText("RENT REQUEST INFORMATION");
        getContentPane().add(uppertext);
        uppertext.setBounds(460, 20, 630, 70);

        upper_panel.setBackground(new java.awt.Color(51, 0, 51));
        upper_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upper panel.jpg"))); // NOI18N
        getContentPane().add(upper_panel);
        upper_panel.setBounds(260, 0, 1220, 120);

        userid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userid.setForeground(new java.awt.Color(102, 102, 102));
        userid.setText("Request ID");
        getContentPane().add(userid);
        userid.setBounds(890, 250, 80, 20);

        flatno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        flatno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        flatno.setOpaque(false);
        flatno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flatnoActionPerformed(evt);
            }
        });
        getContentPane().add(flatno);
        flatno.setBounds(890, 400, 230, 30);

        buildingid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buildingid.setForeground(new java.awt.Color(102, 102, 102));
        buildingid.setText("Trxn No");
        getContentPane().add(buildingid);
        buildingid.setBounds(890, 440, 70, 17);

        rentreqtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rentreqtext.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        rentreqtext.setOpaque(false);
        rentreqtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentreqtextActionPerformed(evt);
            }
        });
        getContentPane().add(rentreqtext);
        rentreqtext.setBounds(890, 270, 230, 30);

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 102));
        date.setText("Date");
        getContentPane().add(date);
        date.setBounds(890, 500, 80, 30);

        uppertext1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uppertext1.setForeground(new java.awt.Color(255, 255, 255));
        uppertext1.setText("Collect Info");
        getContentPane().add(uppertext1);
        uppertext1.setBounds(680, 20, 310, 70);

        collectbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collect2.png"))); // NOI18N
        collectbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collectbtnMouseClicked(evt);
            }
        });
        getContentPane().add(collectbtn);
        collectbtn.setBounds(1010, 590, 110, 40);

        jSeparator1.setForeground(new java.awt.Color(51, 0, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(800, 200, 10, 490);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("SHOW ALL PAYMENT REQUEST");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 170, 290, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("ACCEPT THE PAYMENT");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(890, 170, 210, 30);

        showbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/showbutton2.png"))); // NOI18N
        showbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showbtnMouseClicked(evt);
            }
        });
        getContentPane().add(showbtn);
        showbtn.setBounds(450, 260, 130, 50);

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "RenterID", "FlatID", "Rentfee", "PayDate", "Trxno"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(278, 350, 500, 250);
        getContentPane().add(jDateChooser);
        jDateChooser.setBounds(890, 530, 230, 30);

        useridtext1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        useridtext1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        useridtext1.setOpaque(false);
        useridtext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridtext1ActionPerformed(evt);
            }
        });
        getContentPane().add(useridtext1);
        useridtext1.setBounds(890, 340, 230, 30);

        userid1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userid1.setForeground(new java.awt.Color(102, 102, 102));
        userid1.setText("Renter ID");
        getContentPane().add(userid1);
        userid1.setBounds(890, 320, 70, 17);

        buildingid1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buildingid1.setForeground(new java.awt.Color(102, 102, 102));
        buildingid1.setText("Flat No");
        getContentPane().add(buildingid1);
        buildingid1.setBounds(890, 380, 50, 17);

        trxno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trxnoActionPerformed(evt);
            }
        });
        getContentPane().add(trxno);
        trxno.setBounds(890, 460, 230, 30);

        uppertext2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uppertext2.setForeground(new java.awt.Color(255, 255, 255));
        uppertext2.setText("RENT REQUEST INFORMATION");
        getContentPane().add(uppertext2);
        uppertext2.setBounds(460, 20, 630, 70);

        uppertext3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uppertext3.setForeground(new java.awt.Color(255, 255, 255));
        uppertext3.setText("RENT REQUEST INFORMATION");
        getContentPane().add(uppertext3);
        uppertext3.setBounds(460, 20, 630, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void flatnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flatnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flatnoActionPerformed

    private void rentreqtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentreqtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentreqtextActionPerformed

    private void collectbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collectbtnMouseClicked

        String renterId = useridtext1.getText();
        int renterIdInt =Integer.parseInt(renterId);
        String flatID = flatno.getText();
        int flatIDInt =Integer.parseInt(flatID);
        String ReqID = rentreqtext.getText();
        int ReqIDInt =Integer.parseInt(ReqID);
        String trnx =trxno.getText();
        
        
       try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");
            String query = "insert into CollectRent(RenterID, FlatID, Date, RequestID, Trxno)values(?,?,?,?,?)"  ;  
            
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, renterIdInt);
            pst.setInt(2, flatIDInt);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(jDateChooser.getDate());
            pst.setString(3, date);
            pst.setInt(4, ReqIDInt);
            pst.setString(5, trnx);
                       
            
            String sql = "DELETE FROM PAYRENTREQUEST WHERE RequestID = ?";
            PreparedStatement pst2 = connection.prepareStatement(sql);
            pst2.setInt(1, ReqIDInt);
            
            pst2.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
           
            pst.executeUpdate();
            
            useridtext1.setText("");
            flatno.setText("");
            rentreqtext.setText("");
            trxno.setText("");
            JOptionPane.showMessageDialog(null, "Collected Sucessfully!");
           
            show_data();
            
            
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
          
    }//GEN-LAST:event_collectbtnMouseClicked

    private void showbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showbtnMouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        show_data();
    }//GEN-LAST:event_showbtnMouseClicked

    private void useridtext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridtext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridtext1ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        /*int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        rentreqtext.setText(model.getValueAt(index,0).toString());
        useridtext1.setText(model.getValueAt(index,1).toString());
        flatno.setText(model.getValueAt(index,2).toString());*/
        
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        rentreqtext.setText(model.getValueAt(index,0).toString());
        useridtext1.setText(model.getValueAt(index,1).toString());
        flatno.setText(model.getValueAt(index,2).toString());
        trxno.setText(model.getValueAt(index,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void trxnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trxnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trxnoActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

       this.setVisible(false);
        new Collect_Rent().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Collectinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Collectinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Collectinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Collectinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Collectinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buildingid;
    private javax.swing.JLabel buildingid1;
    private javax.swing.JLabel collectbtn;
    private javax.swing.JLabel cross_btn;
    private javax.swing.JLabel date;
    private javax.swing.JTextField flatno;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField rentreqtext;
    private javax.swing.JLabel showbtn;
    private javax.swing.JLabel sidepannel;
    private javax.swing.JTextField trxno;
    private javax.swing.JLabel upper_panel;
    private javax.swing.JLabel uppertext;
    private javax.swing.JLabel uppertext1;
    private javax.swing.JLabel uppertext2;
    private javax.swing.JLabel uppertext3;
    private javax.swing.JLabel userid;
    private javax.swing.JLabel userid1;
    private javax.swing.JTextField useridtext1;
    // End of variables declaration//GEN-END:variables
}
