package com.alex.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alex.bc.PasseggeroBC;
import com.bc.model.Passeggero;

/**
 * Servlet implementation class Prenotazione
 */
@WebServlet("/prenotazione")
public class Prenotazione extends HttpServlet {
	private static final long serialVersionUID = 8133855713655891006L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Passeggero passeggero = new Passeggero();
		passeggero.setNome(request.getParameter("nome"));
		passeggero.setCognome(request.getParameter("cognome"));
		passeggero.setUsername(request.getParameter("username"));
		passeggero.setClasse(request.getParameter("classe"));
		try {
			
			PasseggeroBC passBC = new PasseggeroBC();
			passBC.create(passeggero);
			response.sendRedirect("posto.jsp");
		}catch (Exception exc) {
			throw new ServletException(exc.getMessage());
		}
		
	}

}
