	package com.es.parcheggio;

import java.util.Comparator;

public class Auto implements Comparable<Auto> {
	private String nome;
	private int entrata;
	private int uscita;
	
	
	public Auto(String nome, int entrata, int uscita) {
		super();
		this.nome = nome;
		this.entrata = entrata;
		this.uscita = uscita;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getEntrata() {
		return entrata;
	}


	public void setEntrata(int entrata) {
		this.entrata = entrata;
	}


	public int getUscita() {
		return uscita;
	}


	public void setUscita(int uscita) {
		this.uscita = uscita;
	}


	@Override
	public int compareTo(Auto other) {
			int confUscita = uscita - other.uscita;
			
		return confUscita;
	}

	
	
}
