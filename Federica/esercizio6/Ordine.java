package com.fede.esercizio6;

import java.util.Enumeration;

public class Ordine {
	private int codice;
	private Compratore compratore;
	private Enumeration<String[]> listaArticoli;
	private double totale;

	public Ordine(int codice, Compratore compratore, Enumeration<String[]> listaArticoli, double totale) {
		this.codice = codice;
		this.compratore = compratore;
		this.listaArticoli = listaArticoli;
		this.totale = totale;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public Compratore getCompratore() {
		return compratore;
	}

	public void setCompratore(Compratore compratore) {
		this.compratore = compratore;
	}

	public Enumeration<String[]> getListaArticoli() {
		return listaArticoli;
	}

	public void setListaArticoli(Enumeration<String[]> listaArticoli) {
		this.listaArticoli = listaArticoli;
	}

	public double getTotale() {
		return totale;
	}

	public void setTotale(double totale) {
		this.totale = totale;
	}

	public void riepilogo(Ordine o) {
		System.out.println("-------RIEPILOGO ORDINE " + o.getCodice() + "-------");
		System.out.println("ID\tN.\tPROD.\tPREZZO");
		String dati[];
		while (o.getListaArticoli().hasMoreElements()) {
			dati = o.getListaArticoli().nextElement();
			System.out.println(dati[0] + "\t" + dati[3] + "\t" + dati[1] + "\t€" + dati[2] + " al pezzo");
		}
		System.out.println("\nTOTALE COMPLESSIVO\t€" + o.getTotale());
		System.out.println(o.getCompratore());
		System.out.println("-------FINE RIEPILOGO ORDINE " + o.getCodice() + "-------");
	}

	@Override
	public String toString() {
		return "Ordine [codice=" + codice + ", compratore=" + compratore + ", listaArticoli=" + listaArticoli
				+ ", totale=" + totale + "]";
	}

}
