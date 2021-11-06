<%@page import="com.architecture.model.Immagine"%>
<%@page import="com.architecture.bc.ImmagineBC"%>
<jsp:useBean id="immagine" class="com.architecture.model.Immagine" scope="page" />
<jsp:useBean id="immagineBC" class="com.architecture.bc.ImmagineBC" scope="request" />

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visualizza immagine</title>
</head>
<body></body>
	<h1 style="margin: 20px;">Immagine Random</h1>
	<% Immagine image = immagineBC.getImmagine(); %>
	<h2>Immagine numero: <%= image.getId() %></h2>
	<img alt="Immagine random" src="<%= image.getUrl()  %>">
	<p><%= image.getDescrizione() %></p>
</html>