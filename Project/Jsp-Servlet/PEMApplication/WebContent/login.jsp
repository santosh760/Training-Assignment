<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
 <head>
  <title>Login Page</title>
  
 <link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/font-awesome.min.css">
<link rel="stylesheet" href="static/css/sticky-footer-navbar.css">
<link rel="stylesheet" href="static/css/bootstrap-grid.css">
<link rel="stylesheet" href="static/css/bootstrap-grid.min.css">
<link rel="stylesheet" href="static/css/bootstrap-reboot.css">
<link rel="stylesheet" href="static/css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="static/css/bootstrap.css">
 </head>
 <body>
 <%@include file="common/header.jsp"%>
 
  <br><br><br><br><br>
  <br><br><br>
<form action="loginUser" method="post">
<center>	
	<fieldset  style="width:400px;background-color: #ffffff;">
		<legend>
			<a id="task">Login Details</a>
		</legend>
		<table>
		<tr>
		<td>Username</td>
		<td><input type="text" name="loginName"></td>
		</tr>
		<tr>
		<td>Password</td>
		<td><input type="password" name="password"></td>
		</tr>
		</table>
		<br><br>
		<input type="submit" value="Login">
	</fieldset>
</center>
</form>

<div align="center">
	<%@include file="common/footer.jsp"%>
	</div>
 </body>
</html>