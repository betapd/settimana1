package com.es.ordini;

public class Ordini implements Comparable<Ordini>{
	private String marca;
	private String modello;
	private double prezzo;
	
	
	public Ordini(String marca, String modello, double prezzo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModello() {
		return modello;
	}


	public void setModello(String modello) {
		this.modello = modello;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "\n marca =" + marca + ", modello =" + modello + ", prezzo =" + prezzo ;
	}


	@Override
	public int compareTo(Ordini other) {
		double confPrezzo = prezzo - other.prezzo;
		return (int) confPrezzo;
	}
	
	
	
}
