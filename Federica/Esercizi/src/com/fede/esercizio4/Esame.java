package com.fede.esercizio4;

public class Esame {
	int matricola;
	String esame;
	int voto;
	
	//costruttore
	public Esame() {
		
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public String getEsame() {
		return esame;
	}
	public void setEsame(String esame) {
		this.esame = esame;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	@Override
	public String toString() {
		return "Esame [matricola=" + matricola + ", esame=" + esame + ", voto=" + voto + "]";
	}
	
	
	
	
}
