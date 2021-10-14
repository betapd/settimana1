//Usando i concetti OOP sviluppare un piccolo applicativo per la registrazione di ordini.
//Il programma dovrà fornire nel menu la possibilità di inserire i dati e di visualizzare un riepilogo complessivo.
//Dopo aver inserito il record relativo al cliente ( da memorizzare in una opportuna struttura) 
//registrare per ciascun ordine i prodotti ( nome, prezzo unitario) acquistati.
//Calcolare per ogni cliente il totale degli ordini.

package com.fede.esercizio6;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;

public class OrdiniTest {
	static ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
	static Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
	static double totPrezzo = 0;
	static Carrello carrello = new Carrello();
	static int n = 0;
	static boolean newOrdine = true;
	static Ordine o;
	
	public static void main(String[] args) {
		PopolaNegozio();
		while (true) {
			while (newOrdine) {
				NuovoOrdine();
				System.out.println("Inserire il nome e cognome: ");
				String nome = in.next();
				String cognome = in.next();
				Compratore c = new Compratore(nome, cognome);
				
				Enumeration<String[]> listaArticoli = carrello.getElementi();
				double totale = carrello.totaleComplessivo();
				o = new Ordine(n, c, listaArticoli, totale);
				o.riepilogo(o);
				
				System.out.println("Modificare l'ordine? \n1)Aggiungi prodotti\n2)Togli prodotti\n3)Pagare");
				int continuare = in.nextInt();
				switch (continuare) {
				case 1:
					newOrdine = true;
					NuovoOrdine();
					break;
				case 2:
					newOrdine = false;
					System.out.println("Inserire l'id del prodotto da togliere");
					int id = in.nextInt();
					System.out.println("Articolo rimosso");
					carrello.rimuoviArticolo(id);
					Enumeration<String[]> newlistaArticoli = carrello.getElementi();
					double newtotale = carrello.totaleComplessivo();
					o.setListaArticoli(newlistaArticoli);
					o.setTotale(newtotale);
					o.riepilogo(o);
					break;
				case 3:
					newOrdine = false;
					o.riepilogo(o);
					break;
				default:
					newOrdine = false;
					o.riepilogo(o);
					break;
				}
			}

		}

	}

	private static void NuovoOrdine() {
		n++;
		while (newOrdine) {
			for (Prodotto p : prodotti) {
				System.out.println(p.getCodice() + ") " + p.getDescrizione() + "  €" + p.getPrezzo());
			}

			System.out.println("Scegliere prodotto");
			int prodotto = in.nextInt();
			System.out.println("Scegliere la quantità");
			int quantita = in.nextInt();

			for (Prodotto p : prodotti) {
				if (prodotto == p.getCodice()) {
					carrello.aggiungiArticolo(p.getCodice(), p.getDescrizione(), p.getPrezzo(), quantita);
				}
			}
			System.out.println("Continuare l'ordine? \n1)SI\n2)NO");
			int continuare = in.nextInt();
			switch (continuare) {
			case 1:
				newOrdine = true;
				break;
			case 2:
				newOrdine = false;
				break;
			default:
				newOrdine = false;
				break;
			}
		}

	}

	private static void PopolaNegozio() {
		Prodotto p1 = new Prodotto(1, "Bici", 2000);
		Prodotto p2 = new Prodotto(2, "Pc", 1000);
		Prodotto p3 = new Prodotto(3, "Auto", 20000);
		Prodotto p4 = new Prodotto(4, "Cell", 500);
		Prodotto p5 = new Prodotto(5, "TV", 800);
		Prodotto p6 = new Prodotto(6, "Phone", 50.90);
		Prodotto p7 = new Prodotto(7, "Rasoio", 55.99);
		Prodotto p8 = new Prodotto(8, "Mixer", 100.50);
		Prodotto p9 = new Prodotto(9, "Bilancia", 25.99);
		Prodotto p10 = new Prodotto(10, "Frigo", 1500.90);

		prodotti.add(p1);
		prodotti.add(p2);
		prodotti.add(p3);
		prodotti.add(p4);
		prodotti.add(p5);
		prodotti.add(p6);
		prodotti.add(p7);
		prodotti.add(p8);
		prodotti.add(p9);
		prodotti.add(p10);
	}
}
