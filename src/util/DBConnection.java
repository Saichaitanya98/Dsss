package util;
 
import java.sql.*;
 
public class DBConnection {
 
 public static  Connection createConnection() 
 {
	 Connection con=null;
	try{  
		 Class.forName("com.mysql.jdbc.Driver");  
		  con=DriverManager.getConnection(  
		 "jdbc:mysql://localhost:3306/sai","root","pass"); 
	}
 catch (Exception e) 
 {
 e.printStackTrace();
 }
 
 return con; 
 }
}