package com.data.prodotti;

public class Cliente {
	private String nome;
	private String cognome;
	private int quantitaOrdine=0;

	public Cliente(String nome, String cognome, int quantitaOrdine, double prezzoTotale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.quantitaOrdine = quantitaOrdine;
	}
	
	// costruttore senza parametri
	public Cliente() {
		
	}

	public Cliente(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
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

	public int getQuantitaOrdine() {
		return quantitaOrdine;
	}

	public void setQuantitaOrdine(int quantitaOrdine) {
		this.quantitaOrdine = quantitaOrdine;
	}
	

	
	@Override
	public String toString() {
		return "Cliente [ nome=" + nome + ", cognome=" + cognome + ", quantitaOrdine=" + quantitaOrdine   +" ]";
	}

	
	
	
	
	
}
