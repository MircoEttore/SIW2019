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


<link rel="stylesheet" href="bootstrap-4.1.3/css/bootstrap.min.css"	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="js/jquery-3.2.1.min.js"></script>
<script src="bootstrap-4.1.3//js/bootstrap.min.js"></script>

<!--Fontawesome CDN-->
<link rel="stylesheet"
	href="fontawesome-free-5.3.1-web/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/Style.css">
</head>
<body>


<form method="POST" class="form-horizontal" action="Singup">
	<div class="input-group form-group">
		<div class="input-group-prepend">
			<span class="input-group-text"><i class="fas fa-user"></i></span>
		</div>
		<input  class="form-control" name="nome" type="text" placeholder="nome">
	</div>
	
	<div class="input-group form-group">
		<div class="input-group-prepend">
			<span class="input-group-text"><i class="fas fa-user"></i></span>
		</div>
		<input  class="form-control" name="cognome" type="text" placeholder="cognome">
	</div>
		<div class="input-group form-group">
		<div class="input-group-prepend">
			<span class="input-group-text"><i class="fas fa-user"></i></span>
		</div>
		<input  class="form-control" name="email" type="text" placeholder="email">
	</div>
	
	<div class="input-group form-group">
		<div class="input-group-prepend">
			<span class="input-group-text"><i class="fas fa-user"></i></span>
		</div>
		<input  class="form-control" name="password" type="text" placeholder="password">
	</div>
	
	<div class="input-group form-group">
		<div class="input-group-prepend">
			<span class="input-group-text"><i class="fas fa-user"></i></span>
		</div>
		<input  class="form-control" name="indirizzo" type="text" placeholder="indirizzo">
	</div>	
	
	<div class="input-group form-group">
		<div class="input-group-prepend">
			<span class="input-group-text"><i class="fas fa-user"></i></span>
		</div>
		<input  class="form-control" name="nickname" type="text" placeholder="nickname">
	</div>	
	
	<div class="form-group">
		<input type="submit" value="Login"
			class="btn float-right login_btn">
	</div>	

	
</form>

</body>
</html>