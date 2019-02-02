<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
<link href="bootstrap-4.1.3/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>


<div class="searchbar">
<nav class="navbar navbar-light bg-light fixed-top">
  <a class="scritta navbar-brand , form-inline md-3">Navbar</a>
	<div class="container">
		<form class="form-inline md-3"><input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"> <button class="btn btn-outline-success my-20 my-sm-10" type="submit">Search</button></form>
		<form><div class="form-inline md-3"><ul class="nav navbar-nav , form-inline md-3"><li><button type="submit" class="btn navbar-btn btn-danger" name="logout" id="logout"  value="Log Out">Log Out</button></li></ul></div></form>
	</div>
	</nav>
</div>
	
	
	<div class="risultatoArtista">
		<div class="row">Risultato</div>
	</div>
	
	
	<div class="risultatoCanzone"></div>
	<div class="risultatoAlbum"></div>
	
	


</body>
</html>