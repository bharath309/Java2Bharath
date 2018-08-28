<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background-color: gray;">
	<div class="container bg-info text-black">
		<br> <br>
		<h1 align="center">Register</h1>
		<f:form action="/register" method="Post" modelAttribute="lc">
		<div class="form-group">
       <label for="fistname">First Name:</label>
       <f:input  class="form-control" id="fistname" path="firstname"></f:input>
     </div>
     <div class="form-group">
       <label for="lastname">Last Name:</label>
       <f:input  class="form-control" id="lastname" path="lastname"></f:input>
     </div>
     <div class="form-group">
       <label for="email">Email/User ID:</label>
       <f:input  class="form-control" id="email" path="email"></f:input>
     </div>
     <div class="form-group">
       <label for="password">Password:</label>
       <f:input type="password" class="form-control" id="password" path="password"></f:input>
     </div>
		<%-- First Name:
		<f:input path="firstname" />
			<br>
			<br>
			Last Name:
			<f:input path="lastname" />
			<br>
			<br>
			Email/User Id:
			<f:input path="email" />
			<br>
			<br>
		Password:
		<f:input path="password" type="password" />
			<br>
			<br> --%>
			<f:button class="btn btn-primary">Submit</f:button>
		</f:form>
		<br> <br>
	</div>

</body>
</html>
