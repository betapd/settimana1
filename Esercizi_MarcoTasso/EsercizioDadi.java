package com.marco.esercizi;

import java.util.Random;

// Ogni giocatore lancia due dadi.
// Se la somma al primo tiro è 7 o 11 il giocatore ha vinto.
// Se la somma al primo tiro è 2, 3 o 12 il giocatore ha perso.
// Se la somma al primo tiro è 4, 5, 6, 8, 9 o 10 questa somma diventa il punteggio.
// Per vincere è necessario continuare a tirare i dadi finchè non si totalizza il punteggio realizzato con il primo tiro.
// Il giocatore perde se totalizza 7 prima di raggiungere il punteggio del primo tiro.

public class EsercizioDadi {
	public static void main(String[] args) {
		Random random = new Random();
		int dado1 = 0;
		int dado2 = 0;
		int primolancio = 0;
		
		while(dado1 < 1 | dado2 < 1) {
			dado1 = random.nextInt(6);
			dado2 = random.nextInt(6);
		}
		
		System.out.println("Dal primo dado è uscito il numero " + dado1);
		System.out.println("Dal secondo dado è uscito il numero " + dado2);
		
		int sommadadi = dado1 + dado2;
		
		if(sommadadi == 7 | sommadadi == 11) {
			System.out.println("Hai fatto " + sommadadi + ". Complimenti hai vinto.");
		} else if (sommadadi == 2 | sommadadi == 3 | sommadadi == 12) {
			System.out.println("Hai fatto " + sommadadi + ". Mi dispiace hai perso.");
		} else {
			System.out.println("Hai fatto " + sommadadi);
			System.out.println();
			
			primolancio = sommadadi;
			sommadadi -= 1;
			System.out.println("Cominciamo a rilanciare finchè non vinci");
			System.out.println();
			
			while (sommadadi != primolancio) {
				dado1 = random.nextInt(6);
				dado2 = random.nextInt(6);
				
				while (dado1 < 1 | dado2 < 1) {
					dado1 = random.nextInt(6);
					dado2 = random.nextInt(6);
				}
				
				sommadadi = dado1 + dado2;
				
				System.out.println("Dal primo dado è uscito il numero " + dado1);
				System.out.println("Dal secondo dado è uscito il numero " + dado2);
				
				if (sommadadi == 7) {
					System.out.println("Hai fatto " + sommadadi + ". Mi dispiace hai perso.");
					break;
				}
				
				System.out.println("Hai fatto " + sommadadi);
				System.out.println();
			}
			
			if (sommadadi == primolancio)
				System.out.println("Complimenti hai vinto!");
		}
	}
}
