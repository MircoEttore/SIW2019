<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Simple Sidebar - Start Bootstrap Template</title>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="bootstrap-4.1.3//js/bootstrap.min.js"></script>
<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/simple-sidebar.css" rel="stylesheet">
</head>
<body>
	<!-- inizio navbar -->
		<nav class="navbar navbar-light bg-dark">
		  <a class="navbar-brand">Navbar</a>
			<div class="container">
				<form class="form-inline  m-auto">
				<input class="form-control mr-sm-2 " type="search" placeholder="Search" aria-label="Search"> 
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
			</div>
		</nav>
 

	<!-- fine navbar -->
	<div id="wrapper" class="toggled">
		<!-- Sidebar -->
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li class="sidebar-brand"><a href="#">Start Bootstrap</a></li>
				<li><a href="#">Profilo</a></li>
				<li><a href="#">Libreria</a></li>
			</ul>
		</div>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">
			<div class="container-fluid">
				<h1>Simple Sidebar</h1>
				<p>This template has a responsive menu toggling system. The menu
					will appear collapsed on smaller screens, and will appear
					non-collapsed on larger screens. When toggled using the button
					below, the menu will appear/disappear. On small screens, the page
					content will be pushed off canvas.</p>
				<p>
					Make sure to keep all page content within the
					<code>#page-content-wrapper</code>
					.
				</p>
			</div>
		</div>
		<!-- /#page-content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>