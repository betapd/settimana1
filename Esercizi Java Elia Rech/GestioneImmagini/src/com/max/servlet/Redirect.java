package com.max.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Redirect extends HttpServlet implements SQLConstants {

	private static final long serialVersionUID = -8841691469255189325L;

	private Connection conn;
	private Statement stmt;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName(config.getInitParameter("jdbcDriver"));
			conn = DriverManager.getConnection(config.getInitParameter("jdbcURL"),
					config.getInitParameter("jdbcUsername"), config.getInitParameter("jdbcPassword"));
			stmt = conn.createStatement();
		} catch (ClassNotFoundException exc) {
			throw new ServletException(exc.getMessage());
		} catch (SQLException exc) {
			throw new ServletException(exc.getMessage());
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		try {

			int min = 1;
			int max = 6;
			int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

			ResultSet rsFinale = stmt.executeQuery("select DESCRIZIONE from IMMAGINI where id = " + random_int + "");

			while (rsFinale.next()) {
				PrintWriter out = response.getWriter();
				out.println("<head><title>Pagina di riepilogo</title><meta charset=\"ISO-8859-1\"></head>");
				out.println("<h1>" + rsFinale.getString(1) + " </h1>");
				out.println("<img src=\'img/img" + random_int + ".jpg' height=500 width=500/>"); 
				rsFinale.close();
				out.close();
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
			PrintWriter out = response.getWriter();
			out.println("<title>Eccezione SQL</title><meta charset=\"ISO-8859-1\"></head>");
			out.println("<body>");
			out.println("<div class=\"container\">");
			out.println("<div class=\"alert alert-danger\">");
			out.println("<h3>Eccezione SQL</h3>");
			out.println("<p>" + exc.getMessage() + "</p>");
			out.println("<p>" + exc.getErrorCode() + "</p>");
			out.println("</div>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
			out.close();

		}
	}
}
