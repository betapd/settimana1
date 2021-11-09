package com.lorenz.architecture.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.lorenz.bc.model.ImageSrc;
import com.lorenz.architecture.dao.*;

public class ImageSrcDAO implements DAOConstants{
	
	private CachedRowSet rowSet;
	
	public static ImageSrcDAO getFactory() throws SQLException {
		return new ImageSrcDAO();
	}
	
	public ImageSrcDAO() throws SQLException {
		rowSet = RowSetProvider.newFactory().createCachedRowSet();
	}
	
	public ImageSrc show(Connection conn) throws SQLException {
		
		
		//generate random from 1 to 4
		int rnd = (int) (Math.random() * 4);
		System.out.println("ok 2");
		rowSet.setCommand(SELECT_IMG);
		rowSet.execute(conn);
		System.out.println("ok 3");
		ArrayList<ImageSrc> i = new ArrayList<ImageSrc>();
		
		//setting first
		rowSet.beforeFirst();
		
		//loop
		while(rowSet.next()) {
			
			ImageSrc img = new ImageSrc();
			
			// setting column 1->3
			img.setId(rowSet.getInt(1));
			img.setNome(rowSet.getString(2));
			img.setDescrizione(rowSet.getString(3));
			
			//add into the array
			i.add(img);
			
			
		}
		
		//return random from 1 to 4
		return i.get(rnd);
		
		
	}
	

}
