
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	crossorigin="anonymous">
<title>Insert title here</title>
<!-- <img src="img/sunset2.jpg" width="340" height="300" /> -->
</head>
<body>
	<div class="container">
		<form action="./randomImage" method="get" class="form-group">
			<%
			String url = (String) request.getSession().getAttribute("url");
			String descrizione = (String) request.getSession().getAttribute("descrizione");
			%>

			<img src="img/<%=url%>" alt="<%=descrizione%>" width="340"
				height="300" />
			<p><%=descrizione%></p>
				<button type="submit" class="btn btn-primary btn-large">Invia</button>
		</form>
	</div>
</body>
</html>