package com.architecture.bc;

import java.sql.Connection;
import java.sql.SQLException;


import com.architecture.dao.ImgDAO;
import com.architecture.dbaccess.DBAccess;
import com.architecture.model.Immagine;

public class ImmagineBC {
	Connection conn;
	
	public ImmagineBC () throws ClassNotFoundException, SQLException{
		conn = DBAccess.getConnection();
	}
	
	public Immagine getImmagine() throws SQLException{
		return ImgDAO.getFactory().getImg(conn);
	}
}
