<%@page import="com.bc.model.Passeggero"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="PasseggeroBC" class="com.alex.bc.PasseggeroBC" scope="request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>Risultato Prenotazione</h1>
	</header>
	
	<main>
	
	
		<h2>Prima Classe</h2>
		<div class="prima">
			<!-- Prima Classe -->
			
			<%
			ArrayList<Passeggero> lista = PasseggeroBC.getPasseggeri();
			ArrayList<Passeggero> listaPrima = new ArrayList<Passeggero>();
			ArrayList<Passeggero> listaSeconda = new ArrayList<Passeggero>();
			
			for(Passeggero p : lista){
				if(p.getClasse().equals("prima")){
					listaPrima.add(p);
				}else{
					listaSeconda.add(p);
				}}
			
			for(Passeggero p :listaPrima){
			%>
			
		
				<div class="posto">
				
					<p>nome: <%= p.getNome() %></p>
					<p>cognome: <%= p.getCognome() %></p>
					<p>username: <%= p.getUsername() %></li>
					<p>classe: <%= p.getClasse() %></p>
				
				</div>
			
			<%
				}
			
			for(int p = 12 - listaPrima.size(); p > 0; p--){
				
				
				out.println("<div class=\"posto\">");
				out.println("<p>Posto Libero</p>");
				out.println("<p>Prima Classe</p>");
				out.println("</div>");
				
			}
			%>
			
		</div>
		<h2>Seconda Classe</h2>
		<div class="seconda">
		
			<!-- Prima Classe -->
			<%
			
			for(Passeggero p :listaSeconda){
			%>
			
			
				<div class="posto">
				
					<p>nome: <%= p.getNome() %></p>
					<p>cognome: <%= p.getCognome() %></p>
					<p>username: <%= p.getUsername() %></p>
					<p>classe: <%= p.getClasse() %></p>
				
				</div>
		
			<%
				}
			
			for(int p = 24 - listaSeconda.size(); p > 0; p--){
				
			
				out.println("<div class=\"posto\">");
				out.println("<p>Posto Libero</p>");
				out.println("<p>Prima Classe</p>");
				out.println("</div>");
				
			}
			%>
			
		</div>
		
	</main>
</body>	
</html>