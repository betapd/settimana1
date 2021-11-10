package com.lorenz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lorenz.bc.ImageSrcBC;
import com.lorenz.bc.model.ImageSrc;

@WebServlet("/image")
public class Image extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// setta il ritorno
		response.setContentType("text/html");

		// response.getWriter() restituisce un oggetto PrintWriter che può inviare testo
		// di caratteri al client.
		PrintWriter out = response.getWriter();

	
		try {
			ImageSrcBC ubc = new ImageSrcBC();
			ImageSrc i = new ImageSrc();
			i = ubc.showImg();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Betacom Random Images</title><meta charset=\"ISO-8859-1\">");
			out.println("<body>");
			out.println("<h1>Betacom Random Images</h1>");
			 out.print("<img src="+i.getNome()+" alt='image' />");
			out.println("<p>" + i.getDescrizione() + "</p>");

			out.println("</body>");
			out.println("</html>");
			out.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			out.println("<body>");
			out.println("<h1>Error! Class not found</h1>");
		} catch (SQLException e) {
			e.printStackTrace();
			out.println("<body>");
			out.println("<h1>Error! SQLException</h1>");
		}

		
	}

}
