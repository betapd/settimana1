package com.marco.esercizi.ordini;

/* Usando i concetti OOP sviluppare un piccolo applicativo per la registrazione di ordini,
 * Il programma deve fornire nel menu' la possibilita' di inserire i dati di visualizzare
 * un riepilogo complessivo.
 * Dopo aver inserito il record relativo al cliente (da memorizzare in una opportuna 
 * strutturata) registrare per ciascun ordine i prodotti (nome, prezzo unitario) 
 * acquistati.
 * Calcolare per ogni cliente il totale degli ordini.
 */

import java.util.Scanner;

public class OrdiniTest {
	public static void main(String[] args) {
		boolean finito = true;
		double totale = 0;
		boolean trovata = true;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Salve. Inserire nome e cognome: ");
		String nome = scanner.next();
		String cognome = scanner.next();
		Cliente c = new Cliente(nome, cognome);
		
		Prodotto[] prodotti = new Prodotto[5];
		
		prodotti[0] = new Prodotto("Margherita", 3.5);
		prodotti[1] = new Prodotto("Diavola", 5);
		prodotti[2] = new Prodotto("Viennese", 5);
		prodotti[3] = new Prodotto("Capricciosa", 5.5);
		prodotti[4] = new Prodotto("Vegetariana", 6);
		
		while (finito) {
			// Inserisco il prodotto
			boolean finito1 = true;
			trovata = true;
			while (finito1) {
				System.out.println("Inserire la pizza che si vuole ordinare: ");
				String p = scanner.next();
				
				// Controllo che il prodotto inserito sia presente nei prodotti disponibili
				for (Prodotto p1 : prodotti) { 
					if (p.equals(p1.getNome())) { // Se è presente aggiungo il prezzo al totale e esco dal controllo
						finito1 = !finito1;
						trovata = true;
						totale = totale + p1.getPrezzo();
						break;
					} else {
						trovata = false;
					}
				}
				
				if (!trovata)
					System.out.println("Mi spiace ma la pizza " + p + " non e' disponibile.");
			}
			
			System.out.println("Continuare con l'ordine? s/n");
			finito1 = true;
			while (finito1) {
				String risposta = scanner.next();
				if (risposta.equals("s")) {
					finito1 = !finito1;
					break;
				} else {
					System.out.println(c.toString() + " il totale e' " + totale);
					scanner.close();
					return;
				}
			}
		}
		
		scanner.close();
	}
}
