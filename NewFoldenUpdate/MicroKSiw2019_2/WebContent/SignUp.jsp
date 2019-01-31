<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="persistance.DatabaseManager"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page session="true"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
<link rel="stylesheet" href="bootstrap-4.1.3/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script src="js/jquery-3.2.1.min.js"></script>
<script src="bootstrap-4.1.3//js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/StyleSignUP.css">
<!-- Main navigation -->
</head>
<header>
	<!-- Navbar -->
	<nav
		class="navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar">
		<div class="container">
			<a class="navbar-brand" href="#"> <strong>MicroK</strong>
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent-7"
				aria-controls="navbarSupportedContent-7" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent-7">
				<ul class="navbar-nav mr-auto">

					<li class="nav-item"><a class="nav-link" href="LoginPage.jsp">Login</a></li>
				</ul>

			</div>
		</div>
	</nav>
	<!-- Navbar -->
	<!-- Full Page Intro -->
	<div class="view">

		<!-- Mask & flexbox options-->
		<div class="mask rgba-gradient d-flex justify-content-center align-items-center">
			<!-- Content -->
			<div class="container">
				<!--Grid row-->
				<div class="row mt-5">
					<!--Grid column-->
					<div
						class="col-md-6 mb-5 mt-md-0 mt-5 white-text text-center text-md-left">
						<h1 class="h1-responsive font-weight-bold wow fadeInLeft"
							data-wow-delay="0.3s">Registrati ora!</h1>
						<hr class="hr-light wow fadeInLeft" data-wow-delay="0.3s">
						<h6 class="mb-3 wow fadeInLeft" data-wow-delay="0.3s">Lorem
							ipsum dolor sit amet, consectetur adipisicing elit. Rem
							repellendus quasi fuga nesciunt dolorum nulla magnam veniam
							sapiente, fugiat! Commodi sequi non animi ea dolor molestiae,
							quisquam iste, maiores. Nulla.</h6>
						<a class="btn btn-outline-white wow fadeInLeft"
							data-wow-delay="0.3s">Learn more</a>
					</div>
					<!--Grid column-->
					
					
					<!--Grid column-->

					<div class="col-md-6 col-xl-5 mb-4">
						<!--Form-->
						<form method="POST" id="signup_form_data" name="signup_form_data" action="SignUpServlet">
							<div class="card wow fadeInRight" data-wow-delay="0.3s">
								<div class="card-body">
									<!--Header-->
									<div class="text-center">
										<h3 class="white-text">
											<i class="fa fa-user white-text"></i> Registrazione:
										</h3>
										<hr class="hr-light">
									</div>
									<!--Body-->

									<div class="md-form">
										<label for="form1" class="active">Il tuo Nome</label> <i
											class="fa fa-user prefix white-text active"></i> <input
											type="text" id="nome" name="nome" class="white-text form-control" required>

									</div>
									<div class="md-form">
										<label for="form2" class="active">Il tuo Cognome</label> <i
											class="fa fa-user prefix white-text active"></i> <input
											type="text" id="cognome" name="cognome" class="white-text form-control" required>

									</div>
									
									<div class="md-form">
										<label for="form5">Nickname</label> <i
											class="fa fa-lock prefix white-text active"></i> <input
											type="text" id="nickname" name="nickname" class="white-text form-control" required>

									</div>
									<div class="md-form">
										<label for="form3" class="active">La tua email</label> <i
											class="fa fa-envelope prefix white-text active"></i> <input
											type="text" id="email" name="email" class="white-text form-control" required>

									</div>
									<div class="md-form">
										<label for="form4">La tua password</label> <i
											class="fa fa-lock prefix white-text active"></i> <input
											type="password" id="password" name="password" class="white-text form-control" required>

									</div>
										<div class="md-form">
										<label for="form4">Conferma la tua password</label> <i
											class="fa fa-lock prefix white-text active"></i> <input
											type="password" id="conferma" name="conferma" class="white-text form-control" required>

									</div>
									<div class="md-form">
										<label for="form5">Indirizzo</label> <i
											class="fa fa-lock prefix white-text active"></i> <input
											type="text" id="indirizzo" name="indirizzo" class="white-text form-control" required >

									</div>
									

								
								<div class="text-center mt-4">
									<button class="btn btn-block btn-primary" id="signup_btn">Registrati</button>
									<hr class="hr-light mb-3 mt-4">
									<div
										class="inline-ul text-center d-flex justify-content-center">
										<a class="p-2 m-2 tw-ic"> <i
											class="fa fa-twitter white-text"></i>
										</a> <a class="p-2 m-2 li-ic"> <i
											class="fa fa-linkedin white-text"> </i>
										</a> <a class="p-2 m-2 ins-ic"> <i
											class="fa fa-instagram white-text"> </i>
										</a>
									</div>
								</div>
							</div>
						</div>
							
						</form>
					</div>



					<!--/.Form-->
				</div>
				<!--Grid column-->
			</div>
			<!--Grid row-->
		</div>
		<!-- Content -->
	</div>
	<!-- Mask & flexbox options-->
	<!-- Full Page Intro -->
</header>
<!-- Main navigation -->
</body>
</html>