package Home;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class AdminRegistration {
    
public void adRegister(String F_name,String L_name,String email,String Pass){
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");





String sql = "Insert into ADMIN"
                    +"(FirstName,LastName,Email,AdminPassword)"
                    +"values(?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, F_name);
            pst.setString(2, L_name);
            pst.setString(3,email);
            pst.setString(4, Pass);
          
            pst.executeUpdate();



} catch (Exception e) {
e.printStackTrace();
}
}









public void GURegister(String F_name,String L_name,String email,String Pass){
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");





String sql = "Insert into GUSER"
                    +"(FirstName,LastName,Email,UserPassword)"
                    +"values(?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, F_name);
            pst.setString(2, L_name);
            pst.setString(3,email);
            pst.setString(4, Pass);
          
            pst.executeUpdate();



} catch (Exception e) {
e.printStackTrace();
}
}





    
}
