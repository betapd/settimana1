package com.studente;

public class Esami {
	
	private String titolo;
	private String CFU;
	private int matricola;
	

	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getCFU() {
		return CFU;
	}
	public void setCFU(String cFU) {
		CFU = cFU;
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public Esami(String titolo, String cFU, int matricola) {
		super();
		this.titolo = titolo;
		CFU = cFU;
		this.matricola = matricola;
	}
	
	@Override
	public String toString() {
		return "Esami [titolo=" + titolo + ", CFU=" + CFU + ", matricola=" + matricola + "]";
	}
	

}
