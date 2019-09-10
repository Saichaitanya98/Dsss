package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.AdimBean;
import bean.AdminBean;
import bean.LoginBean;
import util.DBConnection;

public class AdminDao {
	public String preetam(AdminBean adminbean)
	 {
	 String Username = adminbean.getUsername();
	 String Password = adminbean.getPassword();
	 Connection con = null;
	 PreparedStatement preparedStatement = null;
	 try
	 {
	 con = DBConnection.createConnection();
	 String query = "select * from Userapply where Username=? and Password=?";
	 preparedStatement = con.prepareStatement(query); 
	 preparedStatement.setString(1, Username);
	 preparedStatement.setString(2, Password);
	 int i= preparedStatement.executeUpdate();
	 
	 if ( Username == "mahitha" && Password == "mahitha123"	) {
		 return "mahitha"; 
	 }
	  else if( Username == "chandana" && Password == "chandana123"	)
	 {
		 return "chandana";
	 }
	  else if( Username == "nagaraj" && Password == "nagaraj123") {
			 return "nagaraj";

	  }
	  else {
		  return "failed";
	  }
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }

	 return "hi";
}

}
