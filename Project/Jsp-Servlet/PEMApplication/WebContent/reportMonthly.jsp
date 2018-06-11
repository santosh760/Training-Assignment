<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Monthly Report</title>

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
<h2>Monthly Expense Report</h2>
<div class = "col-md-12" style = "overflow-x: auto">  
	
	<table border="1"  cellpadding="5">
	
	
                            <tr style="color: red;">
                                <th>Monthly(yyyy-MM)</th>
                                <th>Amount</th>                              
                            </tr>
                    <c:forEach items="${map}" var="listMap">
                    	<tr>
                   
                                    <td><c:out value="${listMap.key}"></c:out></td>
                                    <td><c:out value="${listMap.value}"></c:out></td>
                        </tr>
                    </c:forEach>
                    </table>
                    </div>
                    </div>
<div align="center">
<%@include file="common/footer.jsp"%>
</div>
</body>
</html>