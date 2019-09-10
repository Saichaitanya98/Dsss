<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>

html,body {font-family: Arial, Helvetica, sans-serif;
background-image: url("img3.jpg");
background-position:center;
color:white;
background-size: cover;
overflow-x: hidden;
height:100vh;

}


.btn {
 display: inline-block;
 padding: 10px 120px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
 background-color:rgb(30, 30, 30);
  outline: none;
  color:#f0f0f0;
  width: 400px;
  padding: 15px;
  border-radius: 50px;
  
}
.center {
  padding:150px ;
  height:50px;
  

</style>
</head>
<body>
<div class="center" align="center">
<form action="UserApply.jsp">
<button type="submit" class="btn"><b>Apply</b></button>
</form>
</div>


<div class="center1" align="center">
<form action="Status.jsp">
 <button type="submit" class="btn"><b>ViewStatus</b></button>
 

</div>


</form>
</body>
</html>