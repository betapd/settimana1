package com.fede.esercizio5;

public class Cliente {
	private String nome;
	private String cognome;
	private long cellulare;
	
	public Cliente(String nome, String cognome, long cellulare) {
		this.nome = nome;
		this.cognome = cognome;
		this.cellulare = cellulare;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public long getCellulare() {
		return cellulare;
	}

	public void setCellulare(long cellulare) {
		this.cellulare = cellulare;
	}
	
}
