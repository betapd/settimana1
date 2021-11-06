package com.architecture.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.architecture.model.Immagine;

public class ImgDAO implements DAOConstants{
	private CachedRowSet rowSet;
	
	public static ImgDAO getFactory() throws SQLException {
		return new ImgDAO();
	}
	
	
	public ImgDAO() throws SQLException {
		rowSet = RowSetProvider.newFactory().createCachedRowSet();
	}
	
	public Immagine getImg(Connection conn) throws SQLException{
		int randomNumber = (int) (Math.random() * 4);
		rowSet.setCommand(SELECT_IMG);
		rowSet.execute(conn);
		ArrayList<Immagine> img = new ArrayList<Immagine>();
		rowSet.beforeFirst();
		while(rowSet.next()) {
			Immagine image = new Immagine();
			image.setId(rowSet.getInt(1));
			image.setUrl(rowSet.getString(2));
			image.setDescrizione(rowSet.getString(3));
			img.add(image);
		}
		return img.get(randomNumber);
		
	}
	
}
