<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"http://www.w3.org/TR/html4/loose.dtd">
<%@page import="util.DBConnection"%>
<html>
<head>
<title>View Example</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<%@page import="java.sql.*"
%>
<style>
body{
  background: url(images/multi.jpg) no-repeat;
  background-size: 100%;
}
</style>
</head>

<body>
<br/>
<br/>
<br/>
<br/>

<div id="container">
<div align="center">
<h1>View Status</h1>
</div>
</div>
<br/>
<br/>
<br/>
<br/>
<br/>

 <table class="table table-dark">
 <thead class="text-success">
<tr>
<td>firstname</td>  
<td>Refferal_Id</td>
<td>status</td>

</tr>
</thead>
<%
try
{

String query="select firstname,Refferal_Id,status from UserApply where Refferal_Id=? ";
Connection con=DBConnection.createConnection();
PreparedStatement p=con.prepareStatement(query);
int ref = Integer.parseInt(request.getParameter("Refferal_Id"));
p.setInt(1, ref);

ResultSet rs=p.executeQuery(query);
while(rs.next())
{
%>
<tbody>
    <tr>
    <td><%=rs.getString("firstname")%></td>    
    <td><%=rs.getString("Refferal_Id")%></td>
    <td><%=rs.getString("status")%></td>
    
    
    </tr>
 <%
 
}
%>
 </tbody>
    </table>
    <%
    rs.close();
    p.close();
    con.close();
}
catch(Exception e)
{
    e.printStackTrace();
}
%>
</body>

</html>
