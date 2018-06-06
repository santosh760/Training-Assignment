<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>

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
 <%@include file="common/menu.jsp"%>
 
 <main role="main" class="container">
      <h1 class="mt-5">Welcome <%out.print(session.getAttribute("userName")); %></h1>
      <p class="lead">PEM(Personal Expense Manager),Now you can keep track of your expense 
      by monthly,yearly and category wise.  
       </p>
    </main>
 
 
 
 <div align="center">
	<%@include file="common/footer.jsp"%>
	</div>
</body>
</html>