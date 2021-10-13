package com.es.ordini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdiniTest {

	public static void main(String[] args) {

		System.out.println("Salve, mi può dire il suo nome?");

		Scanner in = new Scanner(System.in);

		String name =  in.next();
		System.out.println("Ora il suo cognome");
		
		String lastName = in.next();

		ArrayList<Ordini> ordini = new ArrayList<>();

		ordini.add(new Ordini("prova", "Mac", 3000));
		ordini.add(new Ordini("Apple", "iPhone", 1200));
		ordini.add(new Ordini("Samsung", "s9", 800));
		ordini.add(new Ordini("HP", "envy", 1200));
		ordini.add(new Ordini("LG", "Oled 65uk", 2300));

		Collections.sort(ordini);

		ArrayList<String> carrello = new ArrayList<>();
		System.out.println("Ecco tutti i nostri prodotti:");
		System.out.println(ordini.toString());
		System.out.println("Mi dica il prodotto che preferisce inserendo il nome della marca");
			
		double totale = 0;
		boolean flag = true;
		
		while(flag) {
			String product = in.next();
			inserimento(ordini, carrello, (int) totale, product);
			System.out.println("Desidera altro?(s/n");
			String altro = in.next();
			if(altro.equals("s")) {
				System.out.println(ordini.toString());
				System.out.println("Inserisca il nome della marca");
			}else {
				System.out.println("Ecco la lista di "+name + " " + lastName + ".");
				for(String cart : carrello) {
					System.out.println(cart);
					for(Ordini ord : ordini) {
						if(ord.toString().equals(cart)) {
							totale = totale +ord.getPrezzo();
						}
					}
				}
				System.out.println("Il totale è " + totale);
				flag = !flag;
			}
				
		}
			
		in.close();
	}
	


	//METODO INSERIMENTO
	private static void inserimento(ArrayList<Ordini> ordini, ArrayList<String> carrello, int totale, String prodotto) {
		
		for (Ordini o : ordini) {
			if (o.getMarca().equals(prodotto)) {
				// controllo se è il prodotto è già presente
					carrello.add(o.toString());
				
			}
		}
	}
}
