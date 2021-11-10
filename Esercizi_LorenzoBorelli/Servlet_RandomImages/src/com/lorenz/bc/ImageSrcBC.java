package com.lorenz.bc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lorenz.architecture.dao.ImageSrcDAO;
import com.lorenz.architecture.dbaccess.DBAaccess;
import com.lorenz.bc.model.ImageSrc;

public class ImageSrcBC {
	
	Connection conn;
	
	public ImageSrcBC () throws ClassNotFoundException, SQLException{
		conn = DBAaccess.getConnection();
	}
	
	public ImageSrc showImg() throws SQLException{
		return ImageSrcDAO.getFactory().show(conn);
	}
}