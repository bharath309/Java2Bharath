<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="jquery/jquery.js"></script>
<script type="text/javascript" src='js/bootstrap.min.js'></script>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
	<div class="table-responsive table-hover">
		<table class="table">
			<tr>
				<td  colspan="2"
					style="background-color: Azure; border: thick; font: bold;">
					<tiles:insertAttribute name="header" />
			    </td>
			    
			</tr>
			
			
			<tr>
			 <td><tiles:insertAttribute name="menu"/></td>
			 
				<td  
					style="background-color: lightblue; border: thick; font: bold;">
					<%--  <tiles:insertAttribute name="title" /><br>--%>
					 <tiles:insertAttribute name="body" />
				</td>
			</tr>
			
			<tr>
				<td  colspan="2"
					style="background-color: Azure; border: thick; font: bold;"><tiles:insertAttribute
						name="footer" /></td>
			</tr>
		</table>
	</div>
</body>
</html>