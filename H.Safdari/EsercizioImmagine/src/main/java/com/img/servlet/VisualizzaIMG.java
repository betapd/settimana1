package com.img.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisualizzaIMG
 */
//@WebServlet("/randomImage")
public class VisualizzaIMG extends HttpServlet implements Constants {
	private static final long serialVersionUID = 1L;

	private Connection conn;
	private Statement stmt;
	private PreparedStatement ps;

	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName(config.getInitParameter("jdbcDriver"));
			conn = DriverManager.getConnection(config.getInitParameter("jdbcURL"),
					config.getInitParameter("jdbcUsername"), config.getInitParameter("jdbcPassword"));
			stmt = conn.createStatement();
			System.out.println("sei connesso");
		} catch (ClassNotFoundException exc) {
			throw new ServletException(exc.getMessage());
		} catch (SQLException exc) {
			throw new ServletException(exc.getMessage());
		}
	}

	@Override
	public void destroy() {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		try {
			System.out.println("Try ");

			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); // In questo
			ResultSet rows = stmt.executeQuery(SELECT_ALL_IMAGE);
			int countImage = 0;

			while (rows.next()) {
				rows.last();
				countImage = rows.getRow();
				System.out.println("countImage: " + countImage);
			}
			rows.close();

			ps = conn.prepareStatement(SELECT_IMAGE, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			Random r = new Random();
			ps.setInt(1, r.nextInt(countImage - 1) + 1); // da 1 a n record
			ps.execute();

			ResultSet ris = ps.getResultSet();
			ris.first();

			request.getSession().setAttribute("url", ris.getObject(1));
			request.getSession().setAttribute("descrizione", ris.getObject(2));
			response.sendRedirect("index.jsp");

		} catch (SQLException e) {
			out.println("<p>" + e.getMessage() + "</p>");
			out.println("<p>" + e.getErrorCode() + "</p>");
		}
	}

}
