//Gestire un parcheggio usando le code.
//Ogni macchina rappresenta un elemento e ha come attributi obbligatori l'orario d'entrata e di uscita dal parcheggio.
//L'orario d'entrata specifica il momento in cui l'elemento (auto) entra nella coda (parcheggio).
//Mente quello d'uscita specifica il momento in cui l'elemento esce dalla coda. 

package com.fede.esercizio8;

import java.util.LinkedList;
import java.util.Queue;

public class ParcheggioTest {
	static Queue<Auto> coda = new LinkedList<Auto>();
	static Auto auto[] = new Auto[10];
	public static void main(String[] args) {
		Auto a1 = new Auto("Mario Rossi", "Audi", 15, 20);
		Auto a2 = new Auto("Luca Bianchi", "BMW", 10, 22);
		Auto a3 = new Auto("Rosa Francini", "Fiat", 9, 13);
		Auto a4 = new Auto("Mirko Verdi", "Seat", 14, 23);
		Auto a5 = new Auto("Serena Williams", "Tesla", 15, 20);
		Auto a6 = new Auto("Aldo Pisani", "BMW", 15, 16);
		Auto a7 = new Auto("Giovanni Milani", "Audi", 17, 19);
		Auto a8 = new Auto("Giacomo Nitto", "Fiat", 20, 21);
		Auto a9 = new Auto("Pippo Baudo", "Ford", 18, 22);
		Auto a10 = new Auto("Topolino Mouse", "Opel", 5, 23);
		
		auto[0] = a1;
		auto[1] = a2;
		auto[2] = a3;
		auto[3] = a4;
		auto[4] = a5;
		auto[5] = a6;
		auto[6] = a7;
		auto[7] = a8;
		auto[8] = a9;
		auto[9] = a10;
		
		for (int i = 0; i < 24; i++) {
			System.out.println("Ore: " + i);
			for (Auto a : auto) {
				if (a.getOraEntrata() == i) {
					coda.offer(a);
					System.out.println("Entra: " + a);
					System.out.println();
				}
				if (a.getOraUscita() == i) {
					coda.remove(a);
					System.out.println("Esce: " + a);
					System.out.println();
				}
			}
			System.out.printf("%s ", coda);
			System.out.println();
		}
		
	}

}
