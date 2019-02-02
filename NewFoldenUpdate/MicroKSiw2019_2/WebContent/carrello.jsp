<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

		<meta name="viewport" content="width=device-width">
		 <!-- <link rel="stylesheet" type="text/css" href="carrello_assets/css/bootstrap.min.css"/>  -->
		 <link rel="stylesheet" type="text/css" href="carrello_assets/css/custom.css"/>	


<meta charset="utf-8">
<meta name="viewport"content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Simple Sidebar - Start Bootstrap Template</title>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="bootstrap-4.1.3//js/bootstrap.min.js"></script>
<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
   <link  href="css/searchbar.css" rel="stylesheet" type="text/css">
<link href="css/simple-sidebar.css" rel="stylesheet">

</head>
<body>
	<!-- inizio navbar -->
	<div class="row">
<nav class="navbar navbar-light bg-light fixed-top">
  <a class="scritta navbar-brand">Navbar</a>
	<div class="container">
		<form class="form-inline m-auto">
			<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"> 
			<button class="btn btn-outline-success my-20 my-sm-10" type="submit">Search</button>
		</form>
		<form>
			<div class="pull-left">
				<ul class="nav navbar-nav">
					<li><button type="submit" class="btn navbar-btn btn-danger" name="logout" id="logout"  value="Log Out">Log Out</button></li>
				</ul>
			</div>
		</form>
	</div>
</nav>
	</div>
	<!-- fine navbar -->

	
	<div id="wrapper" class="toggled">
				<!-- Sidebar -->
				<div id="sidebar-wrapper">
					<ul class="sidebar-nav">
						<li class="sidebar-brand"><a href="#">Home</a></li>
						<li><a href="#">Biografia</a></li>
						<li><a href="#">Album</a></li>
						<li><a href="#">Eventi</a></li>
					</ul>
				</div>
				<!-- /#sidebar-wrapper -->
		
				<!-- Page Content -->
		<div id="page-content-wrapper">
		<div class="container text-center">

			<div class="col-md-5 col-sm-12">
				<div class="bigcart"></div>
				<h1>Your shopping cart</h1>
				<p>
					This is a free and <b><a href="http://tutorialzine.com/2014/04/responsive-shopping-cart-layout-twitter-bootstrap-3/" title="Read the article!">responsive shopping cart layout, made by Tutorialzine</a></b>. It looks nice on both desktop and mobile browsers. Try it by resizing your window (or opening it on your smartphone and pc).
				</p>
			</div>
			
			<div class="col-md-12 col-sm-12 text-left">
				<ul>
					<li class="row list-inline columnCaptions">
						<form class="form-inline m-6"> <span>QTY</span> </form>
						<form class="form-inline m-auto"><span>ITEM</span></form>
						<form class="form-inline m-auto"><span>Price</span></form>
					</li>
				
					<li class="row">
						<form class="form-inline m-5"><span class="quantity">1</span><span class="itemName">Birthday Cake</span></form>
						<form class="form-inline m-auto"><span class="popbtn"><a class="arrow"></a></span></form>
						<form class="form-inline m-auto"><span class="price">$49.95</span></form>
					</li>
				
					<li class="row">
						<form class="form-inline m-5"><span class="quantity">1</span><span class="itemName">Bsdkjv dldsk nlskde</span></form>
						<form class="form-inline m-auto"><span class="popbtn"><a class="arrow"></a></span></form>
						<form class="form-inline m-auto"><span class="price">$49.95</span></form>
					</li>
					
					<li class="row">
						<form class="form-inline m-5"><span class="quantity">1</span><span class="itemName">f</span></form>
						<form class="form-inline m-auto"><span class="popbtn"><a class="arrow"></a></span></form>
						<form class="form-inline m-auto"><span class="price">$49.95</span></form>
					</li>
					
					<li class="row">
						<form class="form-inline m-5"><span class="quantity">1</span><span class="itemName">Birthday Cake</span></form>
						<form class="form-inline m-auto"><span class="popbtn"><a class="arrow"></a></span></form>
						<form class="form-inline m-auto"><span class="price">$49.95</span></form>
					</li>
				</ul>
			</div>

		<!-- The popover content -->

		<div id="popover" style="display: none">
			<a href="#"><span class="glyphicon glyphicon-pencil"></span></a>
			<a href="#"><span class="glyphicon glyphicon-remove"></span></a>
		</div>
		
		</div>
		<!-- /#page-content-wrapper -->
	</div>
	<!-- /#wrapper -->

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
		<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script> 
		<script src="carrello_assets/js/bootstrap.min.js"></script>
		<script src="carrello_assets/js/customjs.js"></script>

</html>