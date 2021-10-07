//Nel primo array (dimensione 3) vengono memorizzati:  matricola, nome, cognome.  
//Non devono esistere due studenti con la stessa matricola. (controllare tale constraint) 
//Nel secondo array  (dimensione 7) vengono memorizzati: <matricola, esame, voto>.  
//Più record matricola possono essere associati a diversi esami. 
//Dopo aver inserito i dati tramite linea di comando nelle due strutture 
//creare una voce di riepilogo per visualizzare gli studenti e i rispettivi esami.

package com.fede.esercizio4;

import java.util.Iterator;
import java.util.Scanner;

public class Studenti {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
		String studenti[][] = new String[3][3];
		String esami[][] = new String[7][3];
		while (true) {
			int menu = 0;
			
			
			System.out.println("MENU \n1) Inserire studente \n2) Inserire esame \n3) Riepilogo");
			System.out.println("Scegliere un opzione");
			menu = in.nextInt();

			switch (menu) {
			case 1:
				for (int i = 0; i < studenti.length; i++) {
					System.out.println("-----INSERIMENTO STUDENTE-----");
					System.out.println("Inserire il numero matricola:");
					String matricola = in.nextLine();
					if (matricola == null) {
						studenti[i][0] = "1";
					} else studenti[i][0] = matricola;
					System.out.println("Inserire il nome: ");
					String nome = in.nextLine();
					studenti[i][1] = nome;
					System.out.println("Inserire il cognome: ");
					String cognome = in.nextLine();
					studenti[i][2] = cognome;
				}
				for(int i = 0; i<studenti.length; i++)
				{
				    for(int j = 0; j<studenti[0].length; j++)
				    {
				        System.out.print(studenti[i][j] + "\t");
				    }
				    System.out.println();
				}
				break;
			case 2:
				for (int i = 0; i < esami.length; i++) {
					System.out.println("-----INSERIMENTO ESAME-----");
					System.out.println("Inserire il numero matricola:");
					String matricola = in.nextLine();
					esami[i][0] = matricola;
					System.out.println("Inserire l'esame: ");
					String esame = in.nextLine();
					esami[i][1] = esame;
					System.out.println("Inserire il voto: ");
					String voto = in.nextLine();
					esami[i][2] = voto;
				}
				for(int i = 0; i<esami.length; i++)
				{
				    for(int j = 0; j<esami[0].length; j++)
				    {
				        System.out.print(esami[i][j] + "\t");
				    }
				    System.out.println();
				}
				break;
			case 3: //riepilogo
				for(int i = 0; i<studenti.length; i++)
				{
					System.out.println("Studente ");
				    for(int j = 0; j<studenti[0].length; j++)
				    {
				        System.out.print(studenti[i][j] + "\t");
				    }
				    System.out.println();
				}
				for(int i = 0; i<esami.length; i++)
				{
					System.out.println("Esame ");
				    for(int j = 0; j<esami[0].length; j++)
				    {
				        System.out.print(esami[i][j] + "\t");
				    }
				    System.out.println();
				}
				break;

			default:
				break;
			}
		}

		/*
		 * System.out.
		 * println("MENU \n1) Inserire nuovo studente \n2) Inserire esame \n3) Riepilogo"
		 * ); System.out.println("Scegliere un opzione"); menu = in.nextInt(); // String
		 * nome = in.nextLine(); //legge il nominativo e va alla riga successiva
		 * 
		 * if (menu == 1) { // nuovo studente for (int i = 0; i < 3; i++) {
		 * System.out.println("Inserire il numero matricola"); String matricola =
		 * in.nextLine(); studenti[i][0] = matricola;
		 * System.out.println("Inserire il nome: "); String nome = in.nextLine();
		 * studenti[i][1] = nome; System.out.println("Inserire il cognome: "); String
		 * cognome = in.nextLine(); studenti[i][2] = cognome; } for (int i = 0; i <
		 * studenti.length; i++) { for (int j = 0; j < studenti[0].length; j++) {
		 * System.out.println(studenti[i][j]); } }
		 * 
		 * } else if (menu == 2) { // esame for (int i = 0; i < 7; i++) {
		 * System.out.println("Inserire il numero matricola"); String matricola =
		 * in.nextLine(); esami[i][0] = matricola;
		 * System.out.println("Inserire il esame: "); String esame = in.nextLine();
		 * esami[i][1] = esame; System.out.println("Inserire il voto: "); String voto =
		 * in.nextLine(); esami[i][2] = voto; } for (int i = 0; i < esami.length; i++) {
		 * for (int j = 0; j < esami[0].length; j++) { System.out.println(esami[i][j]);
		 * } }
		 * 
		 * } else if (menu == 3) { // riepilogo for (int i = 0; i < studenti.length;
		 * i++) { for (int j = 0; j < esami.length; j++) { if (studenti[i][0] ==
		 * esami[j][0]) { System.out.println( studenti[i][1] + " " + studenti[i][2] +
		 * "->" + esami[j][1] + " = " + esami[j][1]); } } } } else { System.out.
		 * println("MENU \n1) Inserire studente \n2) Inserire esame \n3) Riepilogo");
		 * System.out.println("Scegliere un opzione"); menu = in.nextInt(); }
		 * 
		 * while (nuovoStudente == false) {
		 * 
		 * } System.out.println("Inserire il nome: "); String nome = in.nextLine(); //
		 * legge il nominativo e va alla riga successiva
		 */ }

	public static void Menu() {
		Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
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
			// Riepilogo();
			break;

		default:
			break;
		}
	}

	public static String Studente() {
		Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
		String studenti[][] = new String[3][3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Inserire il numero matricola");
			String matricola = in.nextLine();
			studenti[i][0] = matricola;
			System.out.println("Inserire il nome: ");
			String nome = in.nextLine();
			studenti[i][1] = nome;
			System.out.println("Inserire il cognome: ");
			String cognome = in.nextLine();
			studenti[i][2] = cognome;
		}
		for (int i = 0; i < studenti.length; i++) {
			for (int j = 0; j < studenti[0].length; j++) {
				System.out.println(studenti[i][j]);
			}
		}
		return studenti.toString();
	}

	public static void Esame() {
		Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
		String esami[][] = new String[7][3];

		for (int i = 0; i < 7; i++) {
			System.out.println("Inserire il numero matricola");
			String matricola = in.nextLine();
			esami[i][0] = matricola;
			System.out.println("Inserire il esame: ");
			String esame = in.nextLine();
			esami[i][1] = esame;
			System.out.println("Inserire il voto: ");
			String voto = in.nextLine();
			esami[i][2] = voto;
		}
		for (int i = 0; i < esami.length; i++) {
			for (int j = 0; j < esami[0].length; j++) {
				System.out.println(esami[i][j]);
			}
		}
		System.out.println();
		Menu();
	}

	public static void Riepilogo(String studenti[][], String esami[][]) {
		for (int i = 0; i < studenti.length; i++) {
			for (int j = 0; j < esami.length; j++) {
				if (studenti[i][0] == esami[j][0]) {
					System.out.println("Riepilogo\n" + studenti[i][1] + " " + studenti[i][2] + "->" + esami[j][1]
							+ " = " + esami[j][1]);
				}
			}
		}
		System.out.println();
		Menu();
	}
}
