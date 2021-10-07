//Ogni giocatore lancia due dadi.  
//Se la somma al primo tiro è 7 o 11 il giocatore ha vinto. 
//Se la somma al primo tiro è 2,3 o 12 il giocatore ha perso. 
//Se la somma al primo tiro è 4,5,6,8,9 o 10 questa somma diventa il punteggio. 
//Per vincere è necessario continuare a tirare i dati finchè non si totalizza il punteggio realizzato con il primo tiro. 
//Il giocatore perde se totalizza 7 prima di raggiungere il punteggio del primo tiro.

package com.fede.esercizio3;

public class LancioDadi {

	public static void main(String[] args) {
		int min = 1;
		int max = 6;
		int somma = 0;
		int tiri = 0;
		int punteggio = 0;
		boolean finePartita = false;

		while (finePartita == false) {
			tiri++;
			System.out.println("Tiro " + tiri);
			int primoDado = (int) Math.floor(Math.random() * (max - min + 1) + min);
			System.out.println(primoDado);
			int secondoDado = (int) Math.floor(Math.random() * (max - min + 1) + min);
			System.out.println(secondoDado);

			somma = primoDado + secondoDado;

			System.out.println("Somma = " + somma);
			if (tiri == 1) {

				switch (somma) {
				case 7:
					finePartita = true;
					System.out.println("Somma = " + somma + " -> VITTORIA");
					break;
				case 11:
					finePartita = true;
					System.out.println("Somma = " + somma + " -> VITTORIA");
					break;
				case 2 | 3 | 12:
					finePartita = true;
					System.out.println("Somma = " + somma + " -> Sconfitta");
					break;
				default:
					punteggio = somma;
				}

				/*
				 * if (somma == 7 | somma == 11) { finePartita = true;
				 * System.out.println("Somma = " + somma + " -> VITTORIA"); } else if (somma ==
				 * 2 | somma == 3 | somma == 12) { finePartita = true;
				 * System.out.println("Somma = " + somma + " -> Sconfitta"); } else punteggio =
				 * somma;
				 */

			} else if (tiri > 1) {				
				if (somma == punteggio) {
					finePartita = true;
					System.out.println("Punteggio = " + punteggio + ", somma = " + somma + " -> VITTORIA");
				}
				if (somma == 7) {
					finePartita = true;
					System.out.println("Punteggio = " + punteggio + ", somma = " + somma + " -> Sconfitta");
				}
			}

		}

	}

}
