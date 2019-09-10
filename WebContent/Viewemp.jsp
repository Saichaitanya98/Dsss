<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"                                                    "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="util.DBConnection"%>
<html>
<head>
<title></title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
<%@page import="java.sql.*"
%>
<%@page import= "java.io.PrintWriter"
%>
</head>

<body>

<div id="container">

<b>Success</b>
</div>



<b>Refferal_Id Is</b>

<%
try
{
	PrintWriter pw= response.getWriter();
String email=request.getParameter("email");
	String query="select Refferal_Id from Reg where email=?";
	Connection con=DBConnection.createConnection();
	PreparedStatement stmt=con.prepareStatement(query);
	stmt.setString(1, email);
	ResultSet rs= stmt.executeQuery();
while(rs.next())
{



    pw.println(rs.getString("Refferal_Id"));

 


 
}


 

    rs.close();
    stmt.close();
    con.close();
}
catch(Exception e)
{
    e.printStackTrace();
}
%>
 

</body>

</html>