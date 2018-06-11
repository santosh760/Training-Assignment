<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Expense</title>

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
<br><br><br><br><br>
<div align="center">
<h2>List of Category</h2>
<div class = "col-md-12" style = "overflow-x: auto">  
	
	<table border="1"  cellpadding="5">
	
	
                            <tr style="color: red;">
                                <th>ID</th>
                                <th>Name</th>                                
                            </tr>
                    <c:forEach items="${catList}" var="catList">
                    	<tr>
                   
                                    <td><c:out value="${catList.categoryId}"></c:out></td>
                                    <td><c:out value="${catList.name}"></c:out></td>
                        </tr>
                    </c:forEach>
                    </table>
                    </div>
                    </div>
  <br><br>
  <center>
		<fieldset style="width:600px">
			<legend><h3>Add Expense Form</h3></legend>
			<form action="AddExpense" method="post">
				<table>
					<tr>
						<td>Enter Category ID From Above List -</td>
						<td><input type="text" name="categoryId"></td>
					</tr>
					<tr>
						<td>Enter Amount -</td>
						<td><input type="text" name="amount"></td>
					</tr>
					<tr>
						<td>Date -</td>
						<td><input type="date" name="date"></td>
					</tr>
					<tr>
						<td>Remark -</td>
						<td><input type="text" name="remark"></td>
					</tr>
					</table>
				
				<br><br><button type="submit" value="Submit">Add Expense</button>
				</form>
		</fieldset>
	</center>


<div align="center">
<%@include file="common/footer.jsp"%>
</body>
</html>