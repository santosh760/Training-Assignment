<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,java.util.Map,java.util.TreeMap, com.santosh.pem.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report Category Wise</title>

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
<h2>Report Category Wise</h2>
<div class = "col-md-12" style = "overflow-x: auto">  
	
	<table border="1"  cellpadding="5">
	
	
                            <tr style="color: red;">
                                <th>Category ID</th>
                                <th>Amount</th>                              
                            </tr>
                    <c:forEach items="${categoryWiseMap}" var="categoryWiseMap">
                    	<tr>
                   
                                    <td><c:out value="${categoryWiseMap}"></c:out></td>
                                    <td><c:out value="${categoryWiseMap}"></c:out></td>
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