<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="persistance.DatabaseManager"%>
<%@page import="model.Canzone"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page session="true"%>





<link href="css/search.css" rel="stylesheet">

<!DOCTYPE html>
<html>
<head>
<title>Awesome Search Box</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">
</head>
<body>
	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<form action="search" method="post" class="searchForm">
				<div class="searchbar">
					<input class="search_input" type="text" name="search"
						placeholder="Search..."> <a href="Search.jsp"
						class="search_icon"><i class="fas fa-search"></i></a>
				</div>
			</form>

		</div>
	</div>
	<div class="col-sm-9 padding-right">
		<div class="features_items">
			<!--features_items-->
			<h2 class="title text-center">Search Results</h2>

			<%
				String searchQuery = (String) request.getAttribute("search");
				String searchProducer = (String) request.getAttribute("producer");
				String searchCategory = (String) request.getAttribute("category");

				List<Canzone> completeItems = new ArrayList<Canzone>();

				if (searchQuery != null && !searchQuery.equals("") && !searchQuery.equals("null")) {
					completeItems = DatabaseManager.getInstance().getDaoFactory().getCanzoneDao().findCanzone(searchQuery);
				}
				/*else if (searchProducer != null && !searchProducer.equals("") && !searchProducer.equals("null")) {
					completeItems = DatabaseManager.getInstance().getItemDAO().findItemsPerProducer(searchProducer);
					searchItem = searchProducer;
				} else if (searchCategory != null && !searchCategory.equals("") && !searchCategory.equals("null")) {
					completeItems = DatabaseManager.getInstance().getItemDAO().findItemsPerCategory(searchCategory);
					searchItem = searchCategory;
				}
				*/
				long currentDate = System.currentTimeMillis();

				if (!completeItems.isEmpty()) {

					for (Canzone item : completeItems) {
						//if (item.getItem().getTimeToLive().getTime() > currentDate) {
						out.print("<div class=\"col-sm-4\">");
						out.print("<div class=\"product-image-wrapper\">");
						out.print("<div class=\"single-products\">");
						out.print("<div class=\"productinfo text-center\">");
						//out.print("<img src=\"" + item.getPaths().getPath(0) + "\" alt=\"\" />");

						/*	if (item.getItem().getPrice() > item.getItem().getLastBid()) {
								out.print("<h2>&euro;" + item.getItem().getPrice() + "</h2>");
							} else {
								out.print("<h2>&euro;" + item.getItem().getLastBid() + "</h2>");
							}*/

						out.print("<p>" + item.getTitolo() + " " + item.getArtista().getNomeArtista() + " "
								+ item.getGenere() + "</p>");

						/*	if (request.getSession().getAttribute("email") != null
									&& !request.getSession().getAttribute("email").equals("")) {
								if (item.getItem().isBuy_now()) {
									out.print("<a href=\"addToCart?id=" + (item.getItem().getId() + 1029384756) + "&search="
											+ searchItem + "&from=search.jsp\" class=\"btn btn-default add-to-cart\">");
									out.print("<i class=\"fa fa-shopping-cart\"></i>Add to cart</a>");
								} else if (item.getItem().isBid()) {
									out.print("<a href=\"makeBid?id=" + (item.getItem().getId() + 1029384756) + "&search="
											+ searchItem + "&from=search.jsp\" class=\"btn btn-default add-to-cart\">");
									out.print("<i class=\"fa fa-gavel\"></i>Make your bid</a>");
								}
							} else {
								out.print("<a href=\"login.jsp\" class=\"btn btn-default add-to-cart\">");
								out.print("<i class=\"fa fa-shopping-cart\"></i>Login first</a>");
							}
						
							out.print("</div>");
							out.print("<div class=\"product-overlay\">");
							out.print("<div class=\"overlay-content\">");
							out.print("<p><a href=\"singleProduct.jsp?productId=" + (item.getItem().getId() + 1029384756)
									+ "\">" + item.getItem().getDescription() + "</a></p>");
						
							if (item.getItem().getPrice() > item.getItem().getLastBid()) {
								out.print("<h2>&euro;" + item.getItem().getPrice() + "</h2>");
							} else {
								out.print("<h2>&euro;" + item.getItem().getLastBid() + "</h2>");
							}
						
							if (request.getSession().getAttribute("email") != null
									&& !request.getSession().getAttribute("email").equals("")) {
								if (item.getItem().isBuy_now()) {
									out.print("<a href=\"addToCart?id=" + (item.getItem().getId() + 1029384756) + "&search="
											+ searchItem + "&from=search.jsp\" class=\"btn btn-default add-to-cart\">");
									out.print("<i class=\"fa fa-shopping-cart\"></i>Add to cart</a>");
								} else if (item.getItem().isBid()) {
									out.print("<a href=\"makeBid?id=" + (item.getItem().getId() + 1029384756) + "&search="
											+ searchItem + "&from=search.jsp\" class=\"btn btn-default add-to-cart\">");
									out.print("<i class=\"fa fa-gavel\"></i>Make your bid</a>");
								}
							} else {
								out.print("<a href=\"login.jsp\" class=\"btn btn-default add-to-cart\">");
								out.print("<i class=\"fa fa-shopping-cart\"></i>Login first</a>");
							}
							out.print("</div>");*/
						out.print("</div>");
						out.print("</div>");
						out.print("</div>");
						out.print("</div>");
						//}
					}
				} else {
					out.print("<div class=\"text-center\"> No items found :( </div>");
				}
			%>


		</div>
	</div>
</body>
</html>