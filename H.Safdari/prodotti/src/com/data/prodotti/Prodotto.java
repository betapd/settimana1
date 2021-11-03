package com.data.prodotti;

public class Prodotto {
	private String nome;
	private double prezzo;
	
	
	public Prodotto(String nome, double prezzo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
	}
	public Prodotto() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", prezzo=" + prezzo + "]";
	} 
	
	
}
