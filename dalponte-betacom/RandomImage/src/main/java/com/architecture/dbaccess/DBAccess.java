package com.architecture.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.architecture.dao.DAOConstants;

public class DBAccess implements DAOConstants{
	private static Connection conn;
	//metodo apertura connessione con il db
	public synchronized static Connection getConnection() throws ClassNotFoundException, SQLException{
		//devo leggere il contenuto del driver
		//tramite la reflection
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		conn.setAutoCommit(false);
		return conn;
	}
	//metodo chiusura connessiore
	public static void closeConnection() throws SQLException {
		if(conn != null)
			conn.close();
	}

}
