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
background-image: url("b1.jpg");
background-position:center;
color:white;
background-size: cover;
overflow-x: hidden;
height:100vh;

}

  h2{
  color: white;
  }
* {box-sizing: border-box;}

.input-container {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  width: 30%;
  height:10%;
  margin-bottom: 10px;
}



.input-field {
  width: 30%;
  height: 10%;
  padding: 15px;
  outline: none;
}

<!--.input-field:focus {
  border: 2px solid dodgerblue;
}-->

/* Set a style for the submit button */
.btn {
   border: none;
  color: black;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 20px;
  
}

<!--.btn:hover {
  opacity: 1;
}-->



h1{
padding-top: 15%;
 }
</style>




</head>
<body>
<div class="refid" align="center">
<form  method="get" action="refid.jsp"/>

<h1><b><font color="FFF8C6" size="25" />View status</font></b></h1><br><br>

<h2>Enter ReferenceId</h2><br><br>
 <input class="input-field" type="text" placeholder="refid" name="refid"><br><br><br>
 <button type="submit" class="btn"><b>submit<b></b></button><br><br>
 
</form>
</body>
</html>