package com.lorenz.architecture.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.lorenz.architecture.dao.DAOConstants;

public class DBAaccess implements DAOConstants{
	
	private static Connection conn;
	
	public static synchronized Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER); //tramite reflection
		conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME,JDBC_PASSWORD);
		
		conn.setAutoCommit(false);
		System.out.println("ok");
		return conn;
		
	}
	
	public static void closeConnection() throws SQLException {
		if(conn!= null)
			conn.close();
	}
	
	
}
