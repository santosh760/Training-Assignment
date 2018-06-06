<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
 <head>
  <title>User Registration Page</title>

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
 <br><br><br>
 <%out.print(request.getAttribute("msg")); %>
 <br><br><br>
 <div>
 
<center>
		<fieldset style="width:600px">
			<legend><h3>User Registration FORM</h3></legend>
			<form action="RegisterUser" method="post">
				<table>
					<tr>
						<td>First Name -</td>
						<td><input type="text" name="firstName"></td>
					</tr>
					<tr>
						<td>Last Name -</td>
						<td><input type="text" name="lastName"></td>
					</tr>
					<tr>
						<td>Login Name -</td>
						<td><input type="text" name="loginName"></td>
					</tr>
					<tr>
						<td>Password -</td>
						<td><input type="password" name="password"></td>
					</tr>
					</table>
				
				<br><br><button type="submit" value="Submit">Register User</button>
				</form>
		</fieldset>
	</center>
	</div>
	
<div align="center">
	<%@include file="common/footer.jsp"%>
	</div>
	
 </body>
</html>