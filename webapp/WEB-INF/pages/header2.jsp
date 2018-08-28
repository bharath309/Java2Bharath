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

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="${contextPath}/onlinestore">ONLINE CART</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="${contextPath}/onlinestore">Home</a></li>
					<li><a href="${contextPath}/about">About</a></li>
					<li><a href="${contextPath}/contact">ContactUs</a></li>
					
						
					
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="${contextPath}/onlinestore/cart"><span class="glyphicon glyphicon-shopping-cart"></span>
							Cart</a></li>
					<li><a href="${contextPath}/onlinestore/logout"><span class="glyphicon glyphicon-off"></span>
							Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>


</body>
</html>