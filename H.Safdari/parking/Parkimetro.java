package com.data.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Parkimetro implements Comparable<Parkimetro> {
	
	private String targa;
	private Calendar entrata;
	private int tempoRimasto;
	private double prezzo;
	public Parkimetro(String targa, GregorianCalendar entrata, int tempoRimasto) {
		super();
		this.targa = targa;
		this.entrata = entrata;
		this.tempoRimasto = tempoRimasto;
		this.prezzo = tempoRimasto*2.5;  // 4.5 all'ora
	}
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Calendar getEntrata() {
		return entrata;
	}
	public void setEntrata(Calendar entrata) {
		this.entrata = entrata;
	}
	public int getTempoRimasto() {
		return tempoRimasto;
	}
	public void setTempoRimasto(int tempoRimasto) {
		this.tempoRimasto = tempoRimasto;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
	//calcola data dell'uscita
	public Calendar calcolaUscita() {
		Calendar  data = (Calendar) this.getEntrata().clone();
		// setto la data di intrata 
		data.set(Calendar.HOUR_OF_DAY, data.get(Calendar.HOUR_OF_DAY) + this.getDurata());
		return data;
		
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss", Locale.ITALIAN);
		return"Parkimetro [ targa= " + targa + ", entrata= "  + formato.format(entrata.getTime())
		+  ", tempoRimasto= " + tempoRimasto + "H, prezzo= "
				+ prezzo + "Euro ]";
	}

	private int getDurata() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Parkimetro P) {
		return this.calcolaUscita().compareTo(P.calcolaUscita());
	}
	
	
	

}
