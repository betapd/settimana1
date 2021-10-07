package com.studente;

public class Studenti {
	private String name;
	private String cognome;
	private int matricola;
	public Studenti(String name, String cognome, int matricola) {
		super();
		this.name = name;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	@Override
	public String toString() {
		return "Studenti [name=" + name + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}
	
	

}
