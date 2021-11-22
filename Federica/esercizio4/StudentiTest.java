package com.fede.esercizio4;

import java.util.Scanner;

public class StudentiTest {

	static Studente studenti[] = new Studente[3];
	static Esame esami[] = new Esame[7];
	static Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce

	public static void main(String[] args) {

		while (true) {
			int menu = 0;

			System.out.println("MENU \n1) Inserire studente \n2) Inserire esame \n3) Riepilogo");
			System.out.println("Scegliere un opzione");
			menu = in.nextInt();

			switch (menu) {
			case 1:
				Studente();
				break;
			case 2:
				Esame();
				break;
			case 3:
				Riepilogo();
				break;
			}
		}
	}

	// --------------INSERIMENTO STUDENTE--------------
	public static void Studente() {
		for (int i = 0; i < studenti.length; i++) {
			System.out.println("-----INSERIMENTO STUDENTE-----");
			System.out.println("Inserire il numero matricola:");
			int matricola = in.nextInt();
			boolean ok = true;
			while (ok) {
				int check = 0;
				for (int j = 0; j < i; j++) {
					if (studenti[j].getMatricola() == matricola) {
						check++;
					}
				}
				if (check != 0) {
					System.out.println("NUMERO MATRICOLA GIA' ESISTENTE");
					System.out.println("Inserire il numero matricola:");
					matricola = in.nextInt();
				} else
					ok = false;
			}
			System.out.println("Inserire il nome e cognome: ");
			String nome = in.next();
			String cognome = in.next();
			
			Studente s = new Studente(matricola, nome, cognome);
			studenti[i] = s;
		}
	}

	// --------------INSERIMENTO ESAME--------------
	public static void Esame() {
		for (int i = 0; i < esami.length; i++) {
			System.out.println("-----INSERIMENTO ESAME-----");
			System.out.println("Inserire il numero matricola:");
			int matricola = in.nextInt();
			System.out.println("Inserire l'esame e voto: ");
			String esame = in.next();
			int voto = in.nextInt();
			
			Esame e = new Esame(matricola, esame, voto);
			esami[i] = e;
		}
	}

	// --------------MOSTRA IL RIEPILOGO--------------
	public static void Riepilogo() {
		for (int i = 0; i < studenti.length; i++) {
			for (int j = 0; j < esami.length; j++) {
				if (studenti[i].getMatricola() == esami[j].getMatricola()) {
					System.out.print("Studente: " + studenti[i].getNome() + " " + studenti[i].getCognome() + " -> "
							+ esami[j].getEsame() + " voto = " + esami[j].getVoto() + "\n");
				}
			}
		}
		System.out.println();
	}
}
