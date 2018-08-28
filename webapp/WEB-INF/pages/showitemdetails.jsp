
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<br>
	<br>
	<br>
	<h3>Item Details</h3>
	<hr>

	<a class="d-block mb-4 h-100" > <img class="img-fluid img-thumbnail"
		src=${message3 }  width="400" height="300" alt="Cannot display image"
		alt="">
	</a>
	<p>Description: </p>${message2}
	<br><br>
	
	<p>Price: </p>${message1}
	
	<p>${prod}</p>
	
	<f:form action="/cart" method="POST" modelAttribute="prod">
	<f:button class="btn btn-primary">Add To Cart</f:button>
		</f:form>

</body>
</html>