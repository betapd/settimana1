package com.alex.bc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.architecture.dao.PasseggeroDAO;
import com.architecture.dbaccess.DBAccess;
import com.bc.model.Passeggero;

public class PasseggeroBC {
	Connection conn;
	
	public PasseggeroBC() throws ClassNotFoundException, SQLException{
		conn = DBAccess.getConnection();
	}
	
	public void create(Passeggero passeggero) throws ClassNotFoundException, SQLException{
		PasseggeroDAO.getFactory().create(passeggero, conn);
	}
	
	public ArrayList<Passeggero> getPasseggeri() throws ClassNotFoundException, SQLException{
		return PasseggeroDAO.getFactory().getPasseggeri(conn);
	}
}

