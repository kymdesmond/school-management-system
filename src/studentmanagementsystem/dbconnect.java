package studentmanagementsystem;
import java.sql.*;
import javax.swing.*;
public class dbconnect {
        Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","kimutai2014");
            return conn;
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
}  
}
}
