<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Expense</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<s:url var="url_bootstrap" value="/static/css/bootstrap.css" />	
<s:url var="url_bootstrap_min" value="/static/css/bootstrap.min.css" />
<s:url var="url_font" value="/static/css/font-awesome.css" />
<s:url var="url_font_awesome" value="/static/css/style.css" />
<s:url var="url_footer" value="/static/css/sticky-footer-navbar.css"/>
<s:url var="url_main" value="/static/css/main.css"/>
<s:url var="url_util" value="/static/css/util.css"/>
<s:url var="url_bootstrap_reboot" value="/static/css/bootstrap-reboot.css"/>
<s:url var="url_bootstrap_reboot_min" value="/static/css/bootstrap-reboot.min.css"/>
<s:url var="url_bootstrap_grid" value="/static/css/bootstrap-grid.css"/>
<s:url var="url_bootstrap_grid_min" value="/static/css/bootstrap-grid.min.css"/>
<s:url var="url_icon" value="/static/css/bootstrap-grid.css"/>

<link href="${url_bootstrap_grid}" type="text/css" rel="stylesheet">
<link href="${url_bootstrap_grid_min}" type="text/css" rel="stylesheet">
<link href="${url_bootstrap_reboot_min}" type="text/css" rel="stylesheet">
<link href="${url_bootstrap_reboot}" type="text/css" rel="stylesheet">
<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${url_bootstrap_min}" type="text/css" rel="stylesheet">
<link href="${url_font}" type="text/css" rel="stylesheet">
<link href="${url_font_awesome}" type="text/css" media="all"  rel="stylesheet">
<link href="${url_footer}" type="text/css" rel="stylesheet">
<link href="${url_main}" type="text/css" rel="stylesheet">
<link href="${url_util}" type="text/css" rel="stylesheet">

<style type="text/css">
.trList:hover{
background-color: #ffff99;
}
</style>
</head>
<body>
<%@include file="./common/header.jsp"%>

<div class="container-login100" style="background-image: url('./static/images/bg-01.jpg');">
<div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30" style="width: 50%;">
<center><a style="color: red">${msg}</a></center>
				<form class="login100-form validate-form" action="#" method="post">
				<span class="login100-form-title p-b-37">
					List of Expense
				</span>
				
				<table style="width: 100%;background-color: aqua" cellpadding="10" class="wrap-input100 validate-input m-b-25">
	
	
                            <tr style="color: red;text-align: center;">
                                <th>Category Name</th>
                                <th>Amount</th>
                                <th>Date</th>
                                <th>Remark</th>                           
                            </tr>
                    <c:forEach items="${list}" var="expList">
                    	<tr style="text-align: center;" class="trList">
                   
                                    <td><c:out value="${expList.key}"></c:out></td>
                                    <td><c:out value="${expList.value.amount}"></c:out></td>
                                    <td><c:out value="${expList.value.date}"></c:out></td>
                                      <td><c:out value="${expList.value.remark}"></c:out></td>
                                    <td>
                                    <div class="container-login100-form-btn" style="padding-bottom: 5px;padding-top: 5px">
									<a href="./deleteExpense.htm?expId=${expList.value.expenseId}" class="login100-form-btn" >
									Delete
									</a>
									</div>
                                    </td>
                        </tr>
                    </c:forEach>
                    </table>
                    </form>
			</div>
			</div>
<br><br><br>
<div>
<%@include file="./common/footer.jsp"%>
</div>
</body>
</html>