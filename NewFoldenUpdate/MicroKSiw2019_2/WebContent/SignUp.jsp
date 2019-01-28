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
<title>Insert title here</title>
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

					<li class="nav-item">
					<a class="nav-link" href="LoginPage.jsp">Login</a></li>
				</ul>

			</div>
		</div>
	</nav>
	<!-- Navbar -->
	<!-- Full Page Intro -->
	<div class="view"
		style="background-image: url('http://mdbootstrap.com/img/Photos/Others/images/91.jpg'); background-repeat: no-repeat; background-size: cover; background-position: center center;">
		<!-- Mask & flexbox options-->
		<div
			class="mask rgba-gradient d-flex justify-content-center align-items-center">
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
									<i class="fa fa-user prefix white-text active"></i> <input
										type="text" id="form3" class="white-text form-control">
									<label for="form3" class="active">Il tuo Nome</label>
								</div>
								<div class="md-form">
									<i class="fa fa-user prefix white-text active"></i> <input
										type="text" id="form3" class="white-text form-control">
									<label for="form3" class="active">Il tuo Cognome</label>
								</div>
								<div class="md-form">
									<i class="fa fa-envelope prefix white-text active"></i> <input
										type="email" id="form2" class="white-text form-control">
									<label for="form2" class="active">La tua email</label>
								</div>
								<div class="md-form">
									<i class="fa fa-lock prefix white-text active"></i> <input
										type="password" id="form4" class="white-text form-control">
									<label for="form4">La tua password</label>
								</div>
								<div class="md-form">
									<i class="fa fa-lock prefix white-text active"></i> <input
										type="indirizzo" id="form4" class="white-text form-control">
									<label for="form4">Indirizzo</label>
								</div>
							
						
							<label class=myLabel for="form2">Data di Nascita</label>
							<div class="col-xs-8">
							<div  class="form-inline">
								<div class="col-xs-4 col-md-4">
									<select name="dd" class="form-control">
										<option value="">Giorno</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
										<option value="6">6</option>
										<option value="7">7</option>
										<option value="8">8</option>
										<option value="9">9</option>
										<option value="10">10</option>
										<option value="11">11</option>
										<option value="12">12</option>
										<option value="13">13</option>
										<option value="14">14</option>
										<option value="15">15</option>
										<option value="16">16</option>
										<option value="17">17</option>
										<option value="18">18</option>
										<option value="19">19</option>
										<option value="20">20</option>
										<option value="21">21</option>
										<option value="22">22</option>
										<option value="23">23</option>
										<option value="24">24</option>
										<option value="25">25</option>
										<option value="26">26</option>
										<option value="27">27</option>
										<option value="28">28</option>
										<option value="29">29</option>
										<option value="30">30</option>
										<option value="31">31</option>
									</select>
								</div>
								<div class="col-xs-4 col-md-4">
									<select name="mese" class="form-control">
										<option value="">Mese</option>
										<option value="1">Jan</option>
										<option value="2">Feb</option>
										<option value="3">Mar</option>
										<option value="4">Apr</option>
										<option value="5">May</option>
										<option value="6">Jun</option>
										<option value="7">Jul</option>
										<option value="8">Aug</option>
										<option value="9">Sep</option>
										<option value="10">Oct</option>
										<option value="11">Nov</option>
										<option value="12">Dec</option>
										
									</select>
								</div>

								<div class="col-xs-4 col-md-4">
									<select name="anno" class="form-control">
										<option value="">Anno</option>
										<option value="1955">1955</option>
										<option value="1956">1956</option>
										<option value="1957">1957</option>
										<option value="1958">1958</option>
										<option value="1959">1959</option>
										<option value="1960">1960</option>
										<option value="1961">1961</option>
										<option value="1962">1962</option>
										<option value="1963">1963</option>
										<option value="1964">1964</option>
										<option value="1965">1965</option>
										<option value="1966">1966</option>
										<option value="1967">1967</option>
										<option value="1968">1968</option>
										<option value="1969">1969</option>
										<option value="1970">1970</option>
										<option value="1971">1971</option>
										<option value="1972">1972</option>
										<option value="1973">1973</option>
										<option value="1974">1974</option>
										<option value="1975">1975</option>
										<option value="1976">1976</option>
										<option value="1977">1977</option>
										<option value="1978">1978</option>
										<option value="1979">1979</option>
										<option value="1980">1980</option>
										<option value="1981">1981</option>
										<option value="1982">1982</option>
										<option value="1983">1983</option>
										<option value="1984">1984</option>
										<option value="1985">1985</option>
										<option value="1986">1986</option>
										<option value="1987">1987</option>
										<option value="1988">1988</option>
										<option value="1989">1989</option>
										<option value="1990">1990</option>
										<option value="1991">1991</option>
										<option value="1992">1992</option>
										<option value="1993">1993</option>
										<option value="1994">1994</option>
										<option value="1995">1995</option>
										<option value="1996">1996</option>
										<option value="1997">1997</option>
										<option value="1998">1998</option>
										<option value="1999">1999</option>
										<option value="2000">2000</option>
										<option value="2001">2001</option>
										<option value="2002">2002</option>
										<option value="2003">2003</option>
										<option value="2004">2004</option>
										<option value="2005">2005</option>
										<option value="2006">2006</option>
									</select>
								</div>
							</div>
							 </div>
							 </div>
							<div class="text-center mt-4">
								<button class="btn btn-indigo ">Registrati</button>
								<hr class="hr-light mb-3 mt-4">
								<div class="inline-ul text-center d-flex justify-content-center">
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
					
					
					<!--/.Form-->
				</div>
				<!--Grid column-->
			</div>
			<!--Grid row-->
		</div>
		<!-- Content -->
	</div>
	<!-- Mask & flexbox options-->
	</div>
	<!-- Full Page Intro -->
</header>
<!-- Main navigation -->
</body>
</html>