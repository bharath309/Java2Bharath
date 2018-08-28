<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Welcome</title>
<style>
/* div.fixed {
	position: fixed;
	width: 100%;
	bottom: 40px;
} */

body {
	background: url(https://www.j-26.com/assets/resized/shopping-cart.png);
	background-size: 100%;
	background-repeat: no-repeat;
	width: 100%;
}
</style>
</head>
<body style="background-color: gray;">
	<div class="container">
		<br> <br>



		<h1 align="center">Welcome to Online Cart</h1>
		<c:set var="contextPath" value="${pageContext.request.contextPath}" />




		<div class="container-fluid">
			<div class="col-sm-12 text-center">
				<a href="${contextPath}/register" class="btn btn-danger"
					role="button">Register </a> <a href="${contextPath}/login"
					class="btn btn-danger" role="button">Login </a>
			</div>
		</div>
	</div>

	<div class=container-fluid>
		<img class="img-responsive"
			src="https://api.sonymobile.com/files/xperia-z3-tablet-compact-white-1240x840-1556bceab800f0619eadd9024f509f1a.jpg"
			height="400" width="400" alt="un12able to find image" />



	</div>

</body>
</html>