<%@page import="com.lorenz.bc.ImageSrcBC"%>
<%@page import="com.lorenz.bc.model.ImageSrc"%>
<jsp:useBean id="ImageSrc" class="com.lorenz.bc.model.ImageSrc"
	scope="page" />
<jsp:useBean id="ImmagineBC" class="com.lorenz.bc.ImageSrcBC"
	scope="request" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Random Images</title>




</head>
<body>
	<center>
		<h1 style="margin: 20px;">Random Images Betacom</h1>
		<%
			ImageSrc img = ImmagineBC.showImg();
		%>
		<img alt="Immagine random" src="<%=img.getNome()%>">
		<p><%=img.getDescrizione()%></p>
	</center>
</body>
</html>