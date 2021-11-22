package com.fede.esercizio6;

import java.util.Enumeration;
import java.util.Hashtable;

public class Carrello {
	private Hashtable<Integer, String[]> prodotti = new Hashtable<Integer, String[]>();
	private int articoli;

	public Carrello() {
		articoli = 0;
	}

	public int getArticoli() {
		return articoli;
	}

	public void aggiungiArticolo(int codice, String descrizione, double prezzo, int quantità) {
		String[] record = {Integer.toString(codice), descrizione, Double.toString(prezzo), Integer.toString(quantità)};
		articoli++;
		if (prodotti.containsKey(codice)) {
			String[] dati = prodotti.get(codice);
			int quantita = Integer.parseInt(dati[3]);
			quantita++;
			dati[3] = Integer.toString(quantita);
			prodotti.put(codice, dati);
		} else {
			prodotti.put(codice, record);
		}
	}

	public void rimuoviArticolo(int codice) {
		if (prodotti.containsKey(codice)) {
			articoli--;
			String[] dati = prodotti.get(codice);
			if (Integer.parseInt(dati[3]) == 1) {
				prodotti.remove(codice);
			} else {
				int quantita = Integer.parseInt(dati[3]);
				quantita--;
				dati[3] = Integer.toString(quantita);
				prodotti.put(codice, dati);
			}
		}
	}
	
	public double totaleComplessivo() {
		double totale = 0.00;
		Enumeration<String[]> dati = prodotti.elements();
		String[] elementi;
		while (dati.hasMoreElements()) {
			elementi = dati.nextElement();
			totale += Double.parseDouble(elementi[2]) * Integer.parseInt(elementi[3]);
		}
		
		return totale;
	}
	
	public Enumeration<String[]> getElementi(){
		return prodotti.elements();
	}
}
