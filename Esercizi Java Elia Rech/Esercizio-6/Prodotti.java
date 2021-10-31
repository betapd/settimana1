package com.elia.Ordini;

public class Prodotti {
	private String nome;
	private double prezzo;
	private int numero;
	public Prodotti(String nome, int numero, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.numero = numero;
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
