package com.es.parcheggio;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ParcheggioTest {
	public static void main(String[] args) {
		
		LinkedList<Auto> parcheggio = new LinkedList<Auto>();
		
		parcheggio.add(new Auto("Alessandro",10,19));
		parcheggio.add(new Auto("Andrea",7,10));
		parcheggio.add(new Auto("Marco",14,16));
		parcheggio.add(new Auto("Massimo",13,22));
		parcheggio.add(new Auto("Lorenzo",5,11));
		parcheggio.add(new Auto("Davide",21,23));
		parcheggio.add(new Auto("Enrico",12,19));
		parcheggio.add(new Auto("Cristiano",7,18));
		parcheggio.add(new Auto("Stefano",10,19));
		
		Collections.sort(parcheggio);
		
		System.out.println("Ordine di entrata");
		for(int i=0; i<25; i++) {
			for(Auto p: parcheggio) {
				if(p.getEntrata() == i) {
					System.out.println("Entrata: "+ p.getEntrata()+"  Utente: " + p.getNome());
				}
			}
		}
		System.out.println("-----------------------------");
		System.out.println("Ordine di uscita");
		for(Auto p: parcheggio) {
			System.out.println("Uscita: " + p.getUscita()+ " Utente: " + p.getNome());
		}
		
	}
}
