package com.data.prodotti;

public class Ordine{
	Cliente c =new Cliente(); 
	Prodotto[] P;
	//double prezzo=new Prodotto();
	private double prezzoTot;

	public Ordine(Cliente c, Prodotto[] p) {
		super();
		this.c = c;
		this.P = p;
		c.setQuantitaOrdine(c.getQuantitaOrdine()+1); // incremento ogno volta che c'è un ordine.
		
	}


	public double getPrezzoTot() {
		return prezzoTot;
	}

	public void setPrezzoTot(double prezzoTot) {
		this.prezzoTot = prezzoTot;
	}
	
	
}
