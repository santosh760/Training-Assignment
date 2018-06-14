<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Category</title>

<meta charset="UTF-8">
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
</head>
<body>
<%@include file="./common/header.jsp"%>

<div class="container-login100" style="background-image: url('./static/images/bg-01.jpg');">
<div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
<center><a style="color: red">${msg}</a></center>
			<form class="login100-form validate-form" action="./addCategoryDetails.htm" method="post">
				<span class="login100-form-title p-b-37">
					Enter Category Detail
				</span>

				<div class="wrap-input100 validate-input m-b-20">
					<input class="input100" type="text" name="categoryName" placeholder="Category name">
					<span class="focus-input100"></span>
				</div>

				<div class="container-login100-form-btn">
					<button class="login100-form-btn">
						Add
					</button>
				</div>
			</form>
			</div>
</div>

<%@include file="./common/footer.jsp"%>
</body>
</html>