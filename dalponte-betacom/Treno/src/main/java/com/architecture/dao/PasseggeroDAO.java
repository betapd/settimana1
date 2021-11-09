package com.architecture.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.bc.model.Passeggero;

public class PasseggeroDAO implements DAOConstants{
	private CachedRowSet rowSet;
	
	public static PasseggeroDAO getFactory() 
			throws ClassNotFoundException, SQLException{
		return new PasseggeroDAO();
	}
	
	private PasseggeroDAO() throws ClassNotFoundException, SQLException {
		rowSet = RowSetProvider.newFactory().createCachedRowSet();
	}
	
	public void create(Passeggero passeggero, Connection conn) throws SQLException{
		rowSet.setCommand(SELECT_UTENTI);rowSet.execute(conn);
		rowSet.moveToInsertRow();
		rowSet.updateString(1, passeggero.getNome());
		rowSet.updateString(2, passeggero.getCognome());
		rowSet.updateString(3, passeggero.getUsername());
		rowSet.updateString(4, passeggero.getClasse());
		
		rowSet.insertRow();
		rowSet.moveToCurrentRow();
		rowSet.acceptChanges();
	}
	
	public ArrayList<Passeggero> getPasseggeri(Connection conn) throws SQLException {
		rowSet.setCommand(SELECT_UTENTI);
		rowSet.execute(conn);
		ArrayList<Passeggero> lista = new ArrayList<Passeggero>();
		rowSet.beforeFirst();
		while(rowSet.next()) {
			Passeggero passeggero = new Passeggero(); 
			passeggero.setNome(rowSet.getString(1));
			passeggero.setCognome(rowSet.getString(2));
			passeggero.setUsername(rowSet.getString(3));
			passeggero.setClasse(rowSet.getString(4));
		
			lista.add(passeggero);	
		}
		return lista;
	}
}
