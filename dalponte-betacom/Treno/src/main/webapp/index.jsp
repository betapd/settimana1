<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prenotazione</title>
</head>
<body>
	<h1>Prenotazione</h1>
	<form action="<%=request.getContextPath()%>/prenotazione" method="post">
		<table> 
	<tr> 
		<td style="width:250px;">Nome</td>
		<td style="width:250px;"><input type="text" name="nome" required></td>
	</tr>		
	<tr> 
		<td>Cognome</td>
		<td><input type="text" name="cognome" required></td>
	</tr>	
		<tr> 
		<td>Username</td>
		<td><input type="text" name="username" maxlength="10" required></td>
	</tr>	
	<tr> 
		<td>Scegli la classe:</td>
		<td>
			<input type="radio" id="prima" name="classe" value="prima">
			<label for="prima">Prima Classe</label>
			<input type="radio" id="seconda" name="classe" value="seconda">
			<label for="seconda">Seconda Classe</label>
		</td>
	</tr>	

	<tr> 
		<td colspan="2"><input type="submit" value="Prenota posto"></td>	
	</tr>	
	
</table>
	</form>
</body>
</html>